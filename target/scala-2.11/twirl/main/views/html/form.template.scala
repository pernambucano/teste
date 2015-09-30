
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object form_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class form extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[java.util.List[String],Form[Query],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(opcoes: java.util.List[String], queryForm: Form[Query]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),_display_(/*3.2*/main("query form")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
	"""),format.raw/*4.2*/("""<h1>Query</h1>	
	"""),_display_(/*5.3*/helper/*5.9*/.form(action = routes.Application.handleQuery())/*5.57*/ {_display_(Seq[Any](format.raw/*5.59*/("""
	"""),format.raw/*6.2*/("""<fieldset>
	<legend>query</legend>
	"""),_display_(/*8.3*/helper/*8.9*/.inputText(queryForm("queryStr"),'_label -> "Query")),format.raw/*8.61*/("""
	
	"""),_display_(/*10.3*/for((o, index) <- opcoes.zipWithIndex) yield /*10.41*/ {_display_(Seq[Any](format.raw/*10.43*/("""
	"""),format.raw/*11.2*/("""<label>
	<input type="checkbox" name="opcoes["""),_display_(/*12.39*/index),format.raw/*12.44*/("""]" value=""""),_display_(/*12.55*/o),format.raw/*12.56*/("""">
	"""),_display_(/*13.3*/o),format.raw/*13.4*/("""
	"""),format.raw/*14.2*/("""</label>
	""")))}),format.raw/*15.3*/("""
	
	
	
	"""),format.raw/*19.2*/("""</fieldset>
	<input type="submit" class="btn btn-primary" value="Save">
	<a class="btn" href=""""),_display_(/*21.24*/routes/*21.30*/.Application.query()),format.raw/*21.50*/("""">Cancel</a>
	""")))}),format.raw/*22.3*/("""
""")))}))
      }
    }
  }

  def render(opcoes:java.util.List[String],queryForm:Form[Query]): play.twirl.api.HtmlFormat.Appendable = apply(opcoes,queryForm)

  def f:((java.util.List[String],Form[Query]) => play.twirl.api.HtmlFormat.Appendable) = (opcoes,queryForm) => apply(opcoes,queryForm)

  def ref: this.type = this

}


}

/**/
object form extends form_Scope0.form
              /*
                  -- GENERATED --
                  DATE: Tue Sep 29 21:58:33 BRT 2015
                  SOURCE: /Users/paulofernandes/Developer/wiki_play/mineracao_wiki/app/views/form.scala.html
                  HASH: 701e021fbaf49625832286995a063f236364301e
                  MATRIX: 771->1|922->57|950->60|976->78|1015->80|1043->82|1086->100|1099->106|1155->154|1194->156|1222->158|1284->195|1297->201|1369->253|1400->258|1454->296|1494->298|1523->300|1596->346|1622->351|1660->362|1682->363|1713->368|1734->369|1763->371|1804->382|1839->390|1961->485|1976->491|2017->511|2062->526
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|36->5|37->6|39->8|39->8|39->8|41->10|41->10|41->10|42->11|43->12|43->12|43->12|43->12|44->13|44->13|45->14|46->15|50->19|52->21|52->21|52->21|53->22
                  -- GENERATED --
              */
          