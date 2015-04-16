
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

/* animationdemo Template File */
object animationdemo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* animationdemo Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.14*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
    <head>
    	<meta charset="UTF-8">
        <title>"""),_display_(/*8.17*/param),format.raw/*8.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(/*10.64*/routes/*10.70*/.Assets.at("bootstrap-3.3.2-dist/css/bootstrap.min.css")),format.raw/*10.126*/("""" )>        
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.at("stylesheets/main.css")),format.raw/*11.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.at("stylesheets/MyStyle.css")),format.raw/*12.97*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.at("images/favicon.png")),format.raw/*13.97*/("""">
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.at("bootstrap-3.3.2-dist/js/jquery_2.1.1.min.js")),format.raw/*14.86*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("bootstrap-3.3.2-dist/js/bootstrap.min.js")),format.raw/*15.83*/("""" type="text/javascript"></script>
    </head>
    <body>
    <div class="container">
    	<div class="row">
    		<div class="col-md-12">
    		<div id="wrapper">
				    <h1>Animated Scroll Effects</h1>
				 
				    <p class="desc">Continue scrolling down to see the magic.</p>
				 
				    <p class="desc">Animated blocks use CSS classes to setup direction and flow of each item.</p>
				 
				    <br><br><br><br>
				 
				    <div class="animateblock centerleft">
				      <img href=""""),_display_(/*31.23*/routes/*31.29*/.Assets.at("images/image.jpeg")),format.raw/*31.60*/("""" alt="macbook icon">
				    </div>
    		</div>
    	</div>
    </div>
    </body>
</html>
<script>
	$(function()"""),format.raw/*39.14*/("""{"""),format.raw/*39.15*/("""
	  """),format.raw/*40.4*/("""var $elems = $('.animateblock');
	  var winheight = $(window).height();
	  var fullheight = $(document).height();
	 
	  $(window).scroll(function()"""),format.raw/*44.31*/("""{"""),format.raw/*44.32*/("""
	    """),format.raw/*45.6*/("""animate_elems();
	  """),format.raw/*46.4*/("""}"""),format.raw/*46.5*/(""");

	  function animate_elems() """),format.raw/*48.29*/("""{"""),format.raw/*48.30*/("""
		    """),format.raw/*49.7*/("""wintop = $(window).scrollTop(); // calculate distance from top of window
		 
		    // loop through each item to check when it animates
		    $elems.each(function()"""),format.raw/*52.29*/("""{"""),format.raw/*52.30*/("""
		      """),format.raw/*53.9*/("""$elm = $(this);
		 
		      if($elm.hasClass('animated')) """),format.raw/*55.39*/("""{"""),format.raw/*55.40*/(""" """),format.raw/*55.41*/("""return true; """),format.raw/*55.54*/("""}"""),format.raw/*55.55*/(""" """),format.raw/*55.56*/("""// if already animated skip to the next item
		 
		      topcoords = $elm.offset().top; // element's distance from top of page in pixels
		 
		      if(wintop > (topcoords - (winheight*.75))) """),format.raw/*59.52*/("""{"""),format.raw/*59.53*/("""
		        """),format.raw/*60.11*/("""// animate when top of the window is 3/4 above the element
		        $elm.addClass('animated');
		      """),format.raw/*62.9*/("""}"""),format.raw/*62.10*/("""
		    """),format.raw/*63.7*/("""}"""),format.raw/*63.8*/(""");
		  """),format.raw/*64.5*/("""}"""),format.raw/*64.6*/(""" """),format.raw/*64.7*/("""// end animate_elems()
		"""),format.raw/*65.3*/("""}"""),format.raw/*65.4*/(""");

</script>"""))}
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 05 16:21:36 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/PlayFormPro/app/views/animationdemo.scala.html
                  HASH: b158beb3298bf6c480d41422086ca461305dfc6f
                  MATRIX: 568->35|668->47|696->49|800->127|825->132|1001->281|1016->287|1094->343|1187->409|1202->415|1257->449|1340->505|1355->511|1413->548|1501->609|1516->615|1569->647|1621->672|1636->678|1714->735|1798->792|1813->798|1888->852|2409->1346|2424->1352|2476->1383|2619->1498|2648->1499|2679->1503|2854->1650|2883->1651|2916->1657|2963->1677|2991->1678|3051->1710|3080->1711|3114->1718|3305->1881|3334->1882|3370->1891|3456->1949|3485->1950|3514->1951|3555->1964|3584->1965|3613->1966|3833->2158|3862->2159|3901->2170|4032->2274|4061->2275|4095->2282|4123->2283|4157->2290|4185->2291|4213->2292|4265->2317|4293->2318
                  LINES: 19->2|22->2|24->4|28->8|28->8|30->10|30->10|30->10|31->11|31->11|31->11|32->12|32->12|32->12|33->13|33->13|33->13|34->14|34->14|34->14|35->15|35->15|35->15|51->31|51->31|51->31|59->39|59->39|60->40|64->44|64->44|65->45|66->46|66->46|68->48|68->48|69->49|72->52|72->52|73->53|75->55|75->55|75->55|75->55|75->55|75->55|79->59|79->59|80->60|82->62|82->62|83->63|83->63|84->64|84->64|84->64|85->65|85->65
                  -- GENERATED --
              */
          