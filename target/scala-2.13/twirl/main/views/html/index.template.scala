
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Welcome")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
"""),_display_(/*4.2*/defining(play.core.PlayVersion.current)/*4.41*/ { version =>_display_(Seq[Any](format.raw/*4.54*/("""

"""),format.raw/*6.1*/("""<section id="content">
  <div class="wrapper">

      <div class="flex-container-top">
        <div class="img-container"><img src="assets/images/earth.png" /></div>
          <div>
              <strong>Ethos / Guiding Life Principles</strong><br /><br />
              <ul>
                <li>What is the ethos and guiding principles of the organization?</li>
                <li>How does the organization ethos and guiding principles translate for the collective of teams? (E.g. focus may be Teamwork)</li>
              </ul>
          </div>
      </div>

      <div class="flex-container-top">
        <div class="img-container"><img src="assets/images/purpose.png" /></div>
        <div><strong>Aligned Shared Purpose</strong>
        <br /><br />
          <ul>
            <li>High Reliability Access / Insight</li>
              <li>Process Improvement</li>
          </ul>
        </div>
      </div>

      <div class="flex-container-top">
        <div class="img-container"><img src="assets/images/governance.png" /></div>
        <div><strong>Governance</strong><br /><br />
        <ul>
          <li>xxx</li>
          <li>xxx</li>
        </ul>
      </div>
      </div>
      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/infra.png" /></div>
        <div>
          <strong>Infrastructure</strong><br /><br />
          <ul>
            <li>What are the key components of the technology infrastructure?</li>
            <li>What technologies are unique to the team?</li>
          </ul>
        </div>
      </div>

      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/method.png" /></div>
        <div>
          <strong>Methodologies</strong><br /><br />
          <ul>
            <li>What methodologies and good practices are being used for conducting work and projects?</li>
            <li>Are there any design methods, such as design thinking and nature-inspired design being used?</li>
          </ul>
        </div>
      </div>

      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/people.png" /></div>
        <div>
          <strong>People</strong><br /><br />
          <ul>
            <li>Smart Team: [#, names]</li>
            <li>Orchestrators:</li>
            <li>Key Players in Team:</li>
            <li>Community / Team Collective:</li>
            <li>Organizational Key Players:</li>
            <li>Organizational Stakeholders:</li>
          </ul>
        </div>
      </div>

      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/collab.png" /></div>
        <div>
          <strong>Collaboration Process</strong><br /><br />
          <ul>
            <li>What is the collaboration process?</li>
            <li>How do team members work together?</li>
            <li>Are all voices heard? Are team members responsive and ideate / problem -solve together effectively?</li>
            <li>What may hinder collaboration and flow of interactions?</li>
          </ul>
        </div>
      </div>

      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/interact.png" /></div>
        <div>
          <strong>Spaces of Interactions</strong><br /><br />
          <ul>
            <li>What are the physical spaces & locations where teams work, collaborate and gather?</li>
            <li>What virtual spaces are used for teams to interact?</li>
            <li>Physical:
            <li>Virtual:</li>
          </ul>
        </div>
      </div>

      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/machines_data.png" /></div>
        <div>
          <strong>Machines & Data</strong><br /><br />
          <ul>
            <li>How are machines, robotics, AI and data used and leveraged in the system?</li>
            <li>What is unique to the team?</li>
          </ul>
        </div>
      </div>

      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/tools.png" /></div>
        <div>
          <strong>Collaboration Tools</strong><br /><br />
          <ul>
            <li>What are key collaboration tools being used?</li>
            <li>What other tools may be needed?</li>
          </ul>
        </div>
      </div>

      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/team.png" /></div>
        <div>
          <strong>Team Composition</strong><br /><br />
          <ul>
            <li>What is the composition of the team in skills and diversity of backgrounds?</li>
            <li>What skills may be missing for optimal team composition?</li>
            <li>What is the optimal number of team members required to achieve goals?</li>
          </ul>
        </div>
      </div>

      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/culture.png" /></div>
        <div>
          <strong>Culture & Rules of Engagement</strong><br /><br />
          <ul>
            <li>What kind of culture is fostered in the team? What are the formal and informal rules of engagement?</li>
            <li>Is there open communication and a collaborative approach? Are there opportunities for social interactions?</li>
          </ul>
        </div>
      </div>

      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/dynamics.png" /></div>
        <div>
          <strong>Team Dynamics</strong><br /><br />
          <ul>
            <li>What are the team dynamics within the team and across other teams?</li>
            <li>Are there clusters of interactions? Are there strong or weak bonds within team?</li>
            <li>Are there good connections across other teams?</li>
          </ul>
        </div>
      </div>

      <div class="flex-container-bot">
        <div class="img-container"><img src="assets/images/challenge.png" /></div>
        <div>
          <strong>Diagnosis of Challenge / Pains</strong><br /><br />
          <ul>
            <li>What are the challenges at hand for the team?</li>
            <li>What are the key pain points?</li>
          </ul>
        </div>
      </div>

      <div class="flex-container-bot">
        <div class="img-container"><img src="assets/images/outcomes.png" /></div>
        <div>
          <strong>Desired Outcomes / Gains</strong><br /><br />
          <ul>
            <li>What are the desired outcomes of addressing the challenges?</li>
            <li>What are the potential gains and benefits of improvement and transformation?</li>
          </ul>
        </div>
      </div>

     <!--
    <aside>
      """),_display_(/*184.8*/commonSidebar()),format.raw/*184.23*/("""
    """),format.raw/*185.5*/("""</aside>
    -->
  </div>
</section>

""")))}),format.raw/*190.2*/("""
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 76541bbb7cf0015785bbb2de98f695e2cefa0154
                  MATRIX: 722->1|818->4|845->6|868->21|907->23|934->25|981->64|1031->77|1059->79|7849->6842|7886->6857|7919->6862|7989->6901
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|30->6|208->184|208->184|209->185|214->190
                  -- GENERATED --
              */
          