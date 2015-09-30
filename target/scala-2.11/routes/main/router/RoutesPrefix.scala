
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/paulofernandes/Developer/wiki_play/mineracao_wiki/conf/routes
// @DATE:Tue Sep 29 21:49:59 BRT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
