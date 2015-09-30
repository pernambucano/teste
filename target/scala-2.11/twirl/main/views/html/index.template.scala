
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[ArrayList[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(results: ArrayList[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("Wikipedia Search")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""
	"""),format.raw/*4.2*/("""<table class="table table-striped">
		<thead>
			<tr>
				<th>Name</th>
			</tr>
		</thead>
		<tbody>
			"""),_display_(/*11.5*/for(result <- results) yield /*11.27*/{_display_(Seq[Any](format.raw/*11.28*/("""
				"""),format.raw/*12.5*/("""<tr>
					<td><a href="#">"""),_display_(/*13.23*/result),format.raw/*13.29*/("""</a></td></tr>""")))}),format.raw/*13.44*/("""
		"""),format.raw/*14.3*/("""</tbody>
	</table>
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(results:ArrayList[String]): play.twirl.api.HtmlFormat.Appendable = apply(results)

  def f:((ArrayList[String]) => play.twirl.api.HtmlFormat.Appendable) = (results) => apply(results)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Sep 29 21:12:01 BRT 2015
                  SOURCE: /Users/paulofernandes/Developer/wiki_play/mineracao_wiki/app/views/index.scala.html
                  HASH: 4152afe039eb10009a503ebf52a77dd9d36e9237
                  MATRIX: 756->1|879->29|907->32|939->56|978->58|1006->60|1138->166|1176->188|1215->189|1247->194|1301->221|1328->227|1374->242|1404->245|1454->265
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|47->16
                  -- GENERATED --
              */
          