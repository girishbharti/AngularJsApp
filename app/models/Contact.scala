package models

case class Contact(
    firstname:String,
    lastname:String,
    company:String,
    email:String,
    phones:String
    ) 
object Contact{
  def save():Int=99
} 

