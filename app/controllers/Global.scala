package controllers

import play.api._
import play.api.mvc._
import play.api.mvc.Results._
import scala.concurrent.Future
import models._
import scala.xml.Elem
import scala.xml.XML

object Global extends GlobalSettings {

  override def onStart(app: Application) {
    Logger.info("Application has started")
    
    super.onStart(app);
    var contentFileName = app.configuration.getString("startup.file").getOrElse("app/assets/content-data.xml")
    
    val xml = XML.loadFile(contentFileName)
    
    var fooditems = (xml \\ "Food" \ "Item") map { fooditem => Food.fromXML(fooditem) } toList
    var productitems = (xml \\ "Products" \ "Item") map { productitem => Product.fromXML(productitem) } toList
    
    ContentItem.add(fooditems)  
    ContentItem.add(productitems) 
  }  
  
  override def onStop(app: Application) {
    Logger.info("Application shutdown...")
  }  
  
  // 404 - page not found error
  override def onHandlerNotFound(request: RequestHeader) = {
    Future.successful(NotFound(
      views.html.notFoundPage(request.path)
    ))
  }
  
  // 500 - internal server error
  override def onError(request: RequestHeader, ex: Throwable) = {
    Future.successful(InternalServerError(
      views.html.errorPage(ex)
    ))
  }

    
}