package controllers

import play.api._
import play.api.mvc._
import scala.reflect.runtime.universe._
import models._

object Application extends Controller {


	def index = Action {
		val items = ContentItem.findAll    	
    	Ok(views.html.listcontent(items, ""))
	}

	def show(itemType: String, name : String) = Action {implicit request =>
  	
    	ContentItem.findByName(name).map { item =>
	
			if (item.isInstanceOf[Food]) 
	      		Ok(views.html.food(item.asInstanceOf[Food]))
	      	else
	      		Ok(views.html.product(item.asInstanceOf[Product]))

    	}.getOrElse(NotFound)
	}

	def filter(itemType : String, page: Int) = Action {
		/*
		var defaultPageSize = 3
  	  	val foundItems = ContentItem.findByType(itemType)
  		val totalItems = foundItems.length
		val from = ((page - 1) * defaultPageSize) + 1
		val to = totalItems min (from + defaultPageSize - 1)
		val totalPages = (totalItems / defaultPageSize) + (if (totalItems % defaultPageSize > 0) 1 else 0)
		*/
      	Ok(views.html.listcontent(ContentItem.findByType(itemType), itemType))

	}

}

