
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    <title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" media="screen" href='"""),_display_(/*15.50*/routes/*15.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.97*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*16.50*/routes/*16.56*/.Assets.versioned("stylesheets/prism.css")),format.raw/*16.98*/("""'>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <!--<link rel="stylesheet" media="screen" href='"""),_display_(/*18.54*/routes/*18.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*18.110*/("""'>-->
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*19.55*/routes/*19.61*/.Assets.versioned("images/favicon.png")),format.raw/*19.100*/("""'>
    <script src='"""),_display_(/*20.19*/routes/*20.25*/.Assets.versioned("javascripts/prism.js")),format.raw/*20.66*/("""' type="text/javascript"></script>
    <!--<script src='"""),_display_(/*21.23*/routes/*21.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*21.78*/("""' type="text/javascript"></script>-->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <script src="https://cdn.tiny.cloud/1/5zimoo7rrynlf5fvjn3j28pknmysals83mpnpux4hknj4hgq/tinymce/6/tinymce.min.js" referrerpolicy="origin"></script>
    <script>
    tinymce.init("""),format.raw/*26.18*/("""{"""),format.raw/*26.19*/("""
    """),format.raw/*27.5*/("""selector: 'textarea',
    height: "360",
    """),format.raw/*29.5*/("""}"""),format.raw/*29.6*/(""");
    </script>
</head>

<body>
<section id="top">
    <div class="wrapper">
        <img class="resize" src="assets/images/play_icon_reverse.svg" alt="logo" />
        <h1>Biomimetic Collective Intelligence Framework: Canvas</h1>
    </div>
</section>
"""),_display_(/*40.2*/content),format.raw/*40.9*/("""
"""),format.raw/*41.1*/("""</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 94e3cc665c395920038a725e7e463e8b3a530526
                  MATRIX: 1165->261|1290->291|1320->295|1404->352|1430->357|1592->492|1607->498|1669->539|1749->592|1764->598|1827->640|2017->803|2032->809|2104->859|2192->920|2207->926|2268->965|2317->987|2332->993|2394->1034|2479->1092|2494->1098|2564->1147|3005->1560|3034->1561|3067->1567|3141->1614|3169->1615|3461->1881|3488->1888|3517->1890
                  LINES: 32->7|37->7|39->9|43->13|43->13|45->15|45->15|45->15|46->16|46->16|46->16|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|56->26|56->26|57->27|59->29|59->29|70->40|70->40|71->41
                  -- GENERATED --
              */
          