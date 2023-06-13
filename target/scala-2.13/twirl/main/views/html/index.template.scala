
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
          <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#governModal">Edit</button>

          <!-- Modal -->
          <div class="modal fade bd-example-modal-lg" id="governModal" role="dialog">
            <div class="modal-dialog modal-lg">

              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">Governance</h4>
                </div>
                <div class="modal-body">
                  <form action="#">
                    <div class="form-group">
                      <label for="content">Update content:</label>
                      <textarea class="form-control" id="governContent" rows="10">xxx, xxx
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
      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/infra.png" /></div>
        <div>
          <strong>Infrastructure</strong><br /><br />
          <ul>
            <li>What are the key components of the technology infrastructure?</li>
            <li>What technologies are unique to the team?</li>
          </ul>
          <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#infraModal">Edit</button>

          <!-- Modal -->
          <div class="modal fade bd-example-modal-lg" id="infraModal" role="dialog">
            <div class="modal-dialog modal-lg">

              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">Infrastructure</h4>
                </div>
                <div class="modal-body">
                  <form action="#">
                    <div class="form-group">
                      <label for="content">Update content:</label>
                      <textarea class="form-control" id="infraContent" rows="10">What are the key components of the technology infrastructure? What technologies are unique to the team?
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

      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/method.png" /></div>
        <div>
          <strong>Methodologies</strong><br /><br />
          <ul>
            <li>What methodologies and good practices are being used for conducting work and projects?</li>
            <li>Are there any design methods, such as design thinking and nature-inspired design being used?</li>
          </ul>
          <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#methodModal">Edit</button>

          <!-- Modal -->
          <div class="modal fade bd-example-modal-lg" id="methodModal" role="dialog">
            <div class="modal-dialog modal-lg">

              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">Methodologies</h4>
                </div>
                <div class="modal-body">
                  <form action="#">
                    <div class="form-group">
                      <label for="content">Update content:</label>
                      <textarea class="form-control" id="methodContent" rows="10">What methodologies and good practices are being used for conducting work and projects? Are there any design methods, such as design thinking and nature-inspired design being used?
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
          <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#peopleModal">Edit</button>

          <!-- Modal -->
          <div class="modal fade bd-example-modal-lg" id="peopleModal" role="dialog">
            <div class="modal-dialog modal-lg">

              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">People</h4>
                </div>
                <div class="modal-body">
                  <form action="#">
                    <div class="form-group">
                      <label for="content">Update content:</label>
                      <textarea class="form-control" id="peopleContent" rows="10">Smart Team: [#, names] Orchestrators: Key Players in Team: Community / Team Collective: Organizational Key Players: Organizational Stakeholders:</textarea>
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
          <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#collabModal">Edit</button>

          <!-- Modal -->
          <div class="modal fade bd-example-modal-lg" id="collabModal" role="dialog">
            <div class="modal-dialog modal-lg">

              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">Collaboration Process</h4>
                </div>
                <div class="modal-body">
                  <form action="#">
                    <div class="form-group">
                      <label for="content">Update content:</label>
                      <textarea class="form-control" id="collabContent" rows="10">What is the collaboration process? How do team members work together? Are all voices heard? Are team members responsive and ideate / problem -solve together effectively? What may hinder collaboration and flow of interactions?</textarea>
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

      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/interact.png" /></div>
        <div>
          <strong>Spaces of Interactions</strong><br /><br />
          <ul>
            <li>What are the physical spaces & locations where teams work, collaborate and gather?</li>
            <li>What virtual spaces are used for teams to interact?</li>
            <li>Physical:</li>
            <li>Virtual:</li>
          </ul>
          <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#spaceModal">Edit</button>

          <!-- Modal -->
          <div class="modal fade bd-example-modal-lg" id="spaceModal" role="dialog">
            <div class="modal-dialog modal-lg">

              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">Spaces of Interactions</h4>
                </div>
                <div class="modal-body">
                  <form action="#">
                    <div class="form-group">
                      <label for="content">Update content:</label>
                      <textarea class="form-control" id="spaceContent" rows="10">What are the physical spaces & locations where teams work, collaborate and gather? What virtual spaces are used for teams to interact? Physical: Virtual:</textarea>
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

      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/machines_data.png" /></div>
        <div>
          <strong>Machines & Data</strong><br /><br />
          <ul>
            <li>How are machines, robotics, AI and data used and leveraged in the system?</li>
            <li>What is unique to the team?</li>
          </ul>
          <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#machinesModal">Edit</button>

          <!-- Modal -->
          <div class="modal fade bd-example-modal-lg" id="machinesModal" role="dialog">
            <div class="modal-dialog modal-lg">

              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">Machines & Data</h4>
                </div>
                <div class="modal-body">
                  <form action="#">
                    <div class="form-group">
                      <label for="content">Update content:</label>
                      <textarea class="form-control" id="machinesContent" rows="10">How are machines, robotics, AI and data used and leveraged in the system? What is unique to the team?</textarea>
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

      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/tools.png" /></div>
        <div>
          <strong>Collaboration Tools</strong><br /><br />
          <ul>
            <li>What are key collaboration tools being used?</li>
            <li>What other tools may be needed?</li>
          </ul>
          <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#toolsModal">Edit</button>

          <!-- Modal -->
          <div class="modal fade bd-example-modal-lg" id="toolsModal" role="dialog">
            <div class="modal-dialog modal-lg">

              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">Collaboration Tools</h4>
                </div>
                <div class="modal-body">
                  <form action="#">
                    <div class="form-group">
                      <label for="content">Update content:</label>
                      <textarea class="form-control" id="toolsContent" rows="10">What are key collaboration tools being used? What other tools may be needed?</textarea>
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

      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/team.png" /></div>
        <div>
          <strong>Team Composition</strong><br /><br />
          <ul>
            <li>What is the composition of the team in skills and diversity of backgrounds?</li>
            <li>What skills may be missing for optimal team composition?</li>
            <li>What is the optimal number of team members required to achieve goals?</li>
          </ul>
          <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#teamModal">Edit</button>

          <!-- Modal -->
          <div class="modal fade bd-example-modal-lg" id="teamModal" role="dialog">
            <div class="modal-dialog modal-lg">

              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">Team Composition</h4>
                </div>
                <div class="modal-body">
                  <form action="#">
                    <div class="form-group">
                      <label for="content">Update content:</label>
                      <textarea class="form-control" id="teamContent" rows="10">What is the composition of the team in skills and diversity of backgrounds? What skills may be missing for optimal team composition? What is the optimal number of team members required to achieve goals?</textarea>
                    </div>
                    <button type="submit" class="btn btn-default">Submit</button>
                  </form>

                </div>
                <d"""),
format.raw("""iv class="modal-footer">
                  <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                </div>
              </div>
            </div>
          </div>
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
          <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#cultureModal">Edit</button>

          <!-- Modal -->
          <div class="modal fade bd-example-modal-lg" id="cultureModal" role="dialog">
            <div class="modal-dialog modal-lg">

              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">Culture & Rules of Engagement</h4>
                </div>
                <div class="modal-body">
                  <form action="#">
                    <div class="form-group">
                      <label for="content">Update content:</label>
                      <textarea class="form-control" id="cultureContent" rows="10">What kind of culture is fostered in the team? What are the formal and informal rules of engagement? Is there open communication and a collaborative approach? Are there opportunities for social interactions?</textarea>
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

      <div class="flex-container-mid">
        <div class="img-container"><img src="assets/images/dynamics.png" /></div>
        <div>
          <strong>Team Dynamics</strong><br /><br />
          <ul>
            <li>What are the team dynamics within the team and across other teams?</li>
            <li>Are there clusters of interactions? Are there strong or weak bonds within team?</li>
            <li>Are there good connections across other teams?</li>
          </ul>
          <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#dynamicModal">Edit</button>

          <!-- Modal -->
          <div class="modal fade bd-example-modal-lg" id="dynamicModal" role="dialog">
            <div class="modal-dialog modal-lg">

              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">Team Dynamics</h4>
                </div>
                <div class="modal-body">
                  <form action="#">
                    <div class="form-group">
                      <label for="content">Update content:</label>
                      <textarea class="form-control" id="dynamicContent" rows="10">What are the team dynamics within the team and across other teams? Are there clusters of interactions? Are there strong or weak bonds within team? Are there good connections across other teams?</textarea>
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

      <div class="flex-container-bot">
        <div class="img-container"><img src="assets/images/challenge.png" /></div>
        <div>
          <strong>Diagnosis of Challenge / Pains</strong><br /><br />
          <ul>
            <li>What are the challenges at hand for the team?</li>
            <li>What are the key pain points?</li>
          </ul>
          <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#challengeModal">Edit</button>

          <!-- Modal -->
          <div class="modal fade bd-example-modal-lg" id="challengeModal" role="dialog">
            <div class="modal-dialog modal-lg">

              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">Diagnosis of Challenges / Pains</h4>
                </div>
                <div class="modal-body">
                  <form action="#">
                    <div class="form-group">
                      <label for="content">Update content:</label>
                      <textarea class="form-control" id="challengesContent" rows="10">What are the challenges at hand for the team?What are the key pain points?</textarea>
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

      <div class="flex-container-bot">
        <div class="img-container"><img src="assets/images/outcomes.png" /></div>
        <div>
          <strong>Desired Outcomes / Gains</strong><br /><br />
          <ul>
            <li>What are the desired outcomes of addressing the challenges?</li>
            <li>What are the potential gains and benefits of improvement and transformation?</li>
          </ul>
          <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#outcomesModal">Edit</button>

          <!-- Modal -->
          <div class="modal fade bd-example-modal-lg" id="outcomesModal" role="dialog">
            <div class="modal-dialog modal-lg">

              <!-- Modal content-->
              <div class="modal-content">
                <div class="modal-header">
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
                  <h4 class="modal-title">Desired Outcomes / Gains</h4>
                </div>
                <div class="modal-body">
                  <form action="#">
                    <div class="form-group">
                      <label for="content">Update content:</label>
                      <textarea class="form-control" id="outcomesContent" rows="10">What are the desired outcomes of addressing the challenges? What are the potential gains and benefits of improvement and transformation?</textarea>
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

  </div>
</section>

""")))}),format.raw/*613.2*/("""
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
                  HASH: 3a7a733383d0f2a220b4df7ee4d10286eba6ce54
                  MATRIX: 722->1|818->4|845->6|868->21|907->23|934->25|981->64|1031->77|1058->78|28856->27825
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|28->4|28->4|29->5|638->613
                  -- GENERATED --
              */
          