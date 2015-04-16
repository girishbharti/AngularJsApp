
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
object regsuccess extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Contact,play.api.mvc.Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: Contact)(implicit flash: play.api.mvc.Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.53*/("""

"""),_display_(/*3.2*/main("Your Details are:")/*3.27*/{_display_(Seq[Any](format.raw/*3.28*/(""" 
    	"""),format.raw/*4.6*/("""<div><h3>You have entered</h3></div>
    	
    	
    	
	<div>
		<table class="table">
 				<tr>
 					<td>First Name</td><td>"""),_display_(/*11.31*/user/*11.35*/.firstname),format.raw/*11.45*/("""</td>
 				</tr>
 				<tr>
 					<td>Last Name</td><td>"""),_display_(/*14.30*/user/*14.34*/.lastname),format.raw/*14.43*/("""</td>
 				</tr>
 				<tr>
 					<td>Company</td><td>"""),_display_(/*17.28*/user/*17.32*/.company),format.raw/*17.40*/("""</td>
 				</tr>
 				<tr>
 					<td>Email</td><td>"""),_display_(/*20.26*/user/*20.30*/.email),format.raw/*20.36*/("""</td>
 				</tr>
 				<tr>
 					<td>Phone</td><td>"""),_display_(/*23.26*/user/*23.30*/.phones),format.raw/*23.37*/("""</td>
 				</tr>
 		</table>
 	</div>
  
""")))}),format.raw/*28.2*/("""
"""))}
  }

  def render(user:Contact,flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(user)(flash)

  def f:((Contact) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (user) => (flash) => apply(user)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 05 16:21:36 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/PlayFormPro/app/views/regsuccess.scala.html
                  HASH: b7fc3b60a6a02eb827098f996c34afa9be25712b
                  MATRIX: 530->1|669->52|697->55|730->80|768->81|801->88|954->214|967->218|998->228|1081->284|1094->288|1124->297|1205->351|1218->355|1247->363|1326->415|1339->419|1366->425|1445->477|1458->481|1486->488|1558->530
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|32->11|32->11|32->11|35->14|35->14|35->14|38->17|38->17|38->17|41->20|41->20|41->20|44->23|44->23|44->23|49->28
                  -- GENERATED --
              */
          