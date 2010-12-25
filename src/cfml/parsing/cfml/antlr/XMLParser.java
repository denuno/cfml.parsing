// $ANTLR 3.3 Nov 30, 2010 12:50:56 /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g 2010-12-24 17:22:44

package cfml.parsing.cfml.antlr;

import java.util.LinkedList;
import treetool.TreeBuilder;
import javax.swing.tree.DefaultMutableTreeNode;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class XMLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ELEMENT", "ATTRIBUTE", "PCDATA", "TAG_START_OPEN", "GENERIC_ID", "TAG_CLOSE", "ATTR_EQ", "ATTR_VALUE", "TAG_END_OPEN", "TAG_EMPTY_CLOSE", "LETTER", "NAMECHAR", "DIGIT", "WS"
    };
    public static final int EOF=-1;
    public static final int ELEMENT=4;
    public static final int ATTRIBUTE=5;
    public static final int PCDATA=6;
    public static final int TAG_START_OPEN=7;
    public static final int GENERIC_ID=8;
    public static final int TAG_CLOSE=9;
    public static final int ATTR_EQ=10;
    public static final int ATTR_VALUE=11;
    public static final int TAG_END_OPEN=12;
    public static final int TAG_EMPTY_CLOSE=13;
    public static final int LETTER=14;
    public static final int NAMECHAR=15;
    public static final int DIGIT=16;
    public static final int WS=17;

    // delegates
    // delegators

    protected static class ElementScope_scope {
        String currentElementName;
    }
    protected Stack ElementScope_stack = new Stack();


        public XMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public XMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return XMLParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g"; }


        private TreeBuilder T;
       // private DefaultMutableTreeNode oldNode;
        public void setTreeBuilder(TreeBuilder T){
            this.T = T;
        }


    public static class compilationUnit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilationUnit"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:41:1: compilationUnit : ( element )+ ;
    public final XMLParser.compilationUnit_return compilationUnit() throws RecognitionException {
        XMLParser.compilationUnit_return retval = new XMLParser.compilationUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        XMLParser.element_return element1 = null;



        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:41:17: ( ( element )+ )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:41:19: ( element )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:41:19: ( element )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TAG_START_OPEN) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:41:19: element
            	    {
            	    pushFollow(FOLLOW_element_in_compilationUnit92);
            	    element1=element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, element1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compilationUnit"

    public static class element_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "element"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:43:1: element : ( startTag ( element | PCDATA )* endTag | emptyElement ) ;
    public final XMLParser.element_return element() throws RecognitionException {
        ElementScope_stack.push(new ElementScope_scope());

        XMLParser.element_return retval = new XMLParser.element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PCDATA4=null;
        XMLParser.startTag_return startTag2 = null;

        XMLParser.element_return element3 = null;

        XMLParser.endTag_return endTag5 = null;

        XMLParser.emptyElement_return emptyElement6 = null;


        CommonTree PCDATA4_tree=null;

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:45:5: ( ( startTag ( element | PCDATA )* endTag | emptyElement ) )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:45:7: ( startTag ( element | PCDATA )* endTag | emptyElement )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:45:7: ( startTag ( element | PCDATA )* endTag | emptyElement )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:45:9: startTag ( element | PCDATA )* endTag
                    {
                    pushFollow(FOLLOW_startTag_in_element112);
                    startTag2=startTag();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(startTag2.getTree(), root_0);
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:46:13: ( element | PCDATA )*
                    loop2:
                    do {
                        int alt2=3;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==TAG_START_OPEN) ) {
                            alt2=1;
                        }
                        else if ( (LA2_0==PCDATA) ) {
                            alt2=2;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:46:14: element
                    	    {
                    	    pushFollow(FOLLOW_element_in_element128);
                    	    element3=element();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, element3.getTree());

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:47:15: PCDATA
                    	    {
                    	    PCDATA4=(Token)match(input,PCDATA,FOLLOW_PCDATA_in_element144); 
                    	    PCDATA4_tree = (CommonTree)adaptor.create(PCDATA4);
                    	    adaptor.addChild(root_0, PCDATA4_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    pushFollow(FOLLOW_endTag_in_element173);
                    endTag5=endTag();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:50:11: emptyElement
                    {
                    pushFollow(FOLLOW_emptyElement_in_element186);
                    emptyElement6=emptyElement();

                    state._fsp--;

                    adaptor.addChild(root_0, emptyElement6.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            ElementScope_stack.pop();

        }
        return retval;
    }
    // $ANTLR end "element"

    public static class startTag_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "startTag"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:54:1: startTag : TAG_START_OPEN GENERIC_ID ( attribute )* TAG_CLOSE -> ^( ELEMENT GENERIC_ID ( attribute )* ) ;
    public final XMLParser.startTag_return startTag() throws RecognitionException {
        XMLParser.startTag_return retval = new XMLParser.startTag_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TAG_START_OPEN7=null;
        Token GENERIC_ID8=null;
        Token TAG_CLOSE10=null;
        XMLParser.attribute_return attribute9 = null;


        CommonTree TAG_START_OPEN7_tree=null;
        CommonTree GENERIC_ID8_tree=null;
        CommonTree TAG_CLOSE10_tree=null;
        RewriteRuleTokenStream stream_TAG_CLOSE=new RewriteRuleTokenStream(adaptor,"token TAG_CLOSE");
        RewriteRuleTokenStream stream_TAG_START_OPEN=new RewriteRuleTokenStream(adaptor,"token TAG_START_OPEN");
        RewriteRuleTokenStream stream_GENERIC_ID=new RewriteRuleTokenStream(adaptor,"token GENERIC_ID");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:55:5: ( TAG_START_OPEN GENERIC_ID ( attribute )* TAG_CLOSE -> ^( ELEMENT GENERIC_ID ( attribute )* ) )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:55:7: TAG_START_OPEN GENERIC_ID ( attribute )* TAG_CLOSE
            {
            TAG_START_OPEN7=(Token)match(input,TAG_START_OPEN,FOLLOW_TAG_START_OPEN_in_startTag213);  
            stream_TAG_START_OPEN.add(TAG_START_OPEN7);

            GENERIC_ID8=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_startTag215);  
            stream_GENERIC_ID.add(GENERIC_ID8);

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:55:33: ( attribute )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==GENERIC_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:55:33: attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_startTag217);
            	    attribute9=attribute();

            	    state._fsp--;

            	    stream_attribute.add(attribute9.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            TAG_CLOSE10=(Token)match(input,TAG_CLOSE,FOLLOW_TAG_CLOSE_in_startTag220);  
            stream_TAG_CLOSE.add(TAG_CLOSE10);

            ((ElementScope_scope)ElementScope_stack.peek()).currentElementName = (GENERIC_ID8!=null?GENERIC_ID8.getText():null); 


            // AST REWRITE
            // elements: attribute, GENERIC_ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 57:9: -> ^( ELEMENT GENERIC_ID ( attribute )* )
            {
                // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:57:12: ^( ELEMENT GENERIC_ID ( attribute )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELEMENT, "ELEMENT"), root_1);

                adaptor.addChild(root_1, stream_GENERIC_ID.nextNode());
                // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:57:33: ( attribute )*
                while ( stream_attribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_attribute.nextTree());

                }
                stream_attribute.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "startTag"

    public static class attribute_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:60:1: attribute : GENERIC_ID ATTR_EQ ATTR_VALUE -> ^( ATTRIBUTE GENERIC_ID ATTR_VALUE ) ;
    public final XMLParser.attribute_return attribute() throws RecognitionException {
        XMLParser.attribute_return retval = new XMLParser.attribute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token GENERIC_ID11=null;
        Token ATTR_EQ12=null;
        Token ATTR_VALUE13=null;

        CommonTree GENERIC_ID11_tree=null;
        CommonTree ATTR_EQ12_tree=null;
        CommonTree ATTR_VALUE13_tree=null;
        RewriteRuleTokenStream stream_ATTR_EQ=new RewriteRuleTokenStream(adaptor,"token ATTR_EQ");
        RewriteRuleTokenStream stream_ATTR_VALUE=new RewriteRuleTokenStream(adaptor,"token ATTR_VALUE");
        RewriteRuleTokenStream stream_GENERIC_ID=new RewriteRuleTokenStream(adaptor,"token GENERIC_ID");

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:60:11: ( GENERIC_ID ATTR_EQ ATTR_VALUE -> ^( ATTRIBUTE GENERIC_ID ATTR_VALUE ) )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:60:13: GENERIC_ID ATTR_EQ ATTR_VALUE
            {
            GENERIC_ID11=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_attribute267);  
            stream_GENERIC_ID.add(GENERIC_ID11);

            ATTR_EQ12=(Token)match(input,ATTR_EQ,FOLLOW_ATTR_EQ_in_attribute269);  
            stream_ATTR_EQ.add(ATTR_EQ12);

            ATTR_VALUE13=(Token)match(input,ATTR_VALUE,FOLLOW_ATTR_VALUE_in_attribute271);  
            stream_ATTR_VALUE.add(ATTR_VALUE13);



            // AST REWRITE
            // elements: GENERIC_ID, ATTR_VALUE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 60:43: -> ^( ATTRIBUTE GENERIC_ID ATTR_VALUE )
            {
                // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:60:46: ^( ATTRIBUTE GENERIC_ID ATTR_VALUE )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATTRIBUTE, "ATTRIBUTE"), root_1);

                adaptor.addChild(root_1, stream_GENERIC_ID.nextNode());
                adaptor.addChild(root_1, stream_ATTR_VALUE.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attribute"

    public static class endTag_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "endTag"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:62:1: endTag : {...}? TAG_END_OPEN GENERIC_ID TAG_CLOSE ;
    public final XMLParser.endTag_return endTag() throws RecognitionException {
        XMLParser.endTag_return retval = new XMLParser.endTag_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TAG_END_OPEN14=null;
        Token GENERIC_ID15=null;
        Token TAG_CLOSE16=null;

        CommonTree TAG_END_OPEN14_tree=null;
        CommonTree GENERIC_ID15_tree=null;
        CommonTree TAG_CLOSE16_tree=null;

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:63:5: ({...}? TAG_END_OPEN GENERIC_ID TAG_CLOSE )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:63:7: {...}? TAG_END_OPEN GENERIC_ID TAG_CLOSE
            {
            root_0 = (CommonTree)adaptor.nil();

            if ( !(( ((ElementScope_scope)ElementScope_stack.peek()).currentElementName.equals(input.LT(2).getText()) )) ) {
                throw new FailedPredicateException(input, "endTag", " $ElementScope::currentElementName.equals(input.LT(2).getText()) ");
            }
            TAG_END_OPEN14=(Token)match(input,TAG_END_OPEN,FOLLOW_TAG_END_OPEN_in_endTag303); 
            TAG_END_OPEN14_tree = (CommonTree)adaptor.create(TAG_END_OPEN14);
            adaptor.addChild(root_0, TAG_END_OPEN14_tree);

            GENERIC_ID15=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_endTag305); 
            GENERIC_ID15_tree = (CommonTree)adaptor.create(GENERIC_ID15);
            adaptor.addChild(root_0, GENERIC_ID15_tree);

            TAG_CLOSE16=(Token)match(input,TAG_CLOSE,FOLLOW_TAG_CLOSE_in_endTag307); 
            TAG_CLOSE16_tree = (CommonTree)adaptor.create(TAG_CLOSE16);
            adaptor.addChild(root_0, TAG_CLOSE16_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (FailedPredicateException fpe) {

                String hdr = getErrorHeader(fpe);
                String msg = "end tag (" + input.LT(2).getText() +
                             ") does not match start tag (" +
                             ((ElementScope_scope)ElementScope_stack.peek()).currentElementName +
                             ") currently open, closing it anyway";
                emitErrorMessage(hdr+" "+msg);
                consumeUntil(input, TAG_CLOSE);
                input.consume();

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "endTag"

    public static class emptyElement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "emptyElement"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:77:1: emptyElement : TAG_START_OPEN GENERIC_ID ( attribute )* TAG_EMPTY_CLOSE -> ^( ELEMENT GENERIC_ID ( attribute )* ) ;
    public final XMLParser.emptyElement_return emptyElement() throws RecognitionException {
        XMLParser.emptyElement_return retval = new XMLParser.emptyElement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TAG_START_OPEN17=null;
        Token GENERIC_ID18=null;
        Token TAG_EMPTY_CLOSE20=null;
        XMLParser.attribute_return attribute19 = null;


        CommonTree TAG_START_OPEN17_tree=null;
        CommonTree GENERIC_ID18_tree=null;
        CommonTree TAG_EMPTY_CLOSE20_tree=null;
        RewriteRuleTokenStream stream_TAG_EMPTY_CLOSE=new RewriteRuleTokenStream(adaptor,"token TAG_EMPTY_CLOSE");
        RewriteRuleTokenStream stream_TAG_START_OPEN=new RewriteRuleTokenStream(adaptor,"token TAG_START_OPEN");
        RewriteRuleTokenStream stream_GENERIC_ID=new RewriteRuleTokenStream(adaptor,"token GENERIC_ID");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:77:14: ( TAG_START_OPEN GENERIC_ID ( attribute )* TAG_EMPTY_CLOSE -> ^( ELEMENT GENERIC_ID ( attribute )* ) )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:77:16: TAG_START_OPEN GENERIC_ID ( attribute )* TAG_EMPTY_CLOSE
            {
            TAG_START_OPEN17=(Token)match(input,TAG_START_OPEN,FOLLOW_TAG_START_OPEN_in_emptyElement326);  
            stream_TAG_START_OPEN.add(TAG_START_OPEN17);

            GENERIC_ID18=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_emptyElement328);  
            stream_GENERIC_ID.add(GENERIC_ID18);

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:77:42: ( attribute )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==GENERIC_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:77:42: attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_emptyElement330);
            	    attribute19=attribute();

            	    state._fsp--;

            	    stream_attribute.add(attribute19.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            TAG_EMPTY_CLOSE20=(Token)match(input,TAG_EMPTY_CLOSE,FOLLOW_TAG_EMPTY_CLOSE_in_emptyElement333);  
            stream_TAG_EMPTY_CLOSE.add(TAG_EMPTY_CLOSE20);



            // AST REWRITE
            // elements: attribute, GENERIC_ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 78:9: -> ^( ELEMENT GENERIC_ID ( attribute )* )
            {
                // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:78:12: ^( ELEMENT GENERIC_ID ( attribute )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELEMENT, "ELEMENT"), root_1);

                adaptor.addChild(root_1, stream_GENERIC_ID.nextNode());
                // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:78:33: ( attribute )*
                while ( stream_attribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_attribute.nextTree());

                }
                stream_attribute.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "emptyElement"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\10\uffff";
    static final String DFA3_eofS =
        "\10\uffff";
    static final String DFA3_minS =
        "\1\7\2\10\1\12\2\uffff\1\13\1\10";
    static final String DFA3_maxS =
        "\1\7\1\10\1\15\1\12\2\uffff\1\13\1\15";
    static final String DFA3_acceptS =
        "\4\uffff\1\1\1\2\2\uffff";
    static final String DFA3_specialS =
        "\10\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\3\uffff\1\5",
            "\1\6",
            "",
            "",
            "\1\7",
            "\1\3\1\4\3\uffff\1\5"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "45:7: ( startTag ( element | PCDATA )* endTag | emptyElement )";
        }
    }
 

    public static final BitSet FOLLOW_element_in_compilationUnit92 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_startTag_in_element112 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_element_in_element128 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_PCDATA_in_element144 = new BitSet(new long[]{0x00000000000010C0L});
    public static final BitSet FOLLOW_endTag_in_element173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyElement_in_element186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_OPEN_in_startTag213 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_GENERIC_ID_in_startTag215 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_attribute_in_startTag217 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_TAG_CLOSE_in_startTag220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_ID_in_attribute267 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ATTR_EQ_in_attribute269 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ATTR_VALUE_in_attribute271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_END_OPEN_in_endTag303 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_GENERIC_ID_in_endTag305 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TAG_CLOSE_in_endTag307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_OPEN_in_emptyElement326 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_GENERIC_ID_in_emptyElement328 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_attribute_in_emptyElement330 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_TAG_EMPTY_CLOSE_in_emptyElement333 = new BitSet(new long[]{0x0000000000000002L});

}