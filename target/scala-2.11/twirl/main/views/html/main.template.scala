
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <head>
    	<meta charset="UTF-8">
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*9.64*/routes/*9.70*/.Assets.at("bootstrap-3.3.2-dist/css/bootstrap.min.css")),format.raw/*9.126*/("""" )>        
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.at("stylesheets/main.css")),format.raw/*10.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png")),format.raw/*11.97*/("""">
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("bootstrap-3.3.2-dist/js/jquery_2.1.1.min.js")),format.raw/*12.86*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("bootstrap-3.3.2-dist/js/bootstrap.min.js")),format.raw/*13.83*/("""" type="text/javascript"></script>
        
    </head>
    <body>
    <div class="container">
    	"""),format.raw/*20.47*/("""
    	"""),_display_(/*21.7*/header("Index Page")),format.raw/*21.27*/("""
    	"""),format.raw/*24.59*/("""
    	"""),_display_(/*25.7*/content),format.raw/*25.14*/("""
    	"""),format.raw/*28.40*/("""
    	"""),_display_(/*29.7*/footer("Footer")),format.raw/*29.23*/("""
    """),format.raw/*30.5*/("""</div>
    </body>
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 05 16:21:36 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/PlayFormPro/app/views/main.scala.html
                  HASH: de1921e7769edf21241c9dd70c6fbf8126368bd9
                  MATRIX: 509->1|627->31|655->33|759->111|784->116|959->265|973->271|1050->327|1143->393|1158->399|1213->433|1301->494|1316->500|1369->532|1421->557|1436->563|1514->620|1598->677|1613->683|1688->737|1816->972|1849->979|1890->999|1924->1176|1957->1183|1985->1190|2019->1310|2052->1317|2089->1333|2121->1338
                  LINES: 19->1|22->1|24->3|28->7|28->7|30->9|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13|39->20|40->21|40->21|41->24|42->25|42->25|43->28|44->29|44->29|45->30
                  -- GENERATED --
              */
          