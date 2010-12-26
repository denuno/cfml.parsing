// $ANTLR 3.3 Nov 30, 2010 12:50:56 /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g 2010-12-26 05:41:38

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "TAG", "ELEMENT", "ATTRIBUTE", "TAGNAME", "ATTRIBUTENAME", "PCDATA", "TAG_START_OPEN", "GENERIC_ID", "TAG_CLOSE", "ATTR_EQ", "ATTR_VALUE", "TAG_END_OPEN", "TAG_EMPTY_CLOSE", "LETTER", "NAMECHAR", "DIGIT", "WS"
    };
    public static final int EOF=-1;
    public static final int TAG=4;
    public static final int ELEMENT=5;
    public static final int ATTRIBUTE=6;
    public static final int TAGNAME=7;
    public static final int ATTRIBUTENAME=8;
    public static final int PCDATA=9;
    public static final int TAG_START_OPEN=10;
    public static final int GENERIC_ID=11;
    public static final int TAG_CLOSE=12;
    public static final int ATTR_EQ=13;
    public static final int ATTR_VALUE=14;
    public static final int TAG_END_OPEN=15;
    public static final int TAG_EMPTY_CLOSE=16;
    public static final int LETTER=17;
    public static final int NAMECHAR=18;
    public static final int DIGIT=19;
    public static final int WS=20;

    // delegates
    // delegators

    protected static class ElementScope_scope {
        String currentElementName;
        int closerLine;
        int closerPosInLine;
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
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:46:1: compilationUnit : tag ;
    public final XMLParser.compilationUnit_return compilationUnit() throws RecognitionException {
        XMLParser.compilationUnit_return retval = new XMLParser.compilationUnit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        XMLParser.tag_return tag1 = null;



        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:46:17: ( tag )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:46:19: tag
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_tag_in_compilationUnit103);
            tag1=tag();

            state._fsp--;

            adaptor.addChild(root_0, tag1.getTree());

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

    public static class tag_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tag"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:48:1: tag : ( element )* ;
    public final XMLParser.tag_return tag() throws RecognitionException {
        XMLParser.tag_return retval = new XMLParser.tag_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        XMLParser.element_return element2 = null;



        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:48:4: ( ( element )* )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:48:6: ( element )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:48:6: ( element )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TAG_START_OPEN) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:48:6: element
            	    {
            	    pushFollow(FOLLOW_element_in_tag110);
            	    element2=element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, element2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
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
    // $ANTLR end "tag"

    public static class element_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "element"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:50:1: element : ( startTag ( element | PCDATA )* endTag | emptyElement ) ;
    public final XMLParser.element_return element() throws RecognitionException {
        ElementScope_stack.push(new ElementScope_scope());

        XMLParser.element_return retval = new XMLParser.element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PCDATA5=null;
        XMLParser.startTag_return startTag3 = null;

        XMLParser.element_return element4 = null;

        XMLParser.endTag_return endTag6 = null;

        XMLParser.emptyElement_return emptyElement7 = null;


        CommonTree PCDATA5_tree=null;

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:52:5: ( ( startTag ( element | PCDATA )* endTag | emptyElement ) )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:52:7: ( startTag ( element | PCDATA )* endTag | emptyElement )
            {
            root_0 = (CommonTree)adaptor.nil();

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:52:7: ( startTag ( element | PCDATA )* endTag | emptyElement )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:52:9: startTag ( element | PCDATA )* endTag
                    {
                    pushFollow(FOLLOW_startTag_in_element130);
                    startTag3=startTag();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(startTag3.getTree(), root_0);
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:53:13: ( element | PCDATA )*
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
                    	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:53:14: element
                    	    {
                    	    pushFollow(FOLLOW_element_in_element146);
                    	    element4=element();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, element4.getTree());

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:54:15: PCDATA
                    	    {
                    	    PCDATA5=(Token)match(input,PCDATA,FOLLOW_PCDATA_in_element162); 
                    	    PCDATA5_tree = (CommonTree)adaptor.create(PCDATA5);
                    	    adaptor.addChild(root_0, PCDATA5_tree);


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    pushFollow(FOLLOW_endTag_in_element191);
                    endTag6=endTag();

                    state._fsp--;

                    adaptor.addChild(root_0, endTag6.getTree());

                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:57:11: emptyElement
                    {
                    pushFollow(FOLLOW_emptyElement_in_element203);
                    emptyElement7=emptyElement();

                    state._fsp--;

                    adaptor.addChild(root_0, emptyElement7.getTree());

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
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:61:1: startTag : el= TAG_START_OPEN tname= GENERIC_ID ( attribute )* TAG_CLOSE -> ^( ELEMENT[$el] TAGNAME[$tname] ( attribute )* ) ;
    public final XMLParser.startTag_return startTag() throws RecognitionException {
        XMLParser.startTag_return retval = new XMLParser.startTag_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token el=null;
        Token tname=null;
        Token TAG_CLOSE9=null;
        XMLParser.attribute_return attribute8 = null;


        CommonTree el_tree=null;
        CommonTree tname_tree=null;
        CommonTree TAG_CLOSE9_tree=null;
        RewriteRuleTokenStream stream_TAG_CLOSE=new RewriteRuleTokenStream(adaptor,"token TAG_CLOSE");
        RewriteRuleTokenStream stream_TAG_START_OPEN=new RewriteRuleTokenStream(adaptor,"token TAG_START_OPEN");
        RewriteRuleTokenStream stream_GENERIC_ID=new RewriteRuleTokenStream(adaptor,"token GENERIC_ID");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:62:5: (el= TAG_START_OPEN tname= GENERIC_ID ( attribute )* TAG_CLOSE -> ^( ELEMENT[$el] TAGNAME[$tname] ( attribute )* ) )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:62:7: el= TAG_START_OPEN tname= GENERIC_ID ( attribute )* TAG_CLOSE
            {
            el=(Token)match(input,TAG_START_OPEN,FOLLOW_TAG_START_OPEN_in_startTag232);  
            stream_TAG_START_OPEN.add(el);

            tname=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_startTag236);  
            stream_GENERIC_ID.add(tname);

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:62:42: ( attribute )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==GENERIC_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:62:42: attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_startTag238);
            	    attribute8=attribute();

            	    state._fsp--;

            	    stream_attribute.add(attribute8.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            TAG_CLOSE9=(Token)match(input,TAG_CLOSE,FOLLOW_TAG_CLOSE_in_startTag241);  
            stream_TAG_CLOSE.add(TAG_CLOSE9);

            ((ElementScope_scope)ElementScope_stack.peek()).currentElementName = (tname!=null?tname.getText():null);


            // AST REWRITE
            // elements: attribute
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 64:9: -> ^( ELEMENT[$el] TAGNAME[$tname] ( attribute )* )
            {
                // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:64:12: ^( ELEMENT[$el] TAGNAME[$tname] ( attribute )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELEMENT, el), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(TAGNAME, tname));
                // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:64:43: ( attribute )*
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
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:67:1: attribute : aname= GENERIC_ID ATTR_EQ ATTR_VALUE -> ^( ATTRIBUTE[$aname] ATTRIBUTENAME[$aname] ATTR_VALUE ) ;
    public final XMLParser.attribute_return attribute() throws RecognitionException {
        XMLParser.attribute_return retval = new XMLParser.attribute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token aname=null;
        Token ATTR_EQ10=null;
        Token ATTR_VALUE11=null;

        CommonTree aname_tree=null;
        CommonTree ATTR_EQ10_tree=null;
        CommonTree ATTR_VALUE11_tree=null;
        RewriteRuleTokenStream stream_ATTR_EQ=new RewriteRuleTokenStream(adaptor,"token ATTR_EQ");
        RewriteRuleTokenStream stream_ATTR_VALUE=new RewriteRuleTokenStream(adaptor,"token ATTR_VALUE");
        RewriteRuleTokenStream stream_GENERIC_ID=new RewriteRuleTokenStream(adaptor,"token GENERIC_ID");

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:67:11: (aname= GENERIC_ID ATTR_EQ ATTR_VALUE -> ^( ATTRIBUTE[$aname] ATTRIBUTENAME[$aname] ATTR_VALUE ) )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:67:13: aname= GENERIC_ID ATTR_EQ ATTR_VALUE
            {
            aname=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_attribute292);  
            stream_GENERIC_ID.add(aname);

            ATTR_EQ10=(Token)match(input,ATTR_EQ,FOLLOW_ATTR_EQ_in_attribute294);  
            stream_ATTR_EQ.add(ATTR_EQ10);

            ATTR_VALUE11=(Token)match(input,ATTR_VALUE,FOLLOW_ATTR_VALUE_in_attribute296);  
            stream_ATTR_VALUE.add(ATTR_VALUE11);



            // AST REWRITE
            // elements: ATTR_VALUE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 67:49: -> ^( ATTRIBUTE[$aname] ATTRIBUTENAME[$aname] ATTR_VALUE )
            {
                // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:67:52: ^( ATTRIBUTE[$aname] ATTRIBUTENAME[$aname] ATTR_VALUE )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATTRIBUTE, aname), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(ATTRIBUTENAME, aname));
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
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:69:1: endTag : {...}? TAG_END_OPEN GENERIC_ID TAG_CLOSE ;
    public final XMLParser.endTag_return endTag() throws RecognitionException {
        XMLParser.endTag_return retval = new XMLParser.endTag_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TAG_END_OPEN12=null;
        Token GENERIC_ID13=null;
        Token TAG_CLOSE14=null;

        CommonTree TAG_END_OPEN12_tree=null;
        CommonTree GENERIC_ID13_tree=null;
        CommonTree TAG_CLOSE14_tree=null;

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:70:5: ({...}? TAG_END_OPEN GENERIC_ID TAG_CLOSE )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:70:7: {...}? TAG_END_OPEN GENERIC_ID TAG_CLOSE
            {
            root_0 = (CommonTree)adaptor.nil();

            if ( !(( ((ElementScope_scope)ElementScope_stack.peek()).currentElementName.equals(input.LT(2).getText()) )) ) {
                throw new FailedPredicateException(input, "endTag", " $ElementScope::currentElementName.equals(input.LT(2).getText()) ");
            }
            TAG_END_OPEN12=(Token)match(input,TAG_END_OPEN,FOLLOW_TAG_END_OPEN_in_endTag330); 
            TAG_END_OPEN12_tree = (CommonTree)adaptor.create(TAG_END_OPEN12);
            adaptor.addChild(root_0, TAG_END_OPEN12_tree);

            GENERIC_ID13=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_endTag332); 
            GENERIC_ID13_tree = (CommonTree)adaptor.create(GENERIC_ID13);
            adaptor.addChild(root_0, GENERIC_ID13_tree);

            TAG_CLOSE14=(Token)match(input,TAG_CLOSE,FOLLOW_TAG_CLOSE_in_endTag334); 
            TAG_CLOSE14_tree = (CommonTree)adaptor.create(TAG_CLOSE14);
            adaptor.addChild(root_0, TAG_CLOSE14_tree);


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
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:84:1: emptyElement : el= TAG_START_OPEN tname= GENERIC_ID ( attribute )* TAG_EMPTY_CLOSE -> ^( ELEMENT[$el] GENERIC_ID[$tname] ( attribute )* ) ;
    public final XMLParser.emptyElement_return emptyElement() throws RecognitionException {
        XMLParser.emptyElement_return retval = new XMLParser.emptyElement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token el=null;
        Token tname=null;
        Token TAG_EMPTY_CLOSE16=null;
        XMLParser.attribute_return attribute15 = null;


        CommonTree el_tree=null;
        CommonTree tname_tree=null;
        CommonTree TAG_EMPTY_CLOSE16_tree=null;
        RewriteRuleTokenStream stream_TAG_EMPTY_CLOSE=new RewriteRuleTokenStream(adaptor,"token TAG_EMPTY_CLOSE");
        RewriteRuleTokenStream stream_TAG_START_OPEN=new RewriteRuleTokenStream(adaptor,"token TAG_START_OPEN");
        RewriteRuleTokenStream stream_GENERIC_ID=new RewriteRuleTokenStream(adaptor,"token GENERIC_ID");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:84:14: (el= TAG_START_OPEN tname= GENERIC_ID ( attribute )* TAG_EMPTY_CLOSE -> ^( ELEMENT[$el] GENERIC_ID[$tname] ( attribute )* ) )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:84:16: el= TAG_START_OPEN tname= GENERIC_ID ( attribute )* TAG_EMPTY_CLOSE
            {
            el=(Token)match(input,TAG_START_OPEN,FOLLOW_TAG_START_OPEN_in_emptyElement355);  
            stream_TAG_START_OPEN.add(el);

            tname=(Token)match(input,GENERIC_ID,FOLLOW_GENERIC_ID_in_emptyElement359);  
            stream_GENERIC_ID.add(tname);

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:84:51: ( attribute )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==GENERIC_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:84:51: attribute
            	    {
            	    pushFollow(FOLLOW_attribute_in_emptyElement361);
            	    attribute15=attribute();

            	    state._fsp--;

            	    stream_attribute.add(attribute15.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            TAG_EMPTY_CLOSE16=(Token)match(input,TAG_EMPTY_CLOSE,FOLLOW_TAG_EMPTY_CLOSE_in_emptyElement364);  
            stream_TAG_EMPTY_CLOSE.add(TAG_EMPTY_CLOSE16);



            // AST REWRITE
            // elements: GENERIC_ID, attribute
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 85:9: -> ^( ELEMENT[$el] GENERIC_ID[$tname] ( attribute )* )
            {
                // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:85:12: ^( ELEMENT[$el] GENERIC_ID[$tname] ( attribute )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ELEMENT, el), root_1);

                adaptor.addChild(root_1, (CommonTree)adaptor.create(GENERIC_ID, tname));
                // /Users/valliant/Projects/java/CFML/cfml.parsing/src/cfml/parsing/cfml/antlr/XML.g:85:46: ( attribute )*
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
        "\1\12\2\13\1\15\2\uffff\1\16\1\13";
    static final String DFA3_maxS =
        "\1\12\1\13\1\20\1\15\2\uffff\1\16\1\20";
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
            return "52:7: ( startTag ( element | PCDATA )* endTag | emptyElement )";
        }
    }
 

    public static final BitSet FOLLOW_tag_in_compilationUnit103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_in_tag110 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_startTag_in_element130 = new BitSet(new long[]{0x0000000000008600L});
    public static final BitSet FOLLOW_element_in_element146 = new BitSet(new long[]{0x0000000000008600L});
    public static final BitSet FOLLOW_PCDATA_in_element162 = new BitSet(new long[]{0x0000000000008600L});
    public static final BitSet FOLLOW_endTag_in_element191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyElement_in_element203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_OPEN_in_startTag232 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_GENERIC_ID_in_startTag236 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_attribute_in_startTag238 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_TAG_CLOSE_in_startTag241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_ID_in_attribute292 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ATTR_EQ_in_attribute294 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ATTR_VALUE_in_attribute296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_END_OPEN_in_endTag330 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_GENERIC_ID_in_endTag332 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_TAG_CLOSE_in_endTag334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TAG_START_OPEN_in_emptyElement355 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_GENERIC_ID_in_emptyElement359 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_attribute_in_emptyElement361 = new BitSet(new long[]{0x0000000000010800L});
    public static final BitSet FOLLOW_TAG_EMPTY_CLOSE_in_emptyElement364 = new BitSet(new long[]{0x0000000000000002L});

}