package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.Contact
import java.util.concurrent.Future
import models.User
import models.UserDao
import models.userObj
import play.api.mvc.Flash


object userDao extends User

trait ApplicationTrait extends Controller {
  this: Controller =>

  val user : User
    
  val contactForm = Form(
    tuple(
      "firstname" -> text,
      "lastname" -> text,
      "company" -> text,
      "email" -> text,
      "phones" -> text))
     
/**
 * this is form to get number
 */
   
  def square = Action { implicit request =>
    Ok(views.html.square("Square"))
  }

  def calsquare = Action { implicit request =>
      val number =5
      val result = user.calculate(5)
      Ok(s"Result : ${result}")         
  }

  def index = Action {
    Ok(views.html.index("Registration form"))
  }

  def showall = Action {
    Ok(views.html.showall("Show all"))
  }

  def addnew = Action {
    Ok(views.html.addnew("Add"))
  }

  def getdpform = Action {
    Ok(views.html.getdpform("GetDP"))
  }

  def upload = Action(parse.multipartFormData) { implicit request =>
    request.body.file("picture").map { picture =>
      import java.io.File
      val filename = picture.filename
      val contenttype = picture.contentType
      try {
        picture.ref.moveTo(new File(s"/home/knoldus/Desktop/${filename}"))
        Ok("Done! File Uploaded!")
      } catch {
        case ex: Exception => Ok("Error found:" + ex)
      }

    }.getOrElse(
      Ok("Not a valid image"))
  }

  def savecontact = Action { implicit request =>
    contactForm.bindFromRequest.fold(
      formWithErrors => {
        //BadRequest(views.html.contact.form(formWithErrors))
        Ok("Form filled with errors")
      },
      form => {
        val fname = form._1
        val lname = form._2
        val company = form._3
        val email = form._4
        val phone = form._5
        val user = Contact(fname, lname, company, email, phone)
        Ok(views.html.regsuccess(user))
      })
  }
}

object Application extends Controller with ApplicationTrait {
  val user: User = userDao
  
}