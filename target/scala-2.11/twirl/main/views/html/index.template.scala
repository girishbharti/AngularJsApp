
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/main("Employee details")/*2.26*/{_display_(Seq[Any](format.raw/*2.27*/("""
	
	"""),format.raw/*7.56*/("""
	"""),format.raw/*8.2*/("""<img style="width:100%;" src=""""),_display_(/*8.33*/routes/*8.39*/.Assets.at("/images/emp.jpg")),format.raw/*8.68*/(""""  alt="Image">
""")))}))}
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 05 16:21:36 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/PlayFormPro/app/views/index.scala.html
                  HASH: 9f28807e41dc72b714cfd1f4c14263b295af7877
                  MATRIX: 505->1|607->15|634->17|666->41|704->42|735->268|763->270|820->301|834->307|883->336
                  LINES: 19->1|22->1|23->2|23->2|23->2|25->7|26->8|26->8|26->8|26->8
                  -- GENERATED --
              */
          