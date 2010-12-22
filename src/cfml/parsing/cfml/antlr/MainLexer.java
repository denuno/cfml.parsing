package cfml.parsing.cfml.antlr;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.Token;

public class MainLexer {
	public static void main(String[] args) {
		try {
			CharStream input = new ANTLRFileStream("./src/cfml/parsing/cfml/antlr/input");
			XMLLexer lexer = new XMLLexer(input);
			Token token;
			while ((token = lexer.nextToken()) != Token.EOF_TOKEN) {
				System.out.println("Token: " + token.getText());
			}
		} catch (Throwable t) {
			System.out.println("Exception: " + t);
			t.printStackTrace();
		}
	}
}