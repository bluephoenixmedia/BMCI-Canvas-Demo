
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
import play.api.mvc._
import play.api.data._

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


Seq[Any](format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
    <title>"""),_display_(/*13.13*/title),format.raw/*13.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" media="screen" href='"""),_display_(/*15.50*/routes/*15.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.97*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*16.50*/routes/*16.56*/.Assets.versioned("stylesheets/prism.css")),format.raw/*16.98*/("""'>
    <link rel="stylesheet" media="screen" href='"""),_display_(/*17.50*/routes/*17.56*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*17.102*/("""'>
    <link rel="shortcut icon" type="image/png" href='"""),_display_(/*18.55*/routes/*18.61*/.Assets.versioned("images/favicon.png")),format.raw/*18.100*/("""'>
    <script src='"""),_display_(/*19.19*/routes/*19.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*19.66*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*20.19*/routes/*20.25*/.Assets.versioned("javascripts/prism.js")),format.raw/*20.66*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*21.19*/routes/*21.25*/.Assets.versioned("javascripts/bootstrap.bundle.min.js")),format.raw/*21.81*/("""' type="text/javascript"></script>
</head>

<body>
    <section id="top">
        <div class="wrapper">
            <img class="resize" src="assets/images/play_icon_reverse.svg" alt="logo" />
            <h1>Biomimetic Collective Intelligence Framework: Canvas</h1>
        </div>
    </section>
    """),_display_(/*31.6*/content),format.raw/*31.13*/("""
"""),format.raw/*32.1*/("""</body>

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
                  HASH: 43db065fe4d9af51cf80e91342bef37511ddd68c
                  MATRIX: 987->260|1111->291|1138->292|1218->345|1244->350|1404->483|1419->489|1481->530|1560->582|1575->588|1638->630|1717->682|1732->688|1800->734|1884->791|1899->797|1960->836|2008->857|2023->863|2085->904|2165->957|2180->963|2242->1004|2322->1057|2337->1063|2414->1119|2741->1420|2769->1427|2797->1428
                  LINES: 26->7|31->8|32->9|36->13|36->13|38->15|38->15|38->15|39->16|39->16|39->16|40->17|40->17|40->17|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|44->21|44->21|44->21|54->31|54->31|55->32
                  -- GENERATED --
              */
          