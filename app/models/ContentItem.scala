package models

import scala.reflect.runtime.universe._

abstract class ContentItem {
	def name : String
	def description : String
	def image :Image
	def className : String
}

case class Image(thumb: String, large: String) 
case class Food(name: String, description: String, image: Image) extends ContentItem {
	def className = this.getClass.getSimpleName
}
case class Product(name: String, uuid: String, description: String, price: Double, image: Image)  extends ContentItem {
	def className = this.getClass.getSimpleName
} 

object ContentItem {

	var items = List[ContentItem]()
	
	/**
	* Returns all content items 
	*/
	def findAll: List[ContentItem] =  items
  
	def findByName(name: String) =  items.find(_.name == name)
  
	def findByType(itemType: String) = items.filter(_.className == itemType)
  
   def add(item: ContentItem) {
    items = item +: items
  }
  
   def add(itemList: List[ContentItem]) {
    items = itemList ++: items
  }

}

object Food {
	def fromXML(node: scala.xml.NodeSeq): Food =
		new Food (
			(node \ "Name").text,
			(node \ "Description").text, 
			Image.fromXML((node \ "Image")))
}

object Image {
	def fromXML(node: scala.xml.NodeSeq): Image =
		new Image (
			(node \ "Thumb").text,
			(node \ "Large").text
			)
}

object Product {
	def fromXML(node: scala.xml.NodeSeq): Product =
		new Product (
			(node \ "Name").text,
			(node \ "UUID").text,
			(node \ "Description").text, 
			(node \ "Price").text.toDouble,
			Image.fromXML((node \ "Image")))
}
