// @SOURCE:/home/knoldus/PlayProjects/PlayFormPro/conf/routes
// @HASH:a0a2c50f53126269dcd753024850e22c62817381
// @DATE:Thu Mar 05 16:21:35 IST 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:16
class ReverseAssets {


// @LINE:16
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:11
def upload(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "upload")
}
                        

// @LINE:13
def calsquare(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "calsquare")
}
                        

// @LINE:12
def square(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "square")
}
                        

// @LINE:10
def getdpform(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "getdpform")
}
                        

// @LINE:8
def showall(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "showall")
}
                        

// @LINE:7
def savecontact(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "savecontact")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:9
def addnew(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "addnew")
}
                        

}
                          
}
                  


// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:16
class ReverseAssets {


// @LINE:16
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:11
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.upload",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
      }
   """
)
                        

// @LINE:13
def calsquare : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.calsquare",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "calsquare"})
      }
   """
)
                        

// @LINE:12
def square : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.square",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "square"})
      }
   """
)
                        

// @LINE:10
def getdpform : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getdpform",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "getdpform"})
      }
   """
)
                        

// @LINE:8
def showall : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.showall",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showall"})
      }
   """
)
                        

// @LINE:7
def savecontact : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.savecontact",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "savecontact"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:9
def addnew : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.addnew",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addnew"})
      }
   """
)
                        

}
              
}
        


// @LINE:16
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:16
class ReverseAssets {


// @LINE:16
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:11
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.upload(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "upload", Seq(), "POST", """""", _prefix + """upload""")
)
                      

// @LINE:13
def calsquare(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.calsquare(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "calsquare", Seq(), "POST", """""", _prefix + """calsquare""")
)
                      

// @LINE:12
def square(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.square(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "square", Seq(), "GET", """""", _prefix + """square""")
)
                      

// @LINE:10
def getdpform(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getdpform(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getdpform", Seq(), "GET", """""", _prefix + """getdpform""")
)
                      

// @LINE:8
def showall(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.showall(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "showall", Seq(), "GET", """""", _prefix + """showall""")
)
                      

// @LINE:7
def savecontact(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.savecontact(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "savecontact", Seq(), "POST", """""", _prefix + """savecontact""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:9
def addnew(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.addnew(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "addnew", Seq(), "GET", """""", _prefix + """addnew""")
)
                      

}
                          
}
        
    