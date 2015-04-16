
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
import helper._
/**/
object getdpform extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(param: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*3.17*/("""

"""),_display_(/*5.2*/main(param)/*5.13*/{_display_(Seq[Any](format.raw/*5.14*/("""
	"""),_display_(/*6.3*/helper/*6.9*/.form(action = routes.Application.upload, 'enctype -> "multipart/form-data")/*6.85*/ {_display_(Seq[Any](format.raw/*6.87*/("""
		"""),format.raw/*7.3*/("""<div>
	    	<img src=""""),_display_(/*8.18*/routes/*8.24*/.Assets.at("/images/emp.jpg")),format.raw/*8.53*/("""" style="height:180px; width:150px;border-style: solid; border-width: 5px;" alt="Image"/>
	    	<input type="file" name="picture">
	    	<p>
	    	    <input type="submit">
	    	</p>
    	</div>
	""")))}),format.raw/*14.3*/("""
""")))}))}
  }

  def render(param:String): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 05 16:21:36 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/PlayFormPro/app/views/getdpform.scala.html
                  HASH: b73a37ca8920b98b7cacb8925639adcaaa307dcf
                  MATRIX: 524->48|627->63|655->66|674->77|712->78|740->81|753->87|837->163|876->165|905->168|954->191|968->197|1017->226|1245->424
                  LINES: 19->3|22->3|24->5|24->5|24->5|25->6|25->6|25->6|25->6|26->7|27->8|27->8|27->8|33->14
                  -- GENERATED --
              */
          