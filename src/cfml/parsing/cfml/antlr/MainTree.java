package cfml.parsing.cfml.antlr;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;

public class MainTree {
	public static void main(String[] args) {
		try {
			CharStream input = new ANTLRFileStream("./src/cfml/parsing/cfml/antlr/input2");
			XMLLexer lex = new XMLLexer(input);
			
			CommonTokenStream tokens = new CommonTokenStream(lex);
			XMLParser parser = new XMLParser(tokens);
			XMLParser.document_return root = parser.document();
			System.out.println("tree=" + ((Tree) root.tree).toStringTree());
			
			CommonTreeNodeStream nodes = new CommonTreeNodeStream((Tree) root.tree);
			XMLTree walker = new XMLTree(nodes);
			walker.document();
		} catch (Throwable t) {
			System.out.println("exception: " + t);
			t.printStackTrace();
		}
	}
}