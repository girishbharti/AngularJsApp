
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

/* square Template File */
object square extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,play.api.mvc.Flash,play.twirl.api.HtmlFormat.Appendable] {

  /* square Template File */
  def apply/*2.2*/(title:String)(implicit flash: play.api.mvc.Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.52*/("""

"""),_display_(/*4.2*/main("Square")/*4.16*/{_display_(Seq[Any](format.raw/*4.17*/("""
	
	"""),format.raw/*6.2*/("""<div style="background-color:yellow;">
	
			"""),_display_(/*8.5*/flash/*8.10*/.get("square").map/*8.28*/ { message =>_display_(Seq[Any](format.raw/*8.41*/("""
				"""),format.raw/*9.5*/("""<div class="alert alert-dismissable alert-success">
					<button type="button" class="close" data-dismiss="alert">×</button>
					<strong>Square: </strong> """),_display_(/*11.33*/message),format.raw/*11.40*/("""
				"""),format.raw/*12.5*/("""</div>
			""")))}/*13.5*/.getOrElse/*13.15*/{_display_(Seq[Any](format.raw/*13.16*/("""Error Found in flash""")))}),format.raw/*13.37*/("""
		"""),format.raw/*14.3*/("""<form action="/calsquare" method="post">
			<br/>
			Enter number to find <input type="text" name="number"/><br/>
			<input type="submit" value="Square">	
		</form>
	
	</div>
	
""")))}),format.raw/*22.2*/("""
"""))}
  }

  def render(title:String,flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(title)(flash)

  def f:((String) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (title) => (flash) => apply(title)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 05 16:21:36 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/PlayFormPro/app/views/square.scala.html
                  HASH: 7764ae0b716678e2773ffef7f3c6be77d05a5321
                  MATRIX: 569->28|707->78|735->81|757->95|795->96|825->100|895->145|908->150|934->168|984->181|1015->186|1199->343|1227->350|1259->355|1288->366|1307->376|1346->377|1398->398|1428->401|1636->579
                  LINES: 19->2|22->2|24->4|24->4|24->4|26->6|28->8|28->8|28->8|28->8|29->9|31->11|31->11|32->12|33->13|33->13|33->13|33->13|34->14|42->22
                  -- GENERATED --
              */
          