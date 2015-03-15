import abbr.documentation.sqlscript.parser.{MySQLParser, MySQLLexer}
import antlr.CommonToken
import org.antlr.runtime.{CommonTokenStream, ANTLRStringStream}

object Main {

  def main(args: Array[String]): Unit = {

    val query = "create table my_table (id integer)"

    val stream: ANTLRStringStream = new ANTLRStringStream(query)

    val lexer: MySQLLexer = new MySQLLexer(stream)

    val tokens: CommonTokenStream = new CommonTokenStream(lexer)

    val parser: MySQLParser = new MySQLParser(tokens)

    parser.create()
  }
}