// @SOURCE:/home/knoldus/PlayProjects/PlayFormPro/conf/routes
// @HASH:a0a2c50f53126269dcd753024850e22c62817381
// @DATE:Thu Mar 05 16:21:35 IST 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_savecontact1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("savecontact"))))
private[this] lazy val controllers_Application_savecontact1_invoker = createInvoker(
controllers.Application.savecontact,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "savecontact", Nil,"POST", """""", Routes.prefix + """savecontact"""))
        

// @LINE:8
private[this] lazy val controllers_Application_showall2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("showall"))))
private[this] lazy val controllers_Application_showall2_invoker = createInvoker(
controllers.Application.showall,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showall", Nil,"GET", """""", Routes.prefix + """showall"""))
        

// @LINE:9
private[this] lazy val controllers_Application_addnew3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("addnew"))))
private[this] lazy val controllers_Application_addnew3_invoker = createInvoker(
controllers.Application.addnew,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addnew", Nil,"GET", """""", Routes.prefix + """addnew"""))
        

// @LINE:10
private[this] lazy val controllers_Application_getdpform4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("getdpform"))))
private[this] lazy val controllers_Application_getdpform4_invoker = createInvoker(
controllers.Application.getdpform,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getdpform", Nil,"GET", """""", Routes.prefix + """getdpform"""))
        

// @LINE:11
private[this] lazy val controllers_Application_upload5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("upload"))))
private[this] lazy val controllers_Application_upload5_invoker = createInvoker(
controllers.Application.upload,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "upload", Nil,"POST", """""", Routes.prefix + """upload"""))
        

// @LINE:12
private[this] lazy val controllers_Application_square6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("square"))))
private[this] lazy val controllers_Application_square6_invoker = createInvoker(
controllers.Application.square,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "square", Nil,"GET", """""", Routes.prefix + """square"""))
        

// @LINE:13
private[this] lazy val controllers_Application_calsquare7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("calsquare"))))
private[this] lazy val controllers_Application_calsquare7_invoker = createInvoker(
controllers.Application.calsquare,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "calsquare", Nil,"POST", """""", Routes.prefix + """calsquare"""))
        

// @LINE:16
private[this] lazy val controllers_Assets_at8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at8_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """savecontact""","""controllers.Application.savecontact"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """showall""","""controllers.Application.showall"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """addnew""","""controllers.Application.addnew"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """getdpform""","""controllers.Application.getdpform"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """upload""","""controllers.Application.upload"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """square""","""controllers.Application.square"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """calsquare""","""controllers.Application.calsquare"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:7
case controllers_Application_savecontact1_route(params) => {
   call { 
        controllers_Application_savecontact1_invoker.call(controllers.Application.savecontact)
   }
}
        

// @LINE:8
case controllers_Application_showall2_route(params) => {
   call { 
        controllers_Application_showall2_invoker.call(controllers.Application.showall)
   }
}
        

// @LINE:9
case controllers_Application_addnew3_route(params) => {
   call { 
        controllers_Application_addnew3_invoker.call(controllers.Application.addnew)
   }
}
        

// @LINE:10
case controllers_Application_getdpform4_route(params) => {
   call { 
        controllers_Application_getdpform4_invoker.call(controllers.Application.getdpform)
   }
}
        

// @LINE:11
case controllers_Application_upload5_route(params) => {
   call { 
        controllers_Application_upload5_invoker.call(controllers.Application.upload)
   }
}
        

// @LINE:12
case controllers_Application_square6_route(params) => {
   call { 
        controllers_Application_square6_invoker.call(controllers.Application.square)
   }
}
        

// @LINE:13
case controllers_Application_calsquare7_route(params) => {
   call { 
        controllers_Application_calsquare7_invoker.call(controllers.Application.calsquare)
   }
}
        

// @LINE:16
case controllers_Assets_at8_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at8_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     