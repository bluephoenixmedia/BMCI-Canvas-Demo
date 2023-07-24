
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._
/*1.2*/import play.mvc.Http.Request

object listWidgets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[Widget],Form[WidgetData],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(widgets: Seq[Widget], form: Form[WidgetData])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.105*/("""

"""),_display_(/*4.2*/main("Widgets")/*4.17*/ {_display_(Seq[Any](format.raw/*4.19*/("""

    """),format.raw/*6.5*/("""<h1>Widgets</h1>

    """),format.raw/*8.40*/("""
    """),_display_(/*9.6*/request/*9.13*/.flash.asScala().data.map/*9.38*/ { case (name, value) =>_display_(Seq[Any](format.raw/*9.62*/("""
    """),format.raw/*10.5*/("""<div class=""""),_display_(/*10.18*/name),format.raw/*10.22*/("""">"""),_display_(/*10.25*/value),format.raw/*10.30*/("""</div>
    """)))}),format.raw/*11.6*/("""

    """),format.raw/*13.5*/("""<table>
        <thead>
            <tr><th>Name</th><th>Price</th>
        </thead>
        <tbody>
        """),_display_(/*18.10*/for(w <- widgets) yield /*18.27*/ {_display_(Seq[Any](format.raw/*18.29*/("""
            """),format.raw/*19.13*/("""<tr><td>"""),_display_(/*19.22*/w/*19.23*/.title),format.raw/*19.29*/("""</td><td>"""),_display_(/*19.39*/w/*19.40*/.content),format.raw/*19.48*/("""</td></tr>
        """)))}),format.raw/*20.10*/("""
        """),format.raw/*21.9*/("""</tbody>
    </table>

    <hr/>

    """),format.raw/*26.66*/("""
    """),_display_(/*27.6*/if(form.hasGlobalErrors)/*27.30*/ {_display_(Seq[Any](format.raw/*27.32*/("""
        """),_display_(/*28.10*/form/*28.14*/.globalErrors.asScala.map/*28.39*/ { error: play.data.validation.ValidationError =>_display_(Seq[Any](format.raw/*28.88*/("""
            """),format.raw/*29.13*/("""<div>
                """),_display_(/*30.18*/error/*30.23*/.key),format.raw/*30.27*/(""": """),_display_(/*30.30*/error/*30.35*/.message),format.raw/*30.43*/("""
            """),format.raw/*31.13*/("""</div>
        """)))}),format.raw/*32.10*/("""
    """)))}),format.raw/*33.6*/("""

    """),_display_(/*35.6*/helper/*35.12*/.form(routes.HomeController.createWidget)/*35.53*/ {_display_(Seq[Any](format.raw/*35.55*/("""
        """),_display_(/*36.10*/helper/*36.16*/.CSRF.formField),format.raw/*36.31*/("""

        """),_display_(/*38.10*/helper/*38.16*/.inputText(form("name"))),format.raw/*38.40*/("""

        """),_display_(/*40.10*/helper/*40.16*/.inputText(form("price"))),format.raw/*40.41*/("""

        """),format.raw/*42.9*/("""<button type="submit">Create widget</button>
    """)))}),format.raw/*43.6*/("""

""")))}),format.raw/*45.2*/("""
"""))
      }
    }
  }

  def render(widgets:Seq[Widget],form:Form[WidgetData],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(widgets,form)(request,messages)

  def f:((Seq[Widget],Form[WidgetData]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (widgets,form) => (request,messages) => apply(widgets,form)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/listWidgets.scala.html
                  HASH: 5a103f132f16900cb1a7afb950d06bc6f32450d6
                  MATRIX: 610->1|998->32|1197->135|1227->140|1250->155|1289->157|1323->165|1374->224|1406->231|1421->238|1454->263|1515->287|1548->293|1588->306|1613->310|1643->313|1669->318|1712->331|1747->339|1889->454|1922->471|1962->473|2004->487|2040->496|2050->497|2077->503|2114->513|2124->514|2153->522|2205->543|2242->553|2313->657|2346->664|2379->688|2419->690|2457->701|2470->705|2504->730|2591->779|2633->793|2684->817|2698->822|2723->826|2753->829|2767->834|2796->842|2838->856|2886->873|2923->880|2958->889|2973->895|3023->936|3063->938|3101->949|3116->955|3152->970|3192->983|3207->989|3252->1013|3292->1026|3307->1032|3353->1057|3392->1069|3473->1120|3508->1125
                  LINES: 23->1|28->2|33->2|35->4|35->4|35->4|37->6|39->8|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|42->11|44->13|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|50->19|50->19|51->20|52->21|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|60->29|61->30|61->30|61->30|61->30|61->30|61->30|62->31|63->32|64->33|66->35|66->35|66->35|66->35|67->36|67->36|67->36|69->38|69->38|69->38|71->40|71->40|71->40|73->42|74->43|76->45
                  -- GENERATED --
              */
          