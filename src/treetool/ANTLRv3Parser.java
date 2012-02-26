// $ANTLR 3.3 Nov 30, 2010 12:50:56 /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g 2011-08-16 16:28:00

package treetool;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
/** ANTLR v3 grammar written in ANTLR v3 with AST construction */
public class ANTLRv3Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DOC_COMMENT", "PARSER", "LEXER", "RULE", "BLOCK", "OPTIONAL", "CLOSURE", "POSITIVE_CLOSURE", "SYNPRED", "RANGE", "CHAR_RANGE", "EPSILON", "ALT", "EOR", "EOB", "EOA", "ID", "ARG", "ARGLIST", "RET", "LEXER_GRAMMAR", "PARSER_GRAMMAR", "TREE_GRAMMAR", "COMBINED_GRAMMAR", "INITACTION", "LABEL", "TEMPLATE", "SCOPE", "SEMPRED", "GATED_SEMPRED", "SYN_SEMPRED", "BACKTRACK_SEMPRED", "FRAGMENT", "TREE_BEGIN", "ROOT", "BANG", "REWRITE", "TOKENS", "TOKEN_REF", "STRING_LITERAL", "CHAR_LITERAL", "ACTION", "OPTIONS", "INT", "ARG_ACTION", "RULE_REF", "DOUBLE_QUOTE_STRING_LITERAL", "DOUBLE_ANGLE_STRING_LITERAL", "SRC", "SL_COMMENT", "ML_COMMENT", "LITERAL_CHAR", "ESC", "XDIGIT", "NESTED_ARG_ACTION", "ACTION_STRING_LITERAL", "ACTION_CHAR_LITERAL", "NESTED_ACTION", "ACTION_ESC", "WS_LOOP", "WS", "'lexer'", "'parser'", "'tree'", "'grammar'", "';'", "'}'", "'='", "'@'", "'::'", "'*'", "'protected'", "'public'", "'private'", "'returns'", "':'", "'throws'", "','", "'('", "'|'", "')'", "'catch'", "'finally'", "'+='", "'=>'", "'~'", "'?'", "'+'", "'.'", "'$'"
    };
    public static final int EOF=-1;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int DOC_COMMENT=4;
    public static final int PARSER=5;
    public static final int LEXER=6;
    public static final int RULE=7;
    public static final int BLOCK=8;
    public static final int OPTIONAL=9;
    public static final int CLOSURE=10;
    public static final int POSITIVE_CLOSURE=11;
    public static final int SYNPRED=12;
    public static final int RANGE=13;
    public static final int CHAR_RANGE=14;
    public static final int EPSILON=15;
    public static final int ALT=16;
    public static final int EOR=17;
    public static final int EOB=18;
    public static final int EOA=19;
    public static final int ID=20;
    public static final int ARG=21;
    public static final int ARGLIST=22;
    public static final int RET=23;
    public static final int LEXER_GRAMMAR=24;
    public static final int PARSER_GRAMMAR=25;
    public static final int TREE_GRAMMAR=26;
    public static final int COMBINED_GRAMMAR=27;
    public static final int INITACTION=28;
    public static final int LABEL=29;
    public static final int TEMPLATE=30;
    public static final int SCOPE=31;
    public static final int SEMPRED=32;
    public static final int GATED_SEMPRED=33;
    public static final int SYN_SEMPRED=34;
    public static final int BACKTRACK_SEMPRED=35;
    public static final int FRAGMENT=36;
    public static final int TREE_BEGIN=37;
    public static final int ROOT=38;
    public static final int BANG=39;
    public static final int REWRITE=40;
    public static final int TOKENS=41;
    public static final int TOKEN_REF=42;
    public static final int STRING_LITERAL=43;
    public static final int CHAR_LITERAL=44;
    public static final int ACTION=45;
    public static final int OPTIONS=46;
    public static final int INT=47;
    public static final int ARG_ACTION=48;
    public static final int RULE_REF=49;
    public static final int DOUBLE_QUOTE_STRING_LITERAL=50;
    public static final int DOUBLE_ANGLE_STRING_LITERAL=51;
    public static final int SRC=52;
    public static final int SL_COMMENT=53;
    public static final int ML_COMMENT=54;
    public static final int LITERAL_CHAR=55;
    public static final int ESC=56;
    public static final int XDIGIT=57;
    public static final int NESTED_ARG_ACTION=58;
    public static final int ACTION_STRING_LITERAL=59;
    public static final int ACTION_CHAR_LITERAL=60;
    public static final int NESTED_ACTION=61;
    public static final int ACTION_ESC=62;
    public static final int WS_LOOP=63;
    public static final int WS=64;

    // delegates
    // delegators


        public ANTLRv3Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ANTLRv3Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("ANTLRv3ParserTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return ANTLRv3Parser.tokenNames; }
    public String getGrammarFileName() { return "/Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g"; }


        int count = 0;


    public static class grammarDef_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "grammarDef"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:101:1: grammarDef : ( DOC_COMMENT )? ( 'lexer' | 'parser' | 'tree' | ) 'grammar' id ';' ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ EOF ;
    public final ANTLRv3Parser.grammarDef_return grammarDef() throws RecognitionException {
        ANTLRv3Parser.grammarDef_return retval = new ANTLRv3Parser.grammarDef_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:102:5: ( ( DOC_COMMENT )? ( 'lexer' | 'parser' | 'tree' | ) 'grammar' id ';' ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ EOF )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:102:9: ( DOC_COMMENT )? ( 'lexer' | 'parser' | 'tree' | ) 'grammar' id ';' ( optionsSpec )? ( tokensSpec )? ( attrScope )* ( action )* ( rule )+ EOF
            {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:102:9: ( DOC_COMMENT )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==DOC_COMMENT) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:102:9: DOC_COMMENT
                    {
                    match(input,DOC_COMMENT,FOLLOW_DOC_COMMENT_in_grammarDef353); 

                    }
                    break;

            }

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:103:6: ( 'lexer' | 'parser' | 'tree' | )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt2=1;
                }
                break;
            case 66:
                {
                alt2=2;
                }
                break;
            case 67:
                {
                alt2=3;
                }
                break;
            case 68:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:103:8: 'lexer'
                    {
                    match(input,65,FOLLOW_65_in_grammarDef363); 

                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:104:10: 'parser'
                    {
                    match(input,66,FOLLOW_66_in_grammarDef379); 

                    }
                    break;
                case 3 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:105:10: 'tree'
                    {
                    match(input,67,FOLLOW_67_in_grammarDef394); 

                    }
                    break;
                case 4 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:107:6: 
                    {
                    }
                    break;

            }

            match(input,68,FOLLOW_68_in_grammarDef418); 
            pushFollow(FOLLOW_id_in_grammarDef420);
            id();

            state._fsp--;

            match(input,69,FOLLOW_69_in_grammarDef422); 
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:107:25: ( optionsSpec )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==OPTIONS) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:107:25: optionsSpec
                    {
                    pushFollow(FOLLOW_optionsSpec_in_grammarDef424);
                    optionsSpec();

                    state._fsp--;


                    }
                    break;

            }

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:107:38: ( tokensSpec )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TOKENS) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:107:38: tokensSpec
                    {
                    pushFollow(FOLLOW_tokensSpec_in_grammarDef427);
                    tokensSpec();

                    state._fsp--;


                    }
                    break;

            }

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:107:50: ( attrScope )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==SCOPE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:107:50: attrScope
            	    {
            	    pushFollow(FOLLOW_attrScope_in_grammarDef430);
            	    attrScope();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:107:61: ( action )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==72) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:107:61: action
            	    {
            	    pushFollow(FOLLOW_action_in_grammarDef433);
            	    action();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:108:6: ( rule )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==DOC_COMMENT||LA7_0==FRAGMENT||LA7_0==TOKEN_REF||LA7_0==RULE_REF||(LA7_0>=75 && LA7_0<=77)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:108:6: rule
            	    {
            	    pushFollow(FOLLOW_rule_in_grammarDef441);
            	    rule();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_grammarDef449); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "grammarDef"

    public static class tokensSpec_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "tokensSpec"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:112:1: tokensSpec : TOKENS ( tokenSpec )+ '}' ;
    public final ANTLRv3Parser.tokensSpec_return tokensSpec() throws RecognitionException {
        ANTLRv3Parser.tokensSpec_return retval = new ANTLRv3Parser.tokensSpec_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:113:2: ( TOKENS ( tokenSpec )+ '}' )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:113:4: TOKENS ( tokenSpec )+ '}'
            {
            match(input,TOKENS,FOLLOW_TOKENS_in_tokensSpec463); 
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:113:11: ( tokenSpec )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==TOKEN_REF) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:113:11: tokenSpec
            	    {
            	    pushFollow(FOLLOW_tokenSpec_in_tokensSpec465);
            	    tokenSpec();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            match(input,70,FOLLOW_70_in_tokensSpec468); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tokensSpec"

    public static class tokenSpec_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "tokenSpec"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:116:1: tokenSpec : TOKEN_REF ( '=' ( STRING_LITERAL | CHAR_LITERAL ) | ) ';' ;
    public final ANTLRv3Parser.tokenSpec_return tokenSpec() throws RecognitionException {
        ANTLRv3Parser.tokenSpec_return retval = new ANTLRv3Parser.tokenSpec_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:117:2: ( TOKEN_REF ( '=' ( STRING_LITERAL | CHAR_LITERAL ) | ) ';' )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:117:4: TOKEN_REF ( '=' ( STRING_LITERAL | CHAR_LITERAL ) | ) ';'
            {
            match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_tokenSpec479); 
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:118:3: ( '=' ( STRING_LITERAL | CHAR_LITERAL ) | )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==71) ) {
                alt9=1;
            }
            else if ( (LA9_0==69) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:118:5: '=' ( STRING_LITERAL | CHAR_LITERAL )
                    {
                    match(input,71,FOLLOW_71_in_tokenSpec485); 
                    if ( (input.LA(1)>=STRING_LITERAL && input.LA(1)<=CHAR_LITERAL) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:120:3: 
                    {
                    }
                    break;

            }

            match(input,69,FOLLOW_69_in_tokenSpec505); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "tokenSpec"

    public static class attrScope_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "attrScope"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:124:1: attrScope : 'scope' id ACTION ;
    public final ANTLRv3Parser.attrScope_return attrScope() throws RecognitionException {
        ANTLRv3Parser.attrScope_return retval = new ANTLRv3Parser.attrScope_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:125:2: ( 'scope' id ACTION )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:125:4: 'scope' id ACTION
            {
            match(input,SCOPE,FOLLOW_SCOPE_in_attrScope516); 
            pushFollow(FOLLOW_id_in_attrScope518);
            id();

            state._fsp--;

            match(input,ACTION,FOLLOW_ACTION_in_attrScope520); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attrScope"

    public static class action_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "action"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:128:1: action : '@' ( actionScopeName '::' )? id ACTION ;
    public final ANTLRv3Parser.action_return action() throws RecognitionException {
        ANTLRv3Parser.action_return retval = new ANTLRv3Parser.action_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:130:2: ( '@' ( actionScopeName '::' )? id ACTION )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:130:4: '@' ( actionScopeName '::' )? id ACTION
            {
            match(input,72,FOLLOW_72_in_action533); 
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:130:8: ( actionScopeName '::' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==TOKEN_REF||LA10_0==RULE_REF) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==73) ) {
                    alt10=1;
                }
            }
            else if ( ((LA10_0>=65 && LA10_0<=66)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:130:9: actionScopeName '::'
                    {
                    pushFollow(FOLLOW_actionScopeName_in_action536);
                    actionScopeName();

                    state._fsp--;

                    match(input,73,FOLLOW_73_in_action538); 

                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_action542);
            id();

            state._fsp--;

            match(input,ACTION,FOLLOW_ACTION_in_action544); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "action"

    public static class actionScopeName_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "actionScopeName"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:133:1: actionScopeName : ( id | 'lexer' | 'parser' );
    public final ANTLRv3Parser.actionScopeName_return actionScopeName() throws RecognitionException {
        ANTLRv3Parser.actionScopeName_return retval = new ANTLRv3Parser.actionScopeName_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:137:2: ( id | 'lexer' | 'parser' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case TOKEN_REF:
            case RULE_REF:
                {
                alt11=1;
                }
                break;
            case 65:
                {
                alt11=2;
                }
                break;
            case 66:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:137:4: id
                    {
                    pushFollow(FOLLOW_id_in_actionScopeName557);
                    id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:138:4: 'lexer'
                    {
                    match(input,65,FOLLOW_65_in_actionScopeName562); 

                    }
                    break;
                case 3 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:139:7: 'parser'
                    {
                    match(input,66,FOLLOW_66_in_actionScopeName570); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actionScopeName"

    public static class optionsSpec_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "optionsSpec"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:142:1: optionsSpec : OPTIONS ( option ';' )+ '}' ;
    public final ANTLRv3Parser.optionsSpec_return optionsSpec() throws RecognitionException {
        ANTLRv3Parser.optionsSpec_return retval = new ANTLRv3Parser.optionsSpec_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:143:2: ( OPTIONS ( option ';' )+ '}' )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:143:4: OPTIONS ( option ';' )+ '}'
            {
            match(input,OPTIONS,FOLLOW_OPTIONS_in_optionsSpec581); 
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:143:12: ( option ';' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==TOKEN_REF||LA12_0==RULE_REF) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:143:13: option ';'
            	    {
            	    pushFollow(FOLLOW_option_in_optionsSpec584);
            	    option();

            	    state._fsp--;

            	    match(input,69,FOLLOW_69_in_optionsSpec586); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            match(input,70,FOLLOW_70_in_optionsSpec590); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "optionsSpec"

    public static class option_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "option"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:146:1: option : id '=' optionValue ;
    public final ANTLRv3Parser.option_return option() throws RecognitionException {
        ANTLRv3Parser.option_return retval = new ANTLRv3Parser.option_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:147:5: ( id '=' optionValue )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:147:9: id '=' optionValue
            {
            pushFollow(FOLLOW_id_in_option606);
            id();

            state._fsp--;

            match(input,71,FOLLOW_71_in_option608); 
            pushFollow(FOLLOW_optionValue_in_option610);
            optionValue();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "option"

    public static class optionValue_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "optionValue"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:150:1: optionValue : ( id | STRING_LITERAL | CHAR_LITERAL | INT | '*' );
    public final ANTLRv3Parser.optionValue_return optionValue() throws RecognitionException {
        ANTLRv3Parser.optionValue_return retval = new ANTLRv3Parser.optionValue_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:151:5: ( id | STRING_LITERAL | CHAR_LITERAL | INT | '*' )
            int alt13=5;
            switch ( input.LA(1) ) {
            case TOKEN_REF:
            case RULE_REF:
                {
                alt13=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt13=2;
                }
                break;
            case CHAR_LITERAL:
                {
                alt13=3;
                }
                break;
            case INT:
                {
                alt13=4;
                }
                break;
            case 74:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:151:9: id
                    {
                    pushFollow(FOLLOW_id_in_optionValue629);
                    id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:152:9: STRING_LITERAL
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_optionValue639); 

                    }
                    break;
                case 3 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:153:9: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_optionValue649); 

                    }
                    break;
                case 4 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:154:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_optionValue659); 

                    }
                    break;
                case 5 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:155:7: '*'
                    {
                    match(input,74,FOLLOW_74_in_optionValue667); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "optionValue"

    public static class rule_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rule"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:158:1: rule : ( DOC_COMMENT )? ( ( 'protected' | 'public' | 'private' | 'fragment' ) )? id ( '!' )? ( ARG_ACTION )? ( 'returns' ARG_ACTION )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* ':' altList ';' ( exceptionGroup )? ;
    public final ANTLRv3Parser.rule_return rule() throws RecognitionException {
        ANTLRv3Parser.rule_return retval = new ANTLRv3Parser.rule_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:159:2: ( ( DOC_COMMENT )? ( ( 'protected' | 'public' | 'private' | 'fragment' ) )? id ( '!' )? ( ARG_ACTION )? ( 'returns' ARG_ACTION )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* ':' altList ';' ( exceptionGroup )? )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:159:4: ( DOC_COMMENT )? ( ( 'protected' | 'public' | 'private' | 'fragment' ) )? id ( '!' )? ( ARG_ACTION )? ( 'returns' ARG_ACTION )? ( throwsSpec )? ( optionsSpec )? ( ruleScopeSpec )? ( ruleAction )* ':' altList ';' ( exceptionGroup )?
            {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:159:4: ( DOC_COMMENT )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==DOC_COMMENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:159:4: DOC_COMMENT
                    {
                    match(input,DOC_COMMENT,FOLLOW_DOC_COMMENT_in_rule683); 

                    }
                    break;

            }

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:160:3: ( ( 'protected' | 'public' | 'private' | 'fragment' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==FRAGMENT||(LA15_0>=75 && LA15_0<=77)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:160:5: ( 'protected' | 'public' | 'private' | 'fragment' )
                    {
                    if ( input.LA(1)==FRAGMENT||(input.LA(1)>=75 && input.LA(1)<=77) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_id_in_rule705);
            id();

            state._fsp--;

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:162:3: ( '!' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==BANG) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:162:3: '!'
                    {
                    match(input,BANG,FOLLOW_BANG_in_rule711); 

                    }
                    break;

            }

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:163:3: ( ARG_ACTION )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==ARG_ACTION) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:163:5: ARG_ACTION
                    {
                    match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rule718); 

                    }
                    break;

            }

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:164:3: ( 'returns' ARG_ACTION )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==78) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:164:5: 'returns' ARG_ACTION
                    {
                    match(input,78,FOLLOW_78_in_rule727); 
                    match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rule729); 

                    }
                    break;

            }

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:165:3: ( throwsSpec )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==80) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:165:3: throwsSpec
                    {
                    pushFollow(FOLLOW_throwsSpec_in_rule737);
                    throwsSpec();

                    state._fsp--;


                    }
                    break;

            }

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:165:15: ( optionsSpec )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==OPTIONS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:165:15: optionsSpec
                    {
                    pushFollow(FOLLOW_optionsSpec_in_rule740);
                    optionsSpec();

                    state._fsp--;


                    }
                    break;

            }

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:165:28: ( ruleScopeSpec )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==SCOPE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:165:28: ruleScopeSpec
                    {
                    pushFollow(FOLLOW_ruleScopeSpec_in_rule743);
                    ruleScopeSpec();

                    state._fsp--;


                    }
                    break;

            }

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:165:43: ( ruleAction )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==72) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:165:43: ruleAction
            	    {
            	    pushFollow(FOLLOW_ruleAction_in_rule746);
            	    ruleAction();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match(input,79,FOLLOW_79_in_rule751); 
            pushFollow(FOLLOW_altList_in_rule757);
            altList();

            state._fsp--;

            match(input,69,FOLLOW_69_in_rule759); 
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:168:3: ( exceptionGroup )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=85 && LA23_0<=86)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:168:3: exceptionGroup
                    {
                    pushFollow(FOLLOW_exceptionGroup_in_rule763);
                    exceptionGroup();

                    state._fsp--;


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rule"

    public static class ruleAction_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ruleAction"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:171:1: ruleAction : '@' id ACTION ;
    public final ANTLRv3Parser.ruleAction_return ruleAction() throws RecognitionException {
        ANTLRv3Parser.ruleAction_return retval = new ANTLRv3Parser.ruleAction_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:173:2: ( '@' id ACTION )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:173:4: '@' id ACTION
            {
            match(input,72,FOLLOW_72_in_ruleAction777); 
            pushFollow(FOLLOW_id_in_ruleAction779);
            id();

            state._fsp--;

            match(input,ACTION,FOLLOW_ACTION_in_ruleAction781); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ruleAction"

    public static class throwsSpec_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "throwsSpec"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:176:1: throwsSpec : 'throws' id ( ',' id )* ;
    public final ANTLRv3Parser.throwsSpec_return throwsSpec() throws RecognitionException {
        ANTLRv3Parser.throwsSpec_return retval = new ANTLRv3Parser.throwsSpec_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:177:2: ( 'throws' id ( ',' id )* )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:177:4: 'throws' id ( ',' id )*
            {
            match(input,80,FOLLOW_80_in_throwsSpec792); 
            pushFollow(FOLLOW_id_in_throwsSpec794);
            id();

            state._fsp--;

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:177:16: ( ',' id )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==81) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:177:18: ',' id
            	    {
            	    match(input,81,FOLLOW_81_in_throwsSpec798); 
            	    pushFollow(FOLLOW_id_in_throwsSpec800);
            	    id();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "throwsSpec"

    public static class ruleScopeSpec_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ruleScopeSpec"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:180:1: ruleScopeSpec : ( 'scope' ACTION | 'scope' id ( ',' id )* ';' | 'scope' ACTION 'scope' id ( ',' id )* ';' );
    public final ANTLRv3Parser.ruleScopeSpec_return ruleScopeSpec() throws RecognitionException {
        ANTLRv3Parser.ruleScopeSpec_return retval = new ANTLRv3Parser.ruleScopeSpec_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:181:2: ( 'scope' ACTION | 'scope' id ( ',' id )* ';' | 'scope' ACTION 'scope' id ( ',' id )* ';' )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==SCOPE) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==ACTION) ) {
                    int LA27_2 = input.LA(3);

                    if ( (LA27_2==SCOPE) ) {
                        alt27=3;
                    }
                    else if ( (LA27_2==72||LA27_2==79) ) {
                        alt27=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_1==TOKEN_REF||LA27_1==RULE_REF) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:181:4: 'scope' ACTION
                    {
                    match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec814); 
                    match(input,ACTION,FOLLOW_ACTION_in_ruleScopeSpec816); 

                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:182:4: 'scope' id ( ',' id )* ';'
                    {
                    match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec821); 
                    pushFollow(FOLLOW_id_in_ruleScopeSpec823);
                    id();

                    state._fsp--;

                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:182:15: ( ',' id )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==81) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:182:16: ',' id
                    	    {
                    	    match(input,81,FOLLOW_81_in_ruleScopeSpec826); 
                    	    pushFollow(FOLLOW_id_in_ruleScopeSpec828);
                    	    id();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    match(input,69,FOLLOW_69_in_ruleScopeSpec832); 

                    }
                    break;
                case 3 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:183:4: 'scope' ACTION 'scope' id ( ',' id )* ';'
                    {
                    match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec837); 
                    match(input,ACTION,FOLLOW_ACTION_in_ruleScopeSpec839); 
                    match(input,SCOPE,FOLLOW_SCOPE_in_ruleScopeSpec843); 
                    pushFollow(FOLLOW_id_in_ruleScopeSpec845);
                    id();

                    state._fsp--;

                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:184:14: ( ',' id )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==81) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:184:15: ',' id
                    	    {
                    	    match(input,81,FOLLOW_81_in_ruleScopeSpec848); 
                    	    pushFollow(FOLLOW_id_in_ruleScopeSpec850);
                    	    id();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    match(input,69,FOLLOW_69_in_ruleScopeSpec854); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ruleScopeSpec"

    public static class block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:187:1: block : '(' ( ( optionsSpec )? ':' )? alternative rewrite ( '|' alternative rewrite )* ')' ;
    public final ANTLRv3Parser.block_return block() throws RecognitionException {
        ANTLRv3Parser.block_return retval = new ANTLRv3Parser.block_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:188:5: ( '(' ( ( optionsSpec )? ':' )? alternative rewrite ( '|' alternative rewrite )* ')' )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:188:7: '(' ( ( optionsSpec )? ':' )? alternative rewrite ( '|' alternative rewrite )* ')'
            {
            match(input,82,FOLLOW_82_in_block868); 
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:189:3: ( ( optionsSpec )? ':' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==OPTIONS||LA29_0==79) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:189:5: ( optionsSpec )? ':'
                    {
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:189:5: ( optionsSpec )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==OPTIONS) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:189:7: optionsSpec
                            {
                            pushFollow(FOLLOW_optionsSpec_in_block876);
                            optionsSpec();

                            state._fsp--;


                            }
                            break;

                    }

                    match(input,79,FOLLOW_79_in_block880); 

                    }
                    break;

            }

            pushFollow(FOLLOW_alternative_in_block885);
            alternative();

            state._fsp--;

            pushFollow(FOLLOW_rewrite_in_block887);
            rewrite();

            state._fsp--;

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:189:48: ( '|' alternative rewrite )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==83) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:189:50: '|' alternative rewrite
            	    {
            	    match(input,83,FOLLOW_83_in_block891); 
            	    pushFollow(FOLLOW_alternative_in_block893);
            	    alternative();

            	    state._fsp--;

            	    pushFollow(FOLLOW_rewrite_in_block895);
            	    rewrite();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            match(input,84,FOLLOW_84_in_block900); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class altList_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "altList"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:192:1: altList : alternative rewrite ( '|' alternative rewrite )* ;
    public final ANTLRv3Parser.altList_return altList() throws RecognitionException {
        ANTLRv3Parser.altList_return retval = new ANTLRv3Parser.altList_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:193:5: ( alternative rewrite ( '|' alternative rewrite )* )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:193:7: alternative rewrite ( '|' alternative rewrite )*
            {
            pushFollow(FOLLOW_alternative_in_altList917);
            alternative();

            state._fsp--;

            pushFollow(FOLLOW_rewrite_in_altList919);
            rewrite();

            state._fsp--;

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:193:27: ( '|' alternative rewrite )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==83) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:193:29: '|' alternative rewrite
            	    {
            	    match(input,83,FOLLOW_83_in_altList923); 
            	    pushFollow(FOLLOW_alternative_in_altList925);
            	    alternative();

            	    state._fsp--;

            	    pushFollow(FOLLOW_rewrite_in_altList927);
            	    rewrite();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "altList"

    public static class alternative_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "alternative"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:196:1: alternative : ( ( element )+ | );
    public final ANTLRv3Parser.alternative_return alternative() throws RecognitionException {
        ANTLRv3Parser.alternative_return retval = new ANTLRv3Parser.alternative_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:197:5: ( ( element )+ | )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==SEMPRED||LA33_0==TREE_BEGIN||(LA33_0>=TOKEN_REF && LA33_0<=ACTION)||LA33_0==RULE_REF||LA33_0==82||LA33_0==89||LA33_0==92) ) {
                alt33=1;
            }
            else if ( (LA33_0==REWRITE||LA33_0==69||(LA33_0>=83 && LA33_0<=84)) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:197:9: ( element )+
                    {
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:197:9: ( element )+
                    int cnt32=0;
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==SEMPRED||LA32_0==TREE_BEGIN||(LA32_0>=TOKEN_REF && LA32_0<=ACTION)||LA32_0==RULE_REF||LA32_0==82||LA32_0==89||LA32_0==92) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:197:9: element
                    	    {
                    	    pushFollow(FOLLOW_element_in_alternative949);
                    	    element();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt32 >= 1 ) break loop32;
                                EarlyExitException eee =
                                    new EarlyExitException(32, input);
                                throw eee;
                        }
                        cnt32++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:199:5: 
                    {
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "alternative"

    public static class exceptionGroup_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "exceptionGroup"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:201:1: exceptionGroup : ( ( exceptionHandler )+ ( finallyClause )? | finallyClause );
    public final ANTLRv3Parser.exceptionGroup_return exceptionGroup() throws RecognitionException {
        ANTLRv3Parser.exceptionGroup_return retval = new ANTLRv3Parser.exceptionGroup_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:202:2: ( ( exceptionHandler )+ ( finallyClause )? | finallyClause )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==85) ) {
                alt36=1;
            }
            else if ( (LA36_0==86) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:202:4: ( exceptionHandler )+ ( finallyClause )?
                    {
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:202:4: ( exceptionHandler )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==85) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:202:6: exceptionHandler
                    	    {
                    	    pushFollow(FOLLOW_exceptionHandler_in_exceptionGroup972);
                    	    exceptionHandler();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:202:26: ( finallyClause )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==86) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:202:28: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_exceptionGroup979);
                            finallyClause();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:203:4: finallyClause
                    {
                    pushFollow(FOLLOW_finallyClause_in_exceptionGroup987);
                    finallyClause();

                    state._fsp--;


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exceptionGroup"

    public static class exceptionHandler_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "exceptionHandler"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:206:1: exceptionHandler : 'catch' ARG_ACTION ACTION ;
    public final ANTLRv3Parser.exceptionHandler_return exceptionHandler() throws RecognitionException {
        ANTLRv3Parser.exceptionHandler_return retval = new ANTLRv3Parser.exceptionHandler_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:207:5: ( 'catch' ARG_ACTION ACTION )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:207:10: 'catch' ARG_ACTION ACTION
            {
            match(input,85,FOLLOW_85_in_exceptionHandler1007); 
            match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_exceptionHandler1009); 
            match(input,ACTION,FOLLOW_ACTION_in_exceptionHandler1011); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exceptionHandler"

    public static class finallyClause_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "finallyClause"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:210:1: finallyClause : 'finally' ACTION ;
    public final ANTLRv3Parser.finallyClause_return finallyClause() throws RecognitionException {
        ANTLRv3Parser.finallyClause_return retval = new ANTLRv3Parser.finallyClause_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:211:5: ( 'finally' ACTION )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:211:10: 'finally' ACTION
            {
            match(input,86,FOLLOW_86_in_finallyClause1031); 
            match(input,ACTION,FOLLOW_ACTION_in_finallyClause1033); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "finallyClause"

    public static class element_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "element"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:214:1: element : elementNoOptionSpec ;
    public final ANTLRv3Parser.element_return element() throws RecognitionException {
        ANTLRv3Parser.element_return retval = new ANTLRv3Parser.element_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:215:2: ( elementNoOptionSpec )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:215:4: elementNoOptionSpec
            {
            pushFollow(FOLLOW_elementNoOptionSpec_in_element1047);
            elementNoOptionSpec();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "element"

    public static class elementNoOptionSpec_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "elementNoOptionSpec"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:218:1: elementNoOptionSpec : ( id ( '=' | '+=' ) atom ( ebnfSuffix | ) | id ( '=' | '+=' ) block ( ebnfSuffix | ) | atom ( ebnfSuffix | ) | ebnf | ACTION | SEMPRED ( '=>' | ) | treeSpec ( ebnfSuffix | ) );
    public final ANTLRv3Parser.elementNoOptionSpec_return elementNoOptionSpec() throws RecognitionException {
        ANTLRv3Parser.elementNoOptionSpec_return retval = new ANTLRv3Parser.elementNoOptionSpec_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:219:2: ( id ( '=' | '+=' ) atom ( ebnfSuffix | ) | id ( '=' | '+=' ) block ( ebnfSuffix | ) | atom ( ebnfSuffix | ) | ebnf | ACTION | SEMPRED ( '=>' | ) | treeSpec ( ebnfSuffix | ) )
            int alt42=7;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:219:4: id ( '=' | '+=' ) atom ( ebnfSuffix | )
                    {
                    pushFollow(FOLLOW_id_in_elementNoOptionSpec1058);
                    id();

                    state._fsp--;

                    if ( input.LA(1)==71||input.LA(1)==87 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_atom_in_elementNoOptionSpec1068);
                    atom();

                    state._fsp--;

                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:220:3: ( ebnfSuffix | )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==74||(LA37_0>=90 && LA37_0<=91)) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==SEMPRED||LA37_0==TREE_BEGIN||LA37_0==REWRITE||(LA37_0>=TOKEN_REF && LA37_0<=ACTION)||LA37_0==RULE_REF||LA37_0==69||(LA37_0>=82 && LA37_0<=84)||LA37_0==89||LA37_0==92) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:220:5: ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_elementNoOptionSpec1074);
                            ebnfSuffix();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:222:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:223:4: id ( '=' | '+=' ) block ( ebnfSuffix | )
                    {
                    pushFollow(FOLLOW_id_in_elementNoOptionSpec1087);
                    id();

                    state._fsp--;

                    if ( input.LA(1)==71||input.LA(1)==87 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_block_in_elementNoOptionSpec1097);
                    block();

                    state._fsp--;

                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:224:3: ( ebnfSuffix | )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==74||(LA38_0>=90 && LA38_0<=91)) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==SEMPRED||LA38_0==TREE_BEGIN||LA38_0==REWRITE||(LA38_0>=TOKEN_REF && LA38_0<=ACTION)||LA38_0==RULE_REF||LA38_0==69||(LA38_0>=82 && LA38_0<=84)||LA38_0==89||LA38_0==92) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:224:5: ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_elementNoOptionSpec1103);
                            ebnfSuffix();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:226:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:227:4: atom ( ebnfSuffix | )
                    {
                    pushFollow(FOLLOW_atom_in_elementNoOptionSpec1116);
                    atom();

                    state._fsp--;

                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:228:3: ( ebnfSuffix | )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==74||(LA39_0>=90 && LA39_0<=91)) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==SEMPRED||LA39_0==TREE_BEGIN||LA39_0==REWRITE||(LA39_0>=TOKEN_REF && LA39_0<=ACTION)||LA39_0==RULE_REF||LA39_0==69||(LA39_0>=82 && LA39_0<=84)||LA39_0==89||LA39_0==92) ) {
                        alt39=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:228:5: ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_elementNoOptionSpec1122);
                            ebnfSuffix();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:230:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:231:4: ebnf
                    {
                    pushFollow(FOLLOW_ebnf_in_elementNoOptionSpec1135);
                    ebnf();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:232:6: ACTION
                    {
                    match(input,ACTION,FOLLOW_ACTION_in_elementNoOptionSpec1142); 

                    }
                    break;
                case 6 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:233:6: SEMPRED ( '=>' | )
                    {
                    match(input,SEMPRED,FOLLOW_SEMPRED_in_elementNoOptionSpec1149); 
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:233:14: ( '=>' | )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==88) ) {
                        alt40=1;
                    }
                    else if ( (LA40_0==SEMPRED||LA40_0==TREE_BEGIN||LA40_0==REWRITE||(LA40_0>=TOKEN_REF && LA40_0<=ACTION)||LA40_0==RULE_REF||LA40_0==69||(LA40_0>=82 && LA40_0<=84)||LA40_0==89||LA40_0==92) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:233:16: '=>'
                            {
                            match(input,88,FOLLOW_88_in_elementNoOptionSpec1153); 

                            }
                            break;
                        case 2 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:233:23: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:234:6: treeSpec ( ebnfSuffix | )
                    {
                    pushFollow(FOLLOW_treeSpec_in_elementNoOptionSpec1164);
                    treeSpec();

                    state._fsp--;

                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:235:3: ( ebnfSuffix | )
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==74||(LA41_0>=90 && LA41_0<=91)) ) {
                        alt41=1;
                    }
                    else if ( (LA41_0==SEMPRED||LA41_0==TREE_BEGIN||LA41_0==REWRITE||(LA41_0>=TOKEN_REF && LA41_0<=ACTION)||LA41_0==RULE_REF||LA41_0==69||(LA41_0>=82 && LA41_0<=84)||LA41_0==89||LA41_0==92) ) {
                        alt41=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 0, input);

                        throw nvae;
                    }
                    switch (alt41) {
                        case 1 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:235:5: ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_elementNoOptionSpec1170);
                            ebnfSuffix();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:237:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elementNoOptionSpec"

    public static class atom_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "atom"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:240:1: atom : ( range ( ( '^' | '!' ) | ) | terminal | notSet ( ( '^' | '!' ) | ) | RULE_REF ( ARG_ACTION )? ( ( '^' | '!' ) )? );
    public final ANTLRv3Parser.atom_return atom() throws RecognitionException {
        ANTLRv3Parser.atom_return retval = new ANTLRv3Parser.atom_return();
        retval.start = input.LT(1);

        Token RULE_REF1=null;

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:240:5: ( range ( ( '^' | '!' ) | ) | terminal | notSet ( ( '^' | '!' ) | ) | RULE_REF ( ARG_ACTION )? ( ( '^' | '!' ) )? )
            int alt47=4;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
                {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==RANGE) ) {
                    alt47=1;
                }
                else if ( (LA47_1==SEMPRED||(LA47_1>=TREE_BEGIN && LA47_1<=REWRITE)||(LA47_1>=TOKEN_REF && LA47_1<=ACTION)||LA47_1==RULE_REF||LA47_1==69||LA47_1==74||(LA47_1>=82 && LA47_1<=84)||(LA47_1>=89 && LA47_1<=92)) ) {
                    alt47=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
                }
                break;
            case TOKEN_REF:
            case STRING_LITERAL:
            case 92:
                {
                alt47=2;
                }
                break;
            case 89:
                {
                alt47=3;
                }
                break;
            case RULE_REF:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:240:9: range ( ( '^' | '!' ) | )
                    {
                    pushFollow(FOLLOW_range_in_atom1189);
                    range();

                    state._fsp--;

                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:240:15: ( ( '^' | '!' ) | )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=ROOT && LA43_0<=BANG)) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==SEMPRED||LA43_0==TREE_BEGIN||LA43_0==REWRITE||(LA43_0>=TOKEN_REF && LA43_0<=ACTION)||LA43_0==RULE_REF||LA43_0==69||LA43_0==74||(LA43_0>=82 && LA43_0<=84)||(LA43_0>=89 && LA43_0<=92)) ) {
                        alt43=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 43, 0, input);

                        throw nvae;
                    }
                    switch (alt43) {
                        case 1 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:240:17: ( '^' | '!' )
                            {
                            if ( (input.LA(1)>=ROOT && input.LA(1)<=BANG) ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:240:31: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:241:9: terminal
                    {
                    pushFollow(FOLLOW_terminal_in_atom1213);
                    terminal();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:242:7: notSet ( ( '^' | '!' ) | )
                    {
                    pushFollow(FOLLOW_notSet_in_atom1221);
                    notSet();

                    state._fsp--;

                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:242:14: ( ( '^' | '!' ) | )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>=ROOT && LA44_0<=BANG)) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==SEMPRED||LA44_0==TREE_BEGIN||LA44_0==REWRITE||(LA44_0>=TOKEN_REF && LA44_0<=ACTION)||LA44_0==RULE_REF||LA44_0==69||LA44_0==74||(LA44_0>=82 && LA44_0<=84)||(LA44_0>=89 && LA44_0<=92)) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:242:16: ( '^' | '!' )
                            {
                            if ( (input.LA(1)>=ROOT && input.LA(1)<=BANG) ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;
                        case 2 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:242:30: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:243:9: RULE_REF ( ARG_ACTION )? ( ( '^' | '!' ) )?
                    {
                    RULE_REF1=(Token)match(input,RULE_REF,FOLLOW_RULE_REF_in_atom1245); 

                                String tagName = "t"+count++;
                                String content =
                                "{T.pushTop();T.setCurrentParent(T.addNode(\""+(RULE_REF1!=null?RULE_REF1.getText():null)+"\"));} "+
                                tagName + "=" +(RULE_REF1!=null?RULE_REF1.getText():null)+" "+
                                "{T.popTop().setTextRange($"+tagName+".start, $"+tagName+".stop);}";
                                ((TokenRewriteStream) input).replace(RULE_REF1.getTokenIndex(), RULE_REF1.getTokenIndex(), new StringTemplate(templateLib, content));
                               
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:252:9: ( ARG_ACTION )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==ARG_ACTION) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:252:11: ARG_ACTION
                            {
                            match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_atom1285); 

                            }
                            break;

                    }

                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:252:25: ( ( '^' | '!' ) )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>=ROOT && LA46_0<=BANG)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:252:27: ( '^' | '!' )
                            {
                            if ( (input.LA(1)>=ROOT && input.LA(1)<=BANG) ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class notSet_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "notSet"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:255:1: notSet : '~' ( notTerminal | block ) ;
    public final ANTLRv3Parser.notSet_return notSet() throws RecognitionException {
        ANTLRv3Parser.notSet_return retval = new ANTLRv3Parser.notSet_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:256:2: ( '~' ( notTerminal | block ) )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:256:4: '~' ( notTerminal | block )
            {
            match(input,89,FOLLOW_89_in_notSet1315); 
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:257:3: ( notTerminal | block )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=TOKEN_REF && LA48_0<=CHAR_LITERAL)) ) {
                alt48=1;
            }
            else if ( (LA48_0==82) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:257:5: notTerminal
                    {
                    pushFollow(FOLLOW_notTerminal_in_notSet1321);
                    notTerminal();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:258:5: block
                    {
                    pushFollow(FOLLOW_block_in_notSet1327);
                    block();

                    state._fsp--;


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "notSet"

    public static class treeSpec_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "treeSpec"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:262:1: treeSpec : '^(' element ( element )+ ')' ;
    public final ANTLRv3Parser.treeSpec_return treeSpec() throws RecognitionException {
        ANTLRv3Parser.treeSpec_return retval = new ANTLRv3Parser.treeSpec_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:263:2: ( '^(' element ( element )+ ')' )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:263:4: '^(' element ( element )+ ')'
            {
            match(input,TREE_BEGIN,FOLLOW_TREE_BEGIN_in_treeSpec1342); 
            pushFollow(FOLLOW_element_in_treeSpec1344);
            element();

            state._fsp--;

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:263:17: ( element )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==SEMPRED||LA49_0==TREE_BEGIN||(LA49_0>=TOKEN_REF && LA49_0<=ACTION)||LA49_0==RULE_REF||LA49_0==82||LA49_0==89||LA49_0==92) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:263:19: element
            	    {
            	    pushFollow(FOLLOW_element_in_treeSpec1348);
            	    element();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            match(input,84,FOLLOW_84_in_treeSpec1353); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "treeSpec"

    public static class ebnf_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ebnf"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:266:1: ebnf : block ( '?' | '*' | '+' | '=>' | ) ;
    public final ANTLRv3Parser.ebnf_return ebnf() throws RecognitionException {
        ANTLRv3Parser.ebnf_return retval = new ANTLRv3Parser.ebnf_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:268:2: ( block ( '?' | '*' | '+' | '=>' | ) )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:268:4: block ( '?' | '*' | '+' | '=>' | )
            {
            pushFollow(FOLLOW_block_in_ebnf1366);
            block();

            state._fsp--;

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:269:3: ( '?' | '*' | '+' | '=>' | )
            int alt50=5;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt50=1;
                }
                break;
            case 74:
                {
                alt50=2;
                }
                break;
            case 91:
                {
                alt50=3;
                }
                break;
            case 88:
                {
                alt50=4;
                }
                break;
            case SEMPRED:
            case TREE_BEGIN:
            case REWRITE:
            case TOKEN_REF:
            case STRING_LITERAL:
            case CHAR_LITERAL:
            case ACTION:
            case RULE_REF:
            case 69:
            case 82:
            case 83:
            case 84:
            case 89:
            case 92:
                {
                alt50=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:269:5: '?'
                    {
                    match(input,90,FOLLOW_90_in_ebnf1372); 

                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:270:5: '*'
                    {
                    match(input,74,FOLLOW_74_in_ebnf1378); 

                    }
                    break;
                case 3 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:271:5: '+'
                    {
                    match(input,91,FOLLOW_91_in_ebnf1384); 

                    }
                    break;
                case 4 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:272:7: '=>'
                    {
                    match(input,88,FOLLOW_88_in_ebnf1392); 

                    }
                    break;
                case 5 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:274:3: 
                    {
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ebnf"

    public static class range_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "range"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:277:1: range : CHAR_LITERAL RANGE CHAR_LITERAL ;
    public final ANTLRv3Parser.range_return range() throws RecognitionException {
        ANTLRv3Parser.range_return retval = new ANTLRv3Parser.range_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:278:2: ( CHAR_LITERAL RANGE CHAR_LITERAL )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:278:4: CHAR_LITERAL RANGE CHAR_LITERAL
            {
            match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_range1417); 
            match(input,RANGE,FOLLOW_RANGE_in_range1419); 
            match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_range1421); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "range"

    public static class terminal_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "terminal"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:281:1: terminal : ( CHAR_LITERAL | TOKEN_REF ( ARG_ACTION | ) | STRING_LITERAL | '.' ) ( '^' | '!' )? ;
    public final ANTLRv3Parser.terminal_return terminal() throws RecognitionException {
        ANTLRv3Parser.terminal_return retval = new ANTLRv3Parser.terminal_return();
        retval.start = input.LT(1);

        Token CHAR_LITERAL2=null;
        Token TOKEN_REF3=null;
        Token STRING_LITERAL4=null;

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:282:5: ( ( CHAR_LITERAL | TOKEN_REF ( ARG_ACTION | ) | STRING_LITERAL | '.' ) ( '^' | '!' )? )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:282:9: ( CHAR_LITERAL | TOKEN_REF ( ARG_ACTION | ) | STRING_LITERAL | '.' ) ( '^' | '!' )?
            {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:282:9: ( CHAR_LITERAL | TOKEN_REF ( ARG_ACTION | ) | STRING_LITERAL | '.' )
            int alt52=4;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
                {
                alt52=1;
                }
                break;
            case TOKEN_REF:
                {
                alt52=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt52=3;
                }
                break;
            case 92:
                {
                alt52=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:282:11: CHAR_LITERAL
                    {
                    CHAR_LITERAL2=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_terminal1439); 
                                        
                                String s = (CHAR_LITERAL2!=null?CHAR_LITERAL2.getText():null);
                                s = s.substring(1,s.length());
                                s = s.substring(0,s.length()-1);
                                //s = s.replace("%",("\\"+"%"));
                                //s = s.replace("'","\\'");
                                s = s.replace("<", "\\<");
                                String escapedName = "'"+s+"'";
                                String content = 
                                "("+escapedName + "{T.addLeaf(\"'"+s.replace("%",("\\"+"%"))+"'\",input.LT(-1));})";
                                
                                ((TokenRewriteStream) input).replace(CHAR_LITERAL2.getTokenIndex(), CHAR_LITERAL2.getTokenIndex(), new StringTemplate(templateLib, content));
                               

                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:296:7: TOKEN_REF ( ARG_ACTION | )
                    {
                    TOKEN_REF3=(Token)match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_terminal1463); 

                                    String name = (TOKEN_REF3!=null?TOKEN_REF3.getText():null);
                                    String content =
                                    name + " {T.addLeaf(\""+name+"['\"+input.LT(-1).getText()+\"']\",input.LT(-1));}";
                                    ((TokenRewriteStream) input).replace(TOKEN_REF3.getTokenIndex(), TOKEN_REF3.getTokenIndex(), new StringTemplate(templateLib, content));
                                
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:303:4: ( ARG_ACTION | )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==ARG_ACTION) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==SEMPRED||(LA51_0>=TREE_BEGIN && LA51_0<=REWRITE)||(LA51_0>=TOKEN_REF && LA51_0<=ACTION)||LA51_0==RULE_REF||LA51_0==69||LA51_0==74||(LA51_0>=82 && LA51_0<=84)||(LA51_0>=89 && LA51_0<=92)) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:303:6: ARG_ACTION
                            {
                            match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_terminal1486); 

                            }
                            break;
                        case 2 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:305:4: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:306:7: STRING_LITERAL
                    {
                    STRING_LITERAL4=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_terminal1504); 

                                String s = (STRING_LITERAL4!=null?STRING_LITERAL4.getText():null);
                                s = s.replace("%",("\\"+"%"));
                                String content =
                                (STRING_LITERAL4!=null?STRING_LITERAL4.getText():null) + "{T.addLeaf(\""+s+"\",input.LT(-1));}";
                                ((TokenRewriteStream) input).replace(STRING_LITERAL4.getTokenIndex(), STRING_LITERAL4.getTokenIndex(), new StringTemplate(templateLib, content));
                               

                    }
                    break;
                case 4 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:314:7: '.'
                    {
                    match(input,92,FOLLOW_92_in_terminal1529); 

                    }
                    break;

            }

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:316:3: ( '^' | '!' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=ROOT && LA53_0<=BANG)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:
                    {
                    if ( (input.LA(1)>=ROOT && input.LA(1)<=BANG) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "terminal"

    public static class notTerminal_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "notTerminal"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:321:1: notTerminal : ( CHAR_LITERAL | TOKEN_REF | STRING_LITERAL );
    public final ANTLRv3Parser.notTerminal_return notTerminal() throws RecognitionException {
        ANTLRv3Parser.notTerminal_return retval = new ANTLRv3Parser.notTerminal_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:322:2: ( CHAR_LITERAL | TOKEN_REF | STRING_LITERAL )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:
            {
            if ( (input.LA(1)>=TOKEN_REF && input.LA(1)<=CHAR_LITERAL) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "notTerminal"

    public static class ebnfSuffix_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "ebnfSuffix"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:327:1: ebnfSuffix : ( '?' | '*' | '+' );
    public final ANTLRv3Parser.ebnfSuffix_return ebnfSuffix() throws RecognitionException {
        ANTLRv3Parser.ebnfSuffix_return retval = new ANTLRv3Parser.ebnfSuffix_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:328:2: ( '?' | '*' | '+' )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:
            {
            if ( input.LA(1)==74||(input.LA(1)>=90 && input.LA(1)<=91) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ebnfSuffix"

    public static class rewrite_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rewrite"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:337:1: rewrite : ( ( '->' SEMPRED rewrite_alternative )* '->' rewrite_alternative | );
    public final ANTLRv3Parser.rewrite_return rewrite() throws RecognitionException {
        ANTLRv3Parser.rewrite_return retval = new ANTLRv3Parser.rewrite_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:338:2: ( ( '->' SEMPRED rewrite_alternative )* '->' rewrite_alternative | )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==REWRITE) ) {
                alt55=1;
            }
            else if ( (LA55_0==69||(LA55_0>=83 && LA55_0<=84)) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:338:4: ( '->' SEMPRED rewrite_alternative )* '->' rewrite_alternative
                    {
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:338:4: ( '->' SEMPRED rewrite_alternative )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==REWRITE) ) {
                            int LA54_1 = input.LA(2);

                            if ( (LA54_1==SEMPRED) ) {
                                alt54=1;
                            }


                        }


                        switch (alt54) {
                    	case 1 :
                    	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:338:6: '->' SEMPRED rewrite_alternative
                    	    {
                    	    match(input,REWRITE,FOLLOW_REWRITE_in_rewrite1619); 
                    	    match(input,SEMPRED,FOLLOW_SEMPRED_in_rewrite1621); 
                    	    pushFollow(FOLLOW_rewrite_alternative_in_rewrite1623);
                    	    rewrite_alternative();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    match(input,REWRITE,FOLLOW_REWRITE_in_rewrite1627); 
                    pushFollow(FOLLOW_rewrite_alternative_in_rewrite1629);
                    rewrite_alternative();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:340:2: 
                    {
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite"

    public static class rewrite_alternative_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rewrite_alternative"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:342:1: rewrite_alternative : ( rewrite_template | rewrite_tree_alternative | );
    public final ANTLRv3Parser.rewrite_alternative_return rewrite_alternative() throws RecognitionException {
        ANTLRv3Parser.rewrite_alternative_return retval = new ANTLRv3Parser.rewrite_alternative_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:343:2: ( rewrite_template | rewrite_tree_alternative | )
            int alt56=3;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:343:4: rewrite_template
                    {
                    pushFollow(FOLLOW_rewrite_template_in_rewrite_alternative1643);
                    rewrite_template();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:344:4: rewrite_tree_alternative
                    {
                    pushFollow(FOLLOW_rewrite_tree_alternative_in_rewrite_alternative1648);
                    rewrite_tree_alternative();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:346:2: 
                    {
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_alternative"

    public static class rewrite_tree_block_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rewrite_tree_block"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:348:1: rewrite_tree_block : '(' rewrite_tree_alternative ')' ;
    public final ANTLRv3Parser.rewrite_tree_block_return rewrite_tree_block() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_block_return retval = new ANTLRv3Parser.rewrite_tree_block_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:349:5: ( '(' rewrite_tree_alternative ')' )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:349:7: '(' rewrite_tree_alternative ')'
            {
            match(input,82,FOLLOW_82_in_rewrite_tree_block1669); 
            pushFollow(FOLLOW_rewrite_tree_alternative_in_rewrite_tree_block1671);
            rewrite_tree_alternative();

            state._fsp--;

            match(input,84,FOLLOW_84_in_rewrite_tree_block1673); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree_block"

    public static class rewrite_tree_alternative_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rewrite_tree_alternative"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:352:1: rewrite_tree_alternative : ( rewrite_tree_element )+ ;
    public final ANTLRv3Parser.rewrite_tree_alternative_return rewrite_tree_alternative() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_alternative_return retval = new ANTLRv3Parser.rewrite_tree_alternative_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:353:5: ( ( rewrite_tree_element )+ )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:353:7: ( rewrite_tree_element )+
            {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:353:7: ( rewrite_tree_element )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==TREE_BEGIN||(LA57_0>=TOKEN_REF && LA57_0<=ACTION)||LA57_0==RULE_REF||LA57_0==82||LA57_0==93) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:353:7: rewrite_tree_element
            	    {
            	    pushFollow(FOLLOW_rewrite_tree_element_in_rewrite_tree_alternative1690);
            	    rewrite_tree_element();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree_alternative"

    public static class rewrite_tree_element_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rewrite_tree_element"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:356:1: rewrite_tree_element : ( rewrite_tree_atom | rewrite_tree_atom ebnfSuffix | rewrite_tree ( ebnfSuffix | ) | rewrite_tree_ebnf );
    public final ANTLRv3Parser.rewrite_tree_element_return rewrite_tree_element() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_element_return retval = new ANTLRv3Parser.rewrite_tree_element_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:357:2: ( rewrite_tree_atom | rewrite_tree_atom ebnfSuffix | rewrite_tree ( ebnfSuffix | ) | rewrite_tree_ebnf )
            int alt59=4;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:357:4: rewrite_tree_atom
                    {
                    pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree_element1705);
                    rewrite_tree_atom();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:358:4: rewrite_tree_atom ebnfSuffix
                    {
                    pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree_element1710);
                    rewrite_tree_atom();

                    state._fsp--;

                    pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_element1712);
                    ebnfSuffix();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:359:6: rewrite_tree ( ebnfSuffix | )
                    {
                    pushFollow(FOLLOW_rewrite_tree_in_rewrite_tree_element1719);
                    rewrite_tree();

                    state._fsp--;

                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:360:3: ( ebnfSuffix | )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==74||(LA58_0>=90 && LA58_0<=91)) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==TREE_BEGIN||LA58_0==REWRITE||(LA58_0>=TOKEN_REF && LA58_0<=ACTION)||LA58_0==RULE_REF||LA58_0==69||(LA58_0>=82 && LA58_0<=84)||LA58_0==93) ) {
                        alt58=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }
                    switch (alt58) {
                        case 1 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:360:5: ebnfSuffix
                            {
                            pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_element1725);
                            ebnfSuffix();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:362:3: 
                            {
                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:363:6: rewrite_tree_ebnf
                    {
                    pushFollow(FOLLOW_rewrite_tree_ebnf_in_rewrite_tree_element1740);
                    rewrite_tree_ebnf();

                    state._fsp--;


                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree_element"

    public static class rewrite_tree_atom_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rewrite_tree_atom"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:366:1: rewrite_tree_atom : ( CHAR_LITERAL | TOKEN_REF ( ARG_ACTION )? | RULE_REF | STRING_LITERAL | '$' id | ACTION );
    public final ANTLRv3Parser.rewrite_tree_atom_return rewrite_tree_atom() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_atom_return retval = new ANTLRv3Parser.rewrite_tree_atom_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:367:5: ( CHAR_LITERAL | TOKEN_REF ( ARG_ACTION )? | RULE_REF | STRING_LITERAL | '$' id | ACTION )
            int alt61=6;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
                {
                alt61=1;
                }
                break;
            case TOKEN_REF:
                {
                alt61=2;
                }
                break;
            case RULE_REF:
                {
                alt61=3;
                }
                break;
            case STRING_LITERAL:
                {
                alt61=4;
                }
                break;
            case 93:
                {
                alt61=5;
                }
                break;
            case ACTION:
                {
                alt61=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:367:9: CHAR_LITERAL
                    {
                    match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_rewrite_tree_atom1756); 

                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:368:6: TOKEN_REF ( ARG_ACTION )?
                    {
                    match(input,TOKEN_REF,FOLLOW_TOKEN_REF_in_rewrite_tree_atom1763); 
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:368:16: ( ARG_ACTION )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==ARG_ACTION) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:368:16: ARG_ACTION
                            {
                            match(input,ARG_ACTION,FOLLOW_ARG_ACTION_in_rewrite_tree_atom1765); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:369:9: RULE_REF
                    {
                    match(input,RULE_REF,FOLLOW_RULE_REF_in_rewrite_tree_atom1777); 

                    }
                    break;
                case 4 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:370:6: STRING_LITERAL
                    {
                    match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_rewrite_tree_atom1784); 

                    }
                    break;
                case 5 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:371:4: '$' id
                    {
                    match(input,93,FOLLOW_93_in_rewrite_tree_atom1789); 
                    pushFollow(FOLLOW_id_in_rewrite_tree_atom1791);
                    id();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:372:4: ACTION
                    {
                    match(input,ACTION,FOLLOW_ACTION_in_rewrite_tree_atom1797); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree_atom"

    public static class rewrite_tree_ebnf_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rewrite_tree_ebnf"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:375:1: rewrite_tree_ebnf : rewrite_tree_block ebnfSuffix ;
    public final ANTLRv3Parser.rewrite_tree_ebnf_return rewrite_tree_ebnf() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_ebnf_return retval = new ANTLRv3Parser.rewrite_tree_ebnf_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:376:2: ( rewrite_tree_block ebnfSuffix )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:376:4: rewrite_tree_block ebnfSuffix
            {
            pushFollow(FOLLOW_rewrite_tree_block_in_rewrite_tree_ebnf1808);
            rewrite_tree_block();

            state._fsp--;

            pushFollow(FOLLOW_ebnfSuffix_in_rewrite_tree_ebnf1810);
            ebnfSuffix();

            state._fsp--;


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree_ebnf"

    public static class rewrite_tree_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rewrite_tree"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:379:1: rewrite_tree : '^(' rewrite_tree_atom ( rewrite_tree_element )* ')' ;
    public final ANTLRv3Parser.rewrite_tree_return rewrite_tree() throws RecognitionException {
        ANTLRv3Parser.rewrite_tree_return retval = new ANTLRv3Parser.rewrite_tree_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:380:2: ( '^(' rewrite_tree_atom ( rewrite_tree_element )* ')' )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:380:4: '^(' rewrite_tree_atom ( rewrite_tree_element )* ')'
            {
            match(input,TREE_BEGIN,FOLLOW_TREE_BEGIN_in_rewrite_tree1822); 
            pushFollow(FOLLOW_rewrite_tree_atom_in_rewrite_tree1824);
            rewrite_tree_atom();

            state._fsp--;

            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:380:27: ( rewrite_tree_element )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==TREE_BEGIN||(LA62_0>=TOKEN_REF && LA62_0<=ACTION)||LA62_0==RULE_REF||LA62_0==82||LA62_0==93) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:380:27: rewrite_tree_element
            	    {
            	    pushFollow(FOLLOW_rewrite_tree_element_in_rewrite_tree1826);
            	    rewrite_tree_element();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            match(input,84,FOLLOW_84_in_rewrite_tree1829); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_tree"

    public static class rewrite_template_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rewrite_template"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:383:1: rewrite_template : ( id '(' rewrite_template_args ')' ( DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL ) | rewrite_template_ref | rewrite_indirect_template_head | ACTION );
    public final ANTLRv3Parser.rewrite_template_return rewrite_template() throws RecognitionException {
        ANTLRv3Parser.rewrite_template_return retval = new ANTLRv3Parser.rewrite_template_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:395:2: ( id '(' rewrite_template_args ')' ( DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL ) | rewrite_template_ref | rewrite_indirect_template_head | ACTION )
            int alt63=4;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:396:3: id '(' rewrite_template_args ')' ( DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL )
                    {
                    pushFollow(FOLLOW_id_in_rewrite_template1847);
                    id();

                    state._fsp--;

                    match(input,82,FOLLOW_82_in_rewrite_template1849); 
                    pushFollow(FOLLOW_rewrite_template_args_in_rewrite_template1851);
                    rewrite_template_args();

                    state._fsp--;

                    match(input,84,FOLLOW_84_in_rewrite_template1853); 
                    if ( (input.LA(1)>=DOUBLE_QUOTE_STRING_LITERAL && input.LA(1)<=DOUBLE_ANGLE_STRING_LITERAL) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:400:3: rewrite_template_ref
                    {
                    pushFollow(FOLLOW_rewrite_template_ref_in_rewrite_template1874);
                    rewrite_template_ref();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:403:3: rewrite_indirect_template_head
                    {
                    pushFollow(FOLLOW_rewrite_indirect_template_head_in_rewrite_template1883);
                    rewrite_indirect_template_head();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:406:3: ACTION
                    {
                    match(input,ACTION,FOLLOW_ACTION_in_rewrite_template1892); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_template"

    public static class rewrite_template_ref_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rewrite_template_ref"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:409:1: rewrite_template_ref : id '(' rewrite_template_args ')' ;
    public final ANTLRv3Parser.rewrite_template_ref_return rewrite_template_ref() throws RecognitionException {
        ANTLRv3Parser.rewrite_template_ref_return retval = new ANTLRv3Parser.rewrite_template_ref_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:411:2: ( id '(' rewrite_template_args ')' )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:411:4: id '(' rewrite_template_args ')'
            {
            pushFollow(FOLLOW_id_in_rewrite_template_ref1905);
            id();

            state._fsp--;

            match(input,82,FOLLOW_82_in_rewrite_template_ref1907); 
            pushFollow(FOLLOW_rewrite_template_args_in_rewrite_template_ref1909);
            rewrite_template_args();

            state._fsp--;

            match(input,84,FOLLOW_84_in_rewrite_template_ref1911); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_template_ref"

    public static class rewrite_indirect_template_head_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rewrite_indirect_template_head"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:414:1: rewrite_indirect_template_head : '(' ACTION ')' '(' rewrite_template_args ')' ;
    public final ANTLRv3Parser.rewrite_indirect_template_head_return rewrite_indirect_template_head() throws RecognitionException {
        ANTLRv3Parser.rewrite_indirect_template_head_return retval = new ANTLRv3Parser.rewrite_indirect_template_head_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:416:2: ( '(' ACTION ')' '(' rewrite_template_args ')' )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:416:4: '(' ACTION ')' '(' rewrite_template_args ')'
            {
            match(input,82,FOLLOW_82_in_rewrite_indirect_template_head1924); 
            match(input,ACTION,FOLLOW_ACTION_in_rewrite_indirect_template_head1926); 
            match(input,84,FOLLOW_84_in_rewrite_indirect_template_head1928); 
            match(input,82,FOLLOW_82_in_rewrite_indirect_template_head1930); 
            pushFollow(FOLLOW_rewrite_template_args_in_rewrite_indirect_template_head1932);
            rewrite_template_args();

            state._fsp--;

            match(input,84,FOLLOW_84_in_rewrite_indirect_template_head1934); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_indirect_template_head"

    public static class rewrite_template_args_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rewrite_template_args"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:419:1: rewrite_template_args : ( rewrite_template_arg ( ',' rewrite_template_arg )* | );
    public final ANTLRv3Parser.rewrite_template_args_return rewrite_template_args() throws RecognitionException {
        ANTLRv3Parser.rewrite_template_args_return retval = new ANTLRv3Parser.rewrite_template_args_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:420:2: ( rewrite_template_arg ( ',' rewrite_template_arg )* | )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==TOKEN_REF||LA65_0==RULE_REF) ) {
                alt65=1;
            }
            else if ( (LA65_0==84) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:420:4: rewrite_template_arg ( ',' rewrite_template_arg )*
                    {
                    pushFollow(FOLLOW_rewrite_template_arg_in_rewrite_template_args1945);
                    rewrite_template_arg();

                    state._fsp--;

                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:420:25: ( ',' rewrite_template_arg )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==81) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:420:26: ',' rewrite_template_arg
                    	    {
                    	    match(input,81,FOLLOW_81_in_rewrite_template_args1948); 
                    	    pushFollow(FOLLOW_rewrite_template_arg_in_rewrite_template_args1950);
                    	    rewrite_template_arg();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:422:2: 
                    {
                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_template_args"

    public static class rewrite_template_arg_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "rewrite_template_arg"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:424:1: rewrite_template_arg : id '=' ACTION ;
    public final ANTLRv3Parser.rewrite_template_arg_return rewrite_template_arg() throws RecognitionException {
        ANTLRv3Parser.rewrite_template_arg_return retval = new ANTLRv3Parser.rewrite_template_arg_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:425:2: ( id '=' ACTION )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:425:6: id '=' ACTION
            {
            pushFollow(FOLLOW_id_in_rewrite_template_arg1968);
            id();

            state._fsp--;

            match(input,71,FOLLOW_71_in_rewrite_template_arg1970); 
            match(input,ACTION,FOLLOW_ACTION_in_rewrite_template_arg1972); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rewrite_template_arg"

    public static class id_return extends ParserRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "id"
    // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:428:1: id : ( TOKEN_REF | RULE_REF );
    public final ANTLRv3Parser.id_return id() throws RecognitionException {
        ANTLRv3Parser.id_return retval = new ANTLRv3Parser.id_return();
        retval.start = input.LT(1);

        try {
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:428:4: ( TOKEN_REF | RULE_REF )
            // /Users/valliant/Projects/java/CFML/cfml.parsing/src/treetool/ANTLRv3.g:
            {
            if ( input.LA(1)==TOKEN_REF||input.LA(1)==RULE_REF ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "id"

    // Delegated rules


    protected DFA42 dfa42 = new DFA42(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA63 dfa63 = new DFA63(this);
    static final String DFA42_eotS =
        "\13\uffff";
    static final String DFA42_eofS =
        "\13\uffff";
    static final String DFA42_minS =
        "\2\40\1\uffff\1\40\4\uffff\1\52\2\uffff";
    static final String DFA42_maxS =
        "\2\134\1\uffff\1\134\4\uffff\1\134\2\uffff";
    static final String DFA42_acceptS =
        "\2\uffff\1\3\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\1\1\2";
    static final String DFA42_specialS =
        "\13\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\6\4\uffff\1\7\4\uffff\1\1\2\2\1\5\3\uffff\1\3\40\uffff\1"+
            "\4\6\uffff\1\2\2\uffff\1\2",
            "\1\2\4\uffff\4\2\1\uffff\4\2\2\uffff\2\2\23\uffff\1\2\1\uffff"+
            "\1\10\2\uffff\1\2\7\uffff\3\2\2\uffff\1\10\1\uffff\4\2",
            "",
            "\1\2\4\uffff\4\2\1\uffff\4\2\2\uffff\2\2\23\uffff\1\2\1\uffff"+
            "\1\10\2\uffff\1\2\7\uffff\3\2\2\uffff\1\10\1\uffff\4\2",
            "",
            "",
            "",
            "",
            "\3\11\4\uffff\1\11\40\uffff\1\12\6\uffff\1\11\2\uffff\1\11",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "218:1: elementNoOptionSpec : ( id ( '=' | '+=' ) atom ( ebnfSuffix | ) | id ( '=' | '+=' ) block ( ebnfSuffix | ) | atom ( ebnfSuffix | ) | ebnf | ACTION | SEMPRED ( '=>' | ) | treeSpec ( ebnfSuffix | ) );";
        }
    }
    static final String DFA56_eotS =
        "\14\uffff";
    static final String DFA56_eofS =
        "\14\uffff";
    static final String DFA56_minS =
        "\3\45\2\uffff\1\45\1\uffff\4\45\1\112";
    static final String DFA56_maxS =
        "\3\135\2\uffff\1\135\1\uffff\4\135\1\133";
    static final String DFA56_acceptS =
        "\3\uffff\1\1\1\2\1\uffff\1\3\5\uffff";
    static final String DFA56_specialS =
        "\14\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\4\2\uffff\1\6\1\uffff\1\1\2\4\1\3\3\uffff\1\5\23\uffff\1"+
            "\6\14\uffff\1\2\2\6\10\uffff\1\4",
            "\1\4\2\uffff\1\4\1\uffff\4\4\2\uffff\2\4\23\uffff\1\4\4\uffff"+
            "\1\4\7\uffff\1\7\2\4\5\uffff\2\4\1\uffff\1\4",
            "\1\4\4\uffff\3\4\1\10\3\uffff\1\4\40\uffff\1\4\12\uffff\1\4",
            "",
            "",
            "\1\4\2\uffff\1\4\1\uffff\4\4\3\uffff\1\4\23\uffff\1\4\4\uffff"+
            "\1\4\7\uffff\1\7\2\4\5\uffff\2\4\1\uffff\1\4",
            "",
            "\1\4\4\uffff\1\11\3\4\3\uffff\1\12\40\uffff\1\4\1\uffff\1\3"+
            "\10\uffff\1\4",
            "\1\4\4\uffff\4\4\3\uffff\1\4\30\uffff\1\4\7\uffff\1\4\1\uffff"+
            "\1\13\5\uffff\2\4\1\uffff\1\4",
            "\1\4\4\uffff\4\4\2\uffff\2\4\25\uffff\1\3\2\uffff\1\4\7\uffff"+
            "\1\4\1\uffff\1\4\5\uffff\2\4\1\uffff\1\4",
            "\1\4\4\uffff\4\4\3\uffff\1\4\25\uffff\1\3\2\uffff\1\4\7\uffff"+
            "\1\4\1\uffff\1\4\5\uffff\2\4\1\uffff\1\4",
            "\1\4\7\uffff\1\3\7\uffff\2\4"
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "342:1: rewrite_alternative : ( rewrite_template | rewrite_tree_alternative | );";
        }
    }
    static final String DFA59_eotS =
        "\15\uffff";
    static final String DFA59_eofS =
        "\15\uffff";
    static final String DFA59_minS =
        "\5\45\1\52\1\45\4\uffff\2\45";
    static final String DFA59_maxS =
        "\5\135\1\61\1\135\4\uffff\2\135";
    static final String DFA59_acceptS =
        "\7\uffff\1\3\1\4\1\1\1\2\2\uffff";
    static final String DFA59_specialS =
        "\15\uffff}>";
    static final String[] DFA59_transitionS = {
            "\1\7\4\uffff\1\2\1\4\1\1\1\6\3\uffff\1\3\40\uffff\1\10\12\uffff"+
            "\1\5",
            "\1\11\2\uffff\1\11\1\uffff\4\11\3\uffff\1\11\23\uffff\1\11"+
            "\4\uffff\1\12\7\uffff\3\11\5\uffff\2\12\1\uffff\1\11",
            "\1\11\2\uffff\1\11\1\uffff\4\11\2\uffff\1\13\1\11\23\uffff"+
            "\1\11\4\uffff\1\12\7\uffff\3\11\5\uffff\2\12\1\uffff\1\11",
            "\1\11\2\uffff\1\11\1\uffff\4\11\3\uffff\1\11\23\uffff\1\11"+
            "\4\uffff\1\12\7\uffff\3\11\5\uffff\2\12\1\uffff\1\11",
            "\1\11\2\uffff\1\11\1\uffff\4\11\3\uffff\1\11\23\uffff\1\11"+
            "\4\uffff\1\12\7\uffff\3\11\5\uffff\2\12\1\uffff\1\11",
            "\1\14\6\uffff\1\14",
            "\1\11\2\uffff\1\11\1\uffff\4\11\3\uffff\1\11\23\uffff\1\11"+
            "\4\uffff\1\12\7\uffff\3\11\5\uffff\2\12\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "\1\11\2\uffff\1\11\1\uffff\4\11\3\uffff\1\11\23\uffff\1\11"+
            "\4\uffff\1\12\7\uffff\3\11\5\uffff\2\12\1\uffff\1\11",
            "\1\11\2\uffff\1\11\1\uffff\4\11\3\uffff\1\11\23\uffff\1\11"+
            "\4\uffff\1\12\7\uffff\3\11\5\uffff\2\12\1\uffff\1\11"
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "356:1: rewrite_tree_element : ( rewrite_tree_atom | rewrite_tree_atom ebnfSuffix | rewrite_tree ( ebnfSuffix | ) | rewrite_tree_ebnf );";
        }
    }
    static final String DFA63_eotS =
        "\17\uffff";
    static final String DFA63_eofS =
        "\17\uffff";
    static final String DFA63_minS =
        "\1\52\1\122\2\uffff\1\52\1\107\1\50\1\55\2\uffff\1\121\1\52\1\107"+
        "\1\55\1\121";
    static final String DFA63_maxS =
        "\2\122\2\uffff\1\124\1\107\1\124\1\55\2\uffff\1\124\1\61\1\107\1"+
        "\55\1\124";
    static final String DFA63_acceptS =
        "\2\uffff\1\3\1\4\4\uffff\1\1\1\2\5\uffff";
    static final String DFA63_specialS =
        "\17\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\1\2\uffff\1\3\3\uffff\1\1\40\uffff\1\2",
            "\1\4",
            "",
            "",
            "\1\5\6\uffff\1\5\42\uffff\1\6",
            "\1\7",
            "\1\11\11\uffff\2\10\21\uffff\1\11\15\uffff\2\11",
            "\1\12",
            "",
            "",
            "\1\13\2\uffff\1\6",
            "\1\14\6\uffff\1\14",
            "\1\15",
            "\1\16",
            "\1\13\2\uffff\1\6"
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "383:1: rewrite_template : ( id '(' rewrite_template_args ')' ( DOUBLE_QUOTE_STRING_LITERAL | DOUBLE_ANGLE_STRING_LITERAL ) | rewrite_template_ref | rewrite_indirect_template_head | ACTION );";
        }
    }
 

    public static final BitSet FOLLOW_DOC_COMMENT_in_grammarDef353 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001EL});
    public static final BitSet FOLLOW_65_in_grammarDef363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_66_in_grammarDef379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_67_in_grammarDef394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_grammarDef418 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_grammarDef420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_grammarDef422 = new BitSet(new long[]{0x0002461080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_optionsSpec_in_grammarDef424 = new BitSet(new long[]{0x0002461080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_tokensSpec_in_grammarDef427 = new BitSet(new long[]{0x0002461080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_attrScope_in_grammarDef430 = new BitSet(new long[]{0x0002461080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_action_in_grammarDef433 = new BitSet(new long[]{0x0002461080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_rule_in_grammarDef441 = new BitSet(new long[]{0x0002461080000010L,0x0000000000003900L});
    public static final BitSet FOLLOW_EOF_in_grammarDef449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKENS_in_tokensSpec463 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_tokenSpec_in_tokensSpec465 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_tokensSpec468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_tokenSpec479 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000A0L});
    public static final BitSet FOLLOW_71_in_tokenSpec485 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_set_in_tokenSpec487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_tokenSpec505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_attrScope516 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_attrScope518 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_attrScope520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_action533 = new BitSet(new long[]{0x0002040000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_actionScopeName_in_action536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_action538 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_action542 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_action544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_actionScopeName557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_actionScopeName562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_actionScopeName570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTIONS_in_optionsSpec581 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_option_in_optionsSpec584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_optionsSpec586 = new BitSet(new long[]{0x0002040000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_optionsSpec590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_option606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_option608 = new BitSet(new long[]{0x00029C0000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_optionValue_in_option610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_optionValue629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_optionValue639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_optionValue649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_optionValue659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_optionValue667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOC_COMMENT_in_rule683 = new BitSet(new long[]{0x0002041000000000L,0x0000000000003800L});
    public static final BitSet FOLLOW_set_in_rule690 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_rule705 = new BitSet(new long[]{0x0001408080000000L,0x000000000001C100L});
    public static final BitSet FOLLOW_BANG_in_rule711 = new BitSet(new long[]{0x0001400080000000L,0x000000000001C100L});
    public static final BitSet FOLLOW_ARG_ACTION_in_rule718 = new BitSet(new long[]{0x0000400080000000L,0x000000000001C100L});
    public static final BitSet FOLLOW_78_in_rule727 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ARG_ACTION_in_rule729 = new BitSet(new long[]{0x0000400080000000L,0x0000000000018100L});
    public static final BitSet FOLLOW_throwsSpec_in_rule737 = new BitSet(new long[]{0x0000400080000000L,0x0000000000008100L});
    public static final BitSet FOLLOW_optionsSpec_in_rule740 = new BitSet(new long[]{0x0000000080000000L,0x0000000000008100L});
    public static final BitSet FOLLOW_ruleScopeSpec_in_rule743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008100L});
    public static final BitSet FOLLOW_ruleAction_in_rule746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008100L});
    public static final BitSet FOLLOW_79_in_rule751 = new BitSet(new long[]{0x00023D2100000000L,0x00000000120C0000L});
    public static final BitSet FOLLOW_altList_in_rule757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_rule759 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_exceptionGroup_in_rule763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleAction777 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_ruleAction779 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_ruleAction781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_throwsSpec792 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_throwsSpec794 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_throwsSpec798 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_throwsSpec800 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec814 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_ruleScopeSpec816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec821 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
    public static final BitSet FOLLOW_81_in_ruleScopeSpec826 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
    public static final BitSet FOLLOW_69_in_ruleScopeSpec832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec837 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_ruleScopeSpec839 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_SCOPE_in_ruleScopeSpec843 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
    public static final BitSet FOLLOW_81_in_ruleScopeSpec848 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_ruleScopeSpec850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
    public static final BitSet FOLLOW_69_in_ruleScopeSpec854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_block868 = new BitSet(new long[]{0x00027D2100000000L,0x00000000121C8000L});
    public static final BitSet FOLLOW_optionsSpec_in_block876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_block880 = new BitSet(new long[]{0x00023D2100000000L,0x00000000121C0000L});
    public static final BitSet FOLLOW_alternative_in_block885 = new BitSet(new long[]{0x0000010000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_rewrite_in_block887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_83_in_block891 = new BitSet(new long[]{0x00023D2100000000L,0x00000000121C0000L});
    public static final BitSet FOLLOW_alternative_in_block893 = new BitSet(new long[]{0x0000010000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_rewrite_in_block895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_84_in_block900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alternative_in_altList917 = new BitSet(new long[]{0x0000010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_rewrite_in_altList919 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_altList923 = new BitSet(new long[]{0x00023D2100000000L,0x00000000120C0000L});
    public static final BitSet FOLLOW_alternative_in_altList925 = new BitSet(new long[]{0x0000010000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_rewrite_in_altList927 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_element_in_alternative949 = new BitSet(new long[]{0x00023C2100000002L,0x0000000012040000L});
    public static final BitSet FOLLOW_exceptionHandler_in_exceptionGroup972 = new BitSet(new long[]{0x0000000000000002L,0x0000000000600000L});
    public static final BitSet FOLLOW_finallyClause_in_exceptionGroup979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_exceptionGroup987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_exceptionHandler1007 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ARG_ACTION_in_exceptionHandler1009 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_exceptionHandler1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_finallyClause1031 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_finallyClause1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementNoOptionSpec_in_element1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_elementNoOptionSpec1058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800080L});
    public static final BitSet FOLLOW_set_in_elementNoOptionSpec1060 = new BitSet(new long[]{0x00021C0000000000L,0x0000000012000000L});
    public static final BitSet FOLLOW_atom_in_elementNoOptionSpec1068 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_elementNoOptionSpec1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_elementNoOptionSpec1087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800080L});
    public static final BitSet FOLLOW_set_in_elementNoOptionSpec1089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_block_in_elementNoOptionSpec1097 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_elementNoOptionSpec1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_elementNoOptionSpec1116 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_elementNoOptionSpec1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ebnf_in_elementNoOptionSpec1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_elementNoOptionSpec1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMPRED_in_elementNoOptionSpec1149 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_elementNoOptionSpec1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_treeSpec_in_elementNoOptionSpec1164 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_elementNoOptionSpec1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_range_in_atom1189 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_set_in_atom1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_terminal_in_atom1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notSet_in_atom1221 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_set_in_atom1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REF_in_atom1245 = new BitSet(new long[]{0x000100C000000002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_atom1285 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_set_in_atom1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_notSet1315 = new BitSet(new long[]{0x00001C0000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_notTerminal_in_notSet1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_notSet1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TREE_BEGIN_in_treeSpec1342 = new BitSet(new long[]{0x00023C2100000000L,0x0000000012040000L});
    public static final BitSet FOLLOW_element_in_treeSpec1344 = new BitSet(new long[]{0x00023C2100000000L,0x0000000012040000L});
    public static final BitSet FOLLOW_element_in_treeSpec1348 = new BitSet(new long[]{0x00023C2100000000L,0x0000000012140000L});
    public static final BitSet FOLLOW_84_in_treeSpec1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_ebnf1366 = new BitSet(new long[]{0x0000000000000002L,0x000000000D000400L});
    public static final BitSet FOLLOW_90_in_ebnf1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ebnf1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ebnf1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ebnf1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_range1417 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RANGE_in_range1419 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_range1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_terminal1439 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_terminal1463 = new BitSet(new long[]{0x000100C000000002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_terminal1486 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_terminal1504 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_92_in_terminal1529 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_set_in_terminal1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_notTerminal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ebnfSuffix0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REWRITE_in_rewrite1619 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_SEMPRED_in_rewrite1621 = new BitSet(new long[]{0x00023D2000000000L,0x0000000020040000L});
    public static final BitSet FOLLOW_rewrite_alternative_in_rewrite1623 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_REWRITE_in_rewrite1627 = new BitSet(new long[]{0x00023C2000000000L,0x0000000020040000L});
    public static final BitSet FOLLOW_rewrite_alternative_in_rewrite1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_template_in_rewrite_alternative1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_alternative_in_rewrite_alternative1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rewrite_tree_block1669 = new BitSet(new long[]{0x00023C2000000000L,0x0000000020040000L});
    public static final BitSet FOLLOW_rewrite_tree_alternative_in_rewrite_tree_block1671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_tree_block1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_element_in_rewrite_tree_alternative1690 = new BitSet(new long[]{0x00023C2000000002L,0x0000000020040000L});
    public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree_element1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree_element1710 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_element1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_in_rewrite_tree_element1719 = new BitSet(new long[]{0x0000000000000002L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_element1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_ebnf_in_rewrite_tree_element1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_rewrite_tree_atom1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TOKEN_REF_in_rewrite_tree_atom1763 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_ARG_ACTION_in_rewrite_tree_atom1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REF_in_rewrite_tree_atom1777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_rewrite_tree_atom1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_rewrite_tree_atom1789 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_id_in_rewrite_tree_atom1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_tree_atom1797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_tree_block_in_rewrite_tree_ebnf1808 = new BitSet(new long[]{0x0000000000000000L,0x000000000C000400L});
    public static final BitSet FOLLOW_ebnfSuffix_in_rewrite_tree_ebnf1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TREE_BEGIN_in_rewrite_tree1822 = new BitSet(new long[]{0x00023C0000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_rewrite_tree_atom_in_rewrite_tree1824 = new BitSet(new long[]{0x00023C2000000000L,0x0000000020140000L});
    public static final BitSet FOLLOW_rewrite_tree_element_in_rewrite_tree1826 = new BitSet(new long[]{0x00023C2000000000L,0x0000000020140000L});
    public static final BitSet FOLLOW_84_in_rewrite_tree1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_rewrite_template1847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_rewrite_template1849 = new BitSet(new long[]{0x0002040000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_template1851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_template1853 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_set_in_rewrite_template1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_template_ref_in_rewrite_template1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_indirect_template_head_in_rewrite_template1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_template1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_rewrite_template_ref1905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_rewrite_template_ref1907 = new BitSet(new long[]{0x0002040000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_template_ref1909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_template_ref1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_rewrite_indirect_template_head1924 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_indirect_template_head1926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_indirect_template_head1928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_rewrite_indirect_template_head1930 = new BitSet(new long[]{0x0002040000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_rewrite_template_args_in_rewrite_indirect_template_head1932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_rewrite_indirect_template_head1934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewrite_template_arg_in_rewrite_template_args1945 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rewrite_template_args1948 = new BitSet(new long[]{0x0002040000000000L});
    public static final BitSet FOLLOW_rewrite_template_arg_in_rewrite_template_args1950 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_id_in_rewrite_template_arg1968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_rewrite_template_arg1970 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ACTION_in_rewrite_template_arg1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_id0 = new BitSet(new long[]{0x0000000000000002L});

}