
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
    """),_display_(/*40.6*/content),format.raw/*40.13*/("""
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
                  HASH: 553e6b78138ed3601b2bca8235575ce2d68cf5ae
                  MATRIX: 987->260|1111->291|1138->292|1218->345|1244->350|1404->483|1419->489|1481->530|1560->582|1575->588|1638->630|1826->791|1841->797|1913->847|2000->907|2015->913|2076->952|2124->973|2139->979|2201->1020|2285->1077|2300->1083|2370->1132|2806->1540|2835->1541|2867->1546|2939->1591|2967->1592|3276->1875|3304->1882|3332->1883
                  LINES: 26->7|31->8|32->9|36->13|36->13|38->15|38->15|38->15|39->16|39->16|39->16|41->18|41->18|41->18|42->19|42->19|42->19|43->20|43->20|43->20|44->21|44->21|44->21|49->26|49->26|50->27|52->29|52->29|63->40|63->40|64->41
                  -- GENERATED --
              */
          