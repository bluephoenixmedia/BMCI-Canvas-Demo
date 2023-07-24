
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

object commonSidebar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/defining(play.core.PlayVersion.current)/*2.41*/ { version =>_display_(Seq[Any](format.raw/*2.54*/("""
"""),format.raw/*3.1*/("""<h3>Table of Contents</h3>

<h3>Related Resources</h3>
<ul>
  <li><a href="https://playframework.com/documentation/"""),_display_(/*7.57*/version),format.raw/*7.64*/("""" target="_blank">Play documentation</a></li>
  <li><a href="https://github.com/playframework/playframework/discussions" target="_blank">Forum</a></li>
  <li><a href="https://discord.gg/g5s2vtZ4Fa" target="_blank">Play Discord Server</a></li>
  <li><a href="https://stackoverflow.com/questions/tagged/playframework" target="_blank">Stackoverflow</a></li>
  <li><a href="https://www.playframework.com/sponsors" target="_blank">Sponsor Play</a></li>
</ul>
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/commonSidebar.scala.html
                  HASH: 81e794d014bfbde6bc093216f895f959c328eaa6
                  MATRIX: 908->1|1004->5|1051->44|1101->57|1128->58|1270->174|1297->181|1782->636
                  LINES: 27->1|32->2|32->2|32->2|33->3|37->7|37->7|43->13
                  -- GENERATED --
              */
          