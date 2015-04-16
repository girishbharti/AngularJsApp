
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

/* showemployee Template File */
object showall extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* showemployee Template File */
  def apply/*2.2*/(param:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.16*/("""

"""),_display_(/*4.2*/main("Employee Details")/*4.26*/{_display_(Seq[Any](format.raw/*4.27*/("""
	
	"""),format.raw/*6.2*/("""<div class="row" style="padding: 1%; font: bold;">
			<div class="col-md-12">
				<table class="table table-striped table-hover" id="target">
					<thead style="background-color:Gray;">
    					<tr>
      						<th>Name</th>
      						<th>Company</th>
      						<th>Email</th>
      						<th>Mobile</th>
      						<th>Designation</th>
    					</tr>
  					</thead>
					<tr>
						<td>Alexis</td><td>ROTODYNE</td><td>alexisdunlap.otodyne.com</td><td>+1 (936) 536-2343</td><td>Software Engineer</td>
					</tr>
					<tr>
						<td>Amalia</td><td>TRIPSCH</td><td>amaliadunlap.tripsch.com</td><td>+1 (952) 532-2210</td><td>Tester</td>
					</tr>
					<tr>
						<td>Barnett</td><td>ZILPHUR</td><td>anastasiadunlap.zilphur.com</td><td>+1 (835) 488-2630</td><td>Analyst</td>
					</tr>
					<tr>
						<td>Berger</td><td>ZILLAR</td><td>barnettdunlap.zillar.com</td><td>+1 (991) 542-3603</td><td>Software Engineer</td>
					</tr>
					<tr>
						<td>Blanca</td><td>ONTALITY</td><td>bergerdunlap.ontality.com</td><td>+1 (844) 432-3052</td><td>Tester</td>
					</tr>
					<tr>
						<td>Campbell</td><td>GINKOGENE</td><td>castrodunlap.strezzo.com</td><td>+1 (931) 412-3673</td><td>Analyst</td>
					</tr>
					<tr>
						<td>Castro</td><td>PROWASTE</td><td>durandunlap.liquicom.com</td><td>+1 (952) 593-3644</td><td>Software Developer</td>
					</tr>
					<tr>
						<td>Duran</td><td>JAMNATION</td><td>durhamdunlap.zeam.com</td><td> 	+1 (975) 470-3659</td><td>Tester</td>
					</tr>
				</table>
			</div>
		</div>
""")))}),format.raw/*45.2*/("""
"""))}
  }

  def render(param:String): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 05 16:21:36 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/PlayFormPro/app/views/showall.scala.html
                  HASH: 68eb1fc785854947453cef24b873f9bf5a9df3bf
                  MATRIX: 563->34|665->48|693->51|725->75|763->76|793->80|2341->1598
                  LINES: 19->2|22->2|24->4|24->4|24->4|26->6|65->45
                  -- GENERATED --
              */
          