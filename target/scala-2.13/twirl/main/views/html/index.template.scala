
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
"""),format.raw/*5.1*/("""<section id="content">
  <div class="wrapper">


    <div class="flex-container-top">
        <div class="img-container"><img src="assets/images/earth.png" /></div>
          <div>
              <strong>Ethos / Guiding Life Principles</strong><br /><br />
              <ul>
                <li>What is the ethos and guiding principles of the organization?</li>
                <li>How does the organization ethos and guiding principles translate for the collective of teams? (E.g. focus may be Teamwork)</li>
              </ul>
            <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#ethosModal">Edit</button>

            <!-- Modal -->
            <div class="modal fade bd-example-modal-lg" id="ethosModal" role="dialog">
              <div class="modal-dialog modal-lg">

                <!-- Modal content-->
                <div class="modal-content">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                    <h4 class="modal-title">Ethos / Guiding Life Principles</h4>
                  </div>
                  <div class="modal-body">
                    <form action="#">
                      <div class="form-group">
                        <label for="content">Update content:</label>
                        <textarea class="form-control" id="ethosContent" rows="10">What is the ethos and guiding principles of the organization? How does the organization ethos and guiding principles translate for the collective of teams? (E.g. focus may be Teamwork)
                        </textarea>
                      </div>
                      <button type="submit" class="btn btn-default">Submit</button>
                    </form>

                  </div>
                  <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                  </div>
                </div>

              </div>
            </div>
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
          <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#purposeModal">Edit</button>

          <!-- Modal -->
          <div class="modal fade bd-example-modal-lg" id="purposeModal" role="dialog">
            <div class="modal-dialog modal-lg">

              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">Aligned Shared Purpose</h4>
                </div>
                <div class="modal-body">
                  <form action="#">
                    <div class="form-group">
                      <label for="content">Update content:</label>
                      <textarea class="form-control" id="purposeContent" rows="10">High Reliability Access / Insight Process Improvement
                        </textarea>
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button>
                  </form>

                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </div>
              </div>

            </div>
          </div>
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
      """),_display_(/*244.8*/commonSidebar()),format.raw/*244.23*/("""
    """),format.raw/*245.5*/("""</aside>
    -->
  </div>
</section>

""")))}),format.raw/*250.2*/("""
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
                  HASH: 042ace1b610cae4b52b9deb2ff7f3129adc2eb83
                  MATRIX: 722->1|818->4|845->6|868->21|907->23|934->25|981->64|1031->77|1058->78|10701->9694|10738->9709|10771->9714|10841->9753
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|29->5|268->244|268->244|269->245|274->250
                  -- GENERATED --
              */
          