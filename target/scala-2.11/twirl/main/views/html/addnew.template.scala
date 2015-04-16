
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

/* addnew Template File */
object addnew extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Any,play.twirl.api.HtmlFormat.Appendable] {

  /* addnew Template File */
  def apply/*2.2*/(param: Any):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.14*/("""

"""),_display_(/*4.2*/main("Add New Employee")/*4.26*/{_display_(Seq[Any](format.raw/*4.27*/("""
"""),format.raw/*5.1*/("""<div class="row">
<div class="col-md-8">
<form class="form-horizontal" method="post" action="/savecontact">
  <fieldset>
    <legend>Add New Employee</legend>
    <div class="form-group">
      <label for="inputName" class="col-lg-2 control-label">First Name</label>
      <div class="col-lg-10">
        <input class="form-control" id="firstname" placeholder="Name" type="text">
      </div>
    </div>
    <div class="form-group">
      <label for="inputCompany" class="col-lg-2 control-label">Last Name</label>
      <div class="col-lg-10">
        <input class="form-control" id="lastname" placeholder="Company" type="text">
      </div>
    </div>
    <div class="form-group">
      <label for="inputEmail" class="col-lg-2 control-label">Company</label>
      <div class="col-lg-10">
        <input class="form-control" id="email" placeholder="Email" type="text">
      </div>
    </div>
    <div class="form-group">
      <label for="inputPhone" class="col-lg-2 control-label">Phone</label>
      <div class="col-lg-10">
        <input class="form-control" id="phone" placeholder="Phone" type="text">
      </div>
    </div>
    <div class="form-group">
      <label for="inputDesignation" class="col-lg-2 control-label">Designation</label>
      <div class="col-lg-10">
        <input class="form-control" id="designation" placeholder="Designation" type="text">
      </div>
    </div>
    
    <div class="form-group">
      <div class="col-lg-10 col-lg-offset-2">
        <button type="reset" class="btn btn-default">Cancel</button>
        <button type="submit" class="btn btn-primary">Add Employee</button>
      </div>
    </div>
  </fieldset>
</form>
</div>
</div>
""")))}))}
  }

  def render(param:Any): play.twirl.api.HtmlFormat.Appendable = apply(param)

  def f:((Any) => play.twirl.api.HtmlFormat.Appendable) = (param) => apply(param)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Thu Mar 05 16:21:36 IST 2015
                  SOURCE: /home/knoldus/PlayProjects/PlayFormPro/app/views/addnew.scala.html
                  HASH: 49da0eb44e53200488c0c3c71b664f6dd0ae619c
                  MATRIX: 547->28|647->40|675->43|707->67|745->68|772->69
                  LINES: 19->2|22->2|24->4|24->4|24->4|25->5
                  -- GENERATED --
              */
          