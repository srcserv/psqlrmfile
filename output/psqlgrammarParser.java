// $ANTLR 3.4 /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g 2012-06-11 10:39:47

import java.util.HashMap;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class psqlgrammarParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Asterisk", "BETWEEN", "Basic_Latin_Without_Quotes", "Character_String_Literal", "Comma", "Concatenation_Operator", "Dash", "Digit", "Equals_Operator", "Extended_Latin_Without_Quotes", "Greater_Or_Equals_Operator", "Greater_Than_Operator", "IS", "Left_Paren", "Less_Or_Equals_Operator", "Less_Than_Operator", "Minus_Sign", "NEWLINE", "NOT", "Not_Equals_Operator", "POLYMORPHIC", "Percent", "Period", "Plus_Sign", "Quote", "Regular_Identifier", "Right_Arrow", "Right_Paren", "SQL92_Identifier", "SQL92_Identifier_Part", "SQL92_Identifier_Start", "Simple_Latin_Letter", "Simple_Latin_Lower_Case_Letter", "Simple_Latin_Upper_Case_Letter", "Single_Quote", "Slash", "Underscore", "Unsigned_Integer", "Unsigned_Integer2", "WS", "'ABS'", "'AGI CLONE'", "'ALL'", "'AND'", "'ANY'", "'AS'", "'ASC'", "'ASYMMETRIC'", "'AVG'", "'BERNOULLI'", "'BOTH'", "'BY'", "'CHARACTERS'", "'CHROMOSOME'", "'CODE_UNITS'", "'COLLATE'", "'COLLECT'", "'COUNT'", "'CROSS'", "'CUBE'", "'DESC'", "'DISTINCT'", "'ESCAPE'", "'EVERY'", "'EXCEPT'", "'EXCLUSIVE'", "'FALSE'", "'FILTER'", "'FIRST'", "'FOR'", "'FROM'", "'FULL'", "'FUSION'", "'GROUP'", "'GROUPING'", "'HAVING'", "'IN'", "'INCLUSIVE'", "'INNER'", "'INTERSECT'", "'INTERSECTION'", "'IS-A'", "'JOIN'", "'KB'", "'LAST'", "'LEADING'", "'LEFT'", "'LIKE'", "'LOCUS'", "'LOWER'", "'MAP'", "'MARKER'", "'MAX'", "'MIN'", "'MODULE'", "'NATURAL'", "'NULLS'", "'OCTETS'", "'ON'", "'ONTOLOGY'", "'OR'", "'ORDER'", "'OTHER CLONE'", "'OUTER'", "'PART-OF'", "'REFERENCE'", "'REGULATES'", "'REPEATABLE'", "'RIGHT'", "'ROLLUP'", "'ROW'", "'SELECT'", "'SETS'", "'SIMILAR'", "'SOME'", "'STDDEV_POP'", "'STDDEV_SAMP'", "'SUBSTRING'", "'SUM'", "'SYMMETRIC'", "'SYSTEM'", "'TABLESAMPLE'", "'TRAILING'", "'TRIM'", "'TRUE'", "'UNION'", "'UNKNOWN'", "'UPPER'", "'USING'", "'VAR_POP'", "'VAR_SAMP'", "'WHERE'"
    };

    public static final int EOF=-1;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
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
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int T__126=126;
    public static final int T__127=127;
    public static final int T__128=128;
    public static final int T__129=129;
    public static final int T__130=130;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int T__135=135;
    public static final int Asterisk=4;
    public static final int BETWEEN=5;
    public static final int Basic_Latin_Without_Quotes=6;
    public static final int Character_String_Literal=7;
    public static final int Comma=8;
    public static final int Concatenation_Operator=9;
    public static final int Dash=10;
    public static final int Digit=11;
    public static final int Equals_Operator=12;
    public static final int Extended_Latin_Without_Quotes=13;
    public static final int Greater_Or_Equals_Operator=14;
    public static final int Greater_Than_Operator=15;
    public static final int IS=16;
    public static final int Left_Paren=17;
    public static final int Less_Or_Equals_Operator=18;
    public static final int Less_Than_Operator=19;
    public static final int Minus_Sign=20;
    public static final int NEWLINE=21;
    public static final int NOT=22;
    public static final int Not_Equals_Operator=23;
    public static final int POLYMORPHIC=24;
    public static final int Percent=25;
    public static final int Period=26;
    public static final int Plus_Sign=27;
    public static final int Quote=28;
    public static final int Regular_Identifier=29;
    public static final int Right_Arrow=30;
    public static final int Right_Paren=31;
    public static final int SQL92_Identifier=32;
    public static final int SQL92_Identifier_Part=33;
    public static final int SQL92_Identifier_Start=34;
    public static final int Simple_Latin_Letter=35;
    public static final int Simple_Latin_Lower_Case_Letter=36;
    public static final int Simple_Latin_Upper_Case_Letter=37;
    public static final int Single_Quote=38;
    public static final int Slash=39;
    public static final int Underscore=40;
    public static final int Unsigned_Integer=41;
    public static final int Unsigned_Integer2=42;
    public static final int WS=43;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "synpred91_psqlgrammar", "quantified_comparison_predicate", 
    "boolean_primary", "synpred33_psqlgrammar", "synpred193_psqlgrammar", 
    "synpred11_psqlgrammar", "synpred19_psqlgrammar", "synpred119_psqlgrammar", 
    "synpred117_psqlgrammar", "synpred96_psqlgrammar", "character_substring_function", 
    "synpred138_psqlgrammar", "ontology_value_expression", "synpred206_psqlgrammar", 
    "ordinary_grouping_set_list", "synpred151_psqlgrammar", "numeric_value_function", 
    "start_position", "synpred7_psqlgrammar", "synpred175_psqlgrammar", 
    "set_quantifier", "synpred56_psqlgrammar", "scalar_subquery", "fully_qualified_identifier", 
    "boolean_term", "synpred92_psqlgrammar", "derived_table", "synpred118_psqlgrammar", 
    "derived_column", "predicate", "synpred157_psqlgrammar", "filter_clause", 
    "rollup_list", "boolean_test", "nonparenthesized_value_expression_primary", 
    "character_value_function", "synpred68_psqlgrammar", "synpred201_psqlgrammar", 
    "synpred186_psqlgrammar", "synpred140_psqlgrammar", "synpred188_psqlgrammar", 
    "row_value_expression", "synpred158_psqlgrammar", "synpred77_psqlgrammar", 
    "synpred168_psqlgrammar", "ontology_clause", "synpred115_psqlgrammar", 
    "derived_column_list", "months_value", "synpred76_psqlgrammar", "years_value", 
    "synpred48_psqlgrammar", "synpred39_psqlgrammar", "general_set_function", 
    "synpred71_psqlgrammar", "qualified_asterisk", "aggregate_function", 
    "synpred3_psqlgrammar", "synpred192_psqlgrammar", "synpred45_psqlgrammar", 
    "group_by_clause", "table_reference_list", "synpred100_psqlgrammar", 
    "sign", "ontology_child_predicate", "synpred183_psqlgrammar", "synpred34_psqlgrammar", 
    "polymorphic_between_predicate", "map_value_predicand", "grouping_set", 
    "row_value_constructor_predicand", "grouping_element", "synpred65_psqlgrammar", 
    "in_predicate_value", "regular_expression_substring_function", "absolute_value_expression", 
    "character_like_predicate", "synpred53_psqlgrammar", "synpred22_psqlgrammar", 
    "synpred32_psqlgrammar", "in_predicate_part_2", "character_pattern", 
    "synpred124_psqlgrammar", "synpred74_psqlgrammar", "order_by_clause", 
    "trim_function", "polymorphic_range_predicate_part_2", "synpred146_psqlgrammar", 
    "sort_specification", "term", "character_primary", "synpred204_psqlgrammar", 
    "synpred171_psqlgrammar", "synpred133_psqlgrammar", "unsigned_value_specification", 
    "synpred29_psqlgrammar", "select_list", "cube_list", "synpred189_psqlgrammar", 
    "synpred31_psqlgrammar", "column_name_list", "synpred116_psqlgrammar", 
    "factor", "numeric_primary", "synpred8_psqlgrammar", "synpred163_psqlgrammar", 
    "synpred134_psqlgrammar", "sample_clause", "value_expression_primary", 
    "query_primary", "ordinary_grouping_set", "explicit_row_value_constructor", 
    "col_literal", "genomic_location_value", "synpred43_psqlgrammar", "synpred161_psqlgrammar", 
    "synpred55_psqlgrammar", "synpred106_psqlgrammar", "synpred15_psqlgrammar", 
    "identifier_chain", "sort_specification_list", "sort_key", "string_length", 
    "value_expression", "synpred132_psqlgrammar", "table_primary", "comparison_predicate", 
    "synpred5_psqlgrammar", "synpred109_psqlgrammar", "synpred87_psqlgrammar", 
    "days_value", "synpred85_psqlgrammar", "synpred79_psqlgrammar", "string_value_expression", 
    "synpred143_psqlgrammar", "synpred64_psqlgrammar", "synpred20_psqlgrammar", 
    "synpred98_psqlgrammar", "join_condition", "synpred147_psqlgrammar", 
    "synpred35_psqlgrammar", "synpred164_psqlgrammar", "non_terminal_identifier", 
    "common_value_expression", "synpred25_psqlgrammar", "map_clause", "character_like_predicate_part_2", 
    "synpred16_psqlgrammar", "synpred54_psqlgrammar", "all", "synpred94_psqlgrammar", 
    "sample_method", "table_reference", "reference_polymorphism_clause", 
    "repeatable_clause", "character_factor", "synpred129_psqlgrammar", "ontology_relation", 
    "synpred78_psqlgrammar", "between_predicate_part_2", "comparison_predicate_part_2", 
    "synpred2_psqlgrammar", "identifier", "synpred159_psqlgrammar", "synpred51_psqlgrammar", 
    "synpred167_psqlgrammar", "synpred59_psqlgrammar", "trim_specification", 
    "synpred82_psqlgrammar", "synpred105_psqlgrammar", "polymorphic_between_predicate_part_2", 
    "synpred126_psqlgrammar", "from_clause", "grouping_set_list", "synpred205_psqlgrammar", 
    "synpred72_psqlgrammar", "synpred58_psqlgrammar", "col_value", "polymorphic_between_value", 
    "synpred101_psqlgrammar", "synpred24_psqlgrammar", "grouping_sets_specification", 
    "synpred38_psqlgrammar", "synpred1_psqlgrammar", "row_value_constructor_element_list", 
    "collate_clause", "synpred90_psqlgrammar", "column_reference", "polymorphic_range_predicate", 
    "comp_op", "boolean_value_expression", "synpred145_psqlgrammar", "synpred27_psqlgrammar", 
    "where_clause", "synpred40_psqlgrammar", "query_expression", "row_value_predicand", 
    "synpred60_psqlgrammar", "synpred21_psqlgrammar", "synpred195_psqlgrammar", 
    "synpred154_psqlgrammar", "synpred103_psqlgrammar", "synpred41_psqlgrammar", 
    "set_function_specification", "synpred46_psqlgrammar", "synpred47_psqlgrammar", 
    "computational_operation", "synpred37_psqlgrammar", "synpred26_psqlgrammar", 
    "general_value_specification", "row_value_special_case", "synpred185_psqlgrammar", 
    "synpred125_psqlgrammar", "synpred198_psqlgrammar", "char_length_units", 
    "synpred194_psqlgrammar", "synpred93_psqlgrammar", "synpred182_psqlgrammar", 
    "synpred169_psqlgrammar", "synpred113_psqlgrammar", "synpred52_psqlgrammar", 
    "synpred137_psqlgrammar", "synpred81_psqlgrammar", "synpred148_psqlgrammar", 
    "synpred88_psqlgrammar", "in_value_list", "synpred123_psqlgrammar", 
    "synpred110_psqlgrammar", "synpred108_psqlgrammar", "some", "synpred191_psqlgrammar", 
    "synpred200_psqlgrammar", "synpred165_psqlgrammar", "schema_name", "synpred131_psqlgrammar", 
    "synpred111_psqlgrammar", "synpred14_psqlgrammar", "synpred155_psqlgrammar", 
    "synpred127_psqlgrammar", "synpred83_psqlgrammar", "synpred17_psqlgrammar", 
    "synpred62_psqlgrammar", "synpred44_psqlgrammar", "synpred176_psqlgrammar", 
    "synpred152_psqlgrammar", "synpred128_psqlgrammar", "synpred150_psqlgrammar", 
    "synpred136_psqlgrammar", "grouping_column_reference", "synpred66_psqlgrammar", 
    "quantified_comparison_predicate_part_2", "synpred156_psqlgrammar", 
    "synpred73_psqlgrammar", "synpred23_psqlgrammar", "table_expression", 
    "synpred142_psqlgrammar", "cursor_specification", "synpred12_psqlgrammar", 
    "synpred61_psqlgrammar", "between_predicate", "synpred202_psqlgrammar", 
    "synpred10_psqlgrammar", "synpred102_psqlgrammar", "table_or_query_name", 
    "synpred112_psqlgrammar", "synpred107_psqlgrammar", "outer_join_type", 
    "synpred67_psqlgrammar", "synpred89_psqlgrammar", "numeric_value_expression", 
    "synpred95_psqlgrammar", "synpred30_psqlgrammar", "synpred121_psqlgrammar", 
    "term_value_expression", "synpred139_psqlgrammar", "synpred199_psqlgrammar", 
    "synpred187_psqlgrammar", "synpred174_psqlgrammar", "synpred36_psqlgrammar", 
    "join_type", "having_clause", "ordering_specification", "synpred49_psqlgrammar", 
    "string_value_function", "row_subquery", "like_predicate", "synpred197_psqlgrammar", 
    "synpred120_psqlgrammar", "synpred9_psqlgrammar", "joined_table", "query_expression_body", 
    "synpred170_psqlgrammar", "synpred18_psqlgrammar", "direct_select_statement_multiple_rows", 
    "table_name", "null_ordering", "synpred173_psqlgrammar", "query_term", 
    "parenthesized_boolean_value_expression", "synpred99_psqlgrammar", "subquery", 
    "synpred196_psqlgrammar", "synpred181_psqlgrammar", "synpred135_psqlgrammar", 
    "chromosome_clause", "synpred13_psqlgrammar", "year_month_literal", 
    "table_subquery", "select_sublist", "boolean_predicand", "boolean_factor", 
    "synpred114_psqlgrammar", "synpred184_psqlgrammar", "synpred190_psqlgrammar", 
    "synpred97_psqlgrammar", "synpred172_psqlgrammar", "row_value_constructor_element", 
    "synpred42_psqlgrammar", "fold", "synpred80_psqlgrammar", "synpred203_psqlgrammar", 
    "named_columns_join", "non_join_query_term", "trim_character", "non_join_query_expression", 
    "general_literal", "grouping_operation", "synpred50_psqlgrammar", "join_specification", 
    "chromosome_value_predicand", "col_number", "set_function_type", "synpred6_psqlgrammar", 
    "synpred177_psqlgrammar", "synpred57_psqlgrammar", "synpred141_psqlgrammar", 
    "character_value_expression", "join_column_list", "grouping_element_list", 
    "synpred70_psqlgrammar", "synpred144_psqlgrammar", "synpred122_psqlgrammar", 
    "synpred69_psqlgrammar", "simple_table", "in_predicate", "synpred153_psqlgrammar", 
    "trim_source", "synpred180_psqlgrammar", "non_join_query_primary", "synpred178_psqlgrammar", 
    "synpred130_psqlgrammar", "synpred75_psqlgrammar", "synpred162_psqlgrammar", 
    "synpred28_psqlgrammar", "boolean_literal", "synpred104_psqlgrammar", 
    "synpred63_psqlgrammar", "quantifier", "synpred84_psqlgrammar", "as_clause", 
    "trim_operands", "synpred160_psqlgrammar", "synpred86_psqlgrammar", 
    "search_condition", "start_select", "species_variant_list", "query_specification", 
    "truth_value", "synpred4_psqlgrammar", "synpred179_psqlgrammar", "empty_grouping_set", 
    "synpred149_psqlgrammar", "date_literal", "child_predicate_part_2", 
    "grouping_column_reference_list", "synpred166_psqlgrammar"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, true, false, false, true, 
        false, false, false, true, false, false, false, false, false, false, 
        false, false, false, false, false, true, true, false, false, false, 
        false, false, false, true, false, false, false, false, false, false, 
        false, false, false, false, false, true, false, false, false, false, 
        false, false, false, false, true, true, false, false, false, false, 
        false, false, false, false, false, false, false, false, true, true, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, true, true, false, false, false, true, 
        false, true, false, false, false, false, false, false, true, false, 
        true, true, false, false, true, true, false, false, true, true, 
        true, false, true, true, false, true, false, false, false, false, 
        false, true, false, false, true, false, false, false, false, false, 
        false, false, true, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false, false, false, true, false, 
        false, false, false, false, false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public psqlgrammarParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public psqlgrammarParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[376+1];
         

        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public psqlgrammarParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
    this.state.ruleMemo = new HashMap[376+1];
     

}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return psqlgrammarParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g"; }



    HashMap memory = new HashMap();
    HashMap memory2 = new HashMap();
    HashMap memory3 = new HashMap();


    class Mark {
    	int begin;
    	int end;
    }





    // $ANTLR start "start_select"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:43:1: start_select : direct_select_statement_multiple_rows ;
    public final void start_select() throws RecognitionException {
        int start_select_StartIndex = input.index();

        psqlgrammarParser.direct_select_statement_multiple_rows_return direct_select_statement_multiple_rows1 =null;


        try { dbg.enterRule(getGrammarFileName(), "start_select");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:43:17: ( direct_select_statement_multiple_rows )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:43:21: direct_select_statement_multiple_rows
            {
            dbg.location(43,21);
            pushFollow(FOLLOW_direct_select_statement_multiple_rows_in_start_select102);
            direct_select_statement_multiple_rows1=direct_select_statement_multiple_rows();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(43,59);
            if ( state.backtracking==0 ) {System.out.println(); System.out.println("direct_select_statement_multiple_rows ==> " + (direct_select_statement_multiple_rows1!=null?input.toString(direct_select_statement_multiple_rows1.start,direct_select_statement_multiple_rows1.stop):null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, start_select_StartIndex); }

        }
        dbg.location(43, 193);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start_select");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "start_select"



    // $ANTLR start "fully_qualified_identifier"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:49:1: fully_qualified_identifier options {k=1; } : identifier ( Period identifier ( Period identifier )? )? ;
    public final void fully_qualified_identifier() throws RecognitionException {
        int fully_qualified_identifier_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "fully_qualified_identifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:51:2: ( identifier ( Period identifier ( Period identifier )? )? )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:51:5: identifier ( Period identifier ( Period identifier )? )?
            {
            dbg.location(51,5);
            pushFollow(FOLLOW_identifier_in_fully_qualified_identifier139);
            identifier();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(51,17);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:51:17: ( Period identifier ( Period identifier )? )?
            int alt2=2;
            try { dbg.enterSubRule(2);
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==Period) ) {
                alt2=1;
            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:51:19: Period identifier ( Period identifier )?
                    {
                    dbg.location(51,19);
                    match(input,Period,FOLLOW_Period_in_fully_qualified_identifier144); if (state.failed) return ;
                    dbg.location(51,27);
                    pushFollow(FOLLOW_identifier_in_fully_qualified_identifier147);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(51,38);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:51:38: ( Period identifier )?
                    int alt1=2;
                    try { dbg.enterSubRule(1);
                    try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==Period) ) {
                        alt1=1;
                    }
                    } finally {dbg.exitDecision(1);}

                    switch (alt1) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:51:41: Period identifier
                            {
                            dbg.location(51,41);
                            match(input,Period,FOLLOW_Period_in_fully_qualified_identifier152); if (state.failed) return ;
                            dbg.location(51,49);
                            pushFollow(FOLLOW_identifier_in_fully_qualified_identifier155);
                            identifier();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(1);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(2);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, fully_qualified_identifier_StartIndex); }

        }
        dbg.location(51, 64);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fully_qualified_identifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "fully_qualified_identifier"



    // $ANTLR start "column_reference"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:53:1: column_reference options {k=1; } : ( identifier_chain | 'MODULE' Period identifier Period identifier );
    public final void column_reference() throws RecognitionException {
        int column_reference_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "column_reference");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(53, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:55:2: ( identifier_chain | 'MODULE' Period identifier Period identifier )
            int alt3=2;
            try { dbg.enterDecision(3, decisionCanBacktrack[3]);

            int LA3_0 = input.LA(1);

            if ( (LA3_0==Regular_Identifier) ) {
                alt3=1;
            }
            else if ( (LA3_0==98) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(3);}

            switch (alt3) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:55:5: identifier_chain
                    {
                    dbg.location(55,5);
                    pushFollow(FOLLOW_identifier_chain_in_column_reference187);
                    identifier_chain();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:55:24: 'MODULE' Period identifier Period identifier
                    {
                    dbg.location(55,24);
                    match(input,98,FOLLOW_98_in_column_reference191); if (state.failed) return ;
                    dbg.location(55,33);
                    match(input,Period,FOLLOW_Period_in_column_reference193); if (state.failed) return ;
                    dbg.location(55,40);
                    pushFollow(FOLLOW_identifier_in_column_reference195);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(55,52);
                    match(input,Period,FOLLOW_Period_in_column_reference198); if (state.failed) return ;
                    dbg.location(55,59);
                    pushFollow(FOLLOW_identifier_in_column_reference200);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, column_reference_StartIndex); }

        }
        dbg.location(55, 68);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "column_reference");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "column_reference"



    // $ANTLR start "general_literal"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:60:1: general_literal options {k=1; } : ( Character_String_Literal | boolean_literal );
    public final void general_literal() throws RecognitionException {
        int general_literal_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "general_literal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(60, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:62:2: ( Character_String_Literal | boolean_literal )
            int alt4=2;
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==Character_String_Literal) ) {
                alt4=1;
            }
            else if ( (LA4_0==70||LA4_0==128||LA4_0==130) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:62:4: Character_String_Literal
                    {
                    dbg.location(62,4);
                    match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_general_literal219); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:66:4: boolean_literal
                    {
                    dbg.location(66,4);
                    pushFollow(FOLLOW_boolean_literal_in_general_literal230);
                    boolean_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, general_literal_StartIndex); }

        }
        dbg.location(69, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "general_literal");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "general_literal"



    // $ANTLR start "boolean_literal"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:71:1: boolean_literal : ( 'TRUE' | 'FALSE' | 'UNKNOWN' );
    public final void boolean_literal() throws RecognitionException {
        int boolean_literal_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "boolean_literal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(71, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:71:29: ( 'TRUE' | 'FALSE' | 'UNKNOWN' )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            dbg.location(71,29);
            if ( input.LA(1)==70||input.LA(1)==128||input.LA(1)==130 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, boolean_literal_StartIndex); }

        }
        dbg.location(71, 59);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "boolean_literal");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "boolean_literal"



    // $ANTLR start "sign"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:85:1: sign : ( Plus_Sign | Minus_Sign );
    public final void sign() throws RecognitionException {
        int sign_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "sign");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(85, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:85:8: ( Plus_Sign | Minus_Sign )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            dbg.location(85,8);
            if ( input.LA(1)==Minus_Sign||input.LA(1)==Plus_Sign ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, sign_StartIndex); }

        }
        dbg.location(85, 32);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sign");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "sign"



    // $ANTLR start "date_literal"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:99:1: date_literal : days_value oneminus= Minus_Sign months_value twominus= Minus_Sign years_value ;
    public final void date_literal() throws RecognitionException {
        int date_literal_StartIndex = input.index();

        Token oneminus=null;
        Token twominus=null;

        try { dbg.enterRule(getGrammarFileName(), "date_literal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(99, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:99:29: ( days_value oneminus= Minus_Sign months_value twominus= Minus_Sign years_value )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:99:34: days_value oneminus= Minus_Sign months_value twominus= Minus_Sign years_value
            {
            dbg.location(99,34);
            pushFollow(FOLLOW_days_value_in_date_literal318);
            days_value();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(99,54);
            oneminus=(Token)match(input,Minus_Sign,FOLLOW_Minus_Sign_in_date_literal323); if (state.failed) return ;
            dbg.location(99,66);
            if ( state.backtracking==0 ) {System.out.print((oneminus!=null?oneminus.getText():null));}
            dbg.location(100,42);
            pushFollow(FOLLOW_months_value_in_date_literal368);
            months_value();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(100,64);
            twominus=(Token)match(input,Minus_Sign,FOLLOW_Minus_Sign_in_date_literal373); if (state.failed) return ;
            dbg.location(100,76);
            if ( state.backtracking==0 ) {System.out.print((twominus!=null?twominus.getText():null));}
            dbg.location(101,42);
            pushFollow(FOLLOW_years_value_in_date_literal419);
            years_value();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, date_literal_StartIndex); }

        }
        dbg.location(101, 53);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "date_literal");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "date_literal"



    // $ANTLR start "year_month_literal"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:108:1: year_month_literal : ( years_value | years_value Minus_Sign months_value );
    public final void year_month_literal() throws RecognitionException {
        int year_month_literal_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "year_month_literal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:108:29: ( years_value | years_value Minus_Sign months_value )
            int alt5=2;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==Unsigned_Integer) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==EOF) ) {
                    alt5=1;
                }
                else if ( (LA5_1==Minus_Sign) ) {
                    alt5=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:108:32: years_value
                    {
                    dbg.location(108,32);
                    pushFollow(FOLLOW_years_value_in_year_month_literal482);
                    years_value();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:108:47: years_value Minus_Sign months_value
                    {
                    dbg.location(108,47);
                    pushFollow(FOLLOW_years_value_in_year_month_literal487);
                    years_value();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(108,60);
                    match(input,Minus_Sign,FOLLOW_Minus_Sign_in_year_month_literal490); if (state.failed) return ;
                    dbg.location(108,71);
                    pushFollow(FOLLOW_months_value_in_year_month_literal492);
                    months_value();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, year_month_literal_StartIndex); }

        }
        dbg.location(108, 83);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "year_month_literal");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "year_month_literal"



    // $ANTLR start "days_value"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:112:1: days_value : Unsigned_Integer ;
    public final void days_value() throws RecognitionException {
        int days_value_StartIndex = input.index();

        Token Unsigned_Integer2=null;

        try { dbg.enterRule(getGrammarFileName(), "days_value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:112:29: ( Unsigned_Integer )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:112:32: Unsigned_Integer
            {
            dbg.location(112,32);
            Unsigned_Integer2=(Token)match(input,Unsigned_Integer,FOLLOW_Unsigned_Integer_in_days_value521); if (state.failed) return ;
            dbg.location(112,49);
            if ( state.backtracking==0 ) {System.out.print((Unsigned_Integer2!=null?Unsigned_Integer2.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, days_value_StartIndex); }

        }
        dbg.location(112, 91);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "days_value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "days_value"



    // $ANTLR start "months_value"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:118:1: months_value : Regular_Identifier ;
    public final void months_value() throws RecognitionException {
        int months_value_StartIndex = input.index();

        Token Regular_Identifier3=null;

        try { dbg.enterRule(getGrammarFileName(), "months_value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:118:29: ( Regular_Identifier )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:118:32: Regular_Identifier
            {
            dbg.location(118,32);
            Regular_Identifier3=(Token)match(input,Regular_Identifier,FOLLOW_Regular_Identifier_in_months_value551); if (state.failed) return ;
            dbg.location(118,51);
            if ( state.backtracking==0 ) {System.out.print( (Regular_Identifier3!=null?Regular_Identifier3.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, months_value_StartIndex); }

        }
        dbg.location(118, 96);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "months_value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "months_value"



    // $ANTLR start "years_value"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:120:1: years_value : Unsigned_Integer ;
    public final void years_value() throws RecognitionException {
        int years_value_StartIndex = input.index();

        Token Unsigned_Integer4=null;

        try { dbg.enterRule(getGrammarFileName(), "years_value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:120:29: ( Unsigned_Integer )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:120:32: Unsigned_Integer
            {
            dbg.location(120,32);
            Unsigned_Integer4=(Token)match(input,Unsigned_Integer,FOLLOW_Unsigned_Integer_in_years_value578); if (state.failed) return ;
            dbg.location(120,49);
            if ( state.backtracking==0 ) {System.out.print((Unsigned_Integer4!=null?Unsigned_Integer4.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 11, years_value_StartIndex); }

        }
        dbg.location(120, 91);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "years_value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "years_value"



    // $ANTLR start "col_literal"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:123:1: col_literal : col_value Minus_Sign col_number ;
    public final void col_literal() throws RecognitionException {
        int col_literal_StartIndex = input.index();

        Token Minus_Sign5=null;

        try { dbg.enterRule(getGrammarFileName(), "col_literal");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:123:14: ( col_value Minus_Sign col_number )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:123:16: col_value Minus_Sign col_number
            {
            dbg.location(123,16);
            pushFollow(FOLLOW_col_value_in_col_literal590);
            col_value();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(123,26);
            Minus_Sign5=(Token)match(input,Minus_Sign,FOLLOW_Minus_Sign_in_col_literal592); if (state.failed) return ;
            dbg.location(123,37);
            if ( state.backtracking==0 ) {System.out.print((Minus_Sign5!=null?Minus_Sign5.getText():null));}
            dbg.location(123,75);
            pushFollow(FOLLOW_col_number_in_col_literal596);
            col_number();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 12, col_literal_StartIndex); }

        }
        dbg.location(123, 84);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "col_literal");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "col_literal"



    // $ANTLR start "col_value"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:125:1: col_value : Regular_Identifier ;
    public final void col_value() throws RecognitionException {
        int col_value_StartIndex = input.index();

        Token Regular_Identifier6=null;

        try { dbg.enterRule(getGrammarFileName(), "col_value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(125, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:125:12: ( Regular_Identifier )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:125:15: Regular_Identifier
            {
            dbg.location(125,15);
            Regular_Identifier6=(Token)match(input,Regular_Identifier,FOLLOW_Regular_Identifier_in_col_value606); if (state.failed) return ;
            dbg.location(125,34);
            if ( state.backtracking==0 ) {System.out.print( (Regular_Identifier6!=null?Regular_Identifier6.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 13, col_value_StartIndex); }

        }
        dbg.location(125, 79);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "col_value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "col_value"



    // $ANTLR start "col_number"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:127:1: col_number : Unsigned_Integer2 ;
    public final void col_number() throws RecognitionException {
        int col_number_StartIndex = input.index();

        Token Unsigned_Integer27=null;

        try { dbg.enterRule(getGrammarFileName(), "col_number");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(127, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:127:13: ( Unsigned_Integer2 )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:127:16: Unsigned_Integer2
            {
            dbg.location(127,16);
            Unsigned_Integer27=(Token)match(input,Unsigned_Integer2,FOLLOW_Unsigned_Integer2_in_col_number618); if (state.failed) return ;
            dbg.location(127,34);
            if ( state.backtracking==0 ) {System.out.print((Unsigned_Integer27!=null?Unsigned_Integer27.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 14, col_number_StartIndex); }

        }
        dbg.location(127, 77);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "col_number");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "col_number"



    // $ANTLR start "char_length_units"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:136:1: char_length_units : ( 'CHARACTERS' | 'CODE_UNITS' | 'OCTETS' );
    public final void char_length_units() throws RecognitionException {
        int char_length_units_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "char_length_units");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(136, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:137:2: ( 'CHARACTERS' | 'CODE_UNITS' | 'OCTETS' )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            dbg.location(137,2);
            if ( input.LA(1)==56||input.LA(1)==58||input.LA(1)==101 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 15, char_length_units_StartIndex); }

        }
        dbg.location(137, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "char_length_units");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "char_length_units"


    public static class direct_select_statement_multiple_rows_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "direct_select_statement_multiple_rows"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:141:1: direct_select_statement_multiple_rows : cursor_specification ;
    public final psqlgrammarParser.direct_select_statement_multiple_rows_return direct_select_statement_multiple_rows() throws RecognitionException {
        psqlgrammarParser.direct_select_statement_multiple_rows_return retval = new psqlgrammarParser.direct_select_statement_multiple_rows_return();
        retval.start = input.LT(1);

        int direct_select_statement_multiple_rows_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "direct_select_statement_multiple_rows");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(141, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:142:2: ( cursor_specification )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:142:4: cursor_specification
            {
            dbg.location(142,4);
            pushFollow(FOLLOW_cursor_specification_in_direct_select_statement_multiple_rows653);
            cursor_specification();

            state._fsp--;
            if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 16, direct_select_statement_multiple_rows_StartIndex); }

        }
        dbg.location(142, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "direct_select_statement_multiple_rows");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "direct_select_statement_multiple_rows"



    // $ANTLR start "cursor_specification"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:148:1: cursor_specification : query_expression ( order_by_clause )? ;
    public final void cursor_specification() throws RecognitionException {
        int cursor_specification_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "cursor_specification");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:149:2: ( query_expression ( order_by_clause )? )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:149:4: query_expression ( order_by_clause )?
            {
            dbg.location(149,4);
            pushFollow(FOLLOW_query_expression_in_cursor_specification666);
            query_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(149,21);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:149:21: ( order_by_clause )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==105) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:149:22: order_by_clause
                    {
                    dbg.location(149,22);
                    pushFollow(FOLLOW_order_by_clause_in_cursor_specification669);
                    order_by_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 17, cursor_specification_StartIndex); }

        }
        dbg.location(149, 38);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cursor_specification");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cursor_specification"



    // $ANTLR start "order_by_clause"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:151:1: order_by_clause : 'ORDER' 'BY' sort_specification_list ;
    public final void order_by_clause() throws RecognitionException {
        int order_by_clause_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "order_by_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(151, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:151:19: ( 'ORDER' 'BY' sort_specification_list )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:151:22: 'ORDER' 'BY' sort_specification_list
            {
            dbg.location(151,22);
            match(input,105,FOLLOW_105_in_order_by_clause684); if (state.failed) return ;
            dbg.location(151,30);
            match(input,55,FOLLOW_55_in_order_by_clause686); if (state.failed) return ;
            dbg.location(151,35);
            pushFollow(FOLLOW_sort_specification_list_in_order_by_clause688);
            sort_specification_list();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 18, order_by_clause_StartIndex); }

        }
        dbg.location(151, 58);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "order_by_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "order_by_clause"



    // $ANTLR start "query_expression"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:153:1: query_expression : query_expression_body ;
    public final void query_expression() throws RecognitionException {
        int query_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "query_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:154:2: ( query_expression_body )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:154:4: query_expression_body
            {
            dbg.location(154,4);
            pushFollow(FOLLOW_query_expression_body_in_query_expression698);
            query_expression_body();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 19, query_expression_StartIndex); }

        }
        dbg.location(154, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "query_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "query_expression"



    // $ANTLR start "query_expression_body"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:163:1: query_expression_body options {k=1; } : ( non_join_query_expression | joined_table );
    public final void query_expression_body() throws RecognitionException {
        int query_expression_body_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "query_expression_body");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(163, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:165:2: ( non_join_query_expression | joined_table )
            int alt7=2;
            try { dbg.enterDecision(7, decisionCanBacktrack[7]);

            int LA7_0 = input.LA(1);

            if ( (LA7_0==Left_Paren||LA7_0==Regular_Identifier||LA7_0==98) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred12_psqlgrammar()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA7_0==115) ) {
                alt7=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(7);}

            switch (alt7) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:165:4: non_join_query_expression
                    {
                    dbg.location(165,4);
                    pushFollow(FOLLOW_non_join_query_expression_in_query_expression_body718);
                    non_join_query_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:165:33: joined_table
                    {
                    dbg.location(165,33);
                    pushFollow(FOLLOW_joined_table_in_query_expression_body723);
                    joined_table();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 20, query_expression_body_StartIndex); }

        }
        dbg.location(165, 45);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "query_expression_body");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "query_expression_body"



    // $ANTLR start "non_join_query_expression"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:169:1: non_join_query_expression options {k=1; } : ( non_join_query_term | joined_table ( 'UNION' | 'EXCEPT' ) ( 'ALL' | 'DISTINCT' )? query_term ) ( ( 'UNION' | 'EXCEPT' ) ( 'ALL' | 'DISTINCT' )? query_term )* ;
    public final void non_join_query_expression() throws RecognitionException {
        int non_join_query_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "non_join_query_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(169, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:171:2: ( ( non_join_query_term | joined_table ( 'UNION' | 'EXCEPT' ) ( 'ALL' | 'DISTINCT' )? query_term ) ( ( 'UNION' | 'EXCEPT' ) ( 'ALL' | 'DISTINCT' )? query_term )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:171:4: ( non_join_query_term | joined_table ( 'UNION' | 'EXCEPT' ) ( 'ALL' | 'DISTINCT' )? query_term ) ( ( 'UNION' | 'EXCEPT' ) ( 'ALL' | 'DISTINCT' )? query_term )*
            {
            dbg.location(171,4);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:171:4: ( non_join_query_term | joined_table ( 'UNION' | 'EXCEPT' ) ( 'ALL' | 'DISTINCT' )? query_term )
            int alt10=2;
            try { dbg.enterSubRule(10);
            try { dbg.enterDecision(10, decisionCanBacktrack[10]);

            switch ( input.LA(1) ) {
            case 115:
                {
                alt10=1;
                }
                break;
            case 98:
                {
                int LA10_2 = input.LA(2);

                if ( (synpred13_psqlgrammar()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case Regular_Identifier:
                {
                int LA10_3 = input.LA(2);

                if ( (synpred13_psqlgrammar()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case Left_Paren:
                {
                int LA10_4 = input.LA(2);

                if ( (synpred13_psqlgrammar()) ) {
                    alt10=1;
                }
                else if ( (true) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(10);}

            switch (alt10) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:171:6: non_join_query_term
                    {
                    dbg.location(171,6);
                    pushFollow(FOLLOW_non_join_query_term_in_non_join_query_expression745);
                    non_join_query_term();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:172:5: joined_table ( 'UNION' | 'EXCEPT' ) ( 'ALL' | 'DISTINCT' )? query_term
                    {
                    dbg.location(172,5);
                    pushFollow(FOLLOW_joined_table_in_non_join_query_expression751);
                    joined_table();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(172,19);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:172:19: ( 'UNION' | 'EXCEPT' )
                    int alt8=2;
                    try { dbg.enterSubRule(8);
                    try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==129) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==68) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                    } finally {dbg.exitDecision(8);}

                    switch (alt8) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:172:21: 'UNION'
                            {
                            dbg.location(172,21);
                            match(input,129,FOLLOW_129_in_non_join_query_expression756); if (state.failed) return ;
                            dbg.location(172,29);
                            if ( state.backtracking==0 ) {System.out.print(" UNION ");}

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:172:62: 'EXCEPT'
                            {
                            dbg.location(172,62);
                            match(input,68,FOLLOW_68_in_non_join_query_expression762); if (state.failed) return ;
                            dbg.location(172,71);
                            if ( state.backtracking==0 ) {System.out.print(" EXCEPT ");}

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(8);}

                    dbg.location(173,5);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:173:5: ( 'ALL' | 'DISTINCT' )?
                    int alt9=3;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==46) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==65) ) {
                        alt9=2;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:173:7: 'ALL'
                            {
                            dbg.location(173,7);
                            match(input,46,FOLLOW_46_in_non_join_query_expression774); if (state.failed) return ;
                            dbg.location(173,13);
                            if ( state.backtracking==0 ) {System.out.print(" ALL ");}

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:173:44: 'DISTINCT'
                            {
                            dbg.location(173,44);
                            match(input,65,FOLLOW_65_in_non_join_query_expression780); if (state.failed) return ;
                            dbg.location(173,55);
                            if ( state.backtracking==0 ) {System.out.print(" DISTINCT ");}

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(9);}

                    dbg.location(173,92);
                    pushFollow(FOLLOW_query_term_in_non_join_query_expression787);
                    query_term();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(10);}

            dbg.location(175,3);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:175:3: ( ( 'UNION' | 'EXCEPT' ) ( 'ALL' | 'DISTINCT' )? query_term )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==68||LA13_0==129) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:175:5: ( 'UNION' | 'EXCEPT' ) ( 'ALL' | 'DISTINCT' )? query_term
            	    {
            	    dbg.location(175,5);
            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:175:5: ( 'UNION' | 'EXCEPT' )
            	    int alt11=2;
            	    try { dbg.enterSubRule(11);
            	    try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==129) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==68) ) {
            	        alt11=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;

            	    }
            	    } finally {dbg.exitDecision(11);}

            	    switch (alt11) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:175:7: 'UNION'
            	            {
            	            dbg.location(175,7);
            	            match(input,129,FOLLOW_129_in_non_join_query_expression799); if (state.failed) return ;
            	            dbg.location(175,15);
            	            if ( state.backtracking==0 ) {System.out.print(" UNION ");}

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:175:48: 'EXCEPT'
            	            {
            	            dbg.location(175,48);
            	            match(input,68,FOLLOW_68_in_non_join_query_expression805); if (state.failed) return ;
            	            dbg.location(175,57);
            	            if ( state.backtracking==0 ) {System.out.print(" EXCEPT ");}

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(11);}

            	    dbg.location(175,90);
            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:175:90: ( 'ALL' | 'DISTINCT' )?
            	    int alt12=3;
            	    try { dbg.enterSubRule(12);
            	    try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==46) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==65) ) {
            	        alt12=2;
            	    }
            	    } finally {dbg.exitDecision(12);}

            	    switch (alt12) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:175:92: 'ALL'
            	            {
            	            dbg.location(175,92);
            	            match(input,46,FOLLOW_46_in_non_join_query_expression812); if (state.failed) return ;
            	            dbg.location(175,98);
            	            if ( state.backtracking==0 ) {System.out.print(" ALL ");}

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:176:8: 'DISTINCT'
            	            {
            	            dbg.location(176,8);
            	            match(input,65,FOLLOW_65_in_non_join_query_expression823); if (state.failed) return ;
            	            dbg.location(176,19);
            	            if ( state.backtracking==0 ) {System.out.print(" DISTINCT ");}

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(12);}

            	    dbg.location(176,57);
            	    pushFollow(FOLLOW_query_term_in_non_join_query_expression831);
            	    query_term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 21, non_join_query_expression_StartIndex); }

        }
        dbg.location(177, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "non_join_query_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "non_join_query_expression"



    // $ANTLR start "query_term"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:183:1: query_term options {k=1; } : ( non_join_query_term | joined_table );
    public final void query_term() throws RecognitionException {
        int query_term_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "query_term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(183, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:185:2: ( non_join_query_term | joined_table )
            int alt14=2;
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==Left_Paren||LA14_0==Regular_Identifier||LA14_0==98) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred21_psqlgrammar()) ) {
                    alt14=1;
                }
                else if ( (true) ) {
                    alt14=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA14_0==115) ) {
                alt14=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:185:5: non_join_query_term
                    {
                    dbg.location(185,5);
                    pushFollow(FOLLOW_non_join_query_term_in_query_term856);
                    non_join_query_term();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:185:28: joined_table
                    {
                    dbg.location(185,28);
                    pushFollow(FOLLOW_joined_table_in_query_term861);
                    joined_table();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 22, query_term_StartIndex); }

        }
        dbg.location(185, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "query_term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "query_term"



    // $ANTLR start "non_join_query_term"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:189:1: non_join_query_term options {k=1; } : ( non_join_query_primary | joined_table 'INTERSECT' ( 'ALL' | 'DISTINCT' )? query_primary ) ( 'INTERSECT' ( 'ALL' | 'DISTINCT' )? query_primary )* ;
    public final void non_join_query_term() throws RecognitionException {
        int non_join_query_term_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "non_join_query_term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(189, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:191:2: ( ( non_join_query_primary | joined_table 'INTERSECT' ( 'ALL' | 'DISTINCT' )? query_primary ) ( 'INTERSECT' ( 'ALL' | 'DISTINCT' )? query_primary )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:191:4: ( non_join_query_primary | joined_table 'INTERSECT' ( 'ALL' | 'DISTINCT' )? query_primary ) ( 'INTERSECT' ( 'ALL' | 'DISTINCT' )? query_primary )*
            {
            dbg.location(191,4);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:191:4: ( non_join_query_primary | joined_table 'INTERSECT' ( 'ALL' | 'DISTINCT' )? query_primary )
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==115) ) {
                alt16=1;
            }
            else if ( (LA16_0==Left_Paren||LA16_0==Regular_Identifier||LA16_0==98) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:191:6: non_join_query_primary
                    {
                    dbg.location(191,6);
                    pushFollow(FOLLOW_non_join_query_primary_in_non_join_query_term883);
                    non_join_query_primary();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:192:5: joined_table 'INTERSECT' ( 'ALL' | 'DISTINCT' )? query_primary
                    {
                    dbg.location(192,5);
                    pushFollow(FOLLOW_joined_table_in_non_join_query_term889);
                    joined_table();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(192,19);
                    match(input,83,FOLLOW_83_in_non_join_query_term892); if (state.failed) return ;
                    dbg.location(192,31);
                    if ( state.backtracking==0 ) {System.out.print(" INTERSECT ");}
                    dbg.location(192,66);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:192:66: ( 'ALL' | 'DISTINCT' )?
                    int alt15=3;
                    try { dbg.enterSubRule(15);
                    try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==46) ) {
                        alt15=1;
                    }
                    else if ( (LA15_0==65) ) {
                        alt15=2;
                    }
                    } finally {dbg.exitDecision(15);}

                    switch (alt15) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:192:68: 'ALL'
                            {
                            dbg.location(192,68);
                            match(input,46,FOLLOW_46_in_non_join_query_term898); if (state.failed) return ;
                            dbg.location(192,74);
                            if ( state.backtracking==0 ) {System.out.print(" ALL ");}

                            }
                            break;
                        case 2 :
                            dbg.enterAlt(2);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:192:105: 'DISTINCT'
                            {
                            dbg.location(192,105);
                            match(input,65,FOLLOW_65_in_non_join_query_term904); if (state.failed) return ;
                            dbg.location(192,116);
                            if ( state.backtracking==0 ) {System.out.print(" DISTINCT ");}

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(15);}

                    dbg.location(192,154);
                    pushFollow(FOLLOW_query_primary_in_non_join_query_term912);
                    query_primary();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}

            dbg.location(194,3);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:194:3: ( 'INTERSECT' ( 'ALL' | 'DISTINCT' )? query_primary )*
            try { dbg.enterSubRule(18);

            loop18:
            do {
                int alt18=2;
                try { dbg.enterDecision(18, decisionCanBacktrack[18]);

                int LA18_0 = input.LA(1);

                if ( (LA18_0==83) ) {
                    alt18=1;
                }


                } finally {dbg.exitDecision(18);}

                switch (alt18) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:194:5: 'INTERSECT' ( 'ALL' | 'DISTINCT' )? query_primary
            	    {
            	    dbg.location(194,5);
            	    match(input,83,FOLLOW_83_in_non_join_query_term922); if (state.failed) return ;
            	    dbg.location(194,17);
            	    if ( state.backtracking==0 ) {System.out.print(" INTERSECT ");}
            	    dbg.location(194,52);
            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:194:52: ( 'ALL' | 'DISTINCT' )?
            	    int alt17=3;
            	    try { dbg.enterSubRule(17);
            	    try { dbg.enterDecision(17, decisionCanBacktrack[17]);

            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==46) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==65) ) {
            	        alt17=2;
            	    }
            	    } finally {dbg.exitDecision(17);}

            	    switch (alt17) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:194:54: 'ALL'
            	            {
            	            dbg.location(194,54);
            	            match(input,46,FOLLOW_46_in_non_join_query_term928); if (state.failed) return ;
            	            dbg.location(194,60);
            	            if ( state.backtracking==0 ) {System.out.print(" ALL ");}

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:194:90: 'DISTINCT'
            	            {
            	            dbg.location(194,90);
            	            match(input,65,FOLLOW_65_in_non_join_query_term933); if (state.failed) return ;
            	            dbg.location(194,101);
            	            if ( state.backtracking==0 ) {System.out.print(" DISTINCT ");}

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(17);}

            	    dbg.location(194,138);
            	    pushFollow(FOLLOW_query_primary_in_non_join_query_term940);
            	    query_primary();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);
            } finally {dbg.exitSubRule(18);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 23, non_join_query_term_StartIndex); }

        }
        dbg.location(195, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "non_join_query_term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "non_join_query_term"



    // $ANTLR start "query_primary"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:197:1: query_primary options {k=1; } : ( non_join_query_primary | joined_table );
    public final void query_primary() throws RecognitionException {
        int query_primary_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "query_primary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(197, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:199:2: ( non_join_query_primary | joined_table )
            int alt19=2;
            try { dbg.enterDecision(19, decisionCanBacktrack[19]);

            int LA19_0 = input.LA(1);

            if ( (LA19_0==115) ) {
                alt19=1;
            }
            else if ( (LA19_0==Left_Paren||LA19_0==Regular_Identifier||LA19_0==98) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(19);}

            switch (alt19) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:199:4: non_join_query_primary
                    {
                    dbg.location(199,4);
                    pushFollow(FOLLOW_non_join_query_primary_in_query_primary962);
                    non_join_query_primary();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:200:4: joined_table
                    {
                    dbg.location(200,4);
                    pushFollow(FOLLOW_joined_table_in_query_primary967);
                    joined_table();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 24, query_primary_StartIndex); }

        }
        dbg.location(200, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "query_primary");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "query_primary"



    // $ANTLR start "non_join_query_primary"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:202:1: non_join_query_primary options {k=1; } : simple_table ;
    public final void non_join_query_primary() throws RecognitionException {
        int non_join_query_primary_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "non_join_query_primary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(202, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:204:2: ( simple_table )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:204:4: simple_table
            {
            dbg.location(204,4);
            pushFollow(FOLLOW_simple_table_in_non_join_query_primary985);
            simple_table();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 25, non_join_query_primary_StartIndex); }

        }
        dbg.location(205, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "non_join_query_primary");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "non_join_query_primary"



    // $ANTLR start "simple_table"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:206:1: simple_table : query_specification ;
    public final void simple_table() throws RecognitionException {
        int simple_table_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "simple_table");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(206, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:206:14: ( query_specification )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:206:16: query_specification
            {
            dbg.location(206,16);
            pushFollow(FOLLOW_query_specification_in_simple_table997);
            query_specification();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 26, simple_table_StartIndex); }

        }
        dbg.location(206, 35);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "simple_table");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "simple_table"



    // $ANTLR start "query_specification"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:209:1: query_specification : 'SELECT' ( set_quantifier )? select_list table_expression ;
    public final void query_specification() throws RecognitionException {
        int query_specification_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "query_specification");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(209, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:209:21: ( 'SELECT' ( set_quantifier )? select_list table_expression )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:209:24: 'SELECT' ( set_quantifier )? select_list table_expression
            {
            dbg.location(209,24);
            match(input,115,FOLLOW_115_in_query_specification1008); if (state.failed) return ;
            dbg.location(209,33);
            if ( state.backtracking==0 ) {System.out.print("SELECT ");}
            dbg.location(209,64);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:209:64: ( set_quantifier )?
            int alt20=2;
            try { dbg.enterSubRule(20);
            try { dbg.enterDecision(20, decisionCanBacktrack[20]);

            int LA20_0 = input.LA(1);

            if ( (LA20_0==46||LA20_0==65) ) {
                alt20=1;
            }
            } finally {dbg.exitDecision(20);}

            switch (alt20) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:209:66: set_quantifier
                    {
                    dbg.location(209,66);
                    pushFollow(FOLLOW_set_quantifier_in_query_specification1014);
                    set_quantifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(20);}

            dbg.location(209,85);
            pushFollow(FOLLOW_select_list_in_query_specification1020);
            select_list();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(209,97);
            pushFollow(FOLLOW_table_expression_in_query_specification1022);
            table_expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 27, query_specification_StartIndex); }

        }
        dbg.location(209, 113);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "query_specification");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "query_specification"



    // $ANTLR start "set_quantifier"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:210:1: set_quantifier : ( 'DISTINCT' | 'ALL' );
    public final void set_quantifier() throws RecognitionException {
        int set_quantifier_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "set_quantifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(210, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:210:18: ( 'DISTINCT' | 'ALL' )
            int alt21=2;
            try { dbg.enterDecision(21, decisionCanBacktrack[21]);

            int LA21_0 = input.LA(1);

            if ( (LA21_0==65) ) {
                alt21=1;
            }
            else if ( (LA21_0==46) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(21);}

            switch (alt21) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:210:21: 'DISTINCT'
                    {
                    dbg.location(210,21);
                    match(input,65,FOLLOW_65_in_set_quantifier1033); if (state.failed) return ;
                    dbg.location(210,32);
                    if ( state.backtracking==0 ) {System.out.print("DISTINCT ");}

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:210:67: 'ALL'
                    {
                    dbg.location(210,67);
                    match(input,46,FOLLOW_46_in_set_quantifier1039); if (state.failed) return ;
                    dbg.location(210,73);
                    if ( state.backtracking==0 ) {System.out.print("ALL ");}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 28, set_quantifier_StartIndex); }

        }
        dbg.location(210, 99);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "set_quantifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "set_quantifier"



    // $ANTLR start "select_list"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:211:1: select_list : ( Asterisk | select_sublist ( Comma select_sublist )* );
    public final void select_list() throws RecognitionException {
        int select_list_StartIndex = input.index();

        Token Asterisk8=null;
        Token Comma9=null;

        try { dbg.enterRule(getGrammarFileName(), "select_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(211, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:211:13: ( Asterisk | select_sublist ( Comma select_sublist )* )
            int alt23=2;
            try { dbg.enterDecision(23, decisionCanBacktrack[23]);

            int LA23_0 = input.LA(1);

            if ( (LA23_0==Asterisk) ) {
                alt23=1;
            }
            else if ( (LA23_0==Left_Paren||LA23_0==Minus_Sign||LA23_0==NOT||LA23_0==Plus_Sign||LA23_0==Regular_Identifier||LA23_0==Single_Quote||LA23_0==Unsigned_Integer||LA23_0==44||LA23_0==48||LA23_0==52||(LA23_0 >= 60 && LA23_0 <= 61)||LA23_0==67||LA23_0==76||LA23_0==78||LA23_0==84||LA23_0==93||(LA23_0 >= 96 && LA23_0 <= 97)||(LA23_0 >= 118 && LA23_0 <= 122)||LA23_0==127||LA23_0==131||(LA23_0 >= 133 && LA23_0 <= 134)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(23);}

            switch (alt23) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:211:15: Asterisk
                    {
                    dbg.location(211,15);
                    Asterisk8=(Token)match(input,Asterisk,FOLLOW_Asterisk_in_select_list1048); if (state.failed) return ;
                    dbg.location(211,24);
                    if ( state.backtracking==0 ) {System.out.print((Asterisk8!=null?Asterisk8.getText():null));}

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:211:62: select_sublist ( Comma select_sublist )*
                    {
                    dbg.location(211,62);
                    pushFollow(FOLLOW_select_sublist_in_select_list1054);
                    select_sublist();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(211,78);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:211:78: ( Comma select_sublist )*
                    try { dbg.enterSubRule(22);

                    loop22:
                    do {
                        int alt22=2;
                        try { dbg.enterDecision(22, decisionCanBacktrack[22]);

                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Comma) ) {
                            alt22=1;
                        }


                        } finally {dbg.exitDecision(22);}

                        switch (alt22) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:211:80: Comma select_sublist
                    	    {
                    	    dbg.location(211,80);
                    	    Comma9=(Token)match(input,Comma,FOLLOW_Comma_in_select_list1059); if (state.failed) return ;
                    	    dbg.location(211,86);
                    	    if ( state.backtracking==0 ) {System.out.print((Comma9!=null?Comma9.getText():null) + " ");}
                    	    dbg.location(211,125);
                    	    pushFollow(FOLLOW_select_sublist_in_select_list1063);
                    	    select_sublist();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(22);}


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 29, select_list_StartIndex); }

        }
        dbg.location(211, 142);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "select_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "select_list"



    // $ANTLR start "select_sublist"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:212:1: select_sublist : ( derived_column | qualified_asterisk );
    public final void select_sublist() throws RecognitionException {
        int select_sublist_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "select_sublist");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(212, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:212:16: ( derived_column | qualified_asterisk )
            int alt24=2;
            try { dbg.enterDecision(24, decisionCanBacktrack[24]);

            int LA24_0 = input.LA(1);

            if ( (LA24_0==Left_Paren||LA24_0==Minus_Sign||LA24_0==NOT||LA24_0==Plus_Sign||LA24_0==Single_Quote||LA24_0==Unsigned_Integer||LA24_0==44||LA24_0==48||LA24_0==52||(LA24_0 >= 60 && LA24_0 <= 61)||LA24_0==67||LA24_0==76||LA24_0==78||LA24_0==84||LA24_0==93||(LA24_0 >= 96 && LA24_0 <= 97)||(LA24_0 >= 118 && LA24_0 <= 122)||LA24_0==127||LA24_0==131||(LA24_0 >= 133 && LA24_0 <= 134)) ) {
                alt24=1;
            }
            else if ( (LA24_0==Regular_Identifier) ) {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==EOF||(LA24_2 >= Asterisk && LA24_2 <= BETWEEN)||(LA24_2 >= Comma && LA24_2 <= Concatenation_Operator)||LA24_2==Equals_Operator||(LA24_2 >= Greater_Or_Equals_Operator && LA24_2 <= IS)||(LA24_2 >= Less_Or_Equals_Operator && LA24_2 <= Minus_Sign)||(LA24_2 >= NOT && LA24_2 <= Not_Equals_Operator)||LA24_2==Plus_Sign||(LA24_2 >= Regular_Identifier && LA24_2 <= Right_Arrow)||(LA24_2 >= Single_Quote && LA24_2 <= Slash)||LA24_2==47||LA24_2==49||LA24_2==74||LA24_2==80||LA24_2==85||LA24_2==91||LA24_2==104||LA24_2==108||LA24_2==110) ) {
                    alt24=1;
                }
                else if ( (LA24_2==Period) ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3==Asterisk) ) {
                        alt24=2;
                    }
                    else if ( (LA24_3==Regular_Identifier) ) {
                        int LA24_5 = input.LA(4);

                        if ( (LA24_5==Period) ) {
                            int LA24_6 = input.LA(5);

                            if ( (LA24_6==Asterisk) ) {
                                alt24=2;
                            }
                            else if ( (LA24_6==Regular_Identifier) ) {
                                alt24=1;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 24, 6, input);

                                dbg.recognitionException(nvae);
                                throw nvae;

                            }
                        }
                        else if ( (LA24_5==EOF||(LA24_5 >= Asterisk && LA24_5 <= BETWEEN)||(LA24_5 >= Comma && LA24_5 <= Concatenation_Operator)||LA24_5==Equals_Operator||(LA24_5 >= Greater_Or_Equals_Operator && LA24_5 <= IS)||(LA24_5 >= Less_Or_Equals_Operator && LA24_5 <= Minus_Sign)||(LA24_5 >= NOT && LA24_5 <= Not_Equals_Operator)||LA24_5==Plus_Sign||(LA24_5 >= Regular_Identifier && LA24_5 <= Right_Arrow)||(LA24_5 >= Single_Quote && LA24_5 <= Slash)||LA24_5==47||LA24_5==49||LA24_5==74||LA24_5==80||LA24_5==85||LA24_5==91||LA24_5==104||LA24_5==108||LA24_5==110) ) {
                            alt24=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 24, 5, input);

                            dbg.recognitionException(nvae);
                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 3, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(24);}

            switch (alt24) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:212:19: derived_column
                    {
                    dbg.location(212,19);
                    pushFollow(FOLLOW_derived_column_in_select_sublist1075);
                    derived_column();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:212:36: qualified_asterisk
                    {
                    dbg.location(212,36);
                    pushFollow(FOLLOW_qualified_asterisk_in_select_sublist1079);
                    qualified_asterisk();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 30, select_sublist_StartIndex); }

        }
        dbg.location(212, 54);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "select_sublist");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "select_sublist"



    // $ANTLR start "derived_column"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:214:1: derived_column : value_expression ( as_clause )? ;
    public final void derived_column() throws RecognitionException {
        int derived_column_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "derived_column");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(214, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:214:15: ( value_expression ( as_clause )? )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:214:17: value_expression ( as_clause )?
            {
            dbg.location(214,17);
            pushFollow(FOLLOW_value_expression_in_derived_column1087);
            value_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(214,34);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:214:34: ( as_clause )?
            int alt25=2;
            try { dbg.enterSubRule(25);
            try { dbg.enterDecision(25, decisionCanBacktrack[25]);

            int LA25_0 = input.LA(1);

            if ( (LA25_0==Regular_Identifier||LA25_0==49) ) {
                alt25=1;
            }
            } finally {dbg.exitDecision(25);}

            switch (alt25) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:214:36: as_clause
                    {
                    dbg.location(214,36);
                    pushFollow(FOLLOW_as_clause_in_derived_column1091);
                    as_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(25);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 31, derived_column_StartIndex); }

        }
        dbg.location(214, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "derived_column");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "derived_column"



    // $ANTLR start "value_expression"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:215:1: value_expression options {k=1; } : ( common_value_expression | boolean_value_expression );
    public final void value_expression() throws RecognitionException {
        int value_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "value_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(215, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:217:2: ( common_value_expression | boolean_value_expression )
            int alt26=2;
            try { dbg.enterDecision(26, decisionCanBacktrack[26]);

            int LA26_0 = input.LA(1);

            if ( (LA26_0==Minus_Sign||LA26_0==Plus_Sign||LA26_0==Regular_Identifier||LA26_0==Unsigned_Integer||LA26_0==44||LA26_0==93||LA26_0==121||LA26_0==127||LA26_0==131) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred35_psqlgrammar()) ) {
                    alt26=1;
                }
                else if ( (true) ) {
                    alt26=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA26_0==Left_Paren||LA26_0==NOT||LA26_0==Single_Quote||LA26_0==48||LA26_0==52||(LA26_0 >= 60 && LA26_0 <= 61)||LA26_0==67||LA26_0==76||LA26_0==78||LA26_0==84||(LA26_0 >= 96 && LA26_0 <= 97)||(LA26_0 >= 118 && LA26_0 <= 120)||LA26_0==122||(LA26_0 >= 133 && LA26_0 <= 134)) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(26);}

            switch (alt26) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:217:4: common_value_expression
                    {
                    dbg.location(217,4);
                    pushFollow(FOLLOW_common_value_expression_in_value_expression1111);
                    common_value_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:218:4: boolean_value_expression
                    {
                    dbg.location(218,4);
                    pushFollow(FOLLOW_boolean_value_expression_in_value_expression1116);
                    boolean_value_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 32, value_expression_StartIndex); }

        }
        dbg.location(220, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "value_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "value_expression"



    // $ANTLR start "common_value_expression"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:223:1: common_value_expression : ( numeric_value_expression | string_value_expression );
    public final void common_value_expression() throws RecognitionException {
        int common_value_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "common_value_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(223, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:224:2: ( numeric_value_expression | string_value_expression )
            int alt27=2;
            try { dbg.enterDecision(27, decisionCanBacktrack[27]);

            switch ( input.LA(1) ) {
            case Minus_Sign:
            case Plus_Sign:
            case 44:
                {
                alt27=1;
                }
                break;
            case Unsigned_Integer:
                {
                int LA27_2 = input.LA(2);

                if ( (synpred36_psqlgrammar()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case Regular_Identifier:
                {
                int LA27_3 = input.LA(2);

                if ( (synpred36_psqlgrammar()) ) {
                    alt27=1;
                }
                else if ( (true) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 93:
            case 121:
            case 127:
            case 131:
                {
                alt27=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(27);}

            switch (alt27) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:224:4: numeric_value_expression
                    {
                    dbg.location(224,4);
                    pushFollow(FOLLOW_numeric_value_expression_in_common_value_expression1131);
                    numeric_value_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:225:5: string_value_expression
                    {
                    dbg.location(225,5);
                    pushFollow(FOLLOW_string_value_expression_in_common_value_expression1137);
                    string_value_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 33, common_value_expression_StartIndex); }

        }
        dbg.location(226, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "common_value_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "common_value_expression"



    // $ANTLR start "numeric_value_expression"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:233:1: numeric_value_expression options {k=1; } : term ( ( Plus_Sign | Minus_Sign ) term )* ;
    public final void numeric_value_expression() throws RecognitionException {
        int numeric_value_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "numeric_value_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(233, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:235:2: ( term ( ( Plus_Sign | Minus_Sign ) term )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:235:4: term ( ( Plus_Sign | Minus_Sign ) term )*
            {
            dbg.location(235,4);
            pushFollow(FOLLOW_term_in_numeric_value_expression1158);
            term();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(235,9);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:235:9: ( ( Plus_Sign | Minus_Sign ) term )*
            try { dbg.enterSubRule(28);

            loop28:
            do {
                int alt28=2;
                try { dbg.enterDecision(28, decisionCanBacktrack[28]);

                int LA28_0 = input.LA(1);

                if ( (LA28_0==Minus_Sign||LA28_0==Plus_Sign) ) {
                    alt28=1;
                }


                } finally {dbg.exitDecision(28);}

                switch (alt28) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:235:11: ( Plus_Sign | Minus_Sign ) term
            	    {
            	    dbg.location(235,11);
            	    if ( input.LA(1)==Minus_Sign||input.LA(1)==Plus_Sign ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(235,38);
            	    pushFollow(FOLLOW_term_in_numeric_value_expression1172);
            	    term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);
            } finally {dbg.exitSubRule(28);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 34, numeric_value_expression_StartIndex); }

        }
        dbg.location(236, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "numeric_value_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "numeric_value_expression"



    // $ANTLR start "term"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:238:1: term options {k=1; } : factor ( ( Asterisk | Slash ) factor )* ;
    public final void term() throws RecognitionException {
        int term_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(238, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:240:2: ( factor ( ( Asterisk | Slash ) factor )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:240:4: factor ( ( Asterisk | Slash ) factor )*
            {
            dbg.location(240,4);
            pushFollow(FOLLOW_factor_in_term1194);
            factor();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(240,11);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:240:11: ( ( Asterisk | Slash ) factor )*
            try { dbg.enterSubRule(29);

            loop29:
            do {
                int alt29=2;
                try { dbg.enterDecision(29, decisionCanBacktrack[29]);

                int LA29_0 = input.LA(1);

                if ( (LA29_0==Asterisk||LA29_0==Slash) ) {
                    alt29=1;
                }


                } finally {dbg.exitDecision(29);}

                switch (alt29) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:240:13: ( Asterisk | Slash ) factor
            	    {
            	    dbg.location(240,13);
            	    if ( input.LA(1)==Asterisk||input.LA(1)==Slash ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	        state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(240,34);
            	    pushFollow(FOLLOW_factor_in_term1208);
            	    factor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);
            } finally {dbg.exitSubRule(29);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 35, term_StartIndex); }

        }
        dbg.location(241, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "term"



    // $ANTLR start "factor"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:243:1: factor options {k=1; } : ( sign )? numeric_primary ;
    public final void factor() throws RecognitionException {
        int factor_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(243, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:245:2: ( ( sign )? numeric_primary )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:245:5: ( sign )? numeric_primary
            {
            dbg.location(245,5);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:245:5: ( sign )?
            int alt30=2;
            try { dbg.enterSubRule(30);
            try { dbg.enterDecision(30, decisionCanBacktrack[30]);

            int LA30_0 = input.LA(1);

            if ( (LA30_0==Minus_Sign||LA30_0==Plus_Sign) ) {
                alt30=1;
            }
            } finally {dbg.exitDecision(30);}

            switch (alt30) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:245:7: sign
                    {
                    dbg.location(245,7);
                    pushFollow(FOLLOW_sign_in_factor1233);
                    sign();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(30);}

            dbg.location(245,16);
            pushFollow(FOLLOW_numeric_primary_in_factor1239);
            numeric_primary();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 36, factor_StartIndex); }

        }
        dbg.location(245, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "factor"



    // $ANTLR start "numeric_primary"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:247:1: numeric_primary options {k=1; } : ( value_expression_primary | numeric_value_function );
    public final void numeric_primary() throws RecognitionException {
        int numeric_primary_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "numeric_primary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(247, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:249:2: ( value_expression_primary | numeric_value_function )
            int alt31=2;
            try { dbg.enterDecision(31, decisionCanBacktrack[31]);

            int LA31_0 = input.LA(1);

            if ( (LA31_0==Regular_Identifier||LA31_0==Unsigned_Integer) ) {
                alt31=1;
            }
            else if ( (LA31_0==44) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(31);}

            switch (alt31) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:249:4: value_expression_primary
                    {
                    dbg.location(249,4);
                    pushFollow(FOLLOW_value_expression_primary_in_numeric_primary1257);
                    value_expression_primary();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:250:4: numeric_value_function
                    {
                    dbg.location(250,4);
                    pushFollow(FOLLOW_numeric_value_function_in_numeric_primary1262);
                    numeric_value_function();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 37, numeric_primary_StartIndex); }

        }
        dbg.location(251, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "numeric_primary");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "numeric_primary"



    // $ANTLR start "numeric_value_function"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:260:1: numeric_value_function options {k=1; } : absolute_value_expression ;
    public final void numeric_value_function() throws RecognitionException {
        int numeric_value_function_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "numeric_value_function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(260, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:262:2: ( absolute_value_expression )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:262:4: absolute_value_expression
            {
            dbg.location(262,4);
            pushFollow(FOLLOW_absolute_value_expression_in_numeric_value_function1284);
            absolute_value_expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 38, numeric_value_function_StartIndex); }

        }
        dbg.location(262, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "numeric_value_function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "numeric_value_function"



    // $ANTLR start "absolute_value_expression"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:264:1: absolute_value_expression : 'ABS' Left_Paren numeric_value_expression Right_Paren ;
    public final void absolute_value_expression() throws RecognitionException {
        int absolute_value_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "absolute_value_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(264, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:264:29: ( 'ABS' Left_Paren numeric_value_expression Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:264:32: 'ABS' Left_Paren numeric_value_expression Right_Paren
            {
            dbg.location(264,32);
            match(input,44,FOLLOW_44_in_absolute_value_expression1296); if (state.failed) return ;
            dbg.location(264,38);
            match(input,Left_Paren,FOLLOW_Left_Paren_in_absolute_value_expression1298); if (state.failed) return ;
            dbg.location(264,49);
            pushFollow(FOLLOW_numeric_value_expression_in_absolute_value_expression1300);
            numeric_value_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(264,75);
            match(input,Right_Paren,FOLLOW_Right_Paren_in_absolute_value_expression1303); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 39, absolute_value_expression_StartIndex); }

        }
        dbg.location(264, 85);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "absolute_value_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "absolute_value_expression"



    // $ANTLR start "string_value_expression"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:274:1: string_value_expression : character_value_expression ;
    public final void string_value_expression() throws RecognitionException {
        int string_value_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "string_value_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(274, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:276:2: ( character_value_expression )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:276:4: character_value_expression
            {
            dbg.location(276,4);
            pushFollow(FOLLOW_character_value_expression_in_string_value_expression1319);
            character_value_expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 40, string_value_expression_StartIndex); }

        }
        dbg.location(276, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "string_value_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "string_value_expression"



    // $ANTLR start "character_value_expression"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:278:1: character_value_expression : character_factor ( Concatenation_Operator character_factor )* ;
    public final void character_value_expression() throws RecognitionException {
        int character_value_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "character_value_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(278, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:280:2: ( character_factor ( Concatenation_Operator character_factor )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:280:4: character_factor ( Concatenation_Operator character_factor )*
            {
            dbg.location(280,4);
            pushFollow(FOLLOW_character_factor_in_character_value_expression1331);
            character_factor();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(280,21);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:280:21: ( Concatenation_Operator character_factor )*
            try { dbg.enterSubRule(32);

            loop32:
            do {
                int alt32=2;
                try { dbg.enterDecision(32, decisionCanBacktrack[32]);

                int LA32_0 = input.LA(1);

                if ( (LA32_0==Concatenation_Operator) ) {
                    alt32=1;
                }


                } finally {dbg.exitDecision(32);}

                switch (alt32) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:280:23: Concatenation_Operator character_factor
            	    {
            	    dbg.location(280,23);
            	    match(input,Concatenation_Operator,FOLLOW_Concatenation_Operator_in_character_value_expression1335); if (state.failed) return ;
            	    dbg.location(280,47);
            	    pushFollow(FOLLOW_character_factor_in_character_value_expression1338);
            	    character_factor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);
            } finally {dbg.exitSubRule(32);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 41, character_value_expression_StartIndex); }

        }
        dbg.location(280, 65);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "character_value_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "character_value_expression"



    // $ANTLR start "character_factor"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:285:1: character_factor : character_primary ;
    public final void character_factor() throws RecognitionException {
        int character_factor_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "character_factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(285, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:287:2: ( character_primary )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:287:4: character_primary
            {
            dbg.location(287,4);
            pushFollow(FOLLOW_character_primary_in_character_factor1355);
            character_primary();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 42, character_factor_StartIndex); }

        }
        dbg.location(288, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "character_factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "character_factor"



    // $ANTLR start "character_primary"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:294:1: character_primary options {k=1; } : ( value_expression_primary | string_value_function );
    public final void character_primary() throws RecognitionException {
        int character_primary_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "character_primary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(294, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:296:2: ( value_expression_primary | string_value_function )
            int alt33=2;
            try { dbg.enterDecision(33, decisionCanBacktrack[33]);

            int LA33_0 = input.LA(1);

            if ( (LA33_0==Regular_Identifier||LA33_0==Unsigned_Integer) ) {
                alt33=1;
            }
            else if ( (LA33_0==93||LA33_0==121||LA33_0==127||LA33_0==131) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(33);}

            switch (alt33) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:296:4: value_expression_primary
                    {
                    dbg.location(296,4);
                    pushFollow(FOLLOW_value_expression_primary_in_character_primary1377);
                    value_expression_primary();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:297:4: string_value_function
                    {
                    dbg.location(297,4);
                    pushFollow(FOLLOW_string_value_function_in_character_primary1382);
                    string_value_function();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 43, character_primary_StartIndex); }

        }
        dbg.location(297, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "character_primary");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "character_primary"



    // $ANTLR start "string_value_function"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:311:1: string_value_function options {k=1; } : character_value_function ;
    public final void string_value_function() throws RecognitionException {
        int string_value_function_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "string_value_function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(311, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:313:2: ( character_value_function )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:313:4: character_value_function
            {
            dbg.location(313,4);
            pushFollow(FOLLOW_character_value_function_in_string_value_function1405);
            character_value_function();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 44, string_value_function_StartIndex); }

        }
        dbg.location(314, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "string_value_function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "string_value_function"



    // $ANTLR start "character_value_function"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:343:1: character_value_function options {k=1; } : ( character_substring_function | regular_expression_substring_function | fold | trim_function );
    public final void character_value_function() throws RecognitionException {
        int character_value_function_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "character_value_function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(343, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:345:2: ( character_substring_function | regular_expression_substring_function | fold | trim_function )
            int alt34=4;
            try { dbg.enterDecision(34, decisionCanBacktrack[34]);

            switch ( input.LA(1) ) {
            case 121:
                {
                int LA34_1 = input.LA(2);

                if ( (synpred45_psqlgrammar()) ) {
                    alt34=1;
                }
                else if ( (synpred46_psqlgrammar()) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 93:
            case 131:
                {
                alt34=3;
                }
                break;
            case 127:
                {
                alt34=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(34);}

            switch (alt34) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:345:5: character_substring_function
                    {
                    dbg.location(345,5);
                    pushFollow(FOLLOW_character_substring_function_in_character_value_function1428);
                    character_substring_function();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:346:6: regular_expression_substring_function
                    {
                    dbg.location(346,6);
                    pushFollow(FOLLOW_regular_expression_substring_function_in_character_value_function1435);
                    regular_expression_substring_function();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:347:6: fold
                    {
                    dbg.location(347,6);
                    pushFollow(FOLLOW_fold_in_character_value_function1442);
                    fold();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:348:6: trim_function
                    {
                    dbg.location(348,6);
                    pushFollow(FOLLOW_trim_function_in_character_value_function1450);
                    trim_function();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 45, character_value_function_StartIndex); }

        }
        dbg.location(348, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "character_value_function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "character_value_function"



    // $ANTLR start "fold"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:350:1: fold options {k=1; } : ( 'UPPER' | 'LOWER' ) Left_Paren character_value_expression Right_Paren ;
    public final void fold() throws RecognitionException {
        int fold_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "fold");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(350, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:352:2: ( ( 'UPPER' | 'LOWER' ) Left_Paren character_value_expression Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:352:4: ( 'UPPER' | 'LOWER' ) Left_Paren character_value_expression Right_Paren
            {
            dbg.location(352,4);
            if ( input.LA(1)==93||input.LA(1)==131 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }

            dbg.location(353,3);
            match(input,Left_Paren,FOLLOW_Left_Paren_in_fold1480); if (state.failed) return ;
            dbg.location(354,4);
            pushFollow(FOLLOW_character_value_expression_in_fold1485);
            character_value_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(355,3);
            match(input,Right_Paren,FOLLOW_Right_Paren_in_fold1489); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 46, fold_StartIndex); }

        }
        dbg.location(355, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fold");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "fold"



    // $ANTLR start "character_substring_function"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:357:1: character_substring_function options {k=1; } : 'SUBSTRING' Left_Paren character_value_expression 'FROM' start_position ( 'FOR' string_length )? ( 'USING' char_length_units )? Right_Paren ;
    public final void character_substring_function() throws RecognitionException {
        int character_substring_function_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "character_substring_function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(357, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:359:2: ( 'SUBSTRING' Left_Paren character_value_expression 'FROM' start_position ( 'FOR' string_length )? ( 'USING' char_length_units )? Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:359:4: 'SUBSTRING' Left_Paren character_value_expression 'FROM' start_position ( 'FOR' string_length )? ( 'USING' char_length_units )? Right_Paren
            {
            dbg.location(359,4);
            match(input,121,FOLLOW_121_in_character_substring_function1508); if (state.failed) return ;
            dbg.location(360,3);
            match(input,Left_Paren,FOLLOW_Left_Paren_in_character_substring_function1512); if (state.failed) return ;
            dbg.location(361,4);
            pushFollow(FOLLOW_character_value_expression_in_character_substring_function1517);
            character_value_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(362,4);
            match(input,74,FOLLOW_74_in_character_substring_function1522); if (state.failed) return ;
            dbg.location(362,11);
            pushFollow(FOLLOW_start_position_in_character_substring_function1524);
            start_position();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(363,4);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:363:4: ( 'FOR' string_length )?
            int alt35=2;
            try { dbg.enterSubRule(35);
            try { dbg.enterDecision(35, decisionCanBacktrack[35]);

            int LA35_0 = input.LA(1);

            if ( (LA35_0==73) ) {
                alt35=1;
            }
            } finally {dbg.exitDecision(35);}

            switch (alt35) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:363:6: 'FOR' string_length
                    {
                    dbg.location(363,6);
                    match(input,73,FOLLOW_73_in_character_substring_function1531); if (state.failed) return ;
                    dbg.location(363,12);
                    pushFollow(FOLLOW_string_length_in_character_substring_function1533);
                    string_length();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(35);}

            dbg.location(364,4);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:364:4: ( 'USING' char_length_units )?
            int alt36=2;
            try { dbg.enterSubRule(36);
            try { dbg.enterDecision(36, decisionCanBacktrack[36]);

            int LA36_0 = input.LA(1);

            if ( (LA36_0==132) ) {
                alt36=1;
            }
            } finally {dbg.exitDecision(36);}

            switch (alt36) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:364:6: 'USING' char_length_units
                    {
                    dbg.location(364,6);
                    match(input,132,FOLLOW_132_in_character_substring_function1544); if (state.failed) return ;
                    dbg.location(364,14);
                    pushFollow(FOLLOW_char_length_units_in_character_substring_function1546);
                    char_length_units();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(36);}

            dbg.location(365,3);
            match(input,Right_Paren,FOLLOW_Right_Paren_in_character_substring_function1554); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 47, character_substring_function_StartIndex); }

        }
        dbg.location(365, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "character_substring_function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "character_substring_function"



    // $ANTLR start "regular_expression_substring_function"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:367:1: regular_expression_substring_function options {k=1; } : 'SUBSTRING' Left_Paren character_value_expression 'SIMILAR' character_value_expression 'ESCAPE' Character_String_Literal Right_Paren ;
    public final void regular_expression_substring_function() throws RecognitionException {
        int regular_expression_substring_function_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "regular_expression_substring_function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(367, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:369:2: ( 'SUBSTRING' Left_Paren character_value_expression 'SIMILAR' character_value_expression 'ESCAPE' Character_String_Literal Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:369:4: 'SUBSTRING' Left_Paren character_value_expression 'SIMILAR' character_value_expression 'ESCAPE' Character_String_Literal Right_Paren
            {
            dbg.location(369,4);
            match(input,121,FOLLOW_121_in_regular_expression_substring_function1573); if (state.failed) return ;
            dbg.location(370,3);
            match(input,Left_Paren,FOLLOW_Left_Paren_in_regular_expression_substring_function1577); if (state.failed) return ;
            dbg.location(371,4);
            pushFollow(FOLLOW_character_value_expression_in_regular_expression_substring_function1582);
            character_value_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(372,4);
            match(input,117,FOLLOW_117_in_regular_expression_substring_function1587); if (state.failed) return ;
            dbg.location(372,14);
            pushFollow(FOLLOW_character_value_expression_in_regular_expression_substring_function1589);
            character_value_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(373,4);
            match(input,66,FOLLOW_66_in_regular_expression_substring_function1594); if (state.failed) return ;
            dbg.location(373,13);
            match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_regular_expression_substring_function1596); if (state.failed) return ;
            dbg.location(374,3);
            match(input,Right_Paren,FOLLOW_Right_Paren_in_regular_expression_substring_function1600); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 48, regular_expression_substring_function_StartIndex); }

        }
        dbg.location(374, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "regular_expression_substring_function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "regular_expression_substring_function"



    // $ANTLR start "trim_function"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:376:1: trim_function options {k=1; } : 'TRIM' Left_Paren trim_operands Right_Paren ;
    public final void trim_function() throws RecognitionException {
        int trim_function_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "trim_function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(376, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:378:2: ( 'TRIM' Left_Paren trim_operands Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:378:4: 'TRIM' Left_Paren trim_operands Right_Paren
            {
            dbg.location(378,4);
            match(input,127,FOLLOW_127_in_trim_function1617); if (state.failed) return ;
            dbg.location(379,3);
            match(input,Left_Paren,FOLLOW_Left_Paren_in_trim_function1621); if (state.failed) return ;
            dbg.location(380,4);
            pushFollow(FOLLOW_trim_operands_in_trim_function1626);
            trim_operands();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(381,3);
            match(input,Right_Paren,FOLLOW_Right_Paren_in_trim_function1630); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 49, trim_function_StartIndex); }

        }
        dbg.location(381, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "trim_function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "trim_function"



    // $ANTLR start "trim_operands"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:383:1: trim_operands options {k=1; } : ( trim_source | trim_specification ( trim_character )? 'FROM' trim_source );
    public final void trim_operands() throws RecognitionException {
        int trim_operands_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "trim_operands");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(383, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:385:2: ( trim_source | trim_specification ( trim_character )? 'FROM' trim_source )
            int alt38=2;
            try { dbg.enterDecision(38, decisionCanBacktrack[38]);

            int LA38_0 = input.LA(1);

            if ( (LA38_0==Regular_Identifier||LA38_0==Unsigned_Integer||LA38_0==93||LA38_0==121||LA38_0==127||LA38_0==131) ) {
                alt38=1;
            }
            else if ( (LA38_0==54||LA38_0==89||LA38_0==126) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(38);}

            switch (alt38) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:385:4: trim_source
                    {
                    dbg.location(385,4);
                    pushFollow(FOLLOW_trim_source_in_trim_operands1647);
                    trim_source();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:386:4: trim_specification ( trim_character )? 'FROM' trim_source
                    {
                    dbg.location(386,4);
                    pushFollow(FOLLOW_trim_specification_in_trim_operands1652);
                    trim_specification();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(387,3);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:387:3: ( trim_character )?
                    int alt37=2;
                    try { dbg.enterSubRule(37);
                    try { dbg.enterDecision(37, decisionCanBacktrack[37]);

                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==Regular_Identifier||LA37_0==Unsigned_Integer||LA37_0==93||LA37_0==121||LA37_0==127||LA37_0==131) ) {
                        alt37=1;
                    }
                    } finally {dbg.exitDecision(37);}

                    switch (alt37) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:387:5: trim_character
                            {
                            dbg.location(387,5);
                            pushFollow(FOLLOW_trim_character_in_trim_operands1659);
                            trim_character();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(37);}

                    dbg.location(388,3);
                    match(input,74,FOLLOW_74_in_trim_operands1667); if (state.failed) return ;
                    dbg.location(389,3);
                    pushFollow(FOLLOW_trim_source_in_trim_operands1671);
                    trim_source();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 50, trim_operands_StartIndex); }

        }
        dbg.location(389, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "trim_operands");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "trim_operands"



    // $ANTLR start "trim_source"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:391:1: trim_source : character_value_expression ;
    public final void trim_source() throws RecognitionException {
        int trim_source_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "trim_source");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(391, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:391:15: ( character_value_expression )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:391:18: character_value_expression
            {
            dbg.location(391,18);
            pushFollow(FOLLOW_character_value_expression_in_trim_source1683);
            character_value_expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 51, trim_source_StartIndex); }

        }
        dbg.location(391, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "trim_source");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "trim_source"



    // $ANTLR start "trim_specification"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:393:1: trim_specification : ( 'LEADING' | 'TRAILING' | 'BOTH' );
    public final void trim_specification() throws RecognitionException {
        int trim_specification_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "trim_specification");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(393, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:393:22: ( 'LEADING' | 'TRAILING' | 'BOTH' )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            dbg.location(393,22);
            if ( input.LA(1)==54||input.LA(1)==89||input.LA(1)==126 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 52, trim_specification_StartIndex); }

        }
        dbg.location(393, 55);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "trim_specification");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "trim_specification"



    // $ANTLR start "trim_character"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:395:1: trim_character : character_value_expression ;
    public final void trim_character() throws RecognitionException {
        int trim_character_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "trim_character");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(395, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:395:18: ( character_value_expression )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:395:21: character_value_expression
            {
            dbg.location(395,21);
            pushFollow(FOLLOW_character_value_expression_in_trim_character1714);
            character_value_expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 53, trim_character_StartIndex); }

        }
        dbg.location(395, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "trim_character");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "trim_character"



    // $ANTLR start "start_position"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:397:1: start_position : numeric_value_expression ;
    public final void start_position() throws RecognitionException {
        int start_position_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "start_position");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(397, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:397:18: ( numeric_value_expression )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:397:21: numeric_value_expression
            {
            dbg.location(397,21);
            pushFollow(FOLLOW_numeric_value_expression_in_start_position1728);
            numeric_value_expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 54, start_position_StartIndex); }

        }
        dbg.location(397, 45);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start_position");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "start_position"



    // $ANTLR start "string_length"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:399:1: string_length : numeric_value_expression ;
    public final void string_length() throws RecognitionException {
        int string_length_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "string_length");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(399, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:399:17: ( numeric_value_expression )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:399:20: numeric_value_expression
            {
            dbg.location(399,20);
            pushFollow(FOLLOW_numeric_value_expression_in_string_length1740);
            numeric_value_expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 55, string_length_StartIndex); }

        }
        dbg.location(399, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "string_length");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "string_length"



    // $ANTLR start "value_expression_primary"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:433:2: value_expression_primary : ( unsigned_value_specification ) ( Period identifier | Right_Arrow identifier )* ;
    public final void value_expression_primary() throws RecognitionException {
        int value_expression_primary_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "value_expression_primary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(433, 1);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:434:3: ( ( unsigned_value_specification ) ( Period identifier | Right_Arrow identifier )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:434:5: ( unsigned_value_specification ) ( Period identifier | Right_Arrow identifier )*
            {
            dbg.location(434,5);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:434:5: ( unsigned_value_specification )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:434:7: unsigned_value_specification
            {
            dbg.location(434,7);
            pushFollow(FOLLOW_unsigned_value_specification_in_value_expression_primary1763);
            unsigned_value_specification();

            state._fsp--;
            if (state.failed) return ;

            }

            dbg.location(434,38);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:434:38: ( Period identifier | Right_Arrow identifier )*
            try { dbg.enterSubRule(39);

            loop39:
            do {
                int alt39=3;
                try { dbg.enterDecision(39, decisionCanBacktrack[39]);

                int LA39_0 = input.LA(1);

                if ( (LA39_0==Period) ) {
                    alt39=1;
                }
                else if ( (LA39_0==Right_Arrow) ) {
                    alt39=2;
                }


                } finally {dbg.exitDecision(39);}

                switch (alt39) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:434:41: Period identifier
            	    {
            	    dbg.location(434,41);
            	    match(input,Period,FOLLOW_Period_in_value_expression_primary1770); if (state.failed) return ;
            	    dbg.location(434,48);
            	    pushFollow(FOLLOW_identifier_in_value_expression_primary1772);
            	    identifier();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:434:63: Right_Arrow identifier
            	    {
            	    dbg.location(434,63);
            	    match(input,Right_Arrow,FOLLOW_Right_Arrow_in_value_expression_primary1778); if (state.failed) return ;
            	    dbg.location(434,76);
            	    pushFollow(FOLLOW_identifier_in_value_expression_primary1781);
            	    identifier();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);
            } finally {dbg.exitSubRule(39);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 56, value_expression_primary_StartIndex); }

        }
        dbg.location(434, 89);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "value_expression_primary");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "value_expression_primary"



    // $ANTLR start "table_expression"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:443:1: table_expression options {k=1; } : from_clause ( where_clause )? ( group_by_clause )? ( having_clause )? ;
    public final void table_expression() throws RecognitionException {
        int table_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "table_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(443, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:445:2: ( from_clause ( where_clause )? ( group_by_clause )? ( having_clause )? )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:445:4: from_clause ( where_clause )? ( group_by_clause )? ( having_clause )?
            {
            dbg.location(445,4);
            pushFollow(FOLLOW_from_clause_in_table_expression1806);
            from_clause();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(446,3);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:446:3: ( where_clause )?
            int alt40=2;
            try { dbg.enterSubRule(40);
            try { dbg.enterDecision(40, decisionCanBacktrack[40]);

            int LA40_0 = input.LA(1);

            if ( (LA40_0==135) ) {
                alt40=1;
            }
            } finally {dbg.exitDecision(40);}

            switch (alt40) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:446:5: where_clause
                    {
                    dbg.location(446,5);
                    pushFollow(FOLLOW_where_clause_in_table_expression1812);
                    where_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(40);}

            dbg.location(447,3);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:447:3: ( group_by_clause )?
            int alt41=2;
            try { dbg.enterSubRule(41);
            try { dbg.enterDecision(41, decisionCanBacktrack[41]);

            int LA41_0 = input.LA(1);

            if ( (LA41_0==77) ) {
                alt41=1;
            }
            } finally {dbg.exitDecision(41);}

            switch (alt41) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:447:5: group_by_clause
                    {
                    dbg.location(447,5);
                    pushFollow(FOLLOW_group_by_clause_in_table_expression1822);
                    group_by_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(41);}

            dbg.location(448,3);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:448:3: ( having_clause )?
            int alt42=2;
            try { dbg.enterSubRule(42);
            try { dbg.enterDecision(42, decisionCanBacktrack[42]);

            int LA42_0 = input.LA(1);

            if ( (LA42_0==79) ) {
                alt42=1;
            }
            } finally {dbg.exitDecision(42);}

            switch (alt42) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:448:5: having_clause
                    {
                    dbg.location(448,5);
                    pushFollow(FOLLOW_having_clause_in_table_expression1832);
                    having_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(42);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 57, table_expression_StartIndex); }

        }
        dbg.location(450, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "table_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "table_expression"



    // $ANTLR start "from_clause"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:463:1: from_clause : 'FROM' table_reference_list ;
    public final void from_clause() throws RecognitionException {
        int from_clause_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "from_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(463, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:464:2: ( 'FROM' table_reference_list )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:464:5: 'FROM' table_reference_list
            {
            dbg.location(464,5);
            if ( state.backtracking==0 ) {System.out.print(" ");}
            dbg.location(464,30);
            match(input,74,FOLLOW_74_in_from_clause1858); if (state.failed) return ;
            dbg.location(464,38);
            if ( state.backtracking==0 ) {System.out.print("FROM ");}
            dbg.location(465,3);
            pushFollow(FOLLOW_table_reference_list_in_from_clause1865);
            table_reference_list();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 58, from_clause_StartIndex); }

        }
        dbg.location(465, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "from_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "from_clause"



    // $ANTLR start "table_reference_list"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:468:1: table_reference_list options {k=1; } : table_reference ( Comma table_reference )* ;
    public final void table_reference_list() throws RecognitionException {
        int table_reference_list_StartIndex = input.index();

        Token Comma10=null;

        try { dbg.enterRule(getGrammarFileName(), "table_reference_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(468, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:470:2: ( table_reference ( Comma table_reference )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:470:4: table_reference ( Comma table_reference )*
            {
            dbg.location(470,4);
            pushFollow(FOLLOW_table_reference_in_table_reference_list1884);
            table_reference();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(471,3);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:471:3: ( Comma table_reference )*
            try { dbg.enterSubRule(43);

            loop43:
            do {
                int alt43=2;
                try { dbg.enterDecision(43, decisionCanBacktrack[43]);

                int LA43_0 = input.LA(1);

                if ( (LA43_0==Comma) ) {
                    alt43=1;
                }


                } finally {dbg.exitDecision(43);}

                switch (alt43) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:471:5: Comma table_reference
            	    {
            	    dbg.location(471,5);
            	    Comma10=(Token)match(input,Comma,FOLLOW_Comma_in_table_reference_list1890); if (state.failed) return ;
            	    dbg.location(471,11);
            	    if ( state.backtracking==0 ) {System.out.print((Comma10!=null?Comma10.getText():null));}
            	    dbg.location(471,44);
            	    pushFollow(FOLLOW_table_reference_in_table_reference_list1894);
            	    table_reference();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);
            } finally {dbg.exitSubRule(43);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 59, table_reference_list_StartIndex); }

        }
        dbg.location(471, 62);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "table_reference_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "table_reference_list"



    // $ANTLR start "as_clause"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:501:1: as_clause : ( 'AS' )? identifier ;
    public final void as_clause() throws RecognitionException {
        int as_clause_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "as_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(501, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:501:11: ( ( 'AS' )? identifier )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:501:13: ( 'AS' )? identifier
            {
            dbg.location(501,13);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:501:13: ( 'AS' )?
            int alt44=2;
            try { dbg.enterSubRule(44);
            try { dbg.enterDecision(44, decisionCanBacktrack[44]);

            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            } finally {dbg.exitDecision(44);}

            switch (alt44) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:501:15: 'AS'
                    {
                    dbg.location(501,15);
                    match(input,49,FOLLOW_49_in_as_clause1914); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(44);}

            dbg.location(501,23);
            pushFollow(FOLLOW_identifier_in_as_clause1919);
            identifier();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 60, as_clause_StartIndex); }

        }
        dbg.location(501, 33);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "as_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "as_clause"



    // $ANTLR start "qualified_asterisk"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:503:1: qualified_asterisk : schema_name Period Asterisk ;
    public final void qualified_asterisk() throws RecognitionException {
        int qualified_asterisk_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "qualified_asterisk");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(503, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:503:20: ( schema_name Period Asterisk )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:503:22: schema_name Period Asterisk
            {
            dbg.location(503,22);
            pushFollow(FOLLOW_schema_name_in_qualified_asterisk1928);
            schema_name();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(503,35);
            match(input,Period,FOLLOW_Period_in_qualified_asterisk1931); if (state.failed) return ;
            dbg.location(503,42);
            match(input,Asterisk,FOLLOW_Asterisk_in_qualified_asterisk1933); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 61, qualified_asterisk_StartIndex); }

        }
        dbg.location(503, 51);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "qualified_asterisk");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "qualified_asterisk"



    // $ANTLR start "schema_name"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:508:1: schema_name options {k=1; } : identifier ( Period identifier )? ;
    public final void schema_name() throws RecognitionException {
        int schema_name_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "schema_name");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(508, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:510:2: ( identifier ( Period identifier )? )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:510:5: identifier ( Period identifier )?
            {
            dbg.location(510,5);
            pushFollow(FOLLOW_identifier_in_schema_name1985);
            identifier();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(510,17);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:510:17: ( Period identifier )?
            int alt45=2;
            try { dbg.enterSubRule(45);
            try { dbg.enterDecision(45, decisionCanBacktrack[45]);

            int LA45_0 = input.LA(1);

            if ( (LA45_0==Period) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==Regular_Identifier) ) {
                    alt45=1;
                }
            }
            } finally {dbg.exitDecision(45);}

            switch (alt45) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:510:19: Period identifier
                    {
                    dbg.location(510,19);
                    match(input,Period,FOLLOW_Period_in_schema_name1990); if (state.failed) return ;
                    dbg.location(510,27);
                    pushFollow(FOLLOW_identifier_in_schema_name1993);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(45);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 62, schema_name_StartIndex); }

        }
        dbg.location(510, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "schema_name");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "schema_name"



    // $ANTLR start "table_reference"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:526:1: table_reference options {k=1; } : ( table_primary | joined_table ) ( sample_clause )? ;
    public final void table_reference() throws RecognitionException {
        int table_reference_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "table_reference");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(526, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:528:2: ( ( table_primary | joined_table ) ( sample_clause )? )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:528:4: ( table_primary | joined_table ) ( sample_clause )?
            {
            dbg.location(528,4);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:528:4: ( table_primary | joined_table )
            int alt46=2;
            try { dbg.enterSubRule(46);
            try { dbg.enterDecision(46, decisionCanBacktrack[46]);

            switch ( input.LA(1) ) {
            case 98:
                {
                int LA46_1 = input.LA(2);

                if ( (synpred63_psqlgrammar()) ) {
                    alt46=1;
                }
                else if ( (true) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case Regular_Identifier:
                {
                int LA46_2 = input.LA(2);

                if ( (synpred63_psqlgrammar()) ) {
                    alt46=1;
                }
                else if ( (true) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case Left_Paren:
                {
                int LA46_3 = input.LA(2);

                if ( (synpred63_psqlgrammar()) ) {
                    alt46=1;
                }
                else if ( (true) ) {
                    alt46=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(46);}

            switch (alt46) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:528:6: table_primary
                    {
                    dbg.location(528,6);
                    pushFollow(FOLLOW_table_primary_in_table_reference2031);
                    table_primary();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:529:6: joined_table
                    {
                    dbg.location(529,6);
                    pushFollow(FOLLOW_joined_table_in_table_reference2039);
                    joined_table();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(46);}

            dbg.location(531,3);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:531:3: ( sample_clause )?
            int alt47=2;
            try { dbg.enterSubRule(47);
            try { dbg.enterDecision(47, decisionCanBacktrack[47]);

            int LA47_0 = input.LA(1);

            if ( (LA47_0==125) ) {
                alt47=1;
            }
            } finally {dbg.exitDecision(47);}

            switch (alt47) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:531:5: sample_clause
                    {
                    dbg.location(531,5);
                    pushFollow(FOLLOW_sample_clause_in_table_reference2049);
                    sample_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(47);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 63, table_reference_StartIndex); }

        }
        dbg.location(531, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "table_reference");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "table_reference"



    // $ANTLR start "sample_clause"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:537:1: sample_clause : 'TABLESAMPLE' sample_method Left_Paren numeric_value_expression Right_Paren ( repeatable_clause )? ;
    public final void sample_clause() throws RecognitionException {
        int sample_clause_StartIndex = input.index();

        Token Left_Paren11=null;
        Token Right_Paren12=null;

        try { dbg.enterRule(getGrammarFileName(), "sample_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(537, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:538:2: ( 'TABLESAMPLE' sample_method Left_Paren numeric_value_expression Right_Paren ( repeatable_clause )? )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:538:4: 'TABLESAMPLE' sample_method Left_Paren numeric_value_expression Right_Paren ( repeatable_clause )?
            {
            dbg.location(538,4);
            match(input,125,FOLLOW_125_in_sample_clause2065); if (state.failed) return ;
            dbg.location(538,18);
            pushFollow(FOLLOW_sample_method_in_sample_clause2067);
            sample_method();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(539,3);
            Left_Paren11=(Token)match(input,Left_Paren,FOLLOW_Left_Paren_in_sample_clause2071); if (state.failed) return ;
            dbg.location(539,14);
            if ( state.backtracking==0 ) {System.out.print((Left_Paren11!=null?Left_Paren11.getText():null));}
            dbg.location(539,52);
            pushFollow(FOLLOW_numeric_value_expression_in_sample_clause2075);
            numeric_value_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(539,78);
            Right_Paren12=(Token)match(input,Right_Paren,FOLLOW_Right_Paren_in_sample_clause2078); if (state.failed) return ;
            dbg.location(539,90);
            if ( state.backtracking==0 ) {System.out.print((Right_Paren12!=null?Right_Paren12.getText():null));}
            dbg.location(540,3);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:540:3: ( repeatable_clause )?
            int alt48=2;
            try { dbg.enterSubRule(48);
            try { dbg.enterDecision(48, decisionCanBacktrack[48]);

            int LA48_0 = input.LA(1);

            if ( (LA48_0==111) ) {
                alt48=1;
            }
            } finally {dbg.exitDecision(48);}

            switch (alt48) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:540:5: repeatable_clause
                    {
                    dbg.location(540,5);
                    pushFollow(FOLLOW_repeatable_clause_in_sample_clause2086);
                    repeatable_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(48);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 64, sample_clause_StartIndex); }

        }
        dbg.location(540, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sample_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "sample_clause"



    // $ANTLR start "sample_method"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:542:1: sample_method : ( 'BERNOULLI' | 'SYSTEM' );
    public final void sample_method() throws RecognitionException {
        int sample_method_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "sample_method");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(542, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:543:2: ( 'BERNOULLI' | 'SYSTEM' )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            dbg.location(543,2);
            if ( input.LA(1)==53||input.LA(1)==124 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 65, sample_method_StartIndex); }

        }
        dbg.location(544, 11);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sample_method");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "sample_method"



    // $ANTLR start "repeatable_clause"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:546:1: repeatable_clause : 'REPEATABLE' Left_Paren numeric_value_expression Right_Paren ;
    public final void repeatable_clause() throws RecognitionException {
        int repeatable_clause_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "repeatable_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(546, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:547:2: ( 'REPEATABLE' Left_Paren numeric_value_expression Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:547:4: 'REPEATABLE' Left_Paren numeric_value_expression Right_Paren
            {
            dbg.location(547,4);
            match(input,111,FOLLOW_111_in_repeatable_clause2113); if (state.failed) return ;
            dbg.location(547,17);
            match(input,Left_Paren,FOLLOW_Left_Paren_in_repeatable_clause2115); if (state.failed) return ;
            dbg.location(547,28);
            pushFollow(FOLLOW_numeric_value_expression_in_repeatable_clause2117);
            numeric_value_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(547,54);
            match(input,Right_Paren,FOLLOW_Right_Paren_in_repeatable_clause2120); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 66, repeatable_clause_StartIndex); }

        }
        dbg.location(547, 64);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "repeatable_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "repeatable_clause"



    // $ANTLR start "table_primary"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:553:1: table_primary : ( table_or_query_name ( ( 'AS' )? identifier ( Left_Paren derived_column_list Right_Paren )? )? | derived_table ( 'AS' )? ( identifier )? ( Left_Paren derived_column_list Right_Paren )? | Left_Paren joined_table Right_Paren );
    public final void table_primary() throws RecognitionException {
        int table_primary_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "table_primary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(553, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:553:16: ( table_or_query_name ( ( 'AS' )? identifier ( Left_Paren derived_column_list Right_Paren )? )? | derived_table ( 'AS' )? ( identifier )? ( Left_Paren derived_column_list Right_Paren )? | Left_Paren joined_table Right_Paren )
            int alt55=3;
            try { dbg.enterDecision(55, decisionCanBacktrack[55]);

            int LA55_0 = input.LA(1);

            if ( (LA55_0==Regular_Identifier||LA55_0==98) ) {
                alt55=1;
            }
            else if ( (LA55_0==Left_Paren) ) {
                int LA55_3 = input.LA(2);

                if ( (synpred74_psqlgrammar()) ) {
                    alt55=2;
                }
                else if ( (true) ) {
                    alt55=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(55);}

            switch (alt55) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:554:3: table_or_query_name ( ( 'AS' )? identifier ( Left_Paren derived_column_list Right_Paren )? )?
                    {
                    dbg.location(554,3);
                    pushFollow(FOLLOW_table_or_query_name_in_table_primary2135);
                    table_or_query_name();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(554,24);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:554:24: ( ( 'AS' )? identifier ( Left_Paren derived_column_list Right_Paren )? )?
                    int alt51=2;
                    try { dbg.enterSubRule(51);
                    try { dbg.enterDecision(51, decisionCanBacktrack[51]);

                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==Regular_Identifier||LA51_0==49) ) {
                        alt51=1;
                    }
                    } finally {dbg.exitDecision(51);}

                    switch (alt51) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:554:26: ( 'AS' )? identifier ( Left_Paren derived_column_list Right_Paren )?
                            {
                            dbg.location(554,26);
                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:554:26: ( 'AS' )?
                            int alt49=2;
                            try { dbg.enterSubRule(49);
                            try { dbg.enterDecision(49, decisionCanBacktrack[49]);

                            int LA49_0 = input.LA(1);

                            if ( (LA49_0==49) ) {
                                alt49=1;
                            }
                            } finally {dbg.exitDecision(49);}

                            switch (alt49) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:554:28: 'AS'
                                    {
                                    dbg.location(554,28);
                                    match(input,49,FOLLOW_49_in_table_primary2142); if (state.failed) return ;

                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(49);}

                            dbg.location(554,36);
                            if ( state.backtracking==0 ) {System.out.print(" ");}
                            dbg.location(554,61);
                            pushFollow(FOLLOW_identifier_in_table_primary2149);
                            identifier();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(554,74);
                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:554:74: ( Left_Paren derived_column_list Right_Paren )?
                            int alt50=2;
                            try { dbg.enterSubRule(50);
                            try { dbg.enterDecision(50, decisionCanBacktrack[50]);

                            int LA50_0 = input.LA(1);

                            if ( (LA50_0==Left_Paren) ) {
                                alt50=1;
                            }
                            } finally {dbg.exitDecision(50);}

                            switch (alt50) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:554:76: Left_Paren derived_column_list Right_Paren
                                    {
                                    dbg.location(554,76);
                                    match(input,Left_Paren,FOLLOW_Left_Paren_in_table_primary2155); if (state.failed) return ;
                                    dbg.location(554,87);
                                    pushFollow(FOLLOW_derived_column_list_in_table_primary2157);
                                    derived_column_list();

                                    state._fsp--;
                                    if (state.failed) return ;
                                    dbg.location(554,108);
                                    match(input,Right_Paren,FOLLOW_Right_Paren_in_table_primary2160); if (state.failed) return ;

                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(50);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(51);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:555:5: derived_table ( 'AS' )? ( identifier )? ( Left_Paren derived_column_list Right_Paren )?
                    {
                    dbg.location(555,5);
                    pushFollow(FOLLOW_derived_table_in_table_primary2172);
                    derived_table();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(555,20);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:555:20: ( 'AS' )?
                    int alt52=2;
                    try { dbg.enterSubRule(52);
                    try { dbg.enterDecision(52, decisionCanBacktrack[52]);

                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==49) ) {
                        alt52=1;
                    }
                    } finally {dbg.exitDecision(52);}

                    switch (alt52) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:555:22: 'AS'
                            {
                            dbg.location(555,22);
                            match(input,49,FOLLOW_49_in_table_primary2177); if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(52);}

                    dbg.location(555,30);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:555:30: ( identifier )?
                    int alt53=2;
                    try { dbg.enterSubRule(53);
                    try { dbg.enterDecision(53, decisionCanBacktrack[53]);

                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==Regular_Identifier) ) {
                        alt53=1;
                    }
                    } finally {dbg.exitDecision(53);}

                    switch (alt53) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:555:31: identifier
                            {
                            dbg.location(555,31);
                            pushFollow(FOLLOW_identifier_in_table_primary2183);
                            identifier();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(53);}

                    dbg.location(555,45);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:555:45: ( Left_Paren derived_column_list Right_Paren )?
                    int alt54=2;
                    try { dbg.enterSubRule(54);
                    try { dbg.enterDecision(54, decisionCanBacktrack[54]);

                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==Left_Paren) ) {
                        alt54=1;
                    }
                    } finally {dbg.exitDecision(54);}

                    switch (alt54) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:555:47: Left_Paren derived_column_list Right_Paren
                            {
                            dbg.location(555,47);
                            match(input,Left_Paren,FOLLOW_Left_Paren_in_table_primary2190); if (state.failed) return ;
                            dbg.location(555,58);
                            pushFollow(FOLLOW_derived_column_list_in_table_primary2192);
                            derived_column_list();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(555,79);
                            match(input,Right_Paren,FOLLOW_Right_Paren_in_table_primary2195); if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(54);}


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:556:5: Left_Paren joined_table Right_Paren
                    {
                    dbg.location(556,5);
                    match(input,Left_Paren,FOLLOW_Left_Paren_in_table_primary2204); if (state.failed) return ;
                    dbg.location(556,16);
                    pushFollow(FOLLOW_joined_table_in_table_primary2206);
                    joined_table();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(556,30);
                    match(input,Right_Paren,FOLLOW_Right_Paren_in_table_primary2209); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 67, table_primary_StartIndex); }

        }
        dbg.location(558, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "table_primary");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "table_primary"



    // $ANTLR start "table_or_query_name"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:582:1: table_or_query_name : ( table_name | identifier );
    public final void table_or_query_name() throws RecognitionException {
        int table_or_query_name_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "table_or_query_name");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(582, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:582:23: ( table_name | identifier )
            int alt56=2;
            try { dbg.enterDecision(56, decisionCanBacktrack[56]);

            int LA56_0 = input.LA(1);

            if ( (LA56_0==98) ) {
                alt56=1;
            }
            else if ( (LA56_0==Regular_Identifier) ) {
                int LA56_2 = input.LA(2);

                if ( (synpred75_psqlgrammar()) ) {
                    alt56=1;
                }
                else if ( (true) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(56);}

            switch (alt56) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:582:26: table_name
                    {
                    dbg.location(582,26);
                    pushFollow(FOLLOW_table_name_in_table_or_query_name2237);
                    table_name();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:582:40: identifier
                    {
                    dbg.location(582,40);
                    pushFollow(FOLLOW_identifier_in_table_or_query_name2242);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 68, table_or_query_name_StartIndex); }

        }
        dbg.location(582, 50);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "table_or_query_name");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "table_or_query_name"



    // $ANTLR start "derived_table"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:584:1: derived_table : table_subquery ;
    public final void derived_table() throws RecognitionException {
        int derived_table_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "derived_table");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(584, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:584:17: ( table_subquery )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:584:20: table_subquery
            {
            dbg.location(584,20);
            pushFollow(FOLLOW_table_subquery_in_derived_table2254);
            table_subquery();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 69, derived_table_StartIndex); }

        }
        dbg.location(584, 34);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "derived_table");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "derived_table"



    // $ANTLR start "derived_column_list"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:586:1: derived_column_list : column_name_list ;
    public final void derived_column_list() throws RecognitionException {
        int derived_column_list_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "derived_column_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(586, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:586:23: ( column_name_list )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:586:26: column_name_list
            {
            dbg.location(586,26);
            pushFollow(FOLLOW_column_name_list_in_derived_column_list2266);
            column_name_list();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 70, derived_column_list_StartIndex); }

        }
        dbg.location(586, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "derived_column_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "derived_column_list"



    // $ANTLR start "joined_table"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:602:1: joined_table : table_primary ( ( 'CROSS' 'JOIN' table_primary | ( join_type )? 'JOIN' table_reference join_specification | 'NATURAL' ( join_type )? 'JOIN' table_primary | 'UNION' 'JOIN' table_primary ) )+ ;
    public final void joined_table() throws RecognitionException {
        int joined_table_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "joined_table");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(602, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:602:15: ( table_primary ( ( 'CROSS' 'JOIN' table_primary | ( join_type )? 'JOIN' table_reference join_specification | 'NATURAL' ( join_type )? 'JOIN' table_primary | 'UNION' 'JOIN' table_primary ) )+ )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:603:2: table_primary ( ( 'CROSS' 'JOIN' table_primary | ( join_type )? 'JOIN' table_reference join_specification | 'NATURAL' ( join_type )? 'JOIN' table_primary | 'UNION' 'JOIN' table_primary ) )+
            {
            dbg.location(603,2);
            pushFollow(FOLLOW_table_primary_in_joined_table2287);
            table_primary();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(604,2);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:604:2: ( ( 'CROSS' 'JOIN' table_primary | ( join_type )? 'JOIN' table_reference join_specification | 'NATURAL' ( join_type )? 'JOIN' table_primary | 'UNION' 'JOIN' table_primary ) )+
            int cnt60=0;
            try { dbg.enterSubRule(60);

            loop60:
            do {
                int alt60=2;
                try { dbg.enterDecision(60, decisionCanBacktrack[60]);

                int LA60_0 = input.LA(1);

                if ( (LA60_0==129) ) {
                    int LA60_2 = input.LA(2);

                    if ( (LA60_2==86) ) {
                        alt60=1;
                    }


                }
                else if ( (LA60_0==62||LA60_0==75||LA60_0==82||LA60_0==86||LA60_0==90||LA60_0==99||LA60_0==112) ) {
                    alt60=1;
                }


                } finally {dbg.exitDecision(60);}

                switch (alt60) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:606:3: ( 'CROSS' 'JOIN' table_primary | ( join_type )? 'JOIN' table_reference join_specification | 'NATURAL' ( join_type )? 'JOIN' table_primary | 'UNION' 'JOIN' table_primary )
            	    {
            	    dbg.location(606,3);
            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:606:3: ( 'CROSS' 'JOIN' table_primary | ( join_type )? 'JOIN' table_reference join_specification | 'NATURAL' ( join_type )? 'JOIN' table_primary | 'UNION' 'JOIN' table_primary )
            	    int alt59=4;
            	    try { dbg.enterSubRule(59);
            	    try { dbg.enterDecision(59, decisionCanBacktrack[59]);

            	    switch ( input.LA(1) ) {
            	    case 62:
            	        {
            	        alt59=1;
            	        }
            	        break;
            	    case 75:
            	    case 82:
            	    case 86:
            	    case 90:
            	    case 112:
            	        {
            	        alt59=2;
            	        }
            	        break;
            	    case 99:
            	        {
            	        alt59=3;
            	        }
            	        break;
            	    case 129:
            	        {
            	        alt59=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 59, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;

            	    }

            	    } finally {dbg.exitDecision(59);}

            	    switch (alt59) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:606:5: 'CROSS' 'JOIN' table_primary
            	            {
            	            dbg.location(606,5);
            	            match(input,62,FOLLOW_62_in_joined_table2299); if (state.failed) return ;
            	            dbg.location(606,13);
            	            if ( state.backtracking==0 ) {System.out.print(" CROSS");}
            	            dbg.location(606,43);
            	            match(input,86,FOLLOW_86_in_joined_table2303); if (state.failed) return ;
            	            dbg.location(606,50);
            	            if ( state.backtracking==0 ) {System.out.print(" JOIN ");}
            	            dbg.location(606,80);
            	            pushFollow(FOLLOW_table_primary_in_joined_table2307);
            	            table_primary();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:607:5: ( join_type )? 'JOIN' table_reference join_specification
            	            {
            	            dbg.location(607,5);
            	            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:607:5: ( join_type )?
            	            int alt57=2;
            	            try { dbg.enterSubRule(57);
            	            try { dbg.enterDecision(57, decisionCanBacktrack[57]);

            	            int LA57_0 = input.LA(1);

            	            if ( (LA57_0==75||LA57_0==82||LA57_0==90||LA57_0==112) ) {
            	                alt57=1;
            	            }
            	            } finally {dbg.exitDecision(57);}

            	            switch (alt57) {
            	                case 1 :
            	                    dbg.enterAlt(1);

            	                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:607:7: join_type
            	                    {
            	                    dbg.location(607,7);
            	                    pushFollow(FOLLOW_join_type_in_joined_table2315);
            	                    join_type();

            	                    state._fsp--;
            	                    if (state.failed) return ;

            	                    }
            	                    break;

            	            }
            	            } finally {dbg.exitSubRule(57);}

            	            dbg.location(607,21);
            	            match(input,86,FOLLOW_86_in_joined_table2321); if (state.failed) return ;
            	            dbg.location(607,28);
            	            if ( state.backtracking==0 ) {System.out.print(" JOIN ");}
            	            dbg.location(607,58);
            	            pushFollow(FOLLOW_table_reference_in_joined_table2325);
            	            table_reference();

            	            state._fsp--;
            	            if (state.failed) return ;
            	            dbg.location(607,75);
            	            pushFollow(FOLLOW_join_specification_in_joined_table2328);
            	            join_specification();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            dbg.enterAlt(3);

            	            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:608:5: 'NATURAL' ( join_type )? 'JOIN' table_primary
            	            {
            	            dbg.location(608,5);
            	            match(input,99,FOLLOW_99_in_joined_table2334); if (state.failed) return ;
            	            dbg.location(608,15);
            	            if ( state.backtracking==0 ) {System.out.print(" NATURAL");}
            	            dbg.location(608,47);
            	            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:608:47: ( join_type )?
            	            int alt58=2;
            	            try { dbg.enterSubRule(58);
            	            try { dbg.enterDecision(58, decisionCanBacktrack[58]);

            	            int LA58_0 = input.LA(1);

            	            if ( (LA58_0==75||LA58_0==82||LA58_0==90||LA58_0==112) ) {
            	                alt58=1;
            	            }
            	            } finally {dbg.exitDecision(58);}

            	            switch (alt58) {
            	                case 1 :
            	                    dbg.enterAlt(1);

            	                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:608:49: join_type
            	                    {
            	                    dbg.location(608,49);
            	                    pushFollow(FOLLOW_join_type_in_joined_table2340);
            	                    join_type();

            	                    state._fsp--;
            	                    if (state.failed) return ;

            	                    }
            	                    break;

            	            }
            	            } finally {dbg.exitSubRule(58);}

            	            dbg.location(608,63);
            	            match(input,86,FOLLOW_86_in_joined_table2346); if (state.failed) return ;
            	            dbg.location(608,70);
            	            if ( state.backtracking==0 ) {System.out.print(" JOIN");}
            	            dbg.location(608,99);
            	            pushFollow(FOLLOW_table_primary_in_joined_table2350);
            	            table_primary();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            dbg.enterAlt(4);

            	            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:609:6: 'UNION' 'JOIN' table_primary
            	            {
            	            dbg.location(609,6);
            	            match(input,129,FOLLOW_129_in_joined_table2357); if (state.failed) return ;
            	            dbg.location(609,14);
            	            if ( state.backtracking==0 ) {System.out.print(" UNION");}
            	            dbg.location(609,44);
            	            match(input,86,FOLLOW_86_in_joined_table2361); if (state.failed) return ;
            	            dbg.location(609,51);
            	            if ( state.backtracking==0 ) {System.out.print(" JOIN ");}
            	            dbg.location(609,81);
            	            pushFollow(FOLLOW_table_primary_in_joined_table2365);
            	            table_primary();

            	            state._fsp--;
            	            if (state.failed) return ;

            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(59);}


            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt60++;
            } while (true);
            } finally {dbg.exitSubRule(60);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 71, joined_table_StartIndex); }

        }
        dbg.location(612, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "joined_table");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "joined_table"



    // $ANTLR start "table_name"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:631:1: table_name options {k=1; } : ( 'MODULE' Period identifier | identifier ( Period identifier ( Period identifier )? )? ) ;
    public final void table_name() throws RecognitionException {
        int table_name_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "table_name");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(631, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 72) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:633:2: ( ( 'MODULE' Period identifier | identifier ( Period identifier ( Period identifier )? )? ) )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:633:6: ( 'MODULE' Period identifier | identifier ( Period identifier ( Period identifier )? )? )
            {
            dbg.location(633,6);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:633:6: ( 'MODULE' Period identifier | identifier ( Period identifier ( Period identifier )? )? )
            int alt63=2;
            try { dbg.enterSubRule(63);
            try { dbg.enterDecision(63, decisionCanBacktrack[63]);

            int LA63_0 = input.LA(1);

            if ( (LA63_0==98) ) {
                alt63=1;
            }
            else if ( (LA63_0==Regular_Identifier) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(63);}

            switch (alt63) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:633:8: 'MODULE' Period identifier
                    {
                    dbg.location(633,8);
                    match(input,98,FOLLOW_98_in_table_name2438); if (state.failed) return ;
                    dbg.location(633,17);
                    match(input,Period,FOLLOW_Period_in_table_name2440); if (state.failed) return ;
                    dbg.location(633,24);
                    pushFollow(FOLLOW_identifier_in_table_name2442);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:634:5: identifier ( Period identifier ( Period identifier )? )?
                    {
                    dbg.location(634,5);
                    pushFollow(FOLLOW_identifier_in_table_name2448);
                    identifier();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(634,17);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:634:17: ( Period identifier ( Period identifier )? )?
                    int alt62=2;
                    try { dbg.enterSubRule(62);
                    try { dbg.enterDecision(62, decisionCanBacktrack[62]);

                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==Period) ) {
                        alt62=1;
                    }
                    } finally {dbg.exitDecision(62);}

                    switch (alt62) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:634:19: Period identifier ( Period identifier )?
                            {
                            dbg.location(634,19);
                            match(input,Period,FOLLOW_Period_in_table_name2453); if (state.failed) return ;
                            dbg.location(634,27);
                            pushFollow(FOLLOW_identifier_in_table_name2456);
                            identifier();

                            state._fsp--;
                            if (state.failed) return ;
                            dbg.location(634,38);
                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:634:38: ( Period identifier )?
                            int alt61=2;
                            try { dbg.enterSubRule(61);
                            try { dbg.enterDecision(61, decisionCanBacktrack[61]);

                            int LA61_0 = input.LA(1);

                            if ( (LA61_0==Period) ) {
                                alt61=1;
                            }
                            } finally {dbg.exitDecision(61);}

                            switch (alt61) {
                                case 1 :
                                    dbg.enterAlt(1);

                                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:634:41: Period identifier
                                    {
                                    dbg.location(634,41);
                                    match(input,Period,FOLLOW_Period_in_table_name2461); if (state.failed) return ;
                                    dbg.location(634,49);
                                    pushFollow(FOLLOW_identifier_in_table_name2464);
                                    identifier();

                                    state._fsp--;
                                    if (state.failed) return ;

                                    }
                                    break;

                            }
                            } finally {dbg.exitSubRule(61);}


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(62);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(63);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 72, table_name_StartIndex); }

        }
        dbg.location(635, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "table_name");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "table_name"



    // $ANTLR start "join_specification"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:652:1: join_specification : ( join_condition | named_columns_join );
    public final void join_specification() throws RecognitionException {
        int join_specification_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "join_specification");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(652, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 73) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:652:21: ( join_condition | named_columns_join )
            int alt64=2;
            try { dbg.enterDecision(64, decisionCanBacktrack[64]);

            int LA64_0 = input.LA(1);

            if ( (LA64_0==102) ) {
                alt64=1;
            }
            else if ( (LA64_0==132) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(64);}

            switch (alt64) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:652:24: join_condition
                    {
                    dbg.location(652,24);
                    pushFollow(FOLLOW_join_condition_in_join_specification2499);
                    join_condition();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:652:42: named_columns_join
                    {
                    dbg.location(652,42);
                    pushFollow(FOLLOW_named_columns_join_in_join_specification2504);
                    named_columns_join();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 73, join_specification_StartIndex); }

        }
        dbg.location(652, 60);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "join_specification");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "join_specification"



    // $ANTLR start "join_condition"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:654:1: join_condition : 'ON' search_condition ;
    public final void join_condition() throws RecognitionException {
        int join_condition_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "join_condition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(654, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 74) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:654:19: ( 'ON' search_condition )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:654:22: 'ON' search_condition
            {
            dbg.location(654,22);
            match(input,102,FOLLOW_102_in_join_condition2517); if (state.failed) return ;
            dbg.location(654,27);
            if ( state.backtracking==0 ) {System.out.print(" ON ");}
            dbg.location(654,55);
            pushFollow(FOLLOW_search_condition_in_join_condition2521);
            search_condition();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 74, join_condition_StartIndex); }

        }
        dbg.location(654, 71);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "join_condition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "join_condition"



    // $ANTLR start "named_columns_join"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:656:1: named_columns_join : 'USING' Left_Paren join_column_list Right_Paren ;
    public final void named_columns_join() throws RecognitionException {
        int named_columns_join_StartIndex = input.index();

        Token Left_Paren13=null;
        Token Right_Paren14=null;

        try { dbg.enterRule(getGrammarFileName(), "named_columns_join");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(656, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 75) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:656:21: ( 'USING' Left_Paren join_column_list Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:656:24: 'USING' Left_Paren join_column_list Right_Paren
            {
            dbg.location(656,24);
            match(input,132,FOLLOW_132_in_named_columns_join2532); if (state.failed) return ;
            dbg.location(656,32);
            if ( state.backtracking==0 ) {System.out.print(" USING ");}
            dbg.location(656,63);
            Left_Paren13=(Token)match(input,Left_Paren,FOLLOW_Left_Paren_in_named_columns_join2536); if (state.failed) return ;
            dbg.location(656,74);
            if ( state.backtracking==0 ) {System.out.print((Left_Paren13!=null?Left_Paren13.getText():null));}
            dbg.location(656,112);
            pushFollow(FOLLOW_join_column_list_in_named_columns_join2540);
            join_column_list();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(656,130);
            Right_Paren14=(Token)match(input,Right_Paren,FOLLOW_Right_Paren_in_named_columns_join2543); if (state.failed) return ;
            dbg.location(656,142);
            if ( state.backtracking==0 ) {System.out.print((Right_Paren14!=null?Right_Paren14.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 75, named_columns_join_StartIndex); }

        }
        dbg.location(656, 179);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "named_columns_join");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "named_columns_join"



    // $ANTLR start "join_type"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:658:1: join_type : ( 'INNER' | outer_join_type ( 'OUTER' )? );
    public final void join_type() throws RecognitionException {
        int join_type_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "join_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(658, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 76) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:658:15: ( 'INNER' | outer_join_type ( 'OUTER' )? )
            int alt66=2;
            try { dbg.enterDecision(66, decisionCanBacktrack[66]);

            int LA66_0 = input.LA(1);

            if ( (LA66_0==82) ) {
                alt66=1;
            }
            else if ( (LA66_0==75||LA66_0==90||LA66_0==112) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(66);}

            switch (alt66) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:658:18: 'INNER'
                    {
                    dbg.location(658,18);
                    match(input,82,FOLLOW_82_in_join_type2558); if (state.failed) return ;
                    dbg.location(658,26);
                    if ( state.backtracking==0 ) {System.out.print(" INNER ");}

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:658:59: outer_join_type ( 'OUTER' )?
                    {
                    dbg.location(658,59);
                    pushFollow(FOLLOW_outer_join_type_in_join_type2564);
                    outer_join_type();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(658,76);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:658:76: ( 'OUTER' )?
                    int alt65=2;
                    try { dbg.enterSubRule(65);
                    try { dbg.enterDecision(65, decisionCanBacktrack[65]);

                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==107) ) {
                        alt65=1;
                    }
                    } finally {dbg.exitDecision(65);}

                    switch (alt65) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:658:78: 'OUTER'
                            {
                            dbg.location(658,78);
                            match(input,107,FOLLOW_107_in_join_type2569); if (state.failed) return ;
                            dbg.location(658,86);
                            if ( state.backtracking==0 ) {System.out.print("OUTER ");}

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(65);}


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 76, join_type_StartIndex); }

        }
        dbg.location(658, 117);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "join_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "join_type"



    // $ANTLR start "outer_join_type"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:660:1: outer_join_type : ( 'LEFT' | 'RIGHT' | 'FULL' );
    public final void outer_join_type() throws RecognitionException {
        int outer_join_type_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "outer_join_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(660, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 77) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:660:20: ( 'LEFT' | 'RIGHT' | 'FULL' )
            int alt67=3;
            try { dbg.enterDecision(67, decisionCanBacktrack[67]);

            switch ( input.LA(1) ) {
            case 90:
                {
                alt67=1;
                }
                break;
            case 112:
                {
                alt67=2;
                }
                break;
            case 75:
                {
                alt67=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(67);}

            switch (alt67) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:660:23: 'LEFT'
                    {
                    dbg.location(660,23);
                    match(input,90,FOLLOW_90_in_outer_join_type2586); if (state.failed) return ;
                    dbg.location(660,30);
                    if ( state.backtracking==0 ) {System.out.print(" LEFT ");}

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:660:62: 'RIGHT'
                    {
                    dbg.location(660,62);
                    match(input,112,FOLLOW_112_in_outer_join_type2592); if (state.failed) return ;
                    dbg.location(660,70);
                    if ( state.backtracking==0 ) {System.out.print(" RIGHT ");}

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:660:103: 'FULL'
                    {
                    dbg.location(660,103);
                    match(input,75,FOLLOW_75_in_outer_join_type2598); if (state.failed) return ;
                    dbg.location(660,110);
                    if ( state.backtracking==0 ) {System.out.print(" FULL ");}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 77, outer_join_type_StartIndex); }

        }
        dbg.location(660, 138);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "outer_join_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "outer_join_type"



    // $ANTLR start "join_column_list"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:662:1: join_column_list : column_name_list ;
    public final void join_column_list() throws RecognitionException {
        int join_column_list_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "join_column_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(662, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 78) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:662:21: ( column_name_list )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:662:24: column_name_list
            {
            dbg.location(662,24);
            pushFollow(FOLLOW_column_name_list_in_join_column_list2612);
            column_name_list();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 78, join_column_list_StartIndex); }

        }
        dbg.location(662, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "join_column_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "join_column_list"



    // $ANTLR start "column_name_list"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:666:1: column_name_list options {k=1; } : identifier ( Comma identifier )* ;
    public final void column_name_list() throws RecognitionException {
        int column_name_list_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "column_name_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(666, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 79) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:668:2: ( identifier ( Comma identifier )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:668:5: identifier ( Comma identifier )*
            {
            dbg.location(668,5);
            pushFollow(FOLLOW_identifier_in_column_name_list2636);
            identifier();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(668,17);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:668:17: ( Comma identifier )*
            try { dbg.enterSubRule(68);

            loop68:
            do {
                int alt68=2;
                try { dbg.enterDecision(68, decisionCanBacktrack[68]);

                int LA68_0 = input.LA(1);

                if ( (LA68_0==Comma) ) {
                    alt68=1;
                }


                } finally {dbg.exitDecision(68);}

                switch (alt68) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:668:19: Comma identifier
            	    {
            	    dbg.location(668,19);
            	    match(input,Comma,FOLLOW_Comma_in_column_name_list2641); if (state.failed) return ;
            	    dbg.location(668,25);
            	    pushFollow(FOLLOW_identifier_in_column_name_list2643);
            	    identifier();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);
            } finally {dbg.exitSubRule(68);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 79, column_name_list_StartIndex); }

        }
        dbg.location(668, 38);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "column_name_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "column_name_list"



    // $ANTLR start "unsigned_value_specification"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:671:1: unsigned_value_specification options {k=1; } : ( date_literal | col_literal | Unsigned_Integer | general_value_specification );
    public final void unsigned_value_specification() throws RecognitionException {
        int unsigned_value_specification_StartIndex = input.index();

        Token Unsigned_Integer15=null;

        try { dbg.enterRule(getGrammarFileName(), "unsigned_value_specification");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(671, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 80) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:673:2: ( date_literal | col_literal | Unsigned_Integer | general_value_specification )
            int alt69=4;
            try { dbg.enterDecision(69, decisionCanBacktrack[69]);

            int LA69_0 = input.LA(1);

            if ( (LA69_0==Unsigned_Integer) ) {
                int LA69_1 = input.LA(2);

                if ( (synpred91_psqlgrammar()) ) {
                    alt69=1;
                }
                else if ( (synpred93_psqlgrammar()) ) {
                    alt69=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA69_0==Regular_Identifier) ) {
                int LA69_4 = input.LA(2);

                if ( (synpred92_psqlgrammar()) ) {
                    alt69=2;
                }
                else if ( (true) ) {
                    alt69=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(69);}

            switch (alt69) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:673:4: date_literal
                    {
                    dbg.location(673,4);
                    pushFollow(FOLLOW_date_literal_in_unsigned_value_specification2665);
                    date_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:674:4: col_literal
                    {
                    dbg.location(674,4);
                    pushFollow(FOLLOW_col_literal_in_unsigned_value_specification2670);
                    col_literal();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:675:4: Unsigned_Integer
                    {
                    dbg.location(675,4);
                    Unsigned_Integer15=(Token)match(input,Unsigned_Integer,FOLLOW_Unsigned_Integer_in_unsigned_value_specification2675); if (state.failed) return ;
                    dbg.location(675,21);
                    if ( state.backtracking==0 ) {System.out.print((Unsigned_Integer15!=null?Unsigned_Integer15.getText():null));}

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:676:4: general_value_specification
                    {
                    dbg.location(676,4);
                    pushFollow(FOLLOW_general_value_specification_in_unsigned_value_specification2682);
                    general_value_specification();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 80, unsigned_value_specification_StartIndex); }

        }
        dbg.location(676, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "unsigned_value_specification");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "unsigned_value_specification"



    // $ANTLR start "general_value_specification"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:678:1: general_value_specification options {k=1; } : identifier_chain ;
    public final void general_value_specification() throws RecognitionException {
        int general_value_specification_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "general_value_specification");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(678, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 81) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:681:2: ( identifier_chain )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:681:3: identifier_chain
            {
            dbg.location(681,3);
            pushFollow(FOLLOW_identifier_chain_in_general_value_specification2702);
            identifier_chain();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 81, general_value_specification_StartIndex); }

        }
        dbg.location(681, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "general_value_specification");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "general_value_specification"



    // $ANTLR start "identifier_chain"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:685:1: identifier_chain : identifier ( Period identifier )* ;
    public final void identifier_chain() throws RecognitionException {
        int identifier_chain_StartIndex = input.index();

        Token Period16=null;

        try { dbg.enterRule(getGrammarFileName(), "identifier_chain");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(685, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 82) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:686:22: ( identifier ( Period identifier )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:686:25: identifier ( Period identifier )*
            {
            dbg.location(686,25);
            pushFollow(FOLLOW_identifier_in_identifier_chain2743);
            identifier();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(686,37);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:686:37: ( Period identifier )*
            try { dbg.enterSubRule(70);

            loop70:
            do {
                int alt70=2;
                try { dbg.enterDecision(70, decisionCanBacktrack[70]);

                int LA70_0 = input.LA(1);

                if ( (LA70_0==Period) ) {
                    int LA70_2 = input.LA(2);

                    if ( (LA70_2==Regular_Identifier) ) {
                        int LA70_3 = input.LA(3);

                        if ( (synpred94_psqlgrammar()) ) {
                            alt70=1;
                        }


                    }


                }


                } finally {dbg.exitDecision(70);}

                switch (alt70) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:686:39: Period identifier
            	    {
            	    dbg.location(686,39);
            	    Period16=(Token)match(input,Period,FOLLOW_Period_in_identifier_chain2748); if (state.failed) return ;
            	    dbg.location(686,46);
            	    if ( state.backtracking==0 ) {System.out.print((Period16!=null?Period16.getText():null));}
            	    dbg.location(686,81);
            	    pushFollow(FOLLOW_identifier_in_identifier_chain2753);
            	    identifier();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);
            } finally {dbg.exitSubRule(70);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 82, identifier_chain_StartIndex); }

        }
        dbg.location(686, 94);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "identifier_chain");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "identifier_chain"



    // $ANTLR start "identifier"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:695:1: identifier options {k=1; } : Regular_Identifier ;
    public final void identifier() throws RecognitionException {
        int identifier_StartIndex = input.index();

        Token Regular_Identifier17=null;

        try { dbg.enterRule(getGrammarFileName(), "identifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(695, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 83) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:697:20: ( Regular_Identifier )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:697:27: Regular_Identifier
            {
            dbg.location(697,27);
            Regular_Identifier17=(Token)match(input,Regular_Identifier,FOLLOW_Regular_Identifier_in_identifier2878); if (state.failed) return ;
            dbg.location(697,46);
            if ( state.backtracking==0 ) {System.out.print( (Regular_Identifier17!=null?Regular_Identifier17.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 83, identifier_StartIndex); }

        }
        dbg.location(697, 91);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "identifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "identifier"



    // $ANTLR start "where_clause"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:734:1: where_clause : 'WHERE' search_condition ;
    public final void where_clause() throws RecognitionException {
        int where_clause_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "where_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(734, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 84) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:734:16: ( 'WHERE' search_condition )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:734:19: 'WHERE' search_condition
            {
            dbg.location(734,19);
            if ( state.backtracking==0 ) {System.out.print(" ");}
            dbg.location(734,44);
            match(input,135,FOLLOW_135_in_where_clause2904); if (state.failed) return ;
            dbg.location(734,52);
            if ( state.backtracking==0 ) {System.out.print("WHERE ");}
            dbg.location(734,82);
            pushFollow(FOLLOW_search_condition_in_where_clause2908);
            search_condition();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 84, where_clause_StartIndex); }

        }
        dbg.location(734, 98);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "where_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "where_clause"



    // $ANTLR start "group_by_clause"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:744:1: group_by_clause : 'GROUP' 'BY' ( set_quantifier )? grouping_element_list ;
    public final void group_by_clause() throws RecognitionException {
        int group_by_clause_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "group_by_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(744, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 85) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:744:19: ( 'GROUP' 'BY' ( set_quantifier )? grouping_element_list )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:744:22: 'GROUP' 'BY' ( set_quantifier )? grouping_element_list
            {
            dbg.location(744,22);
            match(input,77,FOLLOW_77_in_group_by_clause2923); if (state.failed) return ;
            dbg.location(744,30);
            match(input,55,FOLLOW_55_in_group_by_clause2925); if (state.failed) return ;
            dbg.location(744,35);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:744:35: ( set_quantifier )?
            int alt71=2;
            try { dbg.enterSubRule(71);
            try { dbg.enterDecision(71, decisionCanBacktrack[71]);

            int LA71_0 = input.LA(1);

            if ( (LA71_0==46||LA71_0==65) ) {
                alt71=1;
            }
            } finally {dbg.exitDecision(71);}

            switch (alt71) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:744:37: set_quantifier
                    {
                    dbg.location(744,37);
                    pushFollow(FOLLOW_set_quantifier_in_group_by_clause2929);
                    set_quantifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(71);}

            dbg.location(744,56);
            pushFollow(FOLLOW_grouping_element_list_in_group_by_clause2935);
            grouping_element_list();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 85, group_by_clause_StartIndex); }

        }
        dbg.location(744, 77);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "group_by_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "group_by_clause"



    // $ANTLR start "grouping_element_list"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:746:1: grouping_element_list : grouping_element ( Comma grouping_element )* ;
    public final void grouping_element_list() throws RecognitionException {
        int grouping_element_list_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "grouping_element_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(746, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 86) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:746:25: ( grouping_element ( Comma grouping_element )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:746:28: grouping_element ( Comma grouping_element )*
            {
            dbg.location(746,28);
            pushFollow(FOLLOW_grouping_element_in_grouping_element_list2947);
            grouping_element();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(746,46);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:746:46: ( Comma grouping_element )*
            try { dbg.enterSubRule(72);

            loop72:
            do {
                int alt72=2;
                try { dbg.enterDecision(72, decisionCanBacktrack[72]);

                int LA72_0 = input.LA(1);

                if ( (LA72_0==Comma) ) {
                    alt72=1;
                }


                } finally {dbg.exitDecision(72);}

                switch (alt72) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:746:48: Comma grouping_element
            	    {
            	    dbg.location(746,48);
            	    match(input,Comma,FOLLOW_Comma_in_grouping_element_list2952); if (state.failed) return ;
            	    dbg.location(746,54);
            	    pushFollow(FOLLOW_grouping_element_in_grouping_element_list2954);
            	    grouping_element();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);
            } finally {dbg.exitSubRule(72);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 86, grouping_element_list_StartIndex); }

        }
        dbg.location(746, 73);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "grouping_element_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "grouping_element_list"



    // $ANTLR start "grouping_element"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:748:1: grouping_element : ( ordinary_grouping_set | rollup_list | cube_list | grouping_sets_specification | empty_grouping_set );
    public final void grouping_element() throws RecognitionException {
        int grouping_element_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "grouping_element");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(748, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 87) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:748:19: ( ordinary_grouping_set | rollup_list | cube_list | grouping_sets_specification | empty_grouping_set )
            int alt73=5;
            try { dbg.enterDecision(73, decisionCanBacktrack[73]);

            switch ( input.LA(1) ) {
            case Regular_Identifier:
            case 98:
                {
                alt73=1;
                }
                break;
            case Left_Paren:
                {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==Right_Paren) ) {
                    alt73=5;
                }
                else if ( (LA73_2==Regular_Identifier||LA73_2==98) ) {
                    alt73=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 113:
                {
                alt73=2;
                }
                break;
            case 63:
                {
                alt73=3;
                }
                break;
            case 78:
                {
                alt73=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(73);}

            switch (alt73) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:749:3: ordinary_grouping_set
                    {
                    dbg.location(749,3);
                    pushFollow(FOLLOW_ordinary_grouping_set_in_grouping_element2969);
                    ordinary_grouping_set();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:750:4: rollup_list
                    {
                    dbg.location(750,4);
                    pushFollow(FOLLOW_rollup_list_in_grouping_element2974);
                    rollup_list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:751:4: cube_list
                    {
                    dbg.location(751,4);
                    pushFollow(FOLLOW_cube_list_in_grouping_element2979);
                    cube_list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:752:4: grouping_sets_specification
                    {
                    dbg.location(752,4);
                    pushFollow(FOLLOW_grouping_sets_specification_in_grouping_element2984);
                    grouping_sets_specification();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:753:4: empty_grouping_set
                    {
                    dbg.location(753,4);
                    pushFollow(FOLLOW_empty_grouping_set_in_grouping_element2989);
                    empty_grouping_set();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 87, grouping_element_StartIndex); }

        }
        dbg.location(754, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "grouping_element");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "grouping_element"



    // $ANTLR start "ordinary_grouping_set"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:756:1: ordinary_grouping_set : ( grouping_column_reference | Left_Paren grouping_column_reference_list Right_Paren );
    public final void ordinary_grouping_set() throws RecognitionException {
        int ordinary_grouping_set_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "ordinary_grouping_set");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(756, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 88) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:756:24: ( grouping_column_reference | Left_Paren grouping_column_reference_list Right_Paren )
            int alt74=2;
            try { dbg.enterDecision(74, decisionCanBacktrack[74]);

            int LA74_0 = input.LA(1);

            if ( (LA74_0==Regular_Identifier||LA74_0==98) ) {
                alt74=1;
            }
            else if ( (LA74_0==Left_Paren) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(74);}

            switch (alt74) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:757:3: grouping_column_reference
                    {
                    dbg.location(757,3);
                    pushFollow(FOLLOW_grouping_column_reference_in_ordinary_grouping_set3002);
                    grouping_column_reference();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:758:4: Left_Paren grouping_column_reference_list Right_Paren
                    {
                    dbg.location(758,4);
                    match(input,Left_Paren,FOLLOW_Left_Paren_in_ordinary_grouping_set3007); if (state.failed) return ;
                    dbg.location(758,15);
                    pushFollow(FOLLOW_grouping_column_reference_list_in_ordinary_grouping_set3009);
                    grouping_column_reference_list();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(758,47);
                    match(input,Right_Paren,FOLLOW_Right_Paren_in_ordinary_grouping_set3012); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 88, ordinary_grouping_set_StartIndex); }

        }
        dbg.location(759, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ordinary_grouping_set");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ordinary_grouping_set"



    // $ANTLR start "grouping_column_reference"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:761:1: grouping_column_reference : column_reference ( collate_clause )? ;
    public final void grouping_column_reference() throws RecognitionException {
        int grouping_column_reference_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "grouping_column_reference");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(761, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 89) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:761:29: ( column_reference ( collate_clause )? )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:761:32: column_reference ( collate_clause )?
            {
            dbg.location(761,32);
            pushFollow(FOLLOW_column_reference_in_grouping_column_reference3025);
            column_reference();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(761,50);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:761:50: ( collate_clause )?
            int alt75=2;
            try { dbg.enterSubRule(75);
            try { dbg.enterDecision(75, decisionCanBacktrack[75]);

            int LA75_0 = input.LA(1);

            if ( (LA75_0==59) ) {
                alt75=1;
            }
            } finally {dbg.exitDecision(75);}

            switch (alt75) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:761:52: collate_clause
                    {
                    dbg.location(761,52);
                    pushFollow(FOLLOW_collate_clause_in_grouping_column_reference3030);
                    collate_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(75);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 89, grouping_column_reference_StartIndex); }

        }
        dbg.location(761, 69);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "grouping_column_reference");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "grouping_column_reference"



    // $ANTLR start "grouping_column_reference_list"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:763:1: grouping_column_reference_list : grouping_column_reference ( Comma grouping_column_reference )* ;
    public final void grouping_column_reference_list() throws RecognitionException {
        int grouping_column_reference_list_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "grouping_column_reference_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(763, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 90) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:763:34: ( grouping_column_reference ( Comma grouping_column_reference )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:763:37: grouping_column_reference ( Comma grouping_column_reference )*
            {
            dbg.location(763,37);
            pushFollow(FOLLOW_grouping_column_reference_in_grouping_column_reference_list3045);
            grouping_column_reference();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(763,64);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:763:64: ( Comma grouping_column_reference )*
            try { dbg.enterSubRule(76);

            loop76:
            do {
                int alt76=2;
                try { dbg.enterDecision(76, decisionCanBacktrack[76]);

                int LA76_0 = input.LA(1);

                if ( (LA76_0==Comma) ) {
                    alt76=1;
                }


                } finally {dbg.exitDecision(76);}

                switch (alt76) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:763:66: Comma grouping_column_reference
            	    {
            	    dbg.location(763,66);
            	    match(input,Comma,FOLLOW_Comma_in_grouping_column_reference_list3050); if (state.failed) return ;
            	    dbg.location(763,72);
            	    pushFollow(FOLLOW_grouping_column_reference_in_grouping_column_reference_list3052);
            	    grouping_column_reference();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);
            } finally {dbg.exitSubRule(76);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 90, grouping_column_reference_list_StartIndex); }

        }
        dbg.location(763, 100);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "grouping_column_reference_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "grouping_column_reference_list"



    // $ANTLR start "rollup_list"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:765:1: rollup_list : 'ROLLUP' Left_Paren ordinary_grouping_set_list Right_Paren ;
    public final void rollup_list() throws RecognitionException {
        int rollup_list_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "rollup_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(765, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 91) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:765:15: ( 'ROLLUP' Left_Paren ordinary_grouping_set_list Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:765:18: 'ROLLUP' Left_Paren ordinary_grouping_set_list Right_Paren
            {
            dbg.location(765,18);
            match(input,113,FOLLOW_113_in_rollup_list3067); if (state.failed) return ;
            dbg.location(765,27);
            match(input,Left_Paren,FOLLOW_Left_Paren_in_rollup_list3069); if (state.failed) return ;
            dbg.location(765,38);
            pushFollow(FOLLOW_ordinary_grouping_set_list_in_rollup_list3071);
            ordinary_grouping_set_list();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(765,66);
            match(input,Right_Paren,FOLLOW_Right_Paren_in_rollup_list3074); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 91, rollup_list_StartIndex); }

        }
        dbg.location(765, 76);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "rollup_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "rollup_list"



    // $ANTLR start "ordinary_grouping_set_list"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:767:1: ordinary_grouping_set_list : ordinary_grouping_set ( Comma ordinary_grouping_set )* ;
    public final void ordinary_grouping_set_list() throws RecognitionException {
        int ordinary_grouping_set_list_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "ordinary_grouping_set_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(767, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 92) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:767:30: ( ordinary_grouping_set ( Comma ordinary_grouping_set )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:767:33: ordinary_grouping_set ( Comma ordinary_grouping_set )*
            {
            dbg.location(767,33);
            pushFollow(FOLLOW_ordinary_grouping_set_in_ordinary_grouping_set_list3085);
            ordinary_grouping_set();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(767,56);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:767:56: ( Comma ordinary_grouping_set )*
            try { dbg.enterSubRule(77);

            loop77:
            do {
                int alt77=2;
                try { dbg.enterDecision(77, decisionCanBacktrack[77]);

                int LA77_0 = input.LA(1);

                if ( (LA77_0==Comma) ) {
                    alt77=1;
                }


                } finally {dbg.exitDecision(77);}

                switch (alt77) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:767:58: Comma ordinary_grouping_set
            	    {
            	    dbg.location(767,58);
            	    match(input,Comma,FOLLOW_Comma_in_ordinary_grouping_set_list3090); if (state.failed) return ;
            	    dbg.location(767,64);
            	    pushFollow(FOLLOW_ordinary_grouping_set_in_ordinary_grouping_set_list3092);
            	    ordinary_grouping_set();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);
            } finally {dbg.exitSubRule(77);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 92, ordinary_grouping_set_list_StartIndex); }

        }
        dbg.location(767, 88);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ordinary_grouping_set_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ordinary_grouping_set_list"



    // $ANTLR start "cube_list"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:769:1: cube_list : 'CUBE' Left_Paren ordinary_grouping_set_list Right_Paren ;
    public final void cube_list() throws RecognitionException {
        int cube_list_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "cube_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(769, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 93) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:769:13: ( 'CUBE' Left_Paren ordinary_grouping_set_list Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:769:16: 'CUBE' Left_Paren ordinary_grouping_set_list Right_Paren
            {
            dbg.location(769,16);
            match(input,63,FOLLOW_63_in_cube_list3107); if (state.failed) return ;
            dbg.location(769,23);
            match(input,Left_Paren,FOLLOW_Left_Paren_in_cube_list3109); if (state.failed) return ;
            dbg.location(769,34);
            pushFollow(FOLLOW_ordinary_grouping_set_list_in_cube_list3111);
            ordinary_grouping_set_list();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(769,62);
            match(input,Right_Paren,FOLLOW_Right_Paren_in_cube_list3114); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 93, cube_list_StartIndex); }

        }
        dbg.location(769, 72);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cube_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cube_list"



    // $ANTLR start "grouping_sets_specification"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:771:1: grouping_sets_specification : 'GROUPING' 'SETS' Left_Paren grouping_set_list Right_Paren ;
    public final void grouping_sets_specification() throws RecognitionException {
        int grouping_sets_specification_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "grouping_sets_specification");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(771, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 94) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:771:31: ( 'GROUPING' 'SETS' Left_Paren grouping_set_list Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:771:34: 'GROUPING' 'SETS' Left_Paren grouping_set_list Right_Paren
            {
            dbg.location(771,34);
            match(input,78,FOLLOW_78_in_grouping_sets_specification3125); if (state.failed) return ;
            dbg.location(771,45);
            match(input,116,FOLLOW_116_in_grouping_sets_specification3127); if (state.failed) return ;
            dbg.location(771,52);
            match(input,Left_Paren,FOLLOW_Left_Paren_in_grouping_sets_specification3129); if (state.failed) return ;
            dbg.location(771,63);
            pushFollow(FOLLOW_grouping_set_list_in_grouping_sets_specification3131);
            grouping_set_list();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(771,82);
            match(input,Right_Paren,FOLLOW_Right_Paren_in_grouping_sets_specification3134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 94, grouping_sets_specification_StartIndex); }

        }
        dbg.location(771, 92);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "grouping_sets_specification");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "grouping_sets_specification"



    // $ANTLR start "grouping_set_list"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:773:1: grouping_set_list : grouping_set ( Comma grouping_set )* ;
    public final void grouping_set_list() throws RecognitionException {
        int grouping_set_list_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "grouping_set_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(773, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 95) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:773:21: ( grouping_set ( Comma grouping_set )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:773:24: grouping_set ( Comma grouping_set )*
            {
            dbg.location(773,24);
            pushFollow(FOLLOW_grouping_set_in_grouping_set_list3145);
            grouping_set();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(773,38);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:773:38: ( Comma grouping_set )*
            try { dbg.enterSubRule(78);

            loop78:
            do {
                int alt78=2;
                try { dbg.enterDecision(78, decisionCanBacktrack[78]);

                int LA78_0 = input.LA(1);

                if ( (LA78_0==Comma) ) {
                    alt78=1;
                }


                } finally {dbg.exitDecision(78);}

                switch (alt78) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:773:40: Comma grouping_set
            	    {
            	    dbg.location(773,40);
            	    match(input,Comma,FOLLOW_Comma_in_grouping_set_list3150); if (state.failed) return ;
            	    dbg.location(773,46);
            	    pushFollow(FOLLOW_grouping_set_in_grouping_set_list3152);
            	    grouping_set();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);
            } finally {dbg.exitSubRule(78);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 95, grouping_set_list_StartIndex); }

        }
        dbg.location(773, 61);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "grouping_set_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "grouping_set_list"



    // $ANTLR start "grouping_set"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:775:1: grouping_set : ( ordinary_grouping_set | rollup_list | cube_list | grouping_sets_specification | empty_grouping_set );
    public final void grouping_set() throws RecognitionException {
        int grouping_set_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "grouping_set");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(775, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 96) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:775:15: ( ordinary_grouping_set | rollup_list | cube_list | grouping_sets_specification | empty_grouping_set )
            int alt79=5;
            try { dbg.enterDecision(79, decisionCanBacktrack[79]);

            switch ( input.LA(1) ) {
            case Regular_Identifier:
            case 98:
                {
                alt79=1;
                }
                break;
            case Left_Paren:
                {
                int LA79_2 = input.LA(2);

                if ( (LA79_2==Right_Paren) ) {
                    alt79=5;
                }
                else if ( (LA79_2==Regular_Identifier||LA79_2==98) ) {
                    alt79=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 113:
                {
                alt79=2;
                }
                break;
            case 63:
                {
                alt79=3;
                }
                break;
            case 78:
                {
                alt79=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(79);}

            switch (alt79) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:776:3: ordinary_grouping_set
                    {
                    dbg.location(776,3);
                    pushFollow(FOLLOW_ordinary_grouping_set_in_grouping_set3167);
                    ordinary_grouping_set();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:777:4: rollup_list
                    {
                    dbg.location(777,4);
                    pushFollow(FOLLOW_rollup_list_in_grouping_set3172);
                    rollup_list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:778:4: cube_list
                    {
                    dbg.location(778,4);
                    pushFollow(FOLLOW_cube_list_in_grouping_set3177);
                    cube_list();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:779:4: grouping_sets_specification
                    {
                    dbg.location(779,4);
                    pushFollow(FOLLOW_grouping_sets_specification_in_grouping_set3182);
                    grouping_sets_specification();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:780:4: empty_grouping_set
                    {
                    dbg.location(780,4);
                    pushFollow(FOLLOW_empty_grouping_set_in_grouping_set3187);
                    empty_grouping_set();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 96, grouping_set_StartIndex); }

        }
        dbg.location(781, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "grouping_set");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "grouping_set"



    // $ANTLR start "empty_grouping_set"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:783:1: empty_grouping_set : Left_Paren Right_Paren ;
    public final void empty_grouping_set() throws RecognitionException {
        int empty_grouping_set_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "empty_grouping_set");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(783, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 97) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:783:22: ( Left_Paren Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:783:25: Left_Paren Right_Paren
            {
            dbg.location(783,25);
            match(input,Left_Paren,FOLLOW_Left_Paren_in_empty_grouping_set3200); if (state.failed) return ;
            dbg.location(783,36);
            match(input,Right_Paren,FOLLOW_Right_Paren_in_empty_grouping_set3202); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 97, empty_grouping_set_StartIndex); }

        }
        dbg.location(783, 46);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "empty_grouping_set");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "empty_grouping_set"



    // $ANTLR start "having_clause"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:792:1: having_clause : 'HAVING' search_condition ;
    public final void having_clause() throws RecognitionException {
        int having_clause_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "having_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(792, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 98) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:792:17: ( 'HAVING' search_condition )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:792:20: 'HAVING' search_condition
            {
            dbg.location(792,20);
            match(input,79,FOLLOW_79_in_having_clause3216); if (state.failed) return ;
            dbg.location(792,29);
            pushFollow(FOLLOW_search_condition_in_having_clause3218);
            search_condition();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 98, having_clause_StartIndex); }

        }
        dbg.location(792, 45);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "having_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "having_clause"



    // $ANTLR start "search_condition"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:797:1: search_condition : boolean_value_expression ;
    public final void search_condition() throws RecognitionException {
        int search_condition_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "search_condition");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(797, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 99) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:797:20: ( boolean_value_expression )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:797:23: boolean_value_expression
            {
            dbg.location(797,23);
            pushFollow(FOLLOW_boolean_value_expression_in_search_condition3233);
            boolean_value_expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 99, search_condition_StartIndex); }

        }
        dbg.location(797, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "search_condition");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "search_condition"



    // $ANTLR start "boolean_value_expression"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:802:1: boolean_value_expression options {k=1; } : boolean_term ( 'OR' boolean_term )* ;
    public final void boolean_value_expression() throws RecognitionException {
        int boolean_value_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "boolean_value_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(802, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 100) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:804:2: ( boolean_term ( 'OR' boolean_term )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:804:4: boolean_term ( 'OR' boolean_term )*
            {
            dbg.location(804,4);
            pushFollow(FOLLOW_boolean_term_in_boolean_value_expression3254);
            boolean_term();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(804,17);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:804:17: ( 'OR' boolean_term )*
            try { dbg.enterSubRule(80);

            loop80:
            do {
                int alt80=2;
                try { dbg.enterDecision(80, decisionCanBacktrack[80]);

                int LA80_0 = input.LA(1);

                if ( (LA80_0==104) ) {
                    alt80=1;
                }


                } finally {dbg.exitDecision(80);}

                switch (alt80) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:804:19: 'OR' boolean_term
            	    {
            	    dbg.location(804,19);
            	    match(input,104,FOLLOW_104_in_boolean_value_expression3258); if (state.failed) return ;
            	    dbg.location(804,24);
            	    if ( state.backtracking==0 ) {System.out.print(" " + "OR" + " ");}
            	    dbg.location(804,62);
            	    pushFollow(FOLLOW_boolean_term_in_boolean_value_expression3262);
            	    boolean_term();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);
            } finally {dbg.exitSubRule(80);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 100, boolean_value_expression_StartIndex); }

        }
        dbg.location(805, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "boolean_value_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "boolean_value_expression"



    // $ANTLR start "boolean_term"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:807:1: boolean_term options {k=1; } : boolean_factor ( 'AND' boolean_factor )* ;
    public final void boolean_term() throws RecognitionException {
        int boolean_term_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "boolean_term");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(807, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 101) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:809:2: ( boolean_factor ( 'AND' boolean_factor )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:809:4: boolean_factor ( 'AND' boolean_factor )*
            {
            dbg.location(809,4);
            pushFollow(FOLLOW_boolean_factor_in_boolean_term3285);
            boolean_factor();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(809,19);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:809:19: ( 'AND' boolean_factor )*
            try { dbg.enterSubRule(81);

            loop81:
            do {
                int alt81=2;
                try { dbg.enterDecision(81, decisionCanBacktrack[81]);

                int LA81_0 = input.LA(1);

                if ( (LA81_0==47) ) {
                    alt81=1;
                }


                } finally {dbg.exitDecision(81);}

                switch (alt81) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:809:21: 'AND' boolean_factor
            	    {
            	    dbg.location(809,21);
            	    match(input,47,FOLLOW_47_in_boolean_term3289); if (state.failed) return ;
            	    dbg.location(809,27);
            	    if ( state.backtracking==0 ) {System.out.print(" " + "AND" + " ");}
            	    dbg.location(809,66);
            	    pushFollow(FOLLOW_boolean_factor_in_boolean_term3293);
            	    boolean_factor();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);
            } finally {dbg.exitSubRule(81);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 101, boolean_term_StartIndex); }

        }
        dbg.location(810, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "boolean_term");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "boolean_term"



    // $ANTLR start "boolean_factor"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:812:1: boolean_factor options {k=1; } : ( 'NOT' )? boolean_test ;
    public final void boolean_factor() throws RecognitionException {
        int boolean_factor_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "boolean_factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(812, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 102) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:814:2: ( ( 'NOT' )? boolean_test )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:814:5: ( 'NOT' )? boolean_test
            {
            dbg.location(814,5);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:814:5: ( 'NOT' )?
            int alt82=2;
            try { dbg.enterSubRule(82);
            try { dbg.enterDecision(82, decisionCanBacktrack[82]);

            int LA82_0 = input.LA(1);

            if ( (LA82_0==NOT) ) {
                alt82=1;
            }
            } finally {dbg.exitDecision(82);}

            switch (alt82) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:814:7: 'NOT'
                    {
                    dbg.location(814,7);
                    match(input,NOT,FOLLOW_NOT_in_boolean_factor3318); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(82);}

            dbg.location(814,16);
            pushFollow(FOLLOW_boolean_test_in_boolean_factor3323);
            boolean_test();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 102, boolean_factor_StartIndex); }

        }
        dbg.location(814, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "boolean_factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "boolean_factor"



    // $ANTLR start "boolean_test"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:816:1: boolean_test options {k=1; } : boolean_primary ( 'IS' ( 'NOT' )? truth_value )? ;
    public final void boolean_test() throws RecognitionException {
        int boolean_test_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "boolean_test");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(816, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 103) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:818:2: ( boolean_primary ( 'IS' ( 'NOT' )? truth_value )? )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:818:5: boolean_primary ( 'IS' ( 'NOT' )? truth_value )?
            {
            dbg.location(818,5);
            pushFollow(FOLLOW_boolean_primary_in_boolean_test3342);
            boolean_primary();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(818,22);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:818:22: ( 'IS' ( 'NOT' )? truth_value )?
            int alt84=2;
            try { dbg.enterSubRule(84);
            try { dbg.enterDecision(84, decisionCanBacktrack[84]);

            int LA84_0 = input.LA(1);

            if ( (LA84_0==IS) ) {
                alt84=1;
            }
            } finally {dbg.exitDecision(84);}

            switch (alt84) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:818:24: 'IS' ( 'NOT' )? truth_value
                    {
                    dbg.location(818,24);
                    match(input,IS,FOLLOW_IS_in_boolean_test3347); if (state.failed) return ;
                    dbg.location(818,29);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:818:29: ( 'NOT' )?
                    int alt83=2;
                    try { dbg.enterSubRule(83);
                    try { dbg.enterDecision(83, decisionCanBacktrack[83]);

                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==NOT) ) {
                        alt83=1;
                    }
                    } finally {dbg.exitDecision(83);}

                    switch (alt83) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:818:31: 'NOT'
                            {
                            dbg.location(818,31);
                            match(input,NOT,FOLLOW_NOT_in_boolean_test3351); if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(83);}

                    dbg.location(818,40);
                    pushFollow(FOLLOW_truth_value_in_boolean_test3356);
                    truth_value();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(84);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 103, boolean_test_StartIndex); }

        }
        dbg.location(818, 54);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "boolean_test");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "boolean_test"



    // $ANTLR start "truth_value"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:820:1: truth_value : ( 'TRUE' | 'FALSE' | 'UNKNOWN' );
    public final void truth_value() throws RecognitionException {
        int truth_value_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "truth_value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(820, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 104) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:820:15: ( 'TRUE' | 'FALSE' | 'UNKNOWN' )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            dbg.location(820,15);
            if ( input.LA(1)==70||input.LA(1)==128||input.LA(1)==130 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 104, truth_value_StartIndex); }

        }
        dbg.location(820, 45);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "truth_value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "truth_value"



    // $ANTLR start "boolean_primary"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:829:1: boolean_primary options {k=1; } : ( predicate | boolean_predicand );
    public final void boolean_primary() throws RecognitionException {
        int boolean_primary_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "boolean_primary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(829, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 105) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:831:2: ( predicate | boolean_predicand )
            int alt85=2;
            try { dbg.enterDecision(85, decisionCanBacktrack[85]);

            int LA85_0 = input.LA(1);

            if ( (LA85_0==Left_Paren||LA85_0==Regular_Identifier||LA85_0==Unsigned_Integer||LA85_0==48||LA85_0==52||(LA85_0 >= 60 && LA85_0 <= 61)||LA85_0==67||LA85_0==76||LA85_0==78||LA85_0==84||(LA85_0 >= 96 && LA85_0 <= 97)||(LA85_0 >= 118 && LA85_0 <= 120)||LA85_0==122||(LA85_0 >= 133 && LA85_0 <= 134)) ) {
                int LA85_1 = input.LA(2);

                if ( (synpred117_psqlgrammar()) ) {
                    alt85=1;
                }
                else if ( (true) ) {
                    alt85=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 85, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA85_0==Minus_Sign||LA85_0==Plus_Sign||LA85_0==Single_Quote||LA85_0==44||LA85_0==93||LA85_0==121||LA85_0==127||LA85_0==131) ) {
                alt85=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(85);}

            switch (alt85) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:831:3: predicate
                    {
                    dbg.location(831,3);
                    pushFollow(FOLLOW_predicate_in_boolean_primary3398);
                    predicate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:832:4: boolean_predicand
                    {
                    dbg.location(832,4);
                    pushFollow(FOLLOW_boolean_predicand_in_boolean_primary3403);
                    boolean_predicand();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 105, boolean_primary_StartIndex); }

        }
        dbg.location(832, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "boolean_primary");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "boolean_primary"



    // $ANTLR start "boolean_predicand"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:834:1: boolean_predicand options {k=1; } : ( parenthesized_boolean_value_expression | nonparenthesized_value_expression_primary );
    public final void boolean_predicand() throws RecognitionException {
        int boolean_predicand_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "boolean_predicand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(834, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 106) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:836:2: ( parenthesized_boolean_value_expression | nonparenthesized_value_expression_primary )
            int alt86=2;
            try { dbg.enterDecision(86, decisionCanBacktrack[86]);

            int LA86_0 = input.LA(1);

            if ( (LA86_0==Left_Paren) ) {
                int LA86_1 = input.LA(2);

                if ( (synpred118_psqlgrammar()) ) {
                    alt86=1;
                }
                else if ( (true) ) {
                    alt86=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 86, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA86_0==Regular_Identifier||LA86_0==Unsigned_Integer||LA86_0==48||LA86_0==52||(LA86_0 >= 60 && LA86_0 <= 61)||LA86_0==67||LA86_0==76||LA86_0==78||LA86_0==84||(LA86_0 >= 96 && LA86_0 <= 97)||(LA86_0 >= 118 && LA86_0 <= 120)||LA86_0==122||(LA86_0 >= 133 && LA86_0 <= 134)) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(86);}

            switch (alt86) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:836:4: parenthesized_boolean_value_expression
                    {
                    dbg.location(836,4);
                    pushFollow(FOLLOW_parenthesized_boolean_value_expression_in_boolean_predicand3420);
                    parenthesized_boolean_value_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:837:4: nonparenthesized_value_expression_primary
                    {
                    dbg.location(837,4);
                    pushFollow(FOLLOW_nonparenthesized_value_expression_primary_in_boolean_predicand3425);
                    nonparenthesized_value_expression_primary();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 106, boolean_predicand_StartIndex); }

        }
        dbg.location(838, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "boolean_predicand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "boolean_predicand"



    // $ANTLR start "parenthesized_boolean_value_expression"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:841:1: parenthesized_boolean_value_expression options {k=1; } : Left_Paren boolean_value_expression Right_Paren ;
    public final void parenthesized_boolean_value_expression() throws RecognitionException {
        int parenthesized_boolean_value_expression_StartIndex = input.index();

        Token Left_Paren18=null;
        Token Right_Paren19=null;

        try { dbg.enterRule(getGrammarFileName(), "parenthesized_boolean_value_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(841, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 107) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:843:2: ( Left_Paren boolean_value_expression Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:843:5: Left_Paren boolean_value_expression Right_Paren
            {
            dbg.location(843,5);
            Left_Paren18=(Token)match(input,Left_Paren,FOLLOW_Left_Paren_in_parenthesized_boolean_value_expression3446); if (state.failed) return ;
            dbg.location(843,16);
            if ( state.backtracking==0 ) {System.out.print((Left_Paren18!=null?Left_Paren18.getText():null));}
            dbg.location(843,54);
            pushFollow(FOLLOW_boolean_value_expression_in_parenthesized_boolean_value_expression3450);
            boolean_value_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(843,80);
            Right_Paren19=(Token)match(input,Right_Paren,FOLLOW_Right_Paren_in_parenthesized_boolean_value_expression3453); if (state.failed) return ;
            dbg.location(843,92);
            if ( state.backtracking==0 ) {System.out.print((Right_Paren19!=null?Right_Paren19.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 107, parenthesized_boolean_value_expression_StartIndex); }

        }
        dbg.location(843, 129);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "parenthesized_boolean_value_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "parenthesized_boolean_value_expression"



    // $ANTLR start "nonparenthesized_value_expression_primary"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:872:3: nonparenthesized_value_expression_primary : ( unsigned_value_specification | set_function_specification | scalar_subquery );
    public final void nonparenthesized_value_expression_primary() throws RecognitionException {
        int nonparenthesized_value_expression_primary_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "nonparenthesized_value_expression_primary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(872, 2);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 108) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:872:45: ( unsigned_value_specification | set_function_specification | scalar_subquery )
            int alt87=3;
            try { dbg.enterDecision(87, decisionCanBacktrack[87]);

            switch ( input.LA(1) ) {
            case Regular_Identifier:
            case Unsigned_Integer:
                {
                alt87=1;
                }
                break;
            case 48:
            case 52:
            case 60:
            case 61:
            case 67:
            case 76:
            case 78:
            case 84:
            case 96:
            case 97:
            case 118:
            case 119:
            case 120:
            case 122:
            case 133:
            case 134:
                {
                alt87=2;
                }
                break;
            case Left_Paren:
                {
                alt87=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(87);}

            switch (alt87) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:873:3: unsigned_value_specification
                    {
                    dbg.location(873,3);
                    pushFollow(FOLLOW_unsigned_value_specification_in_nonparenthesized_value_expression_primary3470);
                    unsigned_value_specification();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:874:5: set_function_specification
                    {
                    dbg.location(874,5);
                    pushFollow(FOLLOW_set_function_specification_in_nonparenthesized_value_expression_primary3476);
                    set_function_specification();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:875:5: scalar_subquery
                    {
                    dbg.location(875,5);
                    pushFollow(FOLLOW_scalar_subquery_in_nonparenthesized_value_expression_primary3482);
                    scalar_subquery();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 108, nonparenthesized_value_expression_primary_StartIndex); }

        }
        dbg.location(875, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "nonparenthesized_value_expression_primary");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "nonparenthesized_value_expression_primary"



    // $ANTLR start "set_function_specification"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:881:1: set_function_specification options {k=1; } : ( aggregate_function | grouping_operation );
    public final void set_function_specification() throws RecognitionException {
        int set_function_specification_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "set_function_specification");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(881, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 109) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:883:2: ( aggregate_function | grouping_operation )
            int alt88=2;
            try { dbg.enterDecision(88, decisionCanBacktrack[88]);

            int LA88_0 = input.LA(1);

            if ( (LA88_0==48||LA88_0==52||(LA88_0 >= 60 && LA88_0 <= 61)||LA88_0==67||LA88_0==76||LA88_0==84||(LA88_0 >= 96 && LA88_0 <= 97)||(LA88_0 >= 118 && LA88_0 <= 120)||LA88_0==122||(LA88_0 >= 133 && LA88_0 <= 134)) ) {
                alt88=1;
            }
            else if ( (LA88_0==78) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(88);}

            switch (alt88) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:883:5: aggregate_function
                    {
                    dbg.location(883,5);
                    pushFollow(FOLLOW_aggregate_function_in_set_function_specification3508);
                    aggregate_function();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:883:27: grouping_operation
                    {
                    dbg.location(883,27);
                    pushFollow(FOLLOW_grouping_operation_in_set_function_specification3513);
                    grouping_operation();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 109, set_function_specification_StartIndex); }

        }
        dbg.location(883, 45);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "set_function_specification");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "set_function_specification"



    // $ANTLR start "grouping_operation"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:885:1: grouping_operation : 'GROUPING' Left_Paren column_reference ( Comma column_reference )* Right_Paren ;
    public final void grouping_operation() throws RecognitionException {
        int grouping_operation_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "grouping_operation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(885, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 110) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:885:22: ( 'GROUPING' Left_Paren column_reference ( Comma column_reference )* Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:885:25: 'GROUPING' Left_Paren column_reference ( Comma column_reference )* Right_Paren
            {
            dbg.location(885,25);
            match(input,78,FOLLOW_78_in_grouping_operation3525); if (state.failed) return ;
            dbg.location(885,36);
            match(input,Left_Paren,FOLLOW_Left_Paren_in_grouping_operation3527); if (state.failed) return ;
            dbg.location(885,47);
            pushFollow(FOLLOW_column_reference_in_grouping_operation3529);
            column_reference();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(885,65);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:885:65: ( Comma column_reference )*
            try { dbg.enterSubRule(89);

            loop89:
            do {
                int alt89=2;
                try { dbg.enterDecision(89, decisionCanBacktrack[89]);

                int LA89_0 = input.LA(1);

                if ( (LA89_0==Comma) ) {
                    alt89=1;
                }


                } finally {dbg.exitDecision(89);}

                switch (alt89) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:885:67: Comma column_reference
            	    {
            	    dbg.location(885,67);
            	    match(input,Comma,FOLLOW_Comma_in_grouping_operation3534); if (state.failed) return ;
            	    dbg.location(885,73);
            	    pushFollow(FOLLOW_column_reference_in_grouping_operation3536);
            	    column_reference();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);
            } finally {dbg.exitSubRule(89);}

            dbg.location(885,94);
            match(input,Right_Paren,FOLLOW_Right_Paren_in_grouping_operation3542); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 110, grouping_operation_StartIndex); }

        }
        dbg.location(885, 104);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "grouping_operation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "grouping_operation"



    // $ANTLR start "scalar_subquery"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:895:1: scalar_subquery options {k=1; } : subquery ;
    public final void scalar_subquery() throws RecognitionException {
        int scalar_subquery_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "scalar_subquery");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(895, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 111) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:897:2: ( subquery )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:897:5: subquery
            {
            dbg.location(897,5);
            pushFollow(FOLLOW_subquery_in_scalar_subquery3567);
            subquery();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 111, scalar_subquery_StartIndex); }

        }
        dbg.location(897, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "scalar_subquery");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "scalar_subquery"



    // $ANTLR start "row_subquery"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:899:1: row_subquery options {k=1; } : subquery ;
    public final void row_subquery() throws RecognitionException {
        int row_subquery_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "row_subquery");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(899, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 112) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:901:2: ( subquery )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:901:5: subquery
            {
            dbg.location(901,5);
            pushFollow(FOLLOW_subquery_in_row_subquery3586);
            subquery();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 112, row_subquery_StartIndex); }

        }
        dbg.location(901, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "row_subquery");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "row_subquery"



    // $ANTLR start "table_subquery"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:903:1: table_subquery : subquery ;
    public final void table_subquery() throws RecognitionException {
        int table_subquery_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "table_subquery");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(903, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 113) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:903:18: ( subquery )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:903:21: subquery
            {
            dbg.location(903,21);
            pushFollow(FOLLOW_subquery_in_table_subquery3598);
            subquery();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 113, table_subquery_StartIndex); }

        }
        dbg.location(903, 29);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "table_subquery");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "table_subquery"



    // $ANTLR start "subquery"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:906:1: subquery options {k=1; } : Left_Paren query_expression Right_Paren ;
    public final void subquery() throws RecognitionException {
        int subquery_StartIndex = input.index();

        Token Left_Paren20=null;
        Token Right_Paren21=null;

        try { dbg.enterRule(getGrammarFileName(), "subquery");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(906, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 114) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:908:2: ( Left_Paren query_expression Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:908:5: Left_Paren query_expression Right_Paren
            {
            dbg.location(908,5);
            Left_Paren20=(Token)match(input,Left_Paren,FOLLOW_Left_Paren_in_subquery3618); if (state.failed) return ;
            dbg.location(908,16);
            if ( state.backtracking==0 ) {System.out.print((Left_Paren20!=null?Left_Paren20.getText():null));}
            dbg.location(908,54);
            pushFollow(FOLLOW_query_expression_in_subquery3622);
            query_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(908,72);
            Right_Paren21=(Token)match(input,Right_Paren,FOLLOW_Right_Paren_in_subquery3625); if (state.failed) return ;
            dbg.location(908,84);
            if ( state.backtracking==0 ) {System.out.print((Right_Paren21!=null?Right_Paren21.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 114, subquery_StartIndex); }

        }
        dbg.location(908, 121);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "subquery");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "subquery"



    // $ANTLR start "predicate"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:955:1: predicate options {k=1; } : ( comparison_predicate | like_predicate | between_predicate | in_predicate | quantified_comparison_predicate | polymorphic_between_predicate | polymorphic_range_predicate | ontology_child_predicate );
    public final void predicate() throws RecognitionException {
        int predicate_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "predicate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(955, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 115) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:957:2: ( comparison_predicate | like_predicate | between_predicate | in_predicate | quantified_comparison_predicate | polymorphic_between_predicate | polymorphic_range_predicate | ontology_child_predicate )
            int alt90=8;
            try { dbg.enterDecision(90, decisionCanBacktrack[90]);

            int LA90_0 = input.LA(1);

            if ( (LA90_0==Left_Paren||LA90_0==Regular_Identifier||LA90_0==Unsigned_Integer||LA90_0==48||LA90_0==52||(LA90_0 >= 60 && LA90_0 <= 61)||LA90_0==67||LA90_0==76||LA90_0==78||LA90_0==84||(LA90_0 >= 96 && LA90_0 <= 97)||(LA90_0 >= 118 && LA90_0 <= 120)||LA90_0==122||(LA90_0 >= 133 && LA90_0 <= 134)) ) {
                int LA90_1 = input.LA(2);

                if ( (synpred123_psqlgrammar()) ) {
                    alt90=1;
                }
                else if ( (synpred124_psqlgrammar()) ) {
                    alt90=2;
                }
                else if ( (synpred125_psqlgrammar()) ) {
                    alt90=3;
                }
                else if ( (synpred126_psqlgrammar()) ) {
                    alt90=4;
                }
                else if ( (synpred127_psqlgrammar()) ) {
                    alt90=5;
                }
                else if ( (synpred128_psqlgrammar()) ) {
                    alt90=6;
                }
                else if ( (synpred129_psqlgrammar()) ) {
                    alt90=7;
                }
                else if ( (true) ) {
                    alt90=8;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA90_0==Minus_Sign||LA90_0==Plus_Sign||LA90_0==Single_Quote||LA90_0==44||LA90_0==93||LA90_0==121||LA90_0==127||LA90_0==131) ) {
                int LA90_10 = input.LA(2);

                if ( (synpred123_psqlgrammar()) ) {
                    alt90=1;
                }
                else if ( (synpred124_psqlgrammar()) ) {
                    alt90=2;
                }
                else if ( (synpred125_psqlgrammar()) ) {
                    alt90=3;
                }
                else if ( (synpred126_psqlgrammar()) ) {
                    alt90=4;
                }
                else if ( (synpred127_psqlgrammar()) ) {
                    alt90=5;
                }
                else if ( (synpred128_psqlgrammar()) ) {
                    alt90=6;
                }
                else if ( (synpred129_psqlgrammar()) ) {
                    alt90=7;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 10, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(90);}

            switch (alt90) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:957:4: comparison_predicate
                    {
                    dbg.location(957,4);
                    pushFollow(FOLLOW_comparison_predicate_in_predicate3656);
                    comparison_predicate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:958:4: like_predicate
                    {
                    dbg.location(958,4);
                    pushFollow(FOLLOW_like_predicate_in_predicate3661);
                    like_predicate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:959:4: between_predicate
                    {
                    dbg.location(959,4);
                    pushFollow(FOLLOW_between_predicate_in_predicate3666);
                    between_predicate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:960:4: in_predicate
                    {
                    dbg.location(960,4);
                    pushFollow(FOLLOW_in_predicate_in_predicate3671);
                    in_predicate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:961:4: quantified_comparison_predicate
                    {
                    dbg.location(961,4);
                    pushFollow(FOLLOW_quantified_comparison_predicate_in_predicate3676);
                    quantified_comparison_predicate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:962:4: polymorphic_between_predicate
                    {
                    dbg.location(962,4);
                    pushFollow(FOLLOW_polymorphic_between_predicate_in_predicate3681);
                    polymorphic_between_predicate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    dbg.enterAlt(7);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:963:4: polymorphic_range_predicate
                    {
                    dbg.location(963,4);
                    pushFollow(FOLLOW_polymorphic_range_predicate_in_predicate3686);
                    polymorphic_range_predicate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    dbg.enterAlt(8);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:964:4: ontology_child_predicate
                    {
                    dbg.location(964,4);
                    pushFollow(FOLLOW_ontology_child_predicate_in_predicate3691);
                    ontology_child_predicate();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 115, predicate_StartIndex); }

        }
        dbg.location(966, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "predicate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "predicate"



    // $ANTLR start "comparison_predicate"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:973:1: comparison_predicate options {k=1; } : row_value_predicand comparison_predicate_part_2 ;
    public final void comparison_predicate() throws RecognitionException {
        int comparison_predicate_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "comparison_predicate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(973, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 116) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:975:2: ( row_value_predicand comparison_predicate_part_2 )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:975:5: row_value_predicand comparison_predicate_part_2
            {
            dbg.location(975,5);
            pushFollow(FOLLOW_row_value_predicand_in_comparison_predicate3715);
            row_value_predicand();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(975,26);
            pushFollow(FOLLOW_comparison_predicate_part_2_in_comparison_predicate3718);
            comparison_predicate_part_2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 116, comparison_predicate_StartIndex); }

        }
        dbg.location(975, 53);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comparison_predicate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "comparison_predicate"



    // $ANTLR start "comparison_predicate_part_2"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:977:1: comparison_predicate_part_2 options {k=1; } : comp_op row_value_predicand ;
    public final void comparison_predicate_part_2() throws RecognitionException {
        int comparison_predicate_part_2_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "comparison_predicate_part_2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(977, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 117) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:979:2: ( comp_op row_value_predicand )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:979:5: comp_op row_value_predicand
            {
            dbg.location(979,5);
            pushFollow(FOLLOW_comp_op_in_comparison_predicate_part_23737);
            comp_op();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(979,14);
            pushFollow(FOLLOW_row_value_predicand_in_comparison_predicate_part_23740);
            row_value_predicand();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 117, comparison_predicate_part_2_StartIndex); }

        }
        dbg.location(979, 33);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comparison_predicate_part_2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "comparison_predicate_part_2"



    // $ANTLR start "comp_op"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:981:1: comp_op : ( Equals_Operator | Not_Equals_Operator | Less_Than_Operator | Greater_Than_Operator | Less_Or_Equals_Operator | Greater_Or_Equals_Operator );
    public final void comp_op() throws RecognitionException {
        int comp_op_StartIndex = input.index();

        Token Equals_Operator22=null;
        Token Not_Equals_Operator23=null;
        Token Less_Than_Operator24=null;
        Token Greater_Than_Operator25=null;
        Token Less_Or_Equals_Operator26=null;
        Token Greater_Or_Equals_Operator27=null;

        try { dbg.enterRule(getGrammarFileName(), "comp_op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(981, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 118) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:981:10: ( Equals_Operator | Not_Equals_Operator | Less_Than_Operator | Greater_Than_Operator | Less_Or_Equals_Operator | Greater_Or_Equals_Operator )
            int alt91=6;
            try { dbg.enterDecision(91, decisionCanBacktrack[91]);

            switch ( input.LA(1) ) {
            case Equals_Operator:
                {
                alt91=1;
                }
                break;
            case Not_Equals_Operator:
                {
                alt91=2;
                }
                break;
            case Less_Than_Operator:
                {
                alt91=3;
                }
                break;
            case Greater_Than_Operator:
                {
                alt91=4;
                }
                break;
            case Less_Or_Equals_Operator:
                {
                alt91=5;
                }
                break;
            case Greater_Or_Equals_Operator:
                {
                alt91=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(91);}

            switch (alt91) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:982:3: Equals_Operator
                    {
                    dbg.location(982,3);
                    Equals_Operator22=(Token)match(input,Equals_Operator,FOLLOW_Equals_Operator_in_comp_op3752); if (state.failed) return ;
                    dbg.location(982,19);
                    if ( state.backtracking==0 ) {System.out.print(" " + (Equals_Operator22!=null?Equals_Operator22.getText():null) + " ");}

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:983:4: Not_Equals_Operator
                    {
                    dbg.location(983,4);
                    Not_Equals_Operator23=(Token)match(input,Not_Equals_Operator,FOLLOW_Not_Equals_Operator_in_comp_op3759); if (state.failed) return ;
                    dbg.location(983,24);
                    if ( state.backtracking==0 ) {System.out.print(" " + (Not_Equals_Operator23!=null?Not_Equals_Operator23.getText():null) + " ");}

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:984:4: Less_Than_Operator
                    {
                    dbg.location(984,4);
                    Less_Than_Operator24=(Token)match(input,Less_Than_Operator,FOLLOW_Less_Than_Operator_in_comp_op3766); if (state.failed) return ;
                    dbg.location(984,23);
                    if ( state.backtracking==0 ) {System.out.print(" " + (Less_Than_Operator24!=null?Less_Than_Operator24.getText():null) + " ");}

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:985:4: Greater_Than_Operator
                    {
                    dbg.location(985,4);
                    Greater_Than_Operator25=(Token)match(input,Greater_Than_Operator,FOLLOW_Greater_Than_Operator_in_comp_op3773); if (state.failed) return ;
                    dbg.location(985,26);
                    if ( state.backtracking==0 ) {System.out.print(" " + (Greater_Than_Operator25!=null?Greater_Than_Operator25.getText():null) + " ");}

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:986:4: Less_Or_Equals_Operator
                    {
                    dbg.location(986,4);
                    Less_Or_Equals_Operator26=(Token)match(input,Less_Or_Equals_Operator,FOLLOW_Less_Or_Equals_Operator_in_comp_op3780); if (state.failed) return ;
                    dbg.location(986,28);
                    if ( state.backtracking==0 ) {System.out.print(" " + (Less_Or_Equals_Operator26!=null?Less_Or_Equals_Operator26.getText():null) + " ");}

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:987:4: Greater_Or_Equals_Operator
                    {
                    dbg.location(987,4);
                    Greater_Or_Equals_Operator27=(Token)match(input,Greater_Or_Equals_Operator,FOLLOW_Greater_Or_Equals_Operator_in_comp_op3787); if (state.failed) return ;
                    dbg.location(987,31);
                    if ( state.backtracking==0 ) {System.out.print(" " + (Greater_Or_Equals_Operator27!=null?Greater_Or_Equals_Operator27.getText():null) + " ");}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 118, comp_op_StartIndex); }

        }
        dbg.location(988, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "comp_op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "comp_op"



    // $ANTLR start "like_predicate"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:997:1: like_predicate : character_like_predicate ;
    public final void like_predicate() throws RecognitionException {
        int like_predicate_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "like_predicate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(997, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 119) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:998:2: ( character_like_predicate )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:998:4: character_like_predicate
            {
            dbg.location(998,4);
            pushFollow(FOLLOW_character_like_predicate_in_like_predicate3805);
            character_like_predicate();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 119, like_predicate_StartIndex); }

        }
        dbg.location(998, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "like_predicate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "like_predicate"



    // $ANTLR start "character_like_predicate"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1000:1: character_like_predicate : row_value_predicand character_like_predicate_part_2 ;
    public final void character_like_predicate() throws RecognitionException {
        int character_like_predicate_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "character_like_predicate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1000, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 120) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1000:28: ( row_value_predicand character_like_predicate_part_2 )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1000:31: row_value_predicand character_like_predicate_part_2
            {
            dbg.location(1000,31);
            pushFollow(FOLLOW_row_value_predicand_in_character_like_predicate3816);
            row_value_predicand();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1000,52);
            pushFollow(FOLLOW_character_like_predicate_part_2_in_character_like_predicate3819);
            character_like_predicate_part_2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 120, character_like_predicate_StartIndex); }

        }
        dbg.location(1000, 83);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "character_like_predicate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "character_like_predicate"



    // $ANTLR start "row_value_special_case"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1020:1: row_value_special_case : nonparenthesized_value_expression_primary ;
    public final void row_value_special_case() throws RecognitionException {
        int row_value_special_case_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "row_value_special_case");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1020, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 121) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1022:2: ( nonparenthesized_value_expression_primary )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1022:5: nonparenthesized_value_expression_primary
            {
            dbg.location(1022,5);
            pushFollow(FOLLOW_nonparenthesized_value_expression_primary_in_row_value_special_case3838);
            nonparenthesized_value_expression_primary();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 121, row_value_special_case_StartIndex); }

        }
        dbg.location(1022, 46);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "row_value_special_case");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "row_value_special_case"



    // $ANTLR start "row_value_constructor_predicand"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1024:1: row_value_constructor_predicand : ( boolean_predicand | common_value_expression );
    public final void row_value_constructor_predicand() throws RecognitionException {
        int row_value_constructor_predicand_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "row_value_constructor_predicand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1024, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 122) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1026:2: ( boolean_predicand | common_value_expression )
            int alt92=2;
            try { dbg.enterDecision(92, decisionCanBacktrack[92]);

            switch ( input.LA(1) ) {
            case Left_Paren:
            case 48:
            case 52:
            case 60:
            case 61:
            case 67:
            case 76:
            case 78:
            case 84:
            case 96:
            case 97:
            case 118:
            case 119:
            case 120:
            case 122:
            case 133:
            case 134:
                {
                alt92=1;
                }
                break;
            case Unsigned_Integer:
                {
                int LA92_2 = input.LA(2);

                if ( (synpred135_psqlgrammar()) ) {
                    alt92=1;
                }
                else if ( (true) ) {
                    alt92=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case Regular_Identifier:
                {
                int LA92_3 = input.LA(2);

                if ( (synpred135_psqlgrammar()) ) {
                    alt92=1;
                }
                else if ( (true) ) {
                    alt92=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 92, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case Minus_Sign:
            case Plus_Sign:
            case 44:
            case 93:
            case 121:
            case 127:
            case 131:
                {
                alt92=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(92);}

            switch (alt92) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1027:2: boolean_predicand
                    {
                    dbg.location(1027,2);
                    pushFollow(FOLLOW_boolean_predicand_in_row_value_constructor_predicand3852);
                    boolean_predicand();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1029:4: common_value_expression
                    {
                    dbg.location(1029,4);
                    pushFollow(FOLLOW_common_value_expression_in_row_value_constructor_predicand3859);
                    common_value_expression();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 122, row_value_constructor_predicand_StartIndex); }

        }
        dbg.location(1030, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "row_value_constructor_predicand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "row_value_constructor_predicand"



    // $ANTLR start "character_like_predicate_part_2"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1048:1: character_like_predicate_part_2 : ( 'NOT' )? 'LIKE' Single_Quote character_pattern Single_Quote ( 'ESCAPE' Character_String_Literal )? ;
    public final void character_like_predicate_part_2() throws RecognitionException {
        int character_like_predicate_part_2_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "character_like_predicate_part_2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1048, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 123) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1050:2: ( ( 'NOT' )? 'LIKE' Single_Quote character_pattern Single_Quote ( 'ESCAPE' Character_String_Literal )? )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1050:5: ( 'NOT' )? 'LIKE' Single_Quote character_pattern Single_Quote ( 'ESCAPE' Character_String_Literal )?
            {
            dbg.location(1050,5);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1050:5: ( 'NOT' )?
            int alt93=2;
            try { dbg.enterSubRule(93);
            try { dbg.enterDecision(93, decisionCanBacktrack[93]);

            int LA93_0 = input.LA(1);

            if ( (LA93_0==NOT) ) {
                alt93=1;
            }
            } finally {dbg.exitDecision(93);}

            switch (alt93) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1050:7: 'NOT'
                    {
                    dbg.location(1050,7);
                    match(input,NOT,FOLLOW_NOT_in_character_like_predicate_part_23885); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(93);}

            dbg.location(1050,16);
            match(input,91,FOLLOW_91_in_character_like_predicate_part_23890); if (state.failed) return ;
            dbg.location(1050,24);
            match(input,Single_Quote,FOLLOW_Single_Quote_in_character_like_predicate_part_23893); if (state.failed) return ;
            dbg.location(1050,37);
            pushFollow(FOLLOW_character_pattern_in_character_like_predicate_part_23895);
            character_pattern();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1050,55);
            match(input,Single_Quote,FOLLOW_Single_Quote_in_character_like_predicate_part_23897); if (state.failed) return ;
            dbg.location(1050,69);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1050:69: ( 'ESCAPE' Character_String_Literal )?
            int alt94=2;
            try { dbg.enterSubRule(94);
            try { dbg.enterDecision(94, decisionCanBacktrack[94]);

            int LA94_0 = input.LA(1);

            if ( (LA94_0==66) ) {
                alt94=1;
            }
            } finally {dbg.exitDecision(94);}

            switch (alt94) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1050:71: 'ESCAPE' Character_String_Literal
                    {
                    dbg.location(1050,71);
                    match(input,66,FOLLOW_66_in_character_like_predicate_part_23902); if (state.failed) return ;
                    dbg.location(1050,81);
                    match(input,Character_String_Literal,FOLLOW_Character_String_Literal_in_character_like_predicate_part_23905); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(94);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 123, character_like_predicate_part_2_StartIndex); }

        }
        dbg.location(1050, 109);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "character_like_predicate_part_2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "character_like_predicate_part_2"



    // $ANTLR start "character_pattern"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1052:1: character_pattern : character_value_expression ;
    public final void character_pattern() throws RecognitionException {
        int character_pattern_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "character_pattern");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1052, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 124) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1052:21: ( character_value_expression )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1052:24: character_value_expression
            {
            dbg.location(1052,24);
            pushFollow(FOLLOW_character_value_expression_in_character_pattern3924);
            character_value_expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 124, character_pattern_StartIndex); }

        }
        dbg.location(1052, 50);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "character_pattern");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "character_pattern"



    // $ANTLR start "quantified_comparison_predicate"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1062:1: quantified_comparison_predicate : row_value_predicand quantified_comparison_predicate_part_2 ;
    public final void quantified_comparison_predicate() throws RecognitionException {
        int quantified_comparison_predicate_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "quantified_comparison_predicate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1062, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 125) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1062:35: ( row_value_predicand quantified_comparison_predicate_part_2 )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1062:38: row_value_predicand quantified_comparison_predicate_part_2
            {
            dbg.location(1062,38);
            pushFollow(FOLLOW_row_value_predicand_in_quantified_comparison_predicate3940);
            row_value_predicand();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1062,59);
            pushFollow(FOLLOW_quantified_comparison_predicate_part_2_in_quantified_comparison_predicate3943);
            quantified_comparison_predicate_part_2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 125, quantified_comparison_predicate_StartIndex); }

        }
        dbg.location(1062, 97);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "quantified_comparison_predicate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "quantified_comparison_predicate"



    // $ANTLR start "quantified_comparison_predicate_part_2"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1064:1: quantified_comparison_predicate_part_2 options {k=1; } : comp_op quantifier table_subquery ;
    public final void quantified_comparison_predicate_part_2() throws RecognitionException {
        int quantified_comparison_predicate_part_2_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "quantified_comparison_predicate_part_2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1064, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 126) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1066:2: ( comp_op quantifier table_subquery )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1066:5: comp_op quantifier table_subquery
            {
            dbg.location(1066,5);
            pushFollow(FOLLOW_comp_op_in_quantified_comparison_predicate_part_23962);
            comp_op();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1066,14);
            pushFollow(FOLLOW_quantifier_in_quantified_comparison_predicate_part_23965);
            quantifier();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1066,26);
            pushFollow(FOLLOW_table_subquery_in_quantified_comparison_predicate_part_23968);
            table_subquery();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 126, quantified_comparison_predicate_part_2_StartIndex); }

        }
        dbg.location(1066, 40);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "quantified_comparison_predicate_part_2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "quantified_comparison_predicate_part_2"



    // $ANTLR start "quantifier"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1068:1: quantifier : ( all | some );
    public final void quantifier() throws RecognitionException {
        int quantifier_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "quantifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1068, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 127) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1068:14: ( all | some )
            int alt95=2;
            try { dbg.enterDecision(95, decisionCanBacktrack[95]);

            int LA95_0 = input.LA(1);

            if ( (LA95_0==46) ) {
                alt95=1;
            }
            else if ( (LA95_0==48||LA95_0==118) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(95);}

            switch (alt95) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1068:17: all
                    {
                    dbg.location(1068,17);
                    pushFollow(FOLLOW_all_in_quantifier3980);
                    all();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1068:24: some
                    {
                    dbg.location(1068,24);
                    pushFollow(FOLLOW_some_in_quantifier3985);
                    some();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 127, quantifier_StartIndex); }

        }
        dbg.location(1068, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "quantifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "quantifier"



    // $ANTLR start "all"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1070:1: all : 'ALL' ;
    public final void all() throws RecognitionException {
        int all_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "all");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1070, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 128) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1070:7: ( 'ALL' )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1070:10: 'ALL'
            {
            dbg.location(1070,10);
            match(input,46,FOLLOW_46_in_all3997); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 128, all_StartIndex); }

        }
        dbg.location(1070, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "all");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "all"



    // $ANTLR start "some"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1072:1: some : ( 'SOME' | 'ANY' );
    public final void some() throws RecognitionException {
        int some_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "some");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1072, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 129) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1072:8: ( 'SOME' | 'ANY' )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            dbg.location(1072,8);
            if ( input.LA(1)==48||input.LA(1)==118 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 129, some_StartIndex); }

        }
        dbg.location(1072, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "some");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "some"



    // $ANTLR start "between_predicate"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1097:1: between_predicate : row_value_predicand between_predicate_part_2 ;
    public final void between_predicate() throws RecognitionException {
        int between_predicate_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "between_predicate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1097, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 130) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1097:21: ( row_value_predicand between_predicate_part_2 )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1097:24: row_value_predicand between_predicate_part_2
            {
            dbg.location(1097,24);
            pushFollow(FOLLOW_row_value_predicand_in_between_predicate4052);
            row_value_predicand();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1097,45);
            pushFollow(FOLLOW_between_predicate_part_2_in_between_predicate4055);
            between_predicate_part_2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 130, between_predicate_StartIndex); }

        }
        dbg.location(1097, 69);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "between_predicate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "between_predicate"



    // $ANTLR start "between_predicate_part_2"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1099:1: between_predicate_part_2 : ( 'NOT' )? 'BETWEEN' ( 'ASYMMETRIC' | 'SYMMETRIC' )? row_value_predicand 'AND' row_value_predicand ;
    public final void between_predicate_part_2() throws RecognitionException {
        int between_predicate_part_2_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "between_predicate_part_2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1099, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 131) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1100:2: ( ( 'NOT' )? 'BETWEEN' ( 'ASYMMETRIC' | 'SYMMETRIC' )? row_value_predicand 'AND' row_value_predicand )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1100:7: ( 'NOT' )? 'BETWEEN' ( 'ASYMMETRIC' | 'SYMMETRIC' )? row_value_predicand 'AND' row_value_predicand
            {
            dbg.location(1100,7);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1100:7: ( 'NOT' )?
            int alt96=2;
            try { dbg.enterSubRule(96);
            try { dbg.enterDecision(96, decisionCanBacktrack[96]);

            int LA96_0 = input.LA(1);

            if ( (LA96_0==NOT) ) {
                alt96=1;
            }
            } finally {dbg.exitDecision(96);}

            switch (alt96) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1100:8: 'NOT'
                    {
                    dbg.location(1100,8);
                    match(input,NOT,FOLLOW_NOT_in_between_predicate_part_24069); if (state.failed) return ;
                    dbg.location(1100,14);
                    if ( state.backtracking==0 ) {System.out.print("NOT ");}

                    }
                    break;

            }
            } finally {dbg.exitSubRule(96);}

            dbg.location(1100,45);
            match(input,BETWEEN,FOLLOW_BETWEEN_in_between_predicate_part_24076); if (state.failed) return ;
            dbg.location(1100,55);
            if ( state.backtracking==0 ) {System.out.print(" BETWEEN ");}
            dbg.location(1101,7);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1101:7: ( 'ASYMMETRIC' | 'SYMMETRIC' )?
            int alt97=3;
            try { dbg.enterSubRule(97);
            try { dbg.enterDecision(97, decisionCanBacktrack[97]);

            int LA97_0 = input.LA(1);

            if ( (LA97_0==51) ) {
                alt97=1;
            }
            else if ( (LA97_0==123) ) {
                alt97=2;
            }
            } finally {dbg.exitDecision(97);}

            switch (alt97) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1101:9: 'ASYMMETRIC'
                    {
                    dbg.location(1101,9);
                    match(input,51,FOLLOW_51_in_between_predicate_part_24089); if (state.failed) return ;
                    dbg.location(1101,22);
                    if ( state.backtracking==0 ) {System.out.print(" ASYMMETRIC ");}

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1101:60: 'SYMMETRIC'
                    {
                    dbg.location(1101,60);
                    match(input,123,FOLLOW_123_in_between_predicate_part_24095); if (state.failed) return ;
                    dbg.location(1101,72);
                    if ( state.backtracking==0 ) {System.out.print(" SYMMETRIC ");}

                    }
                    break;

            }
            } finally {dbg.exitSubRule(97);}

            dbg.location(1102,7);
            pushFollow(FOLLOW_row_value_predicand_in_between_predicate_part_24108);
            row_value_predicand();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1102,28);
            match(input,47,FOLLOW_47_in_between_predicate_part_24111); if (state.failed) return ;
            dbg.location(1102,34);
            if ( state.backtracking==0 ) {System.out.print(" AND ");}
            dbg.location(1102,63);
            pushFollow(FOLLOW_row_value_predicand_in_between_predicate_part_24115);
            row_value_predicand();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 131, between_predicate_part_2_StartIndex); }

        }
        dbg.location(1102, 82);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "between_predicate_part_2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "between_predicate_part_2"



    // $ANTLR start "in_predicate"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1105:1: in_predicate : row_value_predicand in_predicate_part_2 ;
    public final void in_predicate() throws RecognitionException {
        int in_predicate_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "in_predicate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1105, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 132) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1105:16: ( row_value_predicand in_predicate_part_2 )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1105:19: row_value_predicand in_predicate_part_2
            {
            dbg.location(1105,19);
            pushFollow(FOLLOW_row_value_predicand_in_in_predicate4128);
            row_value_predicand();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1105,40);
            pushFollow(FOLLOW_in_predicate_part_2_in_in_predicate4131);
            in_predicate_part_2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 132, in_predicate_StartIndex); }

        }
        dbg.location(1105, 60);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "in_predicate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "in_predicate"



    // $ANTLR start "in_predicate_part_2"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1116:1: in_predicate_part_2 options {k=1; } : ( 'NOT' )? 'IN' in_predicate_value ;
    public final void in_predicate_part_2() throws RecognitionException {
        int in_predicate_part_2_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "in_predicate_part_2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1116, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 133) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1118:2: ( ( 'NOT' )? 'IN' in_predicate_value )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1118:5: ( 'NOT' )? 'IN' in_predicate_value
            {
            dbg.location(1118,5);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1118:5: ( 'NOT' )?
            int alt98=2;
            try { dbg.enterSubRule(98);
            try { dbg.enterDecision(98, decisionCanBacktrack[98]);

            int LA98_0 = input.LA(1);

            if ( (LA98_0==NOT) ) {
                alt98=1;
            }
            } finally {dbg.exitDecision(98);}

            switch (alt98) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1118:7: 'NOT'
                    {
                    dbg.location(1118,7);
                    match(input,NOT,FOLLOW_NOT_in_in_predicate_part_24159); if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(98);}

            dbg.location(1118,16);
            match(input,80,FOLLOW_80_in_in_predicate_part_24164); if (state.failed) return ;
            dbg.location(1118,21);
            pushFollow(FOLLOW_in_predicate_value_in_in_predicate_part_24166);
            in_predicate_value();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 133, in_predicate_part_2_StartIndex); }

        }
        dbg.location(1118, 39);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "in_predicate_part_2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "in_predicate_part_2"



    // $ANTLR start "in_predicate_value"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1120:1: in_predicate_value : ( table_subquery | Left_Paren in_value_list Right_Paren );
    public final void in_predicate_value() throws RecognitionException {
        int in_predicate_value_StartIndex = input.index();

        Token Left_Paren28=null;
        Token Right_Paren29=null;

        try { dbg.enterRule(getGrammarFileName(), "in_predicate_value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1120, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 134) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1120:21: ( table_subquery | Left_Paren in_value_list Right_Paren )
            int alt99=2;
            try { dbg.enterDecision(99, decisionCanBacktrack[99]);

            int LA99_0 = input.LA(1);

            if ( (LA99_0==Left_Paren) ) {
                int LA99_1 = input.LA(2);

                if ( (synpred144_psqlgrammar()) ) {
                    alt99=1;
                }
                else if ( (true) ) {
                    alt99=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 99, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(99);}

            switch (alt99) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1121:3: table_subquery
                    {
                    dbg.location(1121,3);
                    pushFollow(FOLLOW_table_subquery_in_in_predicate_value4178);
                    table_subquery();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1123:4: Left_Paren in_value_list Right_Paren
                    {
                    dbg.location(1123,4);
                    Left_Paren28=(Token)match(input,Left_Paren,FOLLOW_Left_Paren_in_in_predicate_value4185); if (state.failed) return ;
                    dbg.location(1123,15);
                    if ( state.backtracking==0 ) {System.out.print((Left_Paren28!=null?Left_Paren28.getText():null));}
                    dbg.location(1123,53);
                    pushFollow(FOLLOW_in_value_list_in_in_predicate_value4189);
                    in_value_list();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(1123,68);
                    Right_Paren29=(Token)match(input,Right_Paren,FOLLOW_Right_Paren_in_in_predicate_value4192); if (state.failed) return ;
                    dbg.location(1123,80);
                    if ( state.backtracking==0 ) {System.out.print((Right_Paren29!=null?Right_Paren29.getText():null));}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 134, in_predicate_value_StartIndex); }

        }
        dbg.location(1124, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "in_predicate_value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "in_predicate_value"



    // $ANTLR start "in_value_list"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1126:1: in_value_list : row_value_expression ( Comma row_value_expression )* ;
    public final void in_value_list() throws RecognitionException {
        int in_value_list_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "in_value_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1126, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 135) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1126:17: ( row_value_expression ( Comma row_value_expression )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1126:20: row_value_expression ( Comma row_value_expression )*
            {
            dbg.location(1126,20);
            pushFollow(FOLLOW_row_value_expression_in_in_value_list4207);
            row_value_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1126,42);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1126:42: ( Comma row_value_expression )*
            try { dbg.enterSubRule(100);

            loop100:
            do {
                int alt100=2;
                try { dbg.enterDecision(100, decisionCanBacktrack[100]);

                int LA100_0 = input.LA(1);

                if ( (LA100_0==Comma) ) {
                    alt100=1;
                }


                } finally {dbg.exitDecision(100);}

                switch (alt100) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1126:44: Comma row_value_expression
            	    {
            	    dbg.location(1126,44);
            	    match(input,Comma,FOLLOW_Comma_in_in_value_list4212); if (state.failed) return ;
            	    dbg.location(1126,50);
            	    pushFollow(FOLLOW_row_value_expression_in_in_value_list4214);
            	    row_value_expression();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);
            } finally {dbg.exitSubRule(100);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 135, in_value_list_StartIndex); }

        }
        dbg.location(1126, 73);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "in_value_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "in_value_list"



    // $ANTLR start "row_value_expression"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1128:1: row_value_expression options {k=1; } : ( row_value_special_case | explicit_row_value_constructor );
    public final void row_value_expression() throws RecognitionException {
        int row_value_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "row_value_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1128, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 136) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1130:2: ( row_value_special_case | explicit_row_value_constructor )
            int alt101=2;
            try { dbg.enterDecision(101, decisionCanBacktrack[101]);

            switch ( input.LA(1) ) {
            case Left_Paren:
                {
                int LA101_1 = input.LA(2);

                if ( (synpred146_psqlgrammar()) ) {
                    alt101=1;
                }
                else if ( (true) ) {
                    alt101=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case Regular_Identifier:
            case Unsigned_Integer:
            case 48:
            case 52:
            case 60:
            case 61:
            case 67:
            case 76:
            case 78:
            case 84:
            case 96:
            case 97:
            case 118:
            case 119:
            case 120:
            case 122:
            case 133:
            case 134:
                {
                alt101=1;
                }
                break;
            case 114:
                {
                alt101=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(101);}

            switch (alt101) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1130:4: row_value_special_case
                    {
                    dbg.location(1130,4);
                    pushFollow(FOLLOW_row_value_special_case_in_row_value_expression4236);
                    row_value_special_case();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1131:4: explicit_row_value_constructor
                    {
                    dbg.location(1131,4);
                    pushFollow(FOLLOW_explicit_row_value_constructor_in_row_value_expression4241);
                    explicit_row_value_constructor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 136, row_value_expression_StartIndex); }

        }
        dbg.location(1131, 33);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "row_value_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "row_value_expression"



    // $ANTLR start "explicit_row_value_constructor"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1133:1: explicit_row_value_constructor options {k=1; } : ( Left_Paren row_value_constructor_element Comma row_value_constructor_element_list Right_Paren | 'ROW' Left_Paren row_value_constructor_element_list Right_Paren | row_subquery );
    public final void explicit_row_value_constructor() throws RecognitionException {
        int explicit_row_value_constructor_StartIndex = input.index();

        Token Left_Paren30=null;
        Token Comma31=null;
        Token Right_Paren32=null;
        Token Left_Paren33=null;
        Token Right_Paren34=null;

        try { dbg.enterRule(getGrammarFileName(), "explicit_row_value_constructor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1133, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 137) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1135:2: ( Left_Paren row_value_constructor_element Comma row_value_constructor_element_list Right_Paren | 'ROW' Left_Paren row_value_constructor_element_list Right_Paren | row_subquery )
            int alt102=3;
            try { dbg.enterDecision(102, decisionCanBacktrack[102]);

            int LA102_0 = input.LA(1);

            if ( (LA102_0==Left_Paren) ) {
                int LA102_1 = input.LA(2);

                if ( (synpred147_psqlgrammar()) ) {
                    alt102=1;
                }
                else if ( (true) ) {
                    alt102=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 102, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA102_0==114) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(102);}

            switch (alt102) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1135:4: Left_Paren row_value_constructor_element Comma row_value_constructor_element_list Right_Paren
                    {
                    dbg.location(1135,4);
                    Left_Paren30=(Token)match(input,Left_Paren,FOLLOW_Left_Paren_in_explicit_row_value_constructor4258); if (state.failed) return ;
                    dbg.location(1135,15);
                    if ( state.backtracking==0 ) {System.out.print((Left_Paren30!=null?Left_Paren30.getText():null));}
                    dbg.location(1135,53);
                    pushFollow(FOLLOW_row_value_constructor_element_in_explicit_row_value_constructor4262);
                    row_value_constructor_element();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(1135,84);
                    Comma31=(Token)match(input,Comma,FOLLOW_Comma_in_explicit_row_value_constructor4265); if (state.failed) return ;
                    dbg.location(1135,90);
                    if ( state.backtracking==0 ) {System.out.print((Comma31!=null?Comma31.getText():null));}
                    dbg.location(1135,122);
                    pushFollow(FOLLOW_row_value_constructor_element_list_in_explicit_row_value_constructor4268);
                    row_value_constructor_element_list();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(1135,158);
                    Right_Paren32=(Token)match(input,Right_Paren,FOLLOW_Right_Paren_in_explicit_row_value_constructor4271); if (state.failed) return ;
                    dbg.location(1135,170);
                    if ( state.backtracking==0 ) {System.out.print((Right_Paren32!=null?Right_Paren32.getText():null));}

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1136:4: 'ROW' Left_Paren row_value_constructor_element_list Right_Paren
                    {
                    dbg.location(1136,4);
                    match(input,114,FOLLOW_114_in_explicit_row_value_constructor4278); if (state.failed) return ;
                    dbg.location(1136,10);
                    Left_Paren33=(Token)match(input,Left_Paren,FOLLOW_Left_Paren_in_explicit_row_value_constructor4280); if (state.failed) return ;
                    dbg.location(1136,21);
                    if ( state.backtracking==0 ) {System.out.print((Left_Paren33!=null?Left_Paren33.getText():null));}
                    dbg.location(1136,59);
                    pushFollow(FOLLOW_row_value_constructor_element_list_in_explicit_row_value_constructor4284);
                    row_value_constructor_element_list();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(1136,95);
                    Right_Paren34=(Token)match(input,Right_Paren,FOLLOW_Right_Paren_in_explicit_row_value_constructor4287); if (state.failed) return ;
                    dbg.location(1136,107);
                    if ( state.backtracking==0 ) {System.out.print((Right_Paren34!=null?Right_Paren34.getText():null));}

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1137:4: row_subquery
                    {
                    dbg.location(1137,4);
                    pushFollow(FOLLOW_row_subquery_in_explicit_row_value_constructor4294);
                    row_subquery();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 137, explicit_row_value_constructor_StartIndex); }

        }
        dbg.location(1138, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "explicit_row_value_constructor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "explicit_row_value_constructor"



    // $ANTLR start "row_value_constructor_element_list"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1139:1: row_value_constructor_element_list : row_value_constructor_element ( Comma row_value_constructor_element )* ;
    public final void row_value_constructor_element_list() throws RecognitionException {
        int row_value_constructor_element_list_StartIndex = input.index();

        Token Comma35=null;

        try { dbg.enterRule(getGrammarFileName(), "row_value_constructor_element_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1139, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 138) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1139:37: ( row_value_constructor_element ( Comma row_value_constructor_element )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1140:3: row_value_constructor_element ( Comma row_value_constructor_element )*
            {
            dbg.location(1140,3);
            pushFollow(FOLLOW_row_value_constructor_element_in_row_value_constructor_element_list4306);
            row_value_constructor_element();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1140,34);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1140:34: ( Comma row_value_constructor_element )*
            try { dbg.enterSubRule(103);

            loop103:
            do {
                int alt103=2;
                try { dbg.enterDecision(103, decisionCanBacktrack[103]);

                int LA103_0 = input.LA(1);

                if ( (LA103_0==Comma) ) {
                    alt103=1;
                }


                } finally {dbg.exitDecision(103);}

                switch (alt103) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1140:36: Comma row_value_constructor_element
            	    {
            	    dbg.location(1140,36);
            	    Comma35=(Token)match(input,Comma,FOLLOW_Comma_in_row_value_constructor_element_list4311); if (state.failed) return ;
            	    dbg.location(1140,42);
            	    if ( state.backtracking==0 ) {System.out.print((Comma35!=null?Comma35.getText():null));}
            	    dbg.location(1140,75);
            	    pushFollow(FOLLOW_row_value_constructor_element_in_row_value_constructor_element_list4315);
            	    row_value_constructor_element();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop103;
                }
            } while (true);
            } finally {dbg.exitSubRule(103);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 138, row_value_constructor_element_list_StartIndex); }

        }
        dbg.location(1140, 107);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "row_value_constructor_element_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "row_value_constructor_element_list"



    // $ANTLR start "row_value_constructor_element"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1142:1: row_value_constructor_element options {k=1; } : value_expression ;
    public final void row_value_constructor_element() throws RecognitionException {
        int row_value_constructor_element_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "row_value_constructor_element");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1142, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 139) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1144:2: ( value_expression )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1144:5: value_expression
            {
            dbg.location(1144,5);
            pushFollow(FOLLOW_value_expression_in_row_value_constructor_element4340);
            value_expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 139, row_value_constructor_element_StartIndex); }

        }
        dbg.location(1144, 21);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "row_value_constructor_element");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "row_value_constructor_element"



    // $ANTLR start "polymorphic_between_predicate"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1164:1: polymorphic_between_predicate : row_value_predicand polymorphic_between_predicate_part_2 ;
    public final void polymorphic_between_predicate() throws RecognitionException {
        int polymorphic_between_predicate_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "polymorphic_between_predicate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1164, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 140) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1164:33: ( row_value_predicand polymorphic_between_predicate_part_2 )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1164:36: row_value_predicand polymorphic_between_predicate_part_2
            {
            dbg.location(1164,36);
            pushFollow(FOLLOW_row_value_predicand_in_polymorphic_between_predicate4359);
            row_value_predicand();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1164,57);
            pushFollow(FOLLOW_polymorphic_between_predicate_part_2_in_polymorphic_between_predicate4362);
            polymorphic_between_predicate_part_2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 140, polymorphic_between_predicate_StartIndex); }

        }
        dbg.location(1164, 94);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "polymorphic_between_predicate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "polymorphic_between_predicate"



    // $ANTLR start "row_value_predicand"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1167:1: row_value_predicand : ( (onequote= Single_Quote )? row_value_special_case (twoquote= Single_Quote )? | row_value_constructor_predicand );
    public final void row_value_predicand() throws RecognitionException {
        int row_value_predicand_StartIndex = input.index();

        Token onequote=null;
        Token twoquote=null;

        try { dbg.enterRule(getGrammarFileName(), "row_value_predicand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1167, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 141) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1169:2: ( (onequote= Single_Quote )? row_value_special_case (twoquote= Single_Quote )? | row_value_constructor_predicand )
            int alt106=2;
            try { dbg.enterDecision(106, decisionCanBacktrack[106]);

            switch ( input.LA(1) ) {
            case Single_Quote:
                {
                alt106=1;
                }
                break;
            case Unsigned_Integer:
                {
                int LA106_2 = input.LA(2);

                if ( (synpred152_psqlgrammar()) ) {
                    alt106=1;
                }
                else if ( (true) ) {
                    alt106=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case Regular_Identifier:
                {
                int LA106_3 = input.LA(2);

                if ( (synpred152_psqlgrammar()) ) {
                    alt106=1;
                }
                else if ( (true) ) {
                    alt106=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 3, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 61:
                {
                int LA106_4 = input.LA(2);

                if ( (synpred152_psqlgrammar()) ) {
                    alt106=1;
                }
                else if ( (true) ) {
                    alt106=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 4, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 48:
            case 52:
            case 60:
            case 67:
            case 76:
            case 84:
            case 96:
            case 97:
            case 118:
            case 119:
            case 120:
            case 122:
            case 133:
            case 134:
                {
                int LA106_5 = input.LA(2);

                if ( (synpred152_psqlgrammar()) ) {
                    alt106=1;
                }
                else if ( (true) ) {
                    alt106=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 5, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case 78:
                {
                int LA106_6 = input.LA(2);

                if ( (synpred152_psqlgrammar()) ) {
                    alt106=1;
                }
                else if ( (true) ) {
                    alt106=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 6, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case Left_Paren:
                {
                int LA106_7 = input.LA(2);

                if ( (synpred152_psqlgrammar()) ) {
                    alt106=1;
                }
                else if ( (true) ) {
                    alt106=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 7, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case Minus_Sign:
            case Plus_Sign:
            case 44:
            case 93:
            case 121:
            case 127:
            case 131:
                {
                alt106=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(106);}

            switch (alt106) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1169:4: (onequote= Single_Quote )? row_value_special_case (twoquote= Single_Quote )?
                    {
                    dbg.location(1169,4);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1169:4: (onequote= Single_Quote )?
                    int alt104=2;
                    try { dbg.enterSubRule(104);
                    try { dbg.enterDecision(104, decisionCanBacktrack[104]);

                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==Single_Quote) ) {
                        alt104=1;
                    }
                    } finally {dbg.exitDecision(104);}

                    switch (alt104) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1169:5: onequote= Single_Quote
                            {
                            dbg.location(1169,13);
                            onequote=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_row_value_predicand4378); if (state.failed) return ;
                            dbg.location(1169,27);
                            if ( state.backtracking==0 ) {System.out.print((onequote!=null?onequote.getText():null));}

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(104);}

                    dbg.location(1169,67);
                    pushFollow(FOLLOW_row_value_special_case_in_row_value_predicand4386);
                    row_value_special_case();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(1169,90);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1169:90: (twoquote= Single_Quote )?
                    int alt105=2;
                    try { dbg.enterSubRule(105);
                    try { dbg.enterDecision(105, decisionCanBacktrack[105]);

                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==Single_Quote) ) {
                        int LA105_1 = input.LA(2);

                        if ( (synpred151_psqlgrammar()) ) {
                            alt105=1;
                        }
                    }
                    } finally {dbg.exitDecision(105);}

                    switch (alt105) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1169:91: twoquote= Single_Quote
                            {
                            dbg.location(1169,99);
                            twoquote=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_row_value_predicand4391); if (state.failed) return ;
                            dbg.location(1169,113);
                            if ( state.backtracking==0 ) {System.out.print((twoquote!=null?twoquote.getText():null));}

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(105);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1170:4: row_value_constructor_predicand
                    {
                    dbg.location(1170,4);
                    pushFollow(FOLLOW_row_value_constructor_predicand_in_row_value_predicand4401);
                    row_value_constructor_predicand();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 141, row_value_predicand_StartIndex); }

        }
        dbg.location(1171, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "row_value_predicand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "row_value_predicand"



    // $ANTLR start "polymorphic_between_predicate_part_2"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1182:1: polymorphic_between_predicate_part_2 options {k=1; } : ( 'NOT' )? 'IS' 'POLYMORPHIC' 'BETWEEN' polymorphic_between_value ;
    public final void polymorphic_between_predicate_part_2() throws RecognitionException {
        int polymorphic_between_predicate_part_2_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "polymorphic_between_predicate_part_2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1182, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 142) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1184:2: ( ( 'NOT' )? 'IS' 'POLYMORPHIC' 'BETWEEN' polymorphic_between_value )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1184:5: ( 'NOT' )? 'IS' 'POLYMORPHIC' 'BETWEEN' polymorphic_between_value
            {
            dbg.location(1184,5);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1184:5: ( 'NOT' )?
            int alt107=2;
            try { dbg.enterSubRule(107);
            try { dbg.enterDecision(107, decisionCanBacktrack[107]);

            int LA107_0 = input.LA(1);

            if ( (LA107_0==NOT) ) {
                alt107=1;
            }
            } finally {dbg.exitDecision(107);}

            switch (alt107) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1184:6: 'NOT'
                    {
                    dbg.location(1184,6);
                    match(input,NOT,FOLLOW_NOT_in_polymorphic_between_predicate_part_24427); if (state.failed) return ;
                    dbg.location(1184,12);
                    if ( state.backtracking==0 ) {System.out.print("NOT ");}

                    }
                    break;

            }
            } finally {dbg.exitSubRule(107);}

            dbg.location(1184,42);
            match(input,IS,FOLLOW_IS_in_polymorphic_between_predicate_part_24433); if (state.failed) return ;
            dbg.location(1184,48);
            if ( state.backtracking==0 ) {System.out.print(" IS ");}
            dbg.location(1184,76);
            match(input,POLYMORPHIC,FOLLOW_POLYMORPHIC_in_polymorphic_between_predicate_part_24438); if (state.failed) return ;
            dbg.location(1184,90);
            if ( state.backtracking==0 ) {System.out.print("POLYMORPHIC ");}
            dbg.location(1185,3);
            match(input,BETWEEN,FOLLOW_BETWEEN_in_polymorphic_between_predicate_part_24444); if (state.failed) return ;
            dbg.location(1185,13);
            if ( state.backtracking==0 ) {System.out.print("BETWEEN ");}
            dbg.location(1185,45);
            pushFollow(FOLLOW_polymorphic_between_value_in_polymorphic_between_predicate_part_24448);
            polymorphic_between_value();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 142, polymorphic_between_predicate_part_2_StartIndex); }

        }
        dbg.location(1186, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "polymorphic_between_predicate_part_2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "polymorphic_between_predicate_part_2"



    // $ANTLR start "polymorphic_between_value"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1188:1: polymorphic_between_value : ( Left_Paren )? species_variant_list ( Right_Paren )? ;
    public final void polymorphic_between_value() throws RecognitionException {
        int polymorphic_between_value_StartIndex = input.index();

        Token Left_Paren36=null;
        Token Right_Paren37=null;

        try { dbg.enterRule(getGrammarFileName(), "polymorphic_between_value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1188, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 143) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1188:28: ( ( Left_Paren )? species_variant_list ( Right_Paren )? )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1191:2: ( Left_Paren )? species_variant_list ( Right_Paren )?
            {
            dbg.location(1191,2);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1191:2: ( Left_Paren )?
            int alt108=2;
            try { dbg.enterSubRule(108);
            try { dbg.enterDecision(108, decisionCanBacktrack[108]);

            int LA108_0 = input.LA(1);

            if ( (LA108_0==Left_Paren) ) {
                alt108=1;
            }
            } finally {dbg.exitDecision(108);}

            switch (alt108) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1191:3: Left_Paren
                    {
                    dbg.location(1191,3);
                    Left_Paren36=(Token)match(input,Left_Paren,FOLLOW_Left_Paren_in_polymorphic_between_value4467); if (state.failed) return ;
                    dbg.location(1191,14);
                    if ( state.backtracking==0 ) {System.out.print((Left_Paren36!=null?Left_Paren36.getText():null));}

                    }
                    break;

            }
            } finally {dbg.exitSubRule(108);}

            dbg.location(1191,54);
            pushFollow(FOLLOW_species_variant_list_in_polymorphic_between_value4473);
            species_variant_list();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1191,76);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1191:76: ( Right_Paren )?
            int alt109=2;
            try { dbg.enterSubRule(109);
            try { dbg.enterDecision(109, decisionCanBacktrack[109]);

            int LA109_0 = input.LA(1);

            if ( (LA109_0==Right_Paren) ) {
                int LA109_1 = input.LA(2);

                if ( (synpred155_psqlgrammar()) ) {
                    alt109=1;
                }
            }
            } finally {dbg.exitDecision(109);}

            switch (alt109) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1191:77: Right_Paren
                    {
                    dbg.location(1191,77);
                    Right_Paren37=(Token)match(input,Right_Paren,FOLLOW_Right_Paren_in_polymorphic_between_value4477); if (state.failed) return ;
                    dbg.location(1191,89);
                    if ( state.backtracking==0 ) {System.out.print((Right_Paren37!=null?Right_Paren37.getText():null));}

                    }
                    break;

            }
            } finally {dbg.exitSubRule(109);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 143, polymorphic_between_value_StartIndex); }

        }
        dbg.location(1192, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "polymorphic_between_value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "polymorphic_between_value"



    // $ANTLR start "species_variant_list"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1196:1: species_variant_list : ( (one= Single_Quote )? (e= non_terminal_identifier )* (two= Single_Quote )? ( Comma (three= Single_Quote )? (e= non_terminal_identifier )* (four= Single_Quote )? )* | NEWLINE );
    public final void species_variant_list() throws RecognitionException {
        int species_variant_list_StartIndex = input.index();

        Token one=null;
        Token two=null;
        Token three=null;
        Token four=null;
        Token Comma38=null;
        String e =null;




        	int counter = 0;
        	int counter2 = 0;
        	int beginone = 0;
        	int wcounter = 0;
        	Mark marker = new Mark();	
        	StringBuffer z = new StringBuffer();
        	StringBuffer n = new StringBuffer();
        	StringBuffer zz = new StringBuffer();
        	

        try { dbg.enterRule(getGrammarFileName(), "species_variant_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1196, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 144) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1211:2: ( (one= Single_Quote )? (e= non_terminal_identifier )* (two= Single_Quote )? ( Comma (three= Single_Quote )? (e= non_terminal_identifier )* (four= Single_Quote )? )* | NEWLINE )
            int alt117=2;
            try { dbg.enterDecision(117, decisionCanBacktrack[117]);

            int LA117_0 = input.LA(1);

            if ( (LA117_0==EOF||LA117_0==Comma||LA117_0==IS||LA117_0==Regular_Identifier||LA117_0==Right_Paren||LA117_0==Single_Quote||LA117_0==47||(LA117_0 >= 49 && LA117_0 <= 50)||LA117_0==62||LA117_0==64||LA117_0==68||(LA117_0 >= 74 && LA117_0 <= 75)||LA117_0==77||LA117_0==79||(LA117_0 >= 82 && LA117_0 <= 83)||LA117_0==86||LA117_0==90||(LA117_0 >= 99 && LA117_0 <= 100)||LA117_0==102||(LA117_0 >= 104 && LA117_0 <= 105)||LA117_0==112||LA117_0==125||LA117_0==129||LA117_0==132||LA117_0==135) ) {
                alt117=1;
            }
            else if ( (LA117_0==NEWLINE) ) {
                alt117=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(117);}

            switch (alt117) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1211:5: (one= Single_Quote )? (e= non_terminal_identifier )* (two= Single_Quote )? ( Comma (three= Single_Quote )? (e= non_terminal_identifier )* (four= Single_Quote )? )*
                    {
                    dbg.location(1211,5);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1211:5: (one= Single_Quote )?
                    int alt110=2;
                    try { dbg.enterSubRule(110);
                    try { dbg.enterDecision(110, decisionCanBacktrack[110]);

                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==Single_Quote) ) {
                        int LA110_1 = input.LA(2);

                        if ( (synpred156_psqlgrammar()) ) {
                            alt110=1;
                        }
                    }
                    } finally {dbg.exitDecision(110);}

                    switch (alt110) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1211:6: one= Single_Quote
                            {
                            dbg.location(1211,9);
                            one=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_species_variant_list4514); if (state.failed) return ;
                            dbg.location(1211,23);
                            if ( state.backtracking==0 ) {System.out.print((one!=null?one.getText():null));}

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(110);}

                    dbg.location(1211,56);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1211:56: (e= non_terminal_identifier )*
                    try { dbg.enterSubRule(111);

                    loop111:
                    do {
                        int alt111=2;
                        try { dbg.enterDecision(111, decisionCanBacktrack[111]);

                        int LA111_0 = input.LA(1);

                        if ( (LA111_0==Regular_Identifier) ) {
                            int LA111_2 = input.LA(2);

                            if ( (synpred157_psqlgrammar()) ) {
                                alt111=1;
                            }


                        }


                        } finally {dbg.exitDecision(111);}

                        switch (alt111) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1211:58: e= non_terminal_identifier
                    	    {
                    	    dbg.location(1211,59);
                    	    pushFollow(FOLLOW_non_terminal_identifier_in_species_variant_list4524);
                    	    e=non_terminal_identifier();

                    	    state._fsp--;
                    	    if (state.failed) return ;
                    	    dbg.location(1211,84);
                    	    if ( state.backtracking==0 ) {
                    	    		
                    	    		counter2 = counter2 + 1; 
                    	    		Integer k = new Integer(counter2);
                    	    		memory2.put(k , e);
                    	    	
                    	    	}

                    	    }
                    	    break;

                    	default :
                    	    break loop111;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(111);}

                    dbg.location(1217,6);
                    if ( state.backtracking==0 ) { for ( int j = 1; j <= counter2 ; j++) {
                    	      if ( j == 1) {
                                                 	String m = (String) memory2.get(j);
                                               	n.insert(0, m);
                                                 }
                                                 else
                                                 	{ 
                                                 	 	String m = (String) memory2.get(j);
                                            		n.append(" ");
                                                 		n.append(m);
                                                 }

                    	}   
                    	System.out.print(n.toString());}
                    dbg.location(1231,30);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1231:30: (two= Single_Quote )?
                    int alt112=2;
                    try { dbg.enterSubRule(112);
                    try { dbg.enterDecision(112, decisionCanBacktrack[112]);

                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==Single_Quote) ) {
                        alt112=1;
                    }
                    } finally {dbg.exitDecision(112);}

                    switch (alt112) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1231:31: two= Single_Quote
                            {
                            dbg.location(1231,34);
                            two=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_species_variant_list4564); if (state.failed) return ;
                            dbg.location(1231,48);
                            if ( state.backtracking==0 ) {System.out.print((two!=null?two.getText():null));}

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(112);}

                    dbg.location(1231,81);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1231:81: ( Comma (three= Single_Quote )? (e= non_terminal_identifier )* (four= Single_Quote )? )*
                    try { dbg.enterSubRule(116);

                    loop116:
                    do {
                        int alt116=2;
                        try { dbg.enterDecision(116, decisionCanBacktrack[116]);

                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==Comma) ) {
                            switch ( input.LA(2) ) {
                            case Regular_Identifier:
                                {
                                int LA116_3 = input.LA(3);

                                if ( (synpred162_psqlgrammar()) ) {
                                    alt116=1;
                                }


                                }
                                break;
                            case Single_Quote:
                                {
                                int LA116_4 = input.LA(3);

                                if ( (LA116_4==Regular_Identifier) ) {
                                    switch ( input.LA(4) ) {
                                    case Single_Quote:
                                        {
                                        int LA116_7 = input.LA(5);

                                        if ( (LA116_7==IS) ) {
                                            int LA116_8 = input.LA(6);

                                            if ( (LA116_8==NOT||LA116_8==70||LA116_8==128||LA116_8==130) ) {
                                                alt116=1;
                                            }


                                        }
                                        else if ( (LA116_7==EOF||LA116_7==Comma||LA116_7==Regular_Identifier||LA116_7==Right_Paren||LA116_7==47||(LA116_7 >= 49 && LA116_7 <= 50)||LA116_7==62||LA116_7==64||LA116_7==68||(LA116_7 >= 74 && LA116_7 <= 75)||LA116_7==77||LA116_7==79||(LA116_7 >= 82 && LA116_7 <= 83)||LA116_7==86||LA116_7==90||(LA116_7 >= 99 && LA116_7 <= 100)||LA116_7==102||(LA116_7 >= 104 && LA116_7 <= 105)||LA116_7==112||LA116_7==125||LA116_7==129||LA116_7==132||LA116_7==135) ) {
                                            alt116=1;
                                        }


                                        }
                                        break;
                                    case IS:
                                        {
                                        int LA116_8 = input.LA(5);

                                        if ( (LA116_8==NOT||LA116_8==70||LA116_8==128||LA116_8==130) ) {
                                            alt116=1;
                                        }


                                        }
                                        break;
                                    case EOF:
                                    case Comma:
                                    case Regular_Identifier:
                                    case Right_Paren:
                                    case 47:
                                    case 49:
                                    case 50:
                                    case 62:
                                    case 64:
                                    case 68:
                                    case 74:
                                    case 75:
                                    case 77:
                                    case 79:
                                    case 82:
                                    case 83:
                                    case 86:
                                    case 90:
                                    case 99:
                                    case 100:
                                    case 102:
                                    case 104:
                                    case 105:
                                    case 112:
                                    case 125:
                                    case 129:
                                    case 132:
                                    case 135:
                                        {
                                        alt116=1;
                                        }
                                        break;

                                    }

                                }
                                else if ( (LA116_4==EOF||LA116_4==Comma||LA116_4==IS||LA116_4==Right_Paren||LA116_4==Single_Quote||LA116_4==47||(LA116_4 >= 49 && LA116_4 <= 50)||LA116_4==62||LA116_4==64||LA116_4==68||(LA116_4 >= 74 && LA116_4 <= 75)||LA116_4==77||LA116_4==79||(LA116_4 >= 82 && LA116_4 <= 83)||LA116_4==86||LA116_4==90||(LA116_4 >= 99 && LA116_4 <= 100)||LA116_4==102||(LA116_4 >= 104 && LA116_4 <= 105)||LA116_4==112||LA116_4==125||LA116_4==129||LA116_4==132||LA116_4==135) ) {
                                    alt116=1;
                                }


                                }
                                break;
                            case EOF:
                            case Comma:
                            case IS:
                            case Right_Paren:
                            case 47:
                            case 49:
                            case 50:
                            case 62:
                            case 64:
                            case 68:
                            case 74:
                            case 75:
                            case 77:
                            case 79:
                            case 82:
                            case 83:
                            case 86:
                            case 90:
                            case 99:
                            case 100:
                            case 102:
                            case 104:
                            case 105:
                            case 112:
                            case 125:
                            case 129:
                            case 132:
                            case 135:
                                {
                                alt116=1;
                                }
                                break;

                            }

                        }


                        } finally {dbg.exitDecision(116);}

                        switch (alt116) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1231:83: Comma (three= Single_Quote )? (e= non_terminal_identifier )* (four= Single_Quote )?
                    	    {
                    	    dbg.location(1231,83);
                    	    Comma38=(Token)match(input,Comma,FOLLOW_Comma_in_species_variant_list4572); if (state.failed) return ;
                    	    dbg.location(1231,91);
                    	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1231:91: (three= Single_Quote )?
                    	    int alt113=2;
                    	    try { dbg.enterSubRule(113);
                    	    try { dbg.enterDecision(113, decisionCanBacktrack[113]);

                    	    int LA113_0 = input.LA(1);

                    	    if ( (LA113_0==Single_Quote) ) {
                    	        int LA113_1 = input.LA(2);

                    	        if ( (synpred159_psqlgrammar()) ) {
                    	            alt113=1;
                    	        }
                    	    }
                    	    } finally {dbg.exitDecision(113);}

                    	    switch (alt113) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1231:92: three= Single_Quote
                    	            {
                    	            dbg.location(1231,97);
                    	            three=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_species_variant_list4579); if (state.failed) return ;

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(113);}

                    	    dbg.location(1231,114);
                    	    if ( state.backtracking==0 ) {beginone = counter + 1;  
                    	    				       marker.begin = beginone; 
                    	    	                                                                           }
                    	    dbg.location(1235,77);
                    	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1235:77: (e= non_terminal_identifier )*
                    	    try { dbg.enterSubRule(114);

                    	    loop114:
                    	    do {
                    	        int alt114=2;
                    	        try { dbg.enterDecision(114, decisionCanBacktrack[114]);

                    	        int LA114_0 = input.LA(1);

                    	        if ( (LA114_0==Regular_Identifier) ) {
                    	            int LA114_2 = input.LA(2);

                    	            if ( (synpred160_psqlgrammar()) ) {
                    	                alt114=1;
                    	            }


                    	        }


                    	        } finally {dbg.exitDecision(114);}

                    	        switch (alt114) {
                    	    	case 1 :
                    	    	    dbg.enterAlt(1);

                    	    	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1235:79: e= non_terminal_identifier
                    	    	    {
                    	    	    dbg.location(1235,80);
                    	    	    pushFollow(FOLLOW_non_terminal_identifier_in_species_variant_list4743);
                    	    	    e=non_terminal_identifier();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return ;
                    	    	    dbg.location(1235,105);
                    	    	    if ( state.backtracking==0 ) {
                    	    	    		
                    	    	    		counter = counter + 1; 
                    	    	    		Integer w = new Integer(counter);
                    	    	    		memory.put(w , e);
                    	    	    	
                    	    	    	}

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop114;
                    	        }
                    	    } while (true);
                    	    } finally {dbg.exitSubRule(114);}

                    	    dbg.location(1241,6);
                    	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1241:6: (four= Single_Quote )?
                    	    int alt115=2;
                    	    try { dbg.enterSubRule(115);
                    	    try { dbg.enterDecision(115, decisionCanBacktrack[115]);

                    	    int LA115_0 = input.LA(1);

                    	    if ( (LA115_0==Single_Quote) ) {
                    	        alt115=1;
                    	    }
                    	    } finally {dbg.exitDecision(115);}

                    	    switch (alt115) {
                    	        case 1 :
                    	            dbg.enterAlt(1);

                    	            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1241:7: four= Single_Quote
                    	            {
                    	            dbg.location(1241,11);
                    	            four=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_species_variant_list4752); if (state.failed) return ;

                    	            }
                    	            break;

                    	    }
                    	    } finally {dbg.exitSubRule(115);}

                    	    dbg.location(1241,28);
                    	    if ( state.backtracking==0 ) {marker.end = counter; 
                    	    		          Integer g = new Integer(wcounter);
                    	    		          Mark h = new Mark();
                    	    		          h.begin = marker.begin;
                    	                                                           h.end = marker.end;
                    	    		          memory3.put(g, h);
                    	    		          wcounter = wcounter + 1;
                    	    		          }

                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);
                    } finally {dbg.exitSubRule(116);}

                    dbg.location(1248,21);
                    if ( state.backtracking==0 ) {

                    for (int ee = 0; ee < memory3.size(); ee++) {

                    	System.out.print((Comma38!=null?Comma38.getText():null));
                    	System.out.print((three!=null?three.getText():null));
                     	Mark  ff = (Mark) memory3.get(ee);	
                                 	int startword = ff.begin;
                                 	int endword = ff.end;
                             
                    	for ( int ii = startword; ii <= endword ; ii++) {
                    	
                    	      if ( ii == startword) {
                                                 	String yy = (String) memory.get(ii);
                                                 	zz.insert(0, yy);
                                                 }
                                                 else
                                                 	{ 
                                                 	 	String yy = (String) memory.get(ii);
                                            		zz.append(" ");
                                                 		zz.append(yy);
                                                 }
                    	       	       
                    	}	       	
                            
                            System.out.print(zz.toString());
                            zz.delete(0,zz.length());
                            System.out.print((four!=null?four.getText():null));	       
                    } //end of size loop
                    //System.out.println();
                    }

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1279:4: NEWLINE
                    {
                    dbg.location(1279,4);
                    match(input,NEWLINE,FOLLOW_NEWLINE_in_species_variant_list4770); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 144, species_variant_list_StartIndex); }

        }
        dbg.location(1280, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "species_variant_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "species_variant_list"



    // $ANTLR start "polymorphic_range_predicate"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1288:1: polymorphic_range_predicate : row_value_predicand polymorphic_range_predicate_part_2 ;
    public final void polymorphic_range_predicate() throws RecognitionException {
        int polymorphic_range_predicate_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "polymorphic_range_predicate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1288, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 145) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1288:31: ( row_value_predicand polymorphic_range_predicate_part_2 )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1288:34: row_value_predicand polymorphic_range_predicate_part_2
            {
            dbg.location(1288,34);
            pushFollow(FOLLOW_row_value_predicand_in_polymorphic_range_predicate4788);
            row_value_predicand();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1288,55);
            pushFollow(FOLLOW_polymorphic_range_predicate_part_2_in_polymorphic_range_predicate4791);
            polymorphic_range_predicate_part_2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 145, polymorphic_range_predicate_StartIndex); }

        }
        dbg.location(1288, 90);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "polymorphic_range_predicate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "polymorphic_range_predicate"



    // $ANTLR start "polymorphic_range_predicate_part_2"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1294:1: polymorphic_range_predicate_part_2 options {k=1; } : ( 'NOT' )? 'BETWEEN' genomic_location_value 'AND' genomic_location_value chromosome_clause ( map_clause )? ( reference_polymorphism_clause )? ;
    public final void polymorphic_range_predicate_part_2() throws RecognitionException {
        int polymorphic_range_predicate_part_2_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "polymorphic_range_predicate_part_2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1294, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 146) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1296:2: ( ( 'NOT' )? 'BETWEEN' genomic_location_value 'AND' genomic_location_value chromosome_clause ( map_clause )? ( reference_polymorphism_clause )? )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1296:6: ( 'NOT' )? 'BETWEEN' genomic_location_value 'AND' genomic_location_value chromosome_clause ( map_clause )? ( reference_polymorphism_clause )?
            {
            dbg.location(1296,6);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1296:6: ( 'NOT' )?
            int alt118=2;
            try { dbg.enterSubRule(118);
            try { dbg.enterDecision(118, decisionCanBacktrack[118]);

            int LA118_0 = input.LA(1);

            if ( (LA118_0==NOT) ) {
                alt118=1;
            }
            } finally {dbg.exitDecision(118);}

            switch (alt118) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1296:7: 'NOT'
                    {
                    dbg.location(1296,7);
                    match(input,NOT,FOLLOW_NOT_in_polymorphic_range_predicate_part_24819); if (state.failed) return ;
                    dbg.location(1296,13);
                    if ( state.backtracking==0 ) {System.out.print("NOT ");}

                    }
                    break;

            }
            } finally {dbg.exitSubRule(118);}

            dbg.location(1296,43);
            match(input,BETWEEN,FOLLOW_BETWEEN_in_polymorphic_range_predicate_part_24825); if (state.failed) return ;
            dbg.location(1296,54);
            if ( state.backtracking==0 ) {System.out.print(" BETWEEN ");}
            dbg.location(1296,87);
            pushFollow(FOLLOW_genomic_location_value_in_polymorphic_range_predicate_part_24830);
            genomic_location_value();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1297,6);
            match(input,47,FOLLOW_47_in_polymorphic_range_predicate_part_24839); if (state.failed) return ;
            dbg.location(1297,12);
            if ( state.backtracking==0 ) {System.out.print("AND ");}
            dbg.location(1297,40);
            pushFollow(FOLLOW_genomic_location_value_in_polymorphic_range_predicate_part_24843);
            genomic_location_value();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1297,63);
            pushFollow(FOLLOW_chromosome_clause_in_polymorphic_range_predicate_part_24845);
            chromosome_clause();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1297,81);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1297:81: ( map_clause )?
            int alt119=2;
            try { dbg.enterSubRule(119);
            try { dbg.enterDecision(119, decisionCanBacktrack[119]);

            int LA119_0 = input.LA(1);

            if ( (LA119_0==102) ) {
                int LA119_1 = input.LA(2);

                if ( (LA119_1==94) ) {
                    alt119=1;
                }
            }
            } finally {dbg.exitDecision(119);}

            switch (alt119) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1297:82: map_clause
                    {
                    dbg.location(1297,82);
                    pushFollow(FOLLOW_map_clause_in_polymorphic_range_predicate_part_24848);
                    map_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(119);}

            dbg.location(1297,95);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1297:95: ( reference_polymorphism_clause )?
            int alt120=2;
            try { dbg.enterSubRule(120);
            try { dbg.enterDecision(120, decisionCanBacktrack[120]);

            int LA120_0 = input.LA(1);

            if ( (LA120_0==132) ) {
                int LA120_1 = input.LA(2);

                if ( (LA120_1==109) ) {
                    alt120=1;
                }
            }
            } finally {dbg.exitDecision(120);}

            switch (alt120) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1297:96: reference_polymorphism_clause
                    {
                    dbg.location(1297,96);
                    pushFollow(FOLLOW_reference_polymorphism_clause_in_polymorphic_range_predicate_part_24853);
                    reference_polymorphism_clause();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(120);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 146, polymorphic_range_predicate_part_2_StartIndex); }

        }
        dbg.location(1299, 5);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "polymorphic_range_predicate_part_2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "polymorphic_range_predicate_part_2"



    // $ANTLR start "genomic_location_value"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1301:1: genomic_location_value : row_value_predicand ( 'KB' | 'LOCUS' | 'MARKER' | 'AGI CLONE' | 'OTHER CLONE' )+ ;
    public final void genomic_location_value() throws RecognitionException {
        int genomic_location_value_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "genomic_location_value");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1301, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 147) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1301:24: ( row_value_predicand ( 'KB' | 'LOCUS' | 'MARKER' | 'AGI CLONE' | 'OTHER CLONE' )+ )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1301:26: row_value_predicand ( 'KB' | 'LOCUS' | 'MARKER' | 'AGI CLONE' | 'OTHER CLONE' )+
            {
            dbg.location(1301,26);
            pushFollow(FOLLOW_row_value_predicand_in_genomic_location_value4873);
            row_value_predicand();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1301,46);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1301:46: ( 'KB' | 'LOCUS' | 'MARKER' | 'AGI CLONE' | 'OTHER CLONE' )+
            int cnt121=0;
            try { dbg.enterSubRule(121);

            loop121:
            do {
                int alt121=6;
                try { dbg.enterDecision(121, decisionCanBacktrack[121]);

                switch ( input.LA(1) ) {
                case 87:
                    {
                    alt121=1;
                    }
                    break;
                case 92:
                    {
                    alt121=2;
                    }
                    break;
                case 95:
                    {
                    alt121=3;
                    }
                    break;
                case 45:
                    {
                    alt121=4;
                    }
                    break;
                case 106:
                    {
                    alt121=5;
                    }
                    break;

                }

                } finally {dbg.exitDecision(121);}

                switch (alt121) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1301:47: 'KB'
            	    {
            	    dbg.location(1301,47);
            	    match(input,87,FOLLOW_87_in_genomic_location_value4876); if (state.failed) return ;
            	    dbg.location(1301,52);
            	    if ( state.backtracking==0 ) {System.out.print(" KB ");}

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1301:83: 'LOCUS'
            	    {
            	    dbg.location(1301,83);
            	    match(input,92,FOLLOW_92_in_genomic_location_value4883); if (state.failed) return ;
            	    dbg.location(1301,91);
            	    if ( state.backtracking==0 ) {System.out.print("LOCUS ");}

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1302:5: 'MARKER'
            	    {
            	    dbg.location(1302,5);
            	    match(input,95,FOLLOW_95_in_genomic_location_value4892); if (state.failed) return ;
            	    dbg.location(1302,14);
            	    if ( state.backtracking==0 ) {System.out.print("MARKER ");}

            	    }
            	    break;
            	case 4 :
            	    dbg.enterAlt(4);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1302:47: 'AGI CLONE'
            	    {
            	    dbg.location(1302,47);
            	    match(input,45,FOLLOW_45_in_genomic_location_value4898); if (state.failed) return ;
            	    dbg.location(1302,59);
            	    if ( state.backtracking==0 ) {System.out.print("AGI CLONE ");}

            	    }
            	    break;
            	case 5 :
            	    dbg.enterAlt(5);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1303:5: 'OTHER CLONE'
            	    {
            	    dbg.location(1303,5);
            	    match(input,106,FOLLOW_106_in_genomic_location_value4907); if (state.failed) return ;
            	    dbg.location(1303,19);
            	    if ( state.backtracking==0 ) {System.out.print("OTHER CLONE ");}

            	    }
            	    break;

            	default :
            	    if ( cnt121 >= 1 ) break loop121;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(121, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt121++;
            } while (true);
            } finally {dbg.exitSubRule(121);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 147, genomic_location_value_StartIndex); }

        }
        dbg.location(1303, 55);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "genomic_location_value");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "genomic_location_value"



    // $ANTLR start "chromosome_clause"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1306:1: chromosome_clause : 'ON' 'CHROMOSOME' chromosome_value_predicand ;
    public final void chromosome_clause() throws RecognitionException {
        int chromosome_clause_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "chromosome_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1306, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 148) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1306:19: ( 'ON' 'CHROMOSOME' chromosome_value_predicand )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1306:21: 'ON' 'CHROMOSOME' chromosome_value_predicand
            {
            dbg.location(1306,21);
            match(input,102,FOLLOW_102_in_chromosome_clause4920); if (state.failed) return ;
            dbg.location(1306,26);
            if ( state.backtracking==0 ) {System.out.print("ON ");}
            dbg.location(1306,53);
            match(input,57,FOLLOW_57_in_chromosome_clause4924); if (state.failed) return ;
            dbg.location(1306,66);
            if ( state.backtracking==0 ) {System.out.print("CHROMOSOME ");}
            dbg.location(1306,101);
            pushFollow(FOLLOW_chromosome_value_predicand_in_chromosome_clause4928);
            chromosome_value_predicand();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 148, chromosome_clause_StartIndex); }

        }
        dbg.location(1306, 126);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "chromosome_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "chromosome_clause"



    // $ANTLR start "chromosome_value_predicand"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1308:1: chromosome_value_predicand : row_value_predicand ;
    public final void chromosome_value_predicand() throws RecognitionException {
        int chromosome_value_predicand_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "chromosome_value_predicand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1308, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 149) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1308:34: ( row_value_predicand )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1308:36: row_value_predicand
            {
            dbg.location(1308,36);
            pushFollow(FOLLOW_row_value_predicand_in_chromosome_value_predicand4942);
            row_value_predicand();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 149, chromosome_value_predicand_StartIndex); }

        }
        dbg.location(1308, 54);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "chromosome_value_predicand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "chromosome_value_predicand"



    // $ANTLR start "map_clause"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1310:1: map_clause : 'ON' 'MAP' map_value_predicand ;
    public final void map_clause() throws RecognitionException {
        int map_clause_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "map_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1310, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 150) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1310:13: ( 'ON' 'MAP' map_value_predicand )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1310:17: 'ON' 'MAP' map_value_predicand
            {
            dbg.location(1310,17);
            match(input,102,FOLLOW_102_in_map_clause4953); if (state.failed) return ;
            dbg.location(1310,22);
            if ( state.backtracking==0 ) {System.out.print("ON ");}
            dbg.location(1310,49);
            match(input,94,FOLLOW_94_in_map_clause4957); if (state.failed) return ;
            dbg.location(1310,55);
            if ( state.backtracking==0 ) {System.out.print("MAP ");}
            dbg.location(1310,83);
            pushFollow(FOLLOW_map_value_predicand_in_map_clause4961);
            map_value_predicand();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 150, map_clause_StartIndex); }

        }
        dbg.location(1310, 101);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "map_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "map_clause"



    // $ANTLR start "map_value_predicand"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1312:1: map_value_predicand : row_value_predicand ;
    public final void map_value_predicand() throws RecognitionException {
        int map_value_predicand_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "map_value_predicand");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1312, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 151) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1312:21: ( row_value_predicand )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1312:24: row_value_predicand
            {
            dbg.location(1312,24);
            pushFollow(FOLLOW_row_value_predicand_in_map_value_predicand4970);
            row_value_predicand();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 151, map_value_predicand_StartIndex); }

        }
        dbg.location(1312, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "map_value_predicand");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "map_value_predicand"



    // $ANTLR start "reference_polymorphism_clause"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1314:1: reference_polymorphism_clause : 'USING' 'REFERENCE' (one= Single_Quote )? row_value_predicand (two= Single_Quote )? ;
    public final void reference_polymorphism_clause() throws RecognitionException {
        int reference_polymorphism_clause_StartIndex = input.index();

        Token one=null;
        Token two=null;

        try { dbg.enterRule(getGrammarFileName(), "reference_polymorphism_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1314, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 152) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1314:31: ( 'USING' 'REFERENCE' (one= Single_Quote )? row_value_predicand (two= Single_Quote )? )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1314:34: 'USING' 'REFERENCE' (one= Single_Quote )? row_value_predicand (two= Single_Quote )?
            {
            dbg.location(1314,34);
            match(input,132,FOLLOW_132_in_reference_polymorphism_clause4979); if (state.failed) return ;
            dbg.location(1314,42);
            if ( state.backtracking==0 ) {System.out.print(" USING ");}
            dbg.location(1314,73);
            match(input,109,FOLLOW_109_in_reference_polymorphism_clause4983); if (state.failed) return ;
            dbg.location(1314,85);
            if ( state.backtracking==0 ) {System.out.print("REFERENCE ");}
            dbg.location(1315,4);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1315:4: (one= Single_Quote )?
            int alt122=2;
            try { dbg.enterSubRule(122);
            try { dbg.enterDecision(122, decisionCanBacktrack[122]);

            int LA122_0 = input.LA(1);

            if ( (LA122_0==Single_Quote) ) {
                int LA122_1 = input.LA(2);

                if ( (synpred172_psqlgrammar()) ) {
                    alt122=1;
                }
            }
            } finally {dbg.exitDecision(122);}

            switch (alt122) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1315:5: one= Single_Quote
                    {
                    dbg.location(1315,8);
                    one=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_reference_polymorphism_clause4994); if (state.failed) return ;
                    dbg.location(1315,22);
                    if ( state.backtracking==0 ) {System.out.print((one!=null?one.getText():null));}

                    }
                    break;

            }
            } finally {dbg.exitSubRule(122);}

            dbg.location(1315,55);
            pushFollow(FOLLOW_row_value_predicand_in_reference_polymorphism_clause5000);
            row_value_predicand();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1315,75);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1315:75: (two= Single_Quote )?
            int alt123=2;
            try { dbg.enterSubRule(123);
            try { dbg.enterDecision(123, decisionCanBacktrack[123]);

            int LA123_0 = input.LA(1);

            if ( (LA123_0==Single_Quote) ) {
                alt123=1;
            }
            } finally {dbg.exitDecision(123);}

            switch (alt123) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1315:76: two= Single_Quote
                    {
                    dbg.location(1315,79);
                    two=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_reference_polymorphism_clause5005); if (state.failed) return ;
                    dbg.location(1315,94);
                    if ( state.backtracking==0 ) {System.out.print((two!=null?two.getText():null));}

                    }
                    break;

            }
            } finally {dbg.exitSubRule(123);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 152, reference_polymorphism_clause_StartIndex); }

        }
        dbg.location(1315, 125);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "reference_polymorphism_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "reference_polymorphism_clause"



    // $ANTLR start "ontology_child_predicate"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1333:1: ontology_child_predicate : row_value_special_case child_predicate_part_2 ;
    public final void ontology_child_predicate() throws RecognitionException {
        int ontology_child_predicate_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "ontology_child_predicate");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1333, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 153) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1334:2: ( row_value_special_case child_predicate_part_2 )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1334:6: row_value_special_case child_predicate_part_2
            {
            dbg.location(1334,6);
            pushFollow(FOLLOW_row_value_special_case_in_ontology_child_predicate5030);
            row_value_special_case();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1334,29);
            pushFollow(FOLLOW_child_predicate_part_2_in_ontology_child_predicate5032);
            child_predicate_part_2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 153, ontology_child_predicate_StartIndex); }

        }
        dbg.location(1334, 50);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ontology_child_predicate");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ontology_child_predicate"



    // $ANTLR start "child_predicate_part_2"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1335:1: child_predicate_part_2 : ontology_relation term_value_expression ontology_clause ;
    public final void child_predicate_part_2() throws RecognitionException {
        int child_predicate_part_2_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "child_predicate_part_2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1335, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 154) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1336:2: ( ontology_relation term_value_expression ontology_clause )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1336:5: ontology_relation term_value_expression ontology_clause
            {
            dbg.location(1336,5);
            pushFollow(FOLLOW_ontology_relation_in_child_predicate_part_25041);
            ontology_relation();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1336,24);
            pushFollow(FOLLOW_term_value_expression_in_child_predicate_part_25044);
            term_value_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1336,46);
            pushFollow(FOLLOW_ontology_clause_in_child_predicate_part_25046);
            ontology_clause();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 154, child_predicate_part_2_StartIndex); }

        }
        dbg.location(1336, 60);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "child_predicate_part_2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "child_predicate_part_2"



    // $ANTLR start "ontology_relation"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1338:1: ontology_relation : ( 'IS-A' | 'PART-OF' | 'REGULATES' )+ ;
    public final void ontology_relation() throws RecognitionException {
        int ontology_relation_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "ontology_relation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1338, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 155) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1339:2: ( ( 'IS-A' | 'PART-OF' | 'REGULATES' )+ )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1339:4: ( 'IS-A' | 'PART-OF' | 'REGULATES' )+
            {
            dbg.location(1339,4);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1339:4: ( 'IS-A' | 'PART-OF' | 'REGULATES' )+
            int cnt124=0;
            try { dbg.enterSubRule(124);

            loop124:
            do {
                int alt124=4;
                try { dbg.enterDecision(124, decisionCanBacktrack[124]);

                switch ( input.LA(1) ) {
                case 85:
                    {
                    alt124=1;
                    }
                    break;
                case 108:
                    {
                    alt124=2;
                    }
                    break;
                case 110:
                    {
                    alt124=3;
                    }
                    break;

                }

                } finally {dbg.exitDecision(124);}

                switch (alt124) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1339:5: 'IS-A'
            	    {
            	    dbg.location(1339,5);
            	    match(input,85,FOLLOW_85_in_ontology_relation5057); if (state.failed) return ;
            	    dbg.location(1339,12);
            	    if ( state.backtracking==0 ) {System.out.print(" IS-A");}

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1339:43: 'PART-OF'
            	    {
            	    dbg.location(1339,43);
            	    match(input,108,FOLLOW_108_in_ontology_relation5063); if (state.failed) return ;
            	    dbg.location(1339,53);
            	    if ( state.backtracking==0 ) {System.out.print(" PART-OF ");}

            	    }
            	    break;
            	case 3 :
            	    dbg.enterAlt(3);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1339:88: 'REGULATES'
            	    {
            	    dbg.location(1339,88);
            	    match(input,110,FOLLOW_110_in_ontology_relation5069); if (state.failed) return ;
            	    dbg.location(1339,100);
            	    if ( state.backtracking==0 ) {System.out.print(" REGULATES ");}

            	    }
            	    break;

            	default :
            	    if ( cnt124 >= 1 ) break loop124;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(124, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt124++;
            } while (true);
            } finally {dbg.exitSubRule(124);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 155, ontology_relation_StartIndex); }

        }
        dbg.location(1339, 136);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ontology_relation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ontology_relation"



    // $ANTLR start "term_value_expression"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1345:1: term_value_expression : (one= Single_Quote )? (e= non_terminal_identifier )* (two= Single_Quote )? ;
    public final void term_value_expression() throws RecognitionException {
        int term_value_expression_StartIndex = input.index();

        Token one=null;
        Token two=null;
        String e =null;




        	//int counter = 0;
        	int counter2 = 0;
        	int beginone = 0;
        	int wcounter = 0;
        	Mark marker = new Mark();	
        	//StringBuffer z = new StringBuffer();
        	StringBuffer n = new StringBuffer();
        	//StringBuffer zz = new StringBuffer();
        	

        try { dbg.enterRule(getGrammarFileName(), "term_value_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1345, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 156) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1358:2: ( (one= Single_Quote )? (e= non_terminal_identifier )* (two= Single_Quote )? )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1358:5: (one= Single_Quote )? (e= non_terminal_identifier )* (two= Single_Quote )?
            {
            dbg.location(1358,5);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1358:5: (one= Single_Quote )?
            int alt125=2;
            try { dbg.enterSubRule(125);
            try { dbg.enterDecision(125, decisionCanBacktrack[125]);

            int LA125_0 = input.LA(1);

            if ( (LA125_0==Single_Quote) ) {
                int LA125_1 = input.LA(2);

                if ( (synpred177_psqlgrammar()) ) {
                    alt125=1;
                }
            }
            } finally {dbg.exitDecision(125);}

            switch (alt125) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1358:6: one= Single_Quote
                    {
                    dbg.location(1358,9);
                    one=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_term_value_expression5097); if (state.failed) return ;
                    dbg.location(1358,23);
                    if ( state.backtracking==0 ) {System.out.print(" " + (one!=null?one.getText():null));}

                    }
                    break;

            }
            } finally {dbg.exitSubRule(125);}

            dbg.location(1358,63);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1358:63: (e= non_terminal_identifier )*
            try { dbg.enterSubRule(126);

            loop126:
            do {
                int alt126=2;
                try { dbg.enterDecision(126, decisionCanBacktrack[126]);

                int LA126_0 = input.LA(1);

                if ( (LA126_0==Regular_Identifier) ) {
                    alt126=1;
                }


                } finally {dbg.exitDecision(126);}

                switch (alt126) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1358:64: e= non_terminal_identifier
            	    {
            	    dbg.location(1358,65);
            	    pushFollow(FOLLOW_non_terminal_identifier_in_term_value_expression5107);
            	    e=non_terminal_identifier();

            	    state._fsp--;
            	    if (state.failed) return ;
            	    dbg.location(1358,90);
            	    if ( state.backtracking==0 ) {
            	    		
            	    		counter2 = counter2 + 1; 
            	    		Integer k = new Integer(counter2);
            	    		memory2.put(k , e);
            	    	
            	    	}

            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);
            } finally {dbg.exitSubRule(126);}

            dbg.location(1364,6);
            if ( state.backtracking==0 ) { for ( int j = 1; j <= counter2 ; j++) {
            	      if ( j == 1) {
                                         	String m = (String) memory2.get(j);
                                       	n.insert(0, m);
                                         }
                                         else
                                         	{ 
                                         	 	String m = (String) memory2.get(j);
                                    		n.append(" ");
                                         		n.append(m);
                                         }

            	}   
            	System.out.print(n.toString());}
            dbg.location(1378,3);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1378:3: (two= Single_Quote )?
            int alt127=2;
            try { dbg.enterSubRule(127);
            try { dbg.enterDecision(127, decisionCanBacktrack[127]);

            int LA127_0 = input.LA(1);

            if ( (LA127_0==Single_Quote) ) {
                alt127=1;
            }
            } finally {dbg.exitDecision(127);}

            switch (alt127) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1378:4: two= Single_Quote
                    {
                    dbg.location(1378,7);
                    two=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_term_value_expression5121); if (state.failed) return ;
                    dbg.location(1378,21);
                    if ( state.backtracking==0 ) {System.out.print((two!=null?two.getText():null));}

                    }
                    break;

            }
            } finally {dbg.exitSubRule(127);}

            dbg.location(1378,54);
            if ( state.backtracking==0 ) {System.out.print(" ");}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 156, term_value_expression_StartIndex); }

        }
        dbg.location(1378, 77);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "term_value_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "term_value_expression"



    // $ANTLR start "ontology_clause"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1380:1: ontology_clause : 'IN' 'ONTOLOGY' (threequote= Single_Quote )? ontology_value_expression (fourquote= Single_Quote )? ( 'EXCLUSIVE' | 'INCLUSIVE' )+ ;
    public final void ontology_clause() throws RecognitionException {
        int ontology_clause_StartIndex = input.index();

        Token threequote=null;
        Token fourquote=null;

        try { dbg.enterRule(getGrammarFileName(), "ontology_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1380, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 157) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1381:2: ( 'IN' 'ONTOLOGY' (threequote= Single_Quote )? ontology_value_expression (fourquote= Single_Quote )? ( 'EXCLUSIVE' | 'INCLUSIVE' )+ )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1381:4: 'IN' 'ONTOLOGY' (threequote= Single_Quote )? ontology_value_expression (fourquote= Single_Quote )? ( 'EXCLUSIVE' | 'INCLUSIVE' )+
            {
            dbg.location(1381,4);
            match(input,80,FOLLOW_80_in_ontology_clause5137); if (state.failed) return ;
            dbg.location(1381,9);
            if ( state.backtracking==0 ) {System.out.print("IN");}
            dbg.location(1381,36);
            match(input,103,FOLLOW_103_in_ontology_clause5142); if (state.failed) return ;
            dbg.location(1381,47);
            if ( state.backtracking==0 ) {System.out.print(" " + "ONTOLOGY" + " ");}
            dbg.location(1382,4);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1382:4: (threequote= Single_Quote )?
            int alt128=2;
            try { dbg.enterSubRule(128);
            try { dbg.enterDecision(128, decisionCanBacktrack[128]);

            int LA128_0 = input.LA(1);

            if ( (LA128_0==Single_Quote) ) {
                alt128=1;
            }
            } finally {dbg.exitDecision(128);}

            switch (alt128) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1382:5: threequote= Single_Quote
                    {
                    dbg.location(1382,15);
                    threequote=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_ontology_clause5153); if (state.failed) return ;
                    dbg.location(1382,29);
                    if ( state.backtracking==0 ) {System.out.print((threequote!=null?threequote.getText():null));}

                    }
                    break;

            }
            } finally {dbg.exitSubRule(128);}

            dbg.location(1382,69);
            pushFollow(FOLLOW_ontology_value_expression_in_ontology_clause5159);
            ontology_value_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1382,95);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1382:95: (fourquote= Single_Quote )?
            int alt129=2;
            try { dbg.enterSubRule(129);
            try { dbg.enterDecision(129, decisionCanBacktrack[129]);

            int LA129_0 = input.LA(1);

            if ( (LA129_0==Single_Quote) ) {
                alt129=1;
            }
            } finally {dbg.exitDecision(129);}

            switch (alt129) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1382:96: fourquote= Single_Quote
                    {
                    dbg.location(1382,105);
                    fourquote=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_ontology_clause5164); if (state.failed) return ;
                    dbg.location(1382,119);
                    if ( state.backtracking==0 ) {System.out.print((fourquote!=null?fourquote.getText():null));}

                    }
                    break;

            }
            } finally {dbg.exitSubRule(129);}

            dbg.location(1383,4);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1383:4: ( 'EXCLUSIVE' | 'INCLUSIVE' )+
            int cnt130=0;
            try { dbg.enterSubRule(130);

            loop130:
            do {
                int alt130=3;
                try { dbg.enterDecision(130, decisionCanBacktrack[130]);

                int LA130_0 = input.LA(1);

                if ( (LA130_0==69) ) {
                    alt130=1;
                }
                else if ( (LA130_0==81) ) {
                    alt130=2;
                }


                } finally {dbg.exitDecision(130);}

                switch (alt130) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1383:5: 'EXCLUSIVE'
            	    {
            	    dbg.location(1383,5);
            	    match(input,69,FOLLOW_69_in_ontology_clause5175); if (state.failed) return ;
            	    dbg.location(1383,17);
            	    if ( state.backtracking==0 ) {System.out.print(" " + "EXCLUSIVE" + " ");}

            	    }
            	    break;
            	case 2 :
            	    dbg.enterAlt(2);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1383:64: 'INCLUSIVE'
            	    {
            	    dbg.location(1383,64);
            	    match(input,81,FOLLOW_81_in_ontology_clause5181); if (state.failed) return ;
            	    dbg.location(1383,76);
            	    if ( state.backtracking==0 ) {System.out.print(" " + "INCLUSIVE" + " ");}

            	    }
            	    break;

            	default :
            	    if ( cnt130 >= 1 ) break loop130;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(130, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt130++;
            } while (true);
            } finally {dbg.exitSubRule(130);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 157, ontology_clause_StartIndex); }

        }
        dbg.location(1383, 121);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ontology_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ontology_clause"



    // $ANTLR start "ontology_value_expression"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1385:1: ontology_value_expression : string_value_expression ;
    public final void ontology_value_expression() throws RecognitionException {
        int ontology_value_expression_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "ontology_value_expression");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1385, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 158) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1386:2: ( string_value_expression )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1386:5: string_value_expression
            {
            dbg.location(1386,5);
            pushFollow(FOLLOW_string_value_expression_in_ontology_value_expression5197);
            string_value_expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 158, ontology_value_expression_StartIndex); }

        }
        dbg.location(1386, 27);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ontology_value_expression");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ontology_value_expression"



    // $ANTLR start "collate_clause"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1395:1: collate_clause : 'COLLATE' fully_qualified_identifier ;
    public final void collate_clause() throws RecognitionException {
        int collate_clause_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "collate_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1395, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 159) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1395:18: ( 'COLLATE' fully_qualified_identifier )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1395:21: 'COLLATE' fully_qualified_identifier
            {
            dbg.location(1395,21);
            match(input,59,FOLLOW_59_in_collate_clause5212); if (state.failed) return ;
            dbg.location(1395,31);
            pushFollow(FOLLOW_fully_qualified_identifier_in_collate_clause5214);
            fully_qualified_identifier();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 159, collate_clause_StartIndex); }

        }
        dbg.location(1395, 57);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "collate_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "collate_clause"



    // $ANTLR start "aggregate_function"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1404:1: aggregate_function options {k=1; } : ( 'COUNT' Left_Paren Asterisk Right_Paren ( filter_clause )? | general_set_function ( filter_clause )? );
    public final void aggregate_function() throws RecognitionException {
        int aggregate_function_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "aggregate_function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1404, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 160) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1406:2: ( 'COUNT' Left_Paren Asterisk Right_Paren ( filter_clause )? | general_set_function ( filter_clause )? )
            int alt133=2;
            try { dbg.enterDecision(133, decisionCanBacktrack[133]);

            int LA133_0 = input.LA(1);

            if ( (LA133_0==61) ) {
                int LA133_1 = input.LA(2);

                if ( (synpred185_psqlgrammar()) ) {
                    alt133=1;
                }
                else if ( (true) ) {
                    alt133=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 133, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else if ( (LA133_0==48||LA133_0==52||LA133_0==60||LA133_0==67||LA133_0==76||LA133_0==84||(LA133_0 >= 96 && LA133_0 <= 97)||(LA133_0 >= 118 && LA133_0 <= 120)||LA133_0==122||(LA133_0 >= 133 && LA133_0 <= 134)) ) {
                alt133=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(133);}

            switch (alt133) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1406:4: 'COUNT' Left_Paren Asterisk Right_Paren ( filter_clause )?
                    {
                    dbg.location(1406,4);
                    match(input,61,FOLLOW_61_in_aggregate_function5235); if (state.failed) return ;
                    dbg.location(1406,12);
                    match(input,Left_Paren,FOLLOW_Left_Paren_in_aggregate_function5237); if (state.failed) return ;
                    dbg.location(1406,23);
                    match(input,Asterisk,FOLLOW_Asterisk_in_aggregate_function5239); if (state.failed) return ;
                    dbg.location(1406,32);
                    match(input,Right_Paren,FOLLOW_Right_Paren_in_aggregate_function5241); if (state.failed) return ;
                    dbg.location(1406,44);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1406:44: ( filter_clause )?
                    int alt131=2;
                    try { dbg.enterSubRule(131);
                    try { dbg.enterDecision(131, decisionCanBacktrack[131]);

                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==71) ) {
                        alt131=1;
                    }
                    } finally {dbg.exitDecision(131);}

                    switch (alt131) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1406:46: filter_clause
                            {
                            dbg.location(1406,46);
                            pushFollow(FOLLOW_filter_clause_in_aggregate_function5245);
                            filter_clause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(131);}


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1407:4: general_set_function ( filter_clause )?
                    {
                    dbg.location(1407,4);
                    pushFollow(FOLLOW_general_set_function_in_aggregate_function5254);
                    general_set_function();

                    state._fsp--;
                    if (state.failed) return ;
                    dbg.location(1407,26);
                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1407:26: ( filter_clause )?
                    int alt132=2;
                    try { dbg.enterSubRule(132);
                    try { dbg.enterDecision(132, decisionCanBacktrack[132]);

                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==71) ) {
                        alt132=1;
                    }
                    } finally {dbg.exitDecision(132);}

                    switch (alt132) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1407:28: filter_clause
                            {
                            dbg.location(1407,28);
                            pushFollow(FOLLOW_filter_clause_in_aggregate_function5259);
                            filter_clause();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(132);}


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 160, aggregate_function_StartIndex); }

        }
        dbg.location(1410, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "aggregate_function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "aggregate_function"



    // $ANTLR start "general_set_function"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1412:1: general_set_function options {k=1; } : set_function_type Left_Paren ( set_quantifier )? value_expression Right_Paren ;
    public final void general_set_function() throws RecognitionException {
        int general_set_function_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "general_set_function");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1412, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 161) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1414:2: ( set_function_type Left_Paren ( set_quantifier )? value_expression Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1414:5: set_function_type Left_Paren ( set_quantifier )? value_expression Right_Paren
            {
            dbg.location(1414,5);
            pushFollow(FOLLOW_set_function_type_in_general_set_function5287);
            set_function_type();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1414,24);
            match(input,Left_Paren,FOLLOW_Left_Paren_in_general_set_function5290); if (state.failed) return ;
            dbg.location(1414,35);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1414:35: ( set_quantifier )?
            int alt134=2;
            try { dbg.enterSubRule(134);
            try { dbg.enterDecision(134, decisionCanBacktrack[134]);

            int LA134_0 = input.LA(1);

            if ( (LA134_0==46||LA134_0==65) ) {
                alt134=1;
            }
            } finally {dbg.exitDecision(134);}

            switch (alt134) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1414:37: set_quantifier
                    {
                    dbg.location(1414,37);
                    pushFollow(FOLLOW_set_quantifier_in_general_set_function5294);
                    set_quantifier();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(134);}

            dbg.location(1414,56);
            pushFollow(FOLLOW_value_expression_in_general_set_function5300);
            value_expression();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1414,74);
            match(input,Right_Paren,FOLLOW_Right_Paren_in_general_set_function5303); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 161, general_set_function_StartIndex); }

        }
        dbg.location(1414, 84);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "general_set_function");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "general_set_function"



    // $ANTLR start "set_function_type"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1416:1: set_function_type : computational_operation ;
    public final void set_function_type() throws RecognitionException {
        int set_function_type_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "set_function_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1416, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 162) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1416:21: ( computational_operation )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1416:24: computational_operation
            {
            dbg.location(1416,24);
            pushFollow(FOLLOW_computational_operation_in_set_function_type5314);
            computational_operation();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 162, set_function_type_StartIndex); }

        }
        dbg.location(1416, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "set_function_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "set_function_type"



    // $ANTLR start "computational_operation"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1418:1: computational_operation : ( 'AVG' | 'MAX' | 'MIN' | 'SUM' | 'EVERY' | 'ANY' | 'SOME' | 'COUNT' | 'STDDEV_POP' | 'STDDEV_SAMP' | 'VAR_SAMP' | 'VAR_POP' | 'COLLECT' | 'FUSION' | 'INTERSECTION' );
    public final void computational_operation() throws RecognitionException {
        int computational_operation_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "computational_operation");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1418, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 163) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1418:26: ( 'AVG' | 'MAX' | 'MIN' | 'SUM' | 'EVERY' | 'ANY' | 'SOME' | 'COUNT' | 'STDDEV_POP' | 'STDDEV_SAMP' | 'VAR_SAMP' | 'VAR_POP' | 'COLLECT' | 'FUSION' | 'INTERSECTION' )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            dbg.location(1418,26);
            if ( input.LA(1)==48||input.LA(1)==52||(input.LA(1) >= 60 && input.LA(1) <= 61)||input.LA(1)==67||input.LA(1)==76||input.LA(1)==84||(input.LA(1) >= 96 && input.LA(1) <= 97)||(input.LA(1) >= 118 && input.LA(1) <= 120)||input.LA(1)==122||(input.LA(1) >= 133 && input.LA(1) <= 134) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 163, computational_operation_StartIndex); }

        }
        dbg.location(1424, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "computational_operation");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "computational_operation"



    // $ANTLR start "filter_clause"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1429:1: filter_clause : 'FILTER' Left_Paren 'WHERE' search_condition Right_Paren ;
    public final void filter_clause() throws RecognitionException {
        int filter_clause_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "filter_clause");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1429, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 164) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1429:17: ( 'FILTER' Left_Paren 'WHERE' search_condition Right_Paren )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1429:20: 'FILTER' Left_Paren 'WHERE' search_condition Right_Paren
            {
            dbg.location(1429,20);
            match(input,71,FOLLOW_71_in_filter_clause5402); if (state.failed) return ;
            dbg.location(1429,29);
            match(input,Left_Paren,FOLLOW_Left_Paren_in_filter_clause5404); if (state.failed) return ;
            dbg.location(1429,40);
            match(input,135,FOLLOW_135_in_filter_clause5406); if (state.failed) return ;
            dbg.location(1429,48);
            pushFollow(FOLLOW_search_condition_in_filter_clause5408);
            search_condition();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1429,66);
            match(input,Right_Paren,FOLLOW_Right_Paren_in_filter_clause5411); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 164, filter_clause_StartIndex); }

        }
        dbg.location(1429, 76);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "filter_clause");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "filter_clause"



    // $ANTLR start "sort_specification_list"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1479:1: sort_specification_list : sort_specification ( Comma sort_specification )* ;
    public final void sort_specification_list() throws RecognitionException {
        int sort_specification_list_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "sort_specification_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1479, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 165) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1479:27: ( sort_specification ( Comma sort_specification )* )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1479:30: sort_specification ( Comma sort_specification )*
            {
            dbg.location(1479,30);
            pushFollow(FOLLOW_sort_specification_in_sort_specification_list5428);
            sort_specification();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1479,50);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1479:50: ( Comma sort_specification )*
            try { dbg.enterSubRule(135);

            loop135:
            do {
                int alt135=2;
                try { dbg.enterDecision(135, decisionCanBacktrack[135]);

                int LA135_0 = input.LA(1);

                if ( (LA135_0==Comma) ) {
                    alt135=1;
                }


                } finally {dbg.exitDecision(135);}

                switch (alt135) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1479:52: Comma sort_specification
            	    {
            	    dbg.location(1479,52);
            	    match(input,Comma,FOLLOW_Comma_in_sort_specification_list5433); if (state.failed) return ;
            	    dbg.location(1479,58);
            	    pushFollow(FOLLOW_sort_specification_in_sort_specification_list5435);
            	    sort_specification();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);
            } finally {dbg.exitSubRule(135);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 165, sort_specification_list_StartIndex); }

        }
        dbg.location(1479, 79);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sort_specification_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "sort_specification_list"



    // $ANTLR start "sort_specification"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1481:1: sort_specification : sort_key ( ordering_specification )? ( null_ordering )? ;
    public final void sort_specification() throws RecognitionException {
        int sort_specification_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "sort_specification");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1481, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 166) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1481:22: ( sort_key ( ordering_specification )? ( null_ordering )? )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1481:25: sort_key ( ordering_specification )? ( null_ordering )?
            {
            dbg.location(1481,25);
            pushFollow(FOLLOW_sort_key_in_sort_specification5450);
            sort_key();

            state._fsp--;
            if (state.failed) return ;
            dbg.location(1481,35);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1481:35: ( ordering_specification )?
            int alt136=2;
            try { dbg.enterSubRule(136);
            try { dbg.enterDecision(136, decisionCanBacktrack[136]);

            int LA136_0 = input.LA(1);

            if ( (LA136_0==50||LA136_0==64) ) {
                alt136=1;
            }
            } finally {dbg.exitDecision(136);}

            switch (alt136) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1481:37: ordering_specification
                    {
                    dbg.location(1481,37);
                    pushFollow(FOLLOW_ordering_specification_in_sort_specification5455);
                    ordering_specification();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(136);}

            dbg.location(1481,64);
            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1481:64: ( null_ordering )?
            int alt137=2;
            try { dbg.enterSubRule(137);
            try { dbg.enterDecision(137, decisionCanBacktrack[137]);

            int LA137_0 = input.LA(1);

            if ( (LA137_0==100) ) {
                alt137=1;
            }
            } finally {dbg.exitDecision(137);}

            switch (alt137) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1481:66: null_ordering
                    {
                    dbg.location(1481,66);
                    pushFollow(FOLLOW_null_ordering_in_sort_specification5463);
                    null_ordering();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
            } finally {dbg.exitSubRule(137);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 166, sort_specification_StartIndex); }

        }
        dbg.location(1481, 82);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sort_specification");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "sort_specification"



    // $ANTLR start "sort_key"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1483:1: sort_key : value_expression ;
    public final void sort_key() throws RecognitionException {
        int sort_key_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "sort_key");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1483, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 167) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1483:12: ( value_expression )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1483:15: value_expression
            {
            dbg.location(1483,15);
            pushFollow(FOLLOW_value_expression_in_sort_key5478);
            value_expression();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 167, sort_key_StartIndex); }

        }
        dbg.location(1483, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "sort_key");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "sort_key"



    // $ANTLR start "ordering_specification"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1485:1: ordering_specification : ( 'ASC' | 'DESC' );
    public final void ordering_specification() throws RecognitionException {
        int ordering_specification_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "ordering_specification");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1485, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 168) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1485:26: ( 'ASC' | 'DESC' )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:
            {
            dbg.location(1485,26);
            if ( input.LA(1)==50||input.LA(1)==64 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 168, ordering_specification_StartIndex); }

        }
        dbg.location(1485, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ordering_specification");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "ordering_specification"



    // $ANTLR start "null_ordering"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1487:1: null_ordering : ( 'NULLS' 'FIRST' | 'NULLS' 'LAST' );
    public final void null_ordering() throws RecognitionException {
        int null_ordering_StartIndex = input.index();

        try { dbg.enterRule(getGrammarFileName(), "null_ordering");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1487, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 169) ) { return ; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1487:17: ( 'NULLS' 'FIRST' | 'NULLS' 'LAST' )
            int alt138=2;
            try { dbg.enterDecision(138, decisionCanBacktrack[138]);

            int LA138_0 = input.LA(1);

            if ( (LA138_0==100) ) {
                int LA138_1 = input.LA(2);

                if ( (LA138_1==72) ) {
                    alt138=1;
                }
                else if ( (LA138_1==88) ) {
                    alt138=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 138, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(138);}

            switch (alt138) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1487:20: 'NULLS' 'FIRST'
                    {
                    dbg.location(1487,20);
                    match(input,100,FOLLOW_100_in_null_ordering5505); if (state.failed) return ;
                    dbg.location(1487,28);
                    match(input,72,FOLLOW_72_in_null_ordering5507); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1487:38: 'NULLS' 'LAST'
                    {
                    dbg.location(1487,38);
                    match(input,100,FOLLOW_100_in_null_ordering5511); if (state.failed) return ;
                    dbg.location(1487,46);
                    match(input,88,FOLLOW_88_in_null_ordering5513); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 169, null_ordering_StartIndex); }

        }
        dbg.location(1487, 51);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "null_ordering");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "null_ordering"



    // $ANTLR start "non_terminal_identifier"
    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1490:1: non_terminal_identifier returns [String value] : Regular_Identifier ;
    public final String non_terminal_identifier() throws RecognitionException {
        String value = null;

        int non_terminal_identifier_StartIndex = input.index();

        Token Regular_Identifier39=null;

        try { dbg.enterRule(getGrammarFileName(), "non_terminal_identifier");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(1490, 0);

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 170) ) { return value; }

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1490:47: ( Regular_Identifier )
            dbg.enterAlt(1);

            // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1490:49: Regular_Identifier
            {
            dbg.location(1490,49);
            Regular_Identifier39=(Token)match(input,Regular_Identifier,FOLLOW_Regular_Identifier_in_non_terminal_identifier5525); if (state.failed) return value;
            dbg.location(1490,68);
            if ( state.backtracking==0 ) {value = (Regular_Identifier39!=null?Regular_Identifier39.getText():null);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 170, non_terminal_identifier_StartIndex); }

        }
        dbg.location(1490, 103);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "non_terminal_identifier");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return value;
    }
    // $ANTLR end "non_terminal_identifier"

    // $ANTLR start synpred12_psqlgrammar
    public final void synpred12_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:165:4: ( non_join_query_expression )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:165:4: non_join_query_expression
        {
        dbg.location(165,4);
        pushFollow(FOLLOW_non_join_query_expression_in_synpred12_psqlgrammar718);
        non_join_query_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_psqlgrammar

    // $ANTLR start synpred13_psqlgrammar
    public final void synpred13_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:171:6: ( non_join_query_term )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:171:6: non_join_query_term
        {
        dbg.location(171,6);
        pushFollow(FOLLOW_non_join_query_term_in_synpred13_psqlgrammar745);
        non_join_query_term();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_psqlgrammar

    // $ANTLR start synpred21_psqlgrammar
    public final void synpred21_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:185:5: ( non_join_query_term )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:185:5: non_join_query_term
        {
        dbg.location(185,5);
        pushFollow(FOLLOW_non_join_query_term_in_synpred21_psqlgrammar856);
        non_join_query_term();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred21_psqlgrammar

    // $ANTLR start synpred35_psqlgrammar
    public final void synpred35_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:217:4: ( common_value_expression )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:217:4: common_value_expression
        {
        dbg.location(217,4);
        pushFollow(FOLLOW_common_value_expression_in_synpred35_psqlgrammar1111);
        common_value_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred35_psqlgrammar

    // $ANTLR start synpred36_psqlgrammar
    public final void synpred36_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:224:4: ( numeric_value_expression )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:224:4: numeric_value_expression
        {
        dbg.location(224,4);
        pushFollow(FOLLOW_numeric_value_expression_in_synpred36_psqlgrammar1131);
        numeric_value_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred36_psqlgrammar

    // $ANTLR start synpred45_psqlgrammar
    public final void synpred45_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:345:5: ( character_substring_function )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:345:5: character_substring_function
        {
        dbg.location(345,5);
        pushFollow(FOLLOW_character_substring_function_in_synpred45_psqlgrammar1428);
        character_substring_function();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred45_psqlgrammar

    // $ANTLR start synpred46_psqlgrammar
    public final void synpred46_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:346:6: ( regular_expression_substring_function )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:346:6: regular_expression_substring_function
        {
        dbg.location(346,6);
        pushFollow(FOLLOW_regular_expression_substring_function_in_synpred46_psqlgrammar1435);
        regular_expression_substring_function();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred46_psqlgrammar

    // $ANTLR start synpred63_psqlgrammar
    public final void synpred63_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:528:6: ( table_primary )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:528:6: table_primary
        {
        dbg.location(528,6);
        pushFollow(FOLLOW_table_primary_in_synpred63_psqlgrammar2031);
        table_primary();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred63_psqlgrammar

    // $ANTLR start synpred74_psqlgrammar
    public final void synpred74_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:555:5: ( derived_table ( 'AS' )? ( identifier )? ( Left_Paren derived_column_list Right_Paren )? )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:555:5: derived_table ( 'AS' )? ( identifier )? ( Left_Paren derived_column_list Right_Paren )?
        {
        dbg.location(555,5);
        pushFollow(FOLLOW_derived_table_in_synpred74_psqlgrammar2172);
        derived_table();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(555,20);
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:555:20: ( 'AS' )?
        int alt147=2;
        try { dbg.enterSubRule(147);
        try { dbg.enterDecision(147, decisionCanBacktrack[147]);

        int LA147_0 = input.LA(1);

        if ( (LA147_0==49) ) {
            alt147=1;
        }
        } finally {dbg.exitDecision(147);}

        switch (alt147) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:555:22: 'AS'
                {
                dbg.location(555,22);
                match(input,49,FOLLOW_49_in_synpred74_psqlgrammar2177); if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(147);}

        dbg.location(555,30);
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:555:30: ( identifier )?
        int alt148=2;
        try { dbg.enterSubRule(148);
        try { dbg.enterDecision(148, decisionCanBacktrack[148]);

        int LA148_0 = input.LA(1);

        if ( (LA148_0==Regular_Identifier) ) {
            alt148=1;
        }
        } finally {dbg.exitDecision(148);}

        switch (alt148) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:555:31: identifier
                {
                dbg.location(555,31);
                pushFollow(FOLLOW_identifier_in_synpred74_psqlgrammar2183);
                identifier();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(148);}

        dbg.location(555,45);
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:555:45: ( Left_Paren derived_column_list Right_Paren )?
        int alt149=2;
        try { dbg.enterSubRule(149);
        try { dbg.enterDecision(149, decisionCanBacktrack[149]);

        int LA149_0 = input.LA(1);

        if ( (LA149_0==Left_Paren) ) {
            alt149=1;
        }
        } finally {dbg.exitDecision(149);}

        switch (alt149) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:555:47: Left_Paren derived_column_list Right_Paren
                {
                dbg.location(555,47);
                match(input,Left_Paren,FOLLOW_Left_Paren_in_synpred74_psqlgrammar2190); if (state.failed) return ;
                dbg.location(555,58);
                pushFollow(FOLLOW_derived_column_list_in_synpred74_psqlgrammar2192);
                derived_column_list();

                state._fsp--;
                if (state.failed) return ;
                dbg.location(555,79);
                match(input,Right_Paren,FOLLOW_Right_Paren_in_synpred74_psqlgrammar2195); if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(149);}


        }

    }
    // $ANTLR end synpred74_psqlgrammar

    // $ANTLR start synpred75_psqlgrammar
    public final void synpred75_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:582:26: ( table_name )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:582:26: table_name
        {
        dbg.location(582,26);
        pushFollow(FOLLOW_table_name_in_synpred75_psqlgrammar2237);
        table_name();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred75_psqlgrammar

    // $ANTLR start synpred91_psqlgrammar
    public final void synpred91_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:673:4: ( date_literal )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:673:4: date_literal
        {
        dbg.location(673,4);
        pushFollow(FOLLOW_date_literal_in_synpred91_psqlgrammar2665);
        date_literal();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred91_psqlgrammar

    // $ANTLR start synpred92_psqlgrammar
    public final void synpred92_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:674:4: ( col_literal )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:674:4: col_literal
        {
        dbg.location(674,4);
        pushFollow(FOLLOW_col_literal_in_synpred92_psqlgrammar2670);
        col_literal();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred92_psqlgrammar

    // $ANTLR start synpred93_psqlgrammar
    public final void synpred93_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:675:4: ( Unsigned_Integer )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:675:4: Unsigned_Integer
        {
        dbg.location(675,4);
        match(input,Unsigned_Integer,FOLLOW_Unsigned_Integer_in_synpred93_psqlgrammar2675); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred93_psqlgrammar

    // $ANTLR start synpred94_psqlgrammar
    public final void synpred94_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:686:39: ( Period identifier )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:686:39: Period identifier
        {
        dbg.location(686,39);
        match(input,Period,FOLLOW_Period_in_synpred94_psqlgrammar2748); if (state.failed) return ;
        dbg.location(686,81);
        pushFollow(FOLLOW_identifier_in_synpred94_psqlgrammar2753);
        identifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred94_psqlgrammar

    // $ANTLR start synpred117_psqlgrammar
    public final void synpred117_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:831:3: ( predicate )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:831:3: predicate
        {
        dbg.location(831,3);
        pushFollow(FOLLOW_predicate_in_synpred117_psqlgrammar3398);
        predicate();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred117_psqlgrammar

    // $ANTLR start synpred118_psqlgrammar
    public final void synpred118_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:836:4: ( parenthesized_boolean_value_expression )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:836:4: parenthesized_boolean_value_expression
        {
        dbg.location(836,4);
        pushFollow(FOLLOW_parenthesized_boolean_value_expression_in_synpred118_psqlgrammar3420);
        parenthesized_boolean_value_expression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred118_psqlgrammar

    // $ANTLR start synpred123_psqlgrammar
    public final void synpred123_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:957:4: ( comparison_predicate )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:957:4: comparison_predicate
        {
        dbg.location(957,4);
        pushFollow(FOLLOW_comparison_predicate_in_synpred123_psqlgrammar3656);
        comparison_predicate();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred123_psqlgrammar

    // $ANTLR start synpred124_psqlgrammar
    public final void synpred124_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:958:4: ( like_predicate )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:958:4: like_predicate
        {
        dbg.location(958,4);
        pushFollow(FOLLOW_like_predicate_in_synpred124_psqlgrammar3661);
        like_predicate();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred124_psqlgrammar

    // $ANTLR start synpred125_psqlgrammar
    public final void synpred125_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:959:4: ( between_predicate )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:959:4: between_predicate
        {
        dbg.location(959,4);
        pushFollow(FOLLOW_between_predicate_in_synpred125_psqlgrammar3666);
        between_predicate();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred125_psqlgrammar

    // $ANTLR start synpred126_psqlgrammar
    public final void synpred126_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:960:4: ( in_predicate )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:960:4: in_predicate
        {
        dbg.location(960,4);
        pushFollow(FOLLOW_in_predicate_in_synpred126_psqlgrammar3671);
        in_predicate();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred126_psqlgrammar

    // $ANTLR start synpred127_psqlgrammar
    public final void synpred127_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:961:4: ( quantified_comparison_predicate )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:961:4: quantified_comparison_predicate
        {
        dbg.location(961,4);
        pushFollow(FOLLOW_quantified_comparison_predicate_in_synpred127_psqlgrammar3676);
        quantified_comparison_predicate();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred127_psqlgrammar

    // $ANTLR start synpred128_psqlgrammar
    public final void synpred128_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:962:4: ( polymorphic_between_predicate )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:962:4: polymorphic_between_predicate
        {
        dbg.location(962,4);
        pushFollow(FOLLOW_polymorphic_between_predicate_in_synpred128_psqlgrammar3681);
        polymorphic_between_predicate();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred128_psqlgrammar

    // $ANTLR start synpred129_psqlgrammar
    public final void synpred129_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:963:4: ( polymorphic_range_predicate )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:963:4: polymorphic_range_predicate
        {
        dbg.location(963,4);
        pushFollow(FOLLOW_polymorphic_range_predicate_in_synpred129_psqlgrammar3686);
        polymorphic_range_predicate();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred129_psqlgrammar

    // $ANTLR start synpred135_psqlgrammar
    public final void synpred135_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1027:2: ( boolean_predicand )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1027:2: boolean_predicand
        {
        dbg.location(1027,2);
        pushFollow(FOLLOW_boolean_predicand_in_synpred135_psqlgrammar3852);
        boolean_predicand();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred135_psqlgrammar

    // $ANTLR start synpred144_psqlgrammar
    public final void synpred144_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1121:3: ( table_subquery )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1121:3: table_subquery
        {
        dbg.location(1121,3);
        pushFollow(FOLLOW_table_subquery_in_synpred144_psqlgrammar4178);
        table_subquery();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred144_psqlgrammar

    // $ANTLR start synpred146_psqlgrammar
    public final void synpred146_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1130:4: ( row_value_special_case )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1130:4: row_value_special_case
        {
        dbg.location(1130,4);
        pushFollow(FOLLOW_row_value_special_case_in_synpred146_psqlgrammar4236);
        row_value_special_case();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred146_psqlgrammar

    // $ANTLR start synpred147_psqlgrammar
    public final void synpred147_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1135:4: ( Left_Paren row_value_constructor_element Comma row_value_constructor_element_list Right_Paren )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1135:4: Left_Paren row_value_constructor_element Comma row_value_constructor_element_list Right_Paren
        {
        dbg.location(1135,4);
        match(input,Left_Paren,FOLLOW_Left_Paren_in_synpred147_psqlgrammar4258); if (state.failed) return ;
        dbg.location(1135,53);
        pushFollow(FOLLOW_row_value_constructor_element_in_synpred147_psqlgrammar4262);
        row_value_constructor_element();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1135,84);
        match(input,Comma,FOLLOW_Comma_in_synpred147_psqlgrammar4265); if (state.failed) return ;
        dbg.location(1135,122);
        pushFollow(FOLLOW_row_value_constructor_element_list_in_synpred147_psqlgrammar4268);
        row_value_constructor_element_list();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1135,158);
        match(input,Right_Paren,FOLLOW_Right_Paren_in_synpred147_psqlgrammar4271); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred147_psqlgrammar

    // $ANTLR start synpred151_psqlgrammar
    public final void synpred151_psqlgrammar_fragment() throws RecognitionException {
        Token twoquote=null;

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1169:91: (twoquote= Single_Quote )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1169:91: twoquote= Single_Quote
        {
        dbg.location(1169,99);
        twoquote=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_synpred151_psqlgrammar4391); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred151_psqlgrammar

    // $ANTLR start synpred152_psqlgrammar
    public final void synpred152_psqlgrammar_fragment() throws RecognitionException {
        Token onequote=null;
        Token twoquote=null;

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1169:4: ( (onequote= Single_Quote )? row_value_special_case (twoquote= Single_Quote )? )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1169:4: (onequote= Single_Quote )? row_value_special_case (twoquote= Single_Quote )?
        {
        dbg.location(1169,4);
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1169:4: (onequote= Single_Quote )?
        int alt157=2;
        try { dbg.enterSubRule(157);
        try { dbg.enterDecision(157, decisionCanBacktrack[157]);

        int LA157_0 = input.LA(1);

        if ( (LA157_0==Single_Quote) ) {
            alt157=1;
        }
        } finally {dbg.exitDecision(157);}

        switch (alt157) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1169:5: onequote= Single_Quote
                {
                dbg.location(1169,13);
                onequote=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_synpred152_psqlgrammar4378); if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(157);}

        dbg.location(1169,67);
        pushFollow(FOLLOW_row_value_special_case_in_synpred152_psqlgrammar4386);
        row_value_special_case();

        state._fsp--;
        if (state.failed) return ;
        dbg.location(1169,90);
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1169:90: (twoquote= Single_Quote )?
        int alt158=2;
        try { dbg.enterSubRule(158);
        try { dbg.enterDecision(158, decisionCanBacktrack[158]);

        int LA158_0 = input.LA(1);

        if ( (LA158_0==Single_Quote) ) {
            alt158=1;
        }
        } finally {dbg.exitDecision(158);}

        switch (alt158) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1169:91: twoquote= Single_Quote
                {
                dbg.location(1169,99);
                twoquote=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_synpred152_psqlgrammar4391); if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(158);}


        }

    }
    // $ANTLR end synpred152_psqlgrammar

    // $ANTLR start synpred155_psqlgrammar
    public final void synpred155_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1191:77: ( Right_Paren )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1191:77: Right_Paren
        {
        dbg.location(1191,77);
        match(input,Right_Paren,FOLLOW_Right_Paren_in_synpred155_psqlgrammar4477); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred155_psqlgrammar

    // $ANTLR start synpred156_psqlgrammar
    public final void synpred156_psqlgrammar_fragment() throws RecognitionException {
        Token one=null;

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1211:6: (one= Single_Quote )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1211:6: one= Single_Quote
        {
        dbg.location(1211,9);
        one=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_synpred156_psqlgrammar4514); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred156_psqlgrammar

    // $ANTLR start synpred157_psqlgrammar
    public final void synpred157_psqlgrammar_fragment() throws RecognitionException {
        String e =null;


        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1211:58: (e= non_terminal_identifier )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1211:58: e= non_terminal_identifier
        {
        dbg.location(1211,59);
        pushFollow(FOLLOW_non_terminal_identifier_in_synpred157_psqlgrammar4524);
        e=non_terminal_identifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred157_psqlgrammar

    // $ANTLR start synpred159_psqlgrammar
    public final void synpred159_psqlgrammar_fragment() throws RecognitionException {
        Token three=null;

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1231:92: (three= Single_Quote )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1231:92: three= Single_Quote
        {
        dbg.location(1231,97);
        three=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_synpred159_psqlgrammar4579); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred159_psqlgrammar

    // $ANTLR start synpred160_psqlgrammar
    public final void synpred160_psqlgrammar_fragment() throws RecognitionException {
        String e =null;


        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1235:79: (e= non_terminal_identifier )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1235:79: e= non_terminal_identifier
        {
        dbg.location(1235,80);
        pushFollow(FOLLOW_non_terminal_identifier_in_synpred160_psqlgrammar4743);
        e=non_terminal_identifier();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred160_psqlgrammar

    // $ANTLR start synpred162_psqlgrammar
    public final void synpred162_psqlgrammar_fragment() throws RecognitionException {
        Token three=null;
        Token four=null;
        String e =null;


        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1231:83: ( Comma (three= Single_Quote )? (e= non_terminal_identifier )* (four= Single_Quote )? )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1231:83: Comma (three= Single_Quote )? (e= non_terminal_identifier )* (four= Single_Quote )?
        {
        dbg.location(1231,83);
        match(input,Comma,FOLLOW_Comma_in_synpred162_psqlgrammar4572); if (state.failed) return ;
        dbg.location(1231,91);
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1231:91: (three= Single_Quote )?
        int alt159=2;
        try { dbg.enterSubRule(159);
        try { dbg.enterDecision(159, decisionCanBacktrack[159]);

        int LA159_0 = input.LA(1);

        if ( (LA159_0==Single_Quote) ) {
            int LA159_1 = input.LA(2);

            if ( (synpred159_psqlgrammar()) ) {
                alt159=1;
            }
        }
        } finally {dbg.exitDecision(159);}

        switch (alt159) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1231:92: three= Single_Quote
                {
                dbg.location(1231,97);
                three=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_synpred162_psqlgrammar4579); if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(159);}

        dbg.location(1235,77);
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1235:77: (e= non_terminal_identifier )*
        try { dbg.enterSubRule(160);

        loop160:
        do {
            int alt160=2;
            try { dbg.enterDecision(160, decisionCanBacktrack[160]);

            int LA160_0 = input.LA(1);

            if ( (LA160_0==Regular_Identifier) ) {
                alt160=1;
            }


            } finally {dbg.exitDecision(160);}

            switch (alt160) {
        	case 1 :
        	    dbg.enterAlt(1);

        	    // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1235:79: e= non_terminal_identifier
        	    {
        	    dbg.location(1235,80);
        	    pushFollow(FOLLOW_non_terminal_identifier_in_synpred162_psqlgrammar4743);
        	    e=non_terminal_identifier();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop160;
            }
        } while (true);
        } finally {dbg.exitSubRule(160);}

        dbg.location(1241,6);
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1241:6: (four= Single_Quote )?
        int alt161=2;
        try { dbg.enterSubRule(161);
        try { dbg.enterDecision(161, decisionCanBacktrack[161]);

        int LA161_0 = input.LA(1);

        if ( (LA161_0==Single_Quote) ) {
            alt161=1;
        }
        } finally {dbg.exitDecision(161);}

        switch (alt161) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1241:7: four= Single_Quote
                {
                dbg.location(1241,11);
                four=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_synpred162_psqlgrammar4752); if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(161);}


        }

    }
    // $ANTLR end synpred162_psqlgrammar

    // $ANTLR start synpred172_psqlgrammar
    public final void synpred172_psqlgrammar_fragment() throws RecognitionException {
        Token one=null;

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1315:5: (one= Single_Quote )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1315:5: one= Single_Quote
        {
        dbg.location(1315,8);
        one=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_synpred172_psqlgrammar4994); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred172_psqlgrammar

    // $ANTLR start synpred177_psqlgrammar
    public final void synpred177_psqlgrammar_fragment() throws RecognitionException {
        Token one=null;

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1358:6: (one= Single_Quote )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1358:6: one= Single_Quote
        {
        dbg.location(1358,9);
        one=(Token)match(input,Single_Quote,FOLLOW_Single_Quote_in_synpred177_psqlgrammar5097); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred177_psqlgrammar

    // $ANTLR start synpred185_psqlgrammar
    public final void synpred185_psqlgrammar_fragment() throws RecognitionException {
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1406:4: ( 'COUNT' Left_Paren Asterisk Right_Paren ( filter_clause )? )
        dbg.enterAlt(1);

        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1406:4: 'COUNT' Left_Paren Asterisk Right_Paren ( filter_clause )?
        {
        dbg.location(1406,4);
        match(input,61,FOLLOW_61_in_synpred185_psqlgrammar5235); if (state.failed) return ;
        dbg.location(1406,12);
        match(input,Left_Paren,FOLLOW_Left_Paren_in_synpred185_psqlgrammar5237); if (state.failed) return ;
        dbg.location(1406,23);
        match(input,Asterisk,FOLLOW_Asterisk_in_synpred185_psqlgrammar5239); if (state.failed) return ;
        dbg.location(1406,32);
        match(input,Right_Paren,FOLLOW_Right_Paren_in_synpred185_psqlgrammar5241); if (state.failed) return ;
        dbg.location(1406,44);
        // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1406:44: ( filter_clause )?
        int alt169=2;
        try { dbg.enterSubRule(169);
        try { dbg.enterDecision(169, decisionCanBacktrack[169]);

        int LA169_0 = input.LA(1);

        if ( (LA169_0==71) ) {
            alt169=1;
        }
        } finally {dbg.exitDecision(169);}

        switch (alt169) {
            case 1 :
                dbg.enterAlt(1);

                // /Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/psqlgrammar.g:1406:46: filter_clause
                {
                dbg.location(1406,46);
                pushFollow(FOLLOW_filter_clause_in_synpred185_psqlgrammar5245);
                filter_clause();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
        } finally {dbg.exitSubRule(169);}


        }

    }
    // $ANTLR end synpred185_psqlgrammar

    // Delegated rules

    public final boolean synpred185_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred185_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred152_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred152_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred144_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred144_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred172_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred172_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred135_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred135_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred46_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred156_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred156_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred126_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred126_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred177_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred177_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred151_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred151_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred124_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred124_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred147_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred147_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred146_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred146_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred21_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred118_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred118_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred155_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred155_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred117_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred117_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred36_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred35_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred12_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred127_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred127_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred162_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred162_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred157_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred157_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred93_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred92_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred128_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred128_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred129_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred129_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred160_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred160_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred13_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred74_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred45_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred123_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred123_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred125_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred75_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred159_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred159_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred94_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred63_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred91_psqlgrammar() {
        state.backtracking++;
        dbg.beginBacktrack(state.backtracking);
        int start = input.mark();
        try {
            synpred91_psqlgrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        dbg.endBacktrack(state.backtracking, success);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_direct_select_statement_multiple_rows_in_start_select102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_fully_qualified_identifier139 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_Period_in_fully_qualified_identifier144 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_fully_qualified_identifier147 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_Period_in_fully_qualified_identifier152 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_fully_qualified_identifier155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_chain_in_column_reference187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_column_reference191 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_Period_in_column_reference193 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_column_reference195 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_Period_in_column_reference198 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_column_reference200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Character_String_Literal_in_general_literal219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_literal_in_general_literal230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_days_value_in_date_literal318 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Minus_Sign_in_date_literal323 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_months_value_in_date_literal368 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Minus_Sign_in_date_literal373 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_years_value_in_date_literal419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_years_value_in_year_month_literal482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_years_value_in_year_month_literal487 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Minus_Sign_in_year_month_literal490 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_months_value_in_year_month_literal492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Unsigned_Integer_in_days_value521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Regular_Identifier_in_months_value551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Unsigned_Integer_in_years_value578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_col_value_in_col_literal590 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_Minus_Sign_in_col_literal592 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_col_number_in_col_literal596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Regular_Identifier_in_col_value606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Unsigned_Integer2_in_col_number618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cursor_specification_in_direct_select_statement_multiple_rows653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_expression_in_cursor_specification666 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static final BitSet FOLLOW_order_by_clause_in_cursor_specification669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_order_by_clause684 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_order_by_clause686 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_sort_specification_list_in_order_by_clause688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_expression_body_in_query_expression698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_join_query_expression_in_query_expression_body718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_joined_table_in_query_expression_body723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_join_query_term_in_non_join_query_expression745 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_joined_table_in_non_join_query_expression751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_non_join_query_expression756 = new BitSet(new long[]{0x0000400020020000L,0x0008000400000002L});
    public static final BitSet FOLLOW_68_in_non_join_query_expression762 = new BitSet(new long[]{0x0000400020020000L,0x0008000400000002L});
    public static final BitSet FOLLOW_46_in_non_join_query_expression774 = new BitSet(new long[]{0x0000000020020000L,0x0008000400000000L});
    public static final BitSet FOLLOW_65_in_non_join_query_expression780 = new BitSet(new long[]{0x0000000020020000L,0x0008000400000000L});
    public static final BitSet FOLLOW_query_term_in_non_join_query_expression787 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_non_join_query_expression799 = new BitSet(new long[]{0x0000400020020000L,0x0008000400000002L});
    public static final BitSet FOLLOW_68_in_non_join_query_expression805 = new BitSet(new long[]{0x0000400020020000L,0x0008000400000002L});
    public static final BitSet FOLLOW_46_in_non_join_query_expression812 = new BitSet(new long[]{0x0000000020020000L,0x0008000400000000L});
    public static final BitSet FOLLOW_65_in_non_join_query_expression823 = new BitSet(new long[]{0x0000000020020000L,0x0008000400000000L});
    public static final BitSet FOLLOW_query_term_in_non_join_query_expression831 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_non_join_query_term_in_query_term856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_joined_table_in_query_term861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_join_query_primary_in_non_join_query_term883 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_joined_table_in_non_join_query_term889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_non_join_query_term892 = new BitSet(new long[]{0x0000400020020000L,0x0008000400000002L});
    public static final BitSet FOLLOW_46_in_non_join_query_term898 = new BitSet(new long[]{0x0000000020020000L,0x0008000400000000L});
    public static final BitSet FOLLOW_65_in_non_join_query_term904 = new BitSet(new long[]{0x0000000020020000L,0x0008000400000000L});
    public static final BitSet FOLLOW_query_primary_in_non_join_query_term912 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_non_join_query_term922 = new BitSet(new long[]{0x0000400020020000L,0x0008000400000002L});
    public static final BitSet FOLLOW_46_in_non_join_query_term928 = new BitSet(new long[]{0x0000000020020000L,0x0008000400000000L});
    public static final BitSet FOLLOW_65_in_non_join_query_term933 = new BitSet(new long[]{0x0000000020020000L,0x0008000400000000L});
    public static final BitSet FOLLOW_query_primary_in_non_join_query_term940 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_non_join_query_primary_in_query_primary962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_joined_table_in_query_primary967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_table_in_non_join_query_primary985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_query_specification_in_simple_table997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_query_specification1008 = new BitSet(new long[]{0x3011524028520010L,0x87C000032010500AL,0x0000000000000068L});
    public static final BitSet FOLLOW_set_quantifier_in_query_specification1014 = new BitSet(new long[]{0x3011124028520010L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_select_list_in_query_specification1020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_table_expression_in_query_specification1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_set_quantifier1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_set_quantifier1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Asterisk_in_select_list1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_sublist_in_select_list1054 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_Comma_in_select_list1059 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_select_sublist_in_select_list1063 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_derived_column_in_select_sublist1075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualified_asterisk_in_select_sublist1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_expression_in_derived_column1087 = new BitSet(new long[]{0x0002000020000002L});
    public static final BitSet FOLLOW_as_clause_in_derived_column1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_common_value_expression_in_value_expression1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_value_expression_in_value_expression1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_value_expression_in_common_value_expression1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_value_expression_in_common_value_expression1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_numeric_value_expression1158 = new BitSet(new long[]{0x0000000008100002L});
    public static final BitSet FOLLOW_set_in_numeric_value_expression1162 = new BitSet(new long[]{0x0000120028100000L});
    public static final BitSet FOLLOW_term_in_numeric_value_expression1172 = new BitSet(new long[]{0x0000000008100002L});
    public static final BitSet FOLLOW_factor_in_term1194 = new BitSet(new long[]{0x0000008000000012L});
    public static final BitSet FOLLOW_set_in_term1198 = new BitSet(new long[]{0x0000120028100000L});
    public static final BitSet FOLLOW_factor_in_term1208 = new BitSet(new long[]{0x0000008000000012L});
    public static final BitSet FOLLOW_sign_in_factor1233 = new BitSet(new long[]{0x0000120020000000L});
    public static final BitSet FOLLOW_numeric_primary_in_factor1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_expression_primary_in_numeric_primary1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_value_function_in_numeric_primary1262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_absolute_value_expression_in_numeric_value_function1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_absolute_value_expression1296 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_absolute_value_expression1298 = new BitSet(new long[]{0x0000120028100000L});
    public static final BitSet FOLLOW_numeric_value_expression_in_absolute_value_expression1300 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_absolute_value_expression1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_value_expression_in_string_value_expression1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_factor_in_character_value_expression1331 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_Concatenation_Operator_in_character_value_expression1335 = new BitSet(new long[]{0x0000020020000000L,0x8200000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_character_factor_in_character_value_expression1338 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_character_primary_in_character_factor1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_expression_primary_in_character_primary1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_value_function_in_character_primary1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_value_function_in_string_value_function1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_substring_function_in_character_value_function1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regular_expression_substring_function_in_character_value_function1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fold_in_character_value_function1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trim_function_in_character_value_function1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_fold1468 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_fold1480 = new BitSet(new long[]{0x0000020020000000L,0x8200000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_character_value_expression_in_fold1485 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_fold1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_character_substring_function1508 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_character_substring_function1512 = new BitSet(new long[]{0x0000020020000000L,0x8200000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_character_value_expression_in_character_substring_function1517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_character_substring_function1522 = new BitSet(new long[]{0x0000120028100000L});
    public static final BitSet FOLLOW_start_position_in_character_substring_function1524 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000200L,0x0000000000000010L});
    public static final BitSet FOLLOW_73_in_character_substring_function1531 = new BitSet(new long[]{0x0000120028100000L});
    public static final BitSet FOLLOW_string_length_in_character_substring_function1533 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_character_substring_function1544 = new BitSet(new long[]{0x0500000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_char_length_units_in_character_substring_function1546 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_character_substring_function1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_regular_expression_substring_function1573 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_regular_expression_substring_function1577 = new BitSet(new long[]{0x0000020020000000L,0x8200000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_character_value_expression_in_regular_expression_substring_function1582 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_regular_expression_substring_function1587 = new BitSet(new long[]{0x0000020020000000L,0x8200000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_character_value_expression_in_regular_expression_substring_function1589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_regular_expression_substring_function1594 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Character_String_Literal_in_regular_expression_substring_function1596 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_regular_expression_substring_function1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_trim_function1617 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_trim_function1621 = new BitSet(new long[]{0x0040020020000000L,0xC200000022000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_trim_operands_in_trim_function1626 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_trim_function1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trim_source_in_trim_operands1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_trim_specification_in_trim_operands1652 = new BitSet(new long[]{0x0000020020000000L,0x8200000020000400L,0x0000000000000008L});
    public static final BitSet FOLLOW_trim_character_in_trim_operands1659 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_trim_operands1667 = new BitSet(new long[]{0x0000020020000000L,0x8200000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_trim_source_in_trim_operands1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_value_expression_in_trim_source1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_value_expression_in_trim_character1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_value_expression_in_start_position1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_value_expression_in_string_length1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unsigned_value_specification_in_value_expression_primary1763 = new BitSet(new long[]{0x0000000044000002L});
    public static final BitSet FOLLOW_Period_in_value_expression_primary1770 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_value_expression_primary1772 = new BitSet(new long[]{0x0000000044000002L});
    public static final BitSet FOLLOW_Right_Arrow_in_value_expression_primary1778 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_value_expression_primary1781 = new BitSet(new long[]{0x0000000044000002L});
    public static final BitSet FOLLOW_from_clause_in_table_expression1806 = new BitSet(new long[]{0x0000000000000002L,0x000000000000A000L,0x0000000000000080L});
    public static final BitSet FOLLOW_where_clause_in_table_expression1812 = new BitSet(new long[]{0x0000000000000002L,0x000000000000A000L});
    public static final BitSet FOLLOW_group_by_clause_in_table_expression1822 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_having_clause_in_table_expression1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_from_clause1858 = new BitSet(new long[]{0x0000000020020000L,0x0000000400000000L});
    public static final BitSet FOLLOW_table_reference_list_in_from_clause1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_reference_in_table_reference_list1884 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_Comma_in_table_reference_list1890 = new BitSet(new long[]{0x0000000020020000L,0x0000000400000000L});
    public static final BitSet FOLLOW_table_reference_in_table_reference_list1894 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_49_in_as_clause1914 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_as_clause1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schema_name_in_qualified_asterisk1928 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_Period_in_qualified_asterisk1931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Asterisk_in_qualified_asterisk1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_schema_name1985 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_Period_in_schema_name1990 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_schema_name1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_primary_in_table_reference2031 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_joined_table_in_table_reference2039 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static final BitSet FOLLOW_sample_clause_in_table_reference2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_sample_clause2065 = new BitSet(new long[]{0x0020000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_sample_method_in_sample_clause2067 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_sample_clause2071 = new BitSet(new long[]{0x0000120028100000L});
    public static final BitSet FOLLOW_numeric_value_expression_in_sample_clause2075 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_sample_clause2078 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_repeatable_clause_in_sample_clause2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_repeatable_clause2113 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_repeatable_clause2115 = new BitSet(new long[]{0x0000120028100000L});
    public static final BitSet FOLLOW_numeric_value_expression_in_repeatable_clause2117 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_repeatable_clause2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_or_query_name_in_table_primary2135 = new BitSet(new long[]{0x0002000020000002L});
    public static final BitSet FOLLOW_49_in_table_primary2142 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_table_primary2149 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_Left_Paren_in_table_primary2155 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_derived_column_list_in_table_primary2157 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_table_primary2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derived_table_in_table_primary2172 = new BitSet(new long[]{0x0002000020020002L});
    public static final BitSet FOLLOW_49_in_table_primary2177 = new BitSet(new long[]{0x0000000020020002L});
    public static final BitSet FOLLOW_identifier_in_table_primary2183 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_Left_Paren_in_table_primary2190 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_derived_column_list_in_table_primary2192 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_table_primary2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Left_Paren_in_table_primary2204 = new BitSet(new long[]{0x0000000020020000L,0x0000000400000000L});
    public static final BitSet FOLLOW_joined_table_in_table_primary2206 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_table_primary2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_name_in_table_or_query_name2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_table_or_query_name2242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_subquery_in_derived_table2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_list_in_derived_column_list2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_primary_in_joined_table2287 = new BitSet(new long[]{0x4000000000000000L,0x0001000804440800L,0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_joined_table2299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_joined_table2303 = new BitSet(new long[]{0x0000000020020000L,0x0000000400000000L});
    public static final BitSet FOLLOW_table_primary_in_joined_table2307 = new BitSet(new long[]{0x4000000000000002L,0x0001000804440800L,0x0000000000000002L});
    public static final BitSet FOLLOW_join_type_in_joined_table2315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_joined_table2321 = new BitSet(new long[]{0x0000000020020000L,0x0000000400000000L});
    public static final BitSet FOLLOW_table_reference_in_joined_table2325 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_join_specification_in_joined_table2328 = new BitSet(new long[]{0x4000000000000002L,0x0001000804440800L,0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_joined_table2334 = new BitSet(new long[]{0x0000000000000000L,0x0001000004440800L});
    public static final BitSet FOLLOW_join_type_in_joined_table2340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_joined_table2346 = new BitSet(new long[]{0x0000000020020000L,0x0000000400000000L});
    public static final BitSet FOLLOW_table_primary_in_joined_table2350 = new BitSet(new long[]{0x4000000000000002L,0x0001000804440800L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_joined_table2357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_joined_table2361 = new BitSet(new long[]{0x0000000020020000L,0x0000000400000000L});
    public static final BitSet FOLLOW_table_primary_in_joined_table2365 = new BitSet(new long[]{0x4000000000000002L,0x0001000804440800L,0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_table_name2438 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_Period_in_table_name2440 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_table_name2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_table_name2448 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_Period_in_table_name2453 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_table_name2456 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_Period_in_table_name2461 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_table_name2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_join_condition_in_join_specification2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_named_columns_join_in_join_specification2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_join_condition2517 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_search_condition_in_join_condition2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_named_columns_join2532 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_named_columns_join2536 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_join_column_list_in_named_columns_join2540 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_named_columns_join2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_join_type2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outer_join_type_in_join_type2564 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_107_in_join_type2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_outer_join_type2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_outer_join_type2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_outer_join_type2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_name_list_in_join_column_list2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_column_name_list2636 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_Comma_in_column_name_list2641 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_column_name_list2643 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_date_literal_in_unsigned_value_specification2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_col_literal_in_unsigned_value_specification2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Unsigned_Integer_in_unsigned_value_specification2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_general_value_specification_in_unsigned_value_specification2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_chain_in_general_value_specification2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_identifier_chain2743 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_Period_in_identifier_chain2748 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_identifier_chain2753 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_Regular_Identifier_in_identifier2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_where_clause2904 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_search_condition_in_where_clause2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_group_by_clause2923 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_group_by_clause2925 = new BitSet(new long[]{0x8000400020020000L,0x0002000400004002L});
    public static final BitSet FOLLOW_set_quantifier_in_group_by_clause2929 = new BitSet(new long[]{0x8000000020020000L,0x0002000400004000L});
    public static final BitSet FOLLOW_grouping_element_list_in_group_by_clause2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grouping_element_in_grouping_element_list2947 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_Comma_in_grouping_element_list2952 = new BitSet(new long[]{0x8000000020020000L,0x0002000400004000L});
    public static final BitSet FOLLOW_grouping_element_in_grouping_element_list2954 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ordinary_grouping_set_in_grouping_element2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollup_list_in_grouping_element2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cube_list_in_grouping_element2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grouping_sets_specification_in_grouping_element2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_empty_grouping_set_in_grouping_element2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grouping_column_reference_in_ordinary_grouping_set3002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Left_Paren_in_ordinary_grouping_set3007 = new BitSet(new long[]{0x0000000020000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_grouping_column_reference_list_in_ordinary_grouping_set3009 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_ordinary_grouping_set3012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_reference_in_grouping_column_reference3025 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_collate_clause_in_grouping_column_reference3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grouping_column_reference_in_grouping_column_reference_list3045 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_Comma_in_grouping_column_reference_list3050 = new BitSet(new long[]{0x0000000020000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_grouping_column_reference_in_grouping_column_reference_list3052 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_113_in_rollup_list3067 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_rollup_list3069 = new BitSet(new long[]{0x0000000020020000L,0x0000000400000000L});
    public static final BitSet FOLLOW_ordinary_grouping_set_list_in_rollup_list3071 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_rollup_list3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ordinary_grouping_set_in_ordinary_grouping_set_list3085 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_Comma_in_ordinary_grouping_set_list3090 = new BitSet(new long[]{0x0000000020020000L,0x0000000400000000L});
    public static final BitSet FOLLOW_ordinary_grouping_set_in_ordinary_grouping_set_list3092 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_63_in_cube_list3107 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_cube_list3109 = new BitSet(new long[]{0x0000000020020000L,0x0000000400000000L});
    public static final BitSet FOLLOW_ordinary_grouping_set_list_in_cube_list3111 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_cube_list3114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_grouping_sets_specification3125 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_grouping_sets_specification3127 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_grouping_sets_specification3129 = new BitSet(new long[]{0x8000000020020000L,0x0002000400004000L});
    public static final BitSet FOLLOW_grouping_set_list_in_grouping_sets_specification3131 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_grouping_sets_specification3134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grouping_set_in_grouping_set_list3145 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_Comma_in_grouping_set_list3150 = new BitSet(new long[]{0x8000000020020000L,0x0002000400004000L});
    public static final BitSet FOLLOW_grouping_set_in_grouping_set_list3152 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ordinary_grouping_set_in_grouping_set3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rollup_list_in_grouping_set3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cube_list_in_grouping_set3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grouping_sets_specification_in_grouping_set3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_empty_grouping_set_in_grouping_set3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Left_Paren_in_empty_grouping_set3200 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_empty_grouping_set3202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_having_clause3216 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_search_condition_in_having_clause3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_value_expression_in_search_condition3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_term_in_boolean_value_expression3254 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_104_in_boolean_value_expression3258 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_boolean_term_in_boolean_value_expression3262 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    public static final BitSet FOLLOW_boolean_factor_in_boolean_term3285 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_boolean_term3289 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_boolean_factor_in_boolean_term3293 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_NOT_in_boolean_factor3318 = new BitSet(new long[]{0x3011124028120000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_boolean_test_in_boolean_factor3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_primary_in_boolean_test3342 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_IS_in_boolean_test3347 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000040L,0x0000000000000005L});
    public static final BitSet FOLLOW_NOT_in_boolean_test3351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L,0x0000000000000005L});
    public static final BitSet FOLLOW_truth_value_in_boolean_test3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_boolean_primary3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_predicand_in_boolean_primary3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenthesized_boolean_value_expression_in_boolean_predicand3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonparenthesized_value_expression_primary_in_boolean_predicand3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Left_Paren_in_parenthesized_boolean_value_expression3446 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_boolean_value_expression_in_parenthesized_boolean_value_expression3450 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_parenthesized_boolean_value_expression3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unsigned_value_specification_in_nonparenthesized_value_expression_primary3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_function_specification_in_nonparenthesized_value_expression_primary3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_scalar_subquery_in_nonparenthesized_value_expression_primary3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggregate_function_in_set_function_specification3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grouping_operation_in_set_function_specification3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_grouping_operation3525 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_grouping_operation3527 = new BitSet(new long[]{0x0000000020000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_column_reference_in_grouping_operation3529 = new BitSet(new long[]{0x0000000080000100L});
    public static final BitSet FOLLOW_Comma_in_grouping_operation3534 = new BitSet(new long[]{0x0000000020000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_column_reference_in_grouping_operation3536 = new BitSet(new long[]{0x0000000080000100L});
    public static final BitSet FOLLOW_Right_Paren_in_grouping_operation3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_scalar_subquery3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_row_subquery3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subquery_in_table_subquery3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Left_Paren_in_subquery3618 = new BitSet(new long[]{0x0000000020020000L,0x0008000400000000L});
    public static final BitSet FOLLOW_query_expression_in_subquery3622 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_subquery3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparison_predicate_in_predicate3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_like_predicate_in_predicate3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_between_predicate_in_predicate3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_predicate_in_predicate3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantified_comparison_predicate_in_predicate3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polymorphic_between_predicate_in_predicate3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polymorphic_range_predicate_in_predicate3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ontology_child_predicate_in_predicate3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_predicand_in_comparison_predicate3715 = new BitSet(new long[]{0x00000000008CD000L});
    public static final BitSet FOLLOW_comparison_predicate_part_2_in_comparison_predicate3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_op_in_comparison_predicate_part_23737 = new BitSet(new long[]{0x3011124028120000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_row_value_predicand_in_comparison_predicate_part_23740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Equals_Operator_in_comp_op3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Not_Equals_Operator_in_comp_op3759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Less_Than_Operator_in_comp_op3766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Greater_Than_Operator_in_comp_op3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Less_Or_Equals_Operator_in_comp_op3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Greater_Or_Equals_Operator_in_comp_op3787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_like_predicate_in_like_predicate3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_predicand_in_character_like_predicate3816 = new BitSet(new long[]{0x0000000000400000L,0x0000000008000000L});
    public static final BitSet FOLLOW_character_like_predicate_part_2_in_character_like_predicate3819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonparenthesized_value_expression_primary_in_row_value_special_case3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_predicand_in_row_value_constructor_predicand3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_common_value_expression_in_row_value_constructor_predicand3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_character_like_predicate_part_23885 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_character_like_predicate_part_23890 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Single_Quote_in_character_like_predicate_part_23893 = new BitSet(new long[]{0x0000020020000000L,0x8200000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_character_pattern_in_character_like_predicate_part_23895 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_Single_Quote_in_character_like_predicate_part_23897 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_character_like_predicate_part_23902 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Character_String_Literal_in_character_like_predicate_part_23905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_value_expression_in_character_pattern3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_predicand_in_quantified_comparison_predicate3940 = new BitSet(new long[]{0x00000000008CD000L});
    public static final BitSet FOLLOW_quantified_comparison_predicate_part_2_in_quantified_comparison_predicate3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comp_op_in_quantified_comparison_predicate_part_23962 = new BitSet(new long[]{0x0001400000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_quantifier_in_quantified_comparison_predicate_part_23965 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_table_subquery_in_quantified_comparison_predicate_part_23968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_all_in_quantifier3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_some_in_quantifier3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_all3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_predicand_in_between_predicate4052 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_between_predicate_part_2_in_between_predicate4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_between_predicate_part_24069 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BETWEEN_in_between_predicate_part_24076 = new BitSet(new long[]{0x3019124028120000L,0x8FC0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_51_in_between_predicate_part_24089 = new BitSet(new long[]{0x3011124028120000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_123_in_between_predicate_part_24095 = new BitSet(new long[]{0x3011124028120000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_row_value_predicand_in_between_predicate_part_24108 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_between_predicate_part_24111 = new BitSet(new long[]{0x3011124028120000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_row_value_predicand_in_between_predicate_part_24115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_predicand_in_in_predicate4128 = new BitSet(new long[]{0x0000000000400000L,0x0000000000010000L});
    public static final BitSet FOLLOW_in_predicate_part_2_in_in_predicate4131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_in_predicate_part_24159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_in_predicate_part_24164 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_in_predicate_value_in_in_predicate_part_24166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_subquery_in_in_predicate_value4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Left_Paren_in_in_predicate_value4185 = new BitSet(new long[]{0x3011020020020000L,0x05C4000300105008L,0x0000000000000060L});
    public static final BitSet FOLLOW_in_value_list_in_in_predicate_value4189 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_in_predicate_value4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_expression_in_in_value_list4207 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_Comma_in_in_value_list4212 = new BitSet(new long[]{0x3011020020020000L,0x05C4000300105008L,0x0000000000000060L});
    public static final BitSet FOLLOW_row_value_expression_in_in_value_list4214 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_row_value_special_case_in_row_value_expression4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_explicit_row_value_constructor_in_row_value_expression4241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Left_Paren_in_explicit_row_value_constructor4258 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_row_value_constructor_element_in_explicit_row_value_constructor4262 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_Comma_in_explicit_row_value_constructor4265 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_row_value_constructor_element_list_in_explicit_row_value_constructor4268 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_explicit_row_value_constructor4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_explicit_row_value_constructor4278 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_explicit_row_value_constructor4280 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_row_value_constructor_element_list_in_explicit_row_value_constructor4284 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_explicit_row_value_constructor4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_subquery_in_explicit_row_value_constructor4294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_constructor_element_in_row_value_constructor_element_list4306 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_Comma_in_row_value_constructor_element_list4311 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_row_value_constructor_element_in_row_value_constructor_element_list4315 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_value_expression_in_row_value_constructor_element4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_predicand_in_polymorphic_between_predicate4359 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_polymorphic_between_predicate_part_2_in_polymorphic_between_predicate4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Single_Quote_in_row_value_predicand4378 = new BitSet(new long[]{0x3011020020020000L,0x05C0000300105008L,0x0000000000000060L});
    public static final BitSet FOLLOW_row_value_special_case_in_row_value_predicand4386 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_Single_Quote_in_row_value_predicand4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_constructor_predicand_in_row_value_predicand4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_polymorphic_between_predicate_part_24427 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_IS_in_polymorphic_between_predicate_part_24433 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_POLYMORPHIC_in_polymorphic_between_predicate_part_24438 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BETWEEN_in_polymorphic_between_predicate_part_24444 = new BitSet(new long[]{0x00000040A0220100L});
    public static final BitSet FOLLOW_polymorphic_between_value_in_polymorphic_between_predicate_part_24448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Left_Paren_in_polymorphic_between_value4467 = new BitSet(new long[]{0x00000040A0200100L});
    public static final BitSet FOLLOW_species_variant_list_in_polymorphic_between_value4473 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_Right_Paren_in_polymorphic_between_value4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Single_Quote_in_species_variant_list4514 = new BitSet(new long[]{0x0000004020000102L});
    public static final BitSet FOLLOW_non_terminal_identifier_in_species_variant_list4524 = new BitSet(new long[]{0x0000004020000102L});
    public static final BitSet FOLLOW_Single_Quote_in_species_variant_list4564 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_Comma_in_species_variant_list4572 = new BitSet(new long[]{0x0000004020000102L});
    public static final BitSet FOLLOW_Single_Quote_in_species_variant_list4579 = new BitSet(new long[]{0x0000004020000102L});
    public static final BitSet FOLLOW_non_terminal_identifier_in_species_variant_list4743 = new BitSet(new long[]{0x0000004020000102L});
    public static final BitSet FOLLOW_Single_Quote_in_species_variant_list4752 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_NEWLINE_in_species_variant_list4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_predicand_in_polymorphic_range_predicate4788 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_polymorphic_range_predicate_part_2_in_polymorphic_range_predicate4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_polymorphic_range_predicate_part_24819 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BETWEEN_in_polymorphic_range_predicate_part_24825 = new BitSet(new long[]{0x3011124028120000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_genomic_location_value_in_polymorphic_range_predicate_part_24830 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_polymorphic_range_predicate_part_24839 = new BitSet(new long[]{0x3011124028120000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_genomic_location_value_in_polymorphic_range_predicate_part_24843 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_chromosome_clause_in_polymorphic_range_predicate_part_24845 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_map_clause_in_polymorphic_range_predicate_part_24848 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_reference_polymorphism_clause_in_polymorphic_range_predicate_part_24853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_predicand_in_genomic_location_value4873 = new BitSet(new long[]{0x0000200000000000L,0x0000040090800000L});
    public static final BitSet FOLLOW_87_in_genomic_location_value4876 = new BitSet(new long[]{0x0000200000000002L,0x0000040090800000L});
    public static final BitSet FOLLOW_92_in_genomic_location_value4883 = new BitSet(new long[]{0x0000200000000002L,0x0000040090800000L});
    public static final BitSet FOLLOW_95_in_genomic_location_value4892 = new BitSet(new long[]{0x0000200000000002L,0x0000040090800000L});
    public static final BitSet FOLLOW_45_in_genomic_location_value4898 = new BitSet(new long[]{0x0000200000000002L,0x0000040090800000L});
    public static final BitSet FOLLOW_106_in_genomic_location_value4907 = new BitSet(new long[]{0x0000200000000002L,0x0000040090800000L});
    public static final BitSet FOLLOW_102_in_chromosome_clause4920 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_chromosome_clause4924 = new BitSet(new long[]{0x3011124028120000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_chromosome_value_predicand_in_chromosome_clause4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_predicand_in_chromosome_value_predicand4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_map_clause4953 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_map_clause4957 = new BitSet(new long[]{0x3011124028120000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_map_value_predicand_in_map_clause4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_predicand_in_map_value_predicand4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_reference_polymorphism_clause4979 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_109_in_reference_polymorphism_clause4983 = new BitSet(new long[]{0x3011124028120000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_Single_Quote_in_reference_polymorphism_clause4994 = new BitSet(new long[]{0x3011124028120000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_row_value_predicand_in_reference_polymorphism_clause5000 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_Single_Quote_in_reference_polymorphism_clause5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_special_case_in_ontology_child_predicate5030 = new BitSet(new long[]{0x0000000000000000L,0x0000500000200000L});
    public static final BitSet FOLLOW_child_predicate_part_2_in_ontology_child_predicate5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ontology_relation_in_child_predicate_part_25041 = new BitSet(new long[]{0x0000004020000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_term_value_expression_in_child_predicate_part_25044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ontology_clause_in_child_predicate_part_25046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ontology_relation5057 = new BitSet(new long[]{0x0000000000000002L,0x0000500000200000L});
    public static final BitSet FOLLOW_108_in_ontology_relation5063 = new BitSet(new long[]{0x0000000000000002L,0x0000500000200000L});
    public static final BitSet FOLLOW_110_in_ontology_relation5069 = new BitSet(new long[]{0x0000000000000002L,0x0000500000200000L});
    public static final BitSet FOLLOW_Single_Quote_in_term_value_expression5097 = new BitSet(new long[]{0x0000004020000002L});
    public static final BitSet FOLLOW_non_terminal_identifier_in_term_value_expression5107 = new BitSet(new long[]{0x0000004020000002L});
    public static final BitSet FOLLOW_Single_Quote_in_term_value_expression5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ontology_clause5137 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_103_in_ontology_clause5142 = new BitSet(new long[]{0x0000024020000000L,0x8200000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_Single_Quote_in_ontology_clause5153 = new BitSet(new long[]{0x0000020020000000L,0x8200000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ontology_value_expression_in_ontology_clause5159 = new BitSet(new long[]{0x0000004000000000L,0x0000000000020020L});
    public static final BitSet FOLLOW_Single_Quote_in_ontology_clause5164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020020L});
    public static final BitSet FOLLOW_69_in_ontology_clause5175 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020020L});
    public static final BitSet FOLLOW_81_in_ontology_clause5181 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020020L});
    public static final BitSet FOLLOW_string_value_expression_in_ontology_value_expression5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_collate_clause5212 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_fully_qualified_identifier_in_collate_clause5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_aggregate_function5235 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_aggregate_function5237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Asterisk_in_aggregate_function5239 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_aggregate_function5241 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_filter_clause_in_aggregate_function5245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_general_set_function_in_aggregate_function5254 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_filter_clause_in_aggregate_function5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_function_type_in_general_set_function5287 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_general_set_function5290 = new BitSet(new long[]{0x3011524028520000L,0x87C000032010500AL,0x0000000000000068L});
    public static final BitSet FOLLOW_set_quantifier_in_general_set_function5294 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_value_expression_in_general_set_function5300 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_general_set_function5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computational_operation_in_set_function_type5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_filter_clause5402 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_filter_clause5404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_filter_clause5406 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_search_condition_in_filter_clause5408 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_filter_clause5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sort_specification_in_sort_specification_list5428 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_Comma_in_sort_specification_list5433 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_sort_specification_in_sort_specification_list5435 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_sort_key_in_sort_specification5450 = new BitSet(new long[]{0x0004000000000002L,0x0000001000000001L});
    public static final BitSet FOLLOW_ordering_specification_in_sort_specification5455 = new BitSet(new long[]{0x0000000000000002L,0x0000001000000000L});
    public static final BitSet FOLLOW_null_ordering_in_sort_specification5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_expression_in_sort_key5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_null_ordering5505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_null_ordering5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_null_ordering5511 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_null_ordering5513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Regular_Identifier_in_non_terminal_identifier5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_join_query_expression_in_synpred12_psqlgrammar718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_join_query_term_in_synpred13_psqlgrammar745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_join_query_term_in_synpred21_psqlgrammar856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_common_value_expression_in_synpred35_psqlgrammar1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numeric_value_expression_in_synpred36_psqlgrammar1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_character_substring_function_in_synpred45_psqlgrammar1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regular_expression_substring_function_in_synpred46_psqlgrammar1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_primary_in_synpred63_psqlgrammar2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derived_table_in_synpred74_psqlgrammar2172 = new BitSet(new long[]{0x0002000020020002L});
    public static final BitSet FOLLOW_49_in_synpred74_psqlgrammar2177 = new BitSet(new long[]{0x0000000020020002L});
    public static final BitSet FOLLOW_identifier_in_synpred74_psqlgrammar2183 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_Left_Paren_in_synpred74_psqlgrammar2190 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_derived_column_list_in_synpred74_psqlgrammar2192 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_synpred74_psqlgrammar2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_name_in_synpred75_psqlgrammar2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_date_literal_in_synpred91_psqlgrammar2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_col_literal_in_synpred92_psqlgrammar2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Unsigned_Integer_in_synpred93_psqlgrammar2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Period_in_synpred94_psqlgrammar2748 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_identifier_in_synpred94_psqlgrammar2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_synpred117_psqlgrammar3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenthesized_boolean_value_expression_in_synpred118_psqlgrammar3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comparison_predicate_in_synpred123_psqlgrammar3656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_like_predicate_in_synpred124_psqlgrammar3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_between_predicate_in_synpred125_psqlgrammar3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_in_predicate_in_synpred126_psqlgrammar3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantified_comparison_predicate_in_synpred127_psqlgrammar3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polymorphic_between_predicate_in_synpred128_psqlgrammar3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_polymorphic_range_predicate_in_synpred129_psqlgrammar3686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolean_predicand_in_synpred135_psqlgrammar3852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_subquery_in_synpred144_psqlgrammar4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_row_value_special_case_in_synpred146_psqlgrammar4236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Left_Paren_in_synpred147_psqlgrammar4258 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_row_value_constructor_element_in_synpred147_psqlgrammar4262 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_Comma_in_synpred147_psqlgrammar4265 = new BitSet(new long[]{0x3011124028520000L,0x87C0000320105008L,0x0000000000000068L});
    public static final BitSet FOLLOW_row_value_constructor_element_list_in_synpred147_psqlgrammar4268 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_synpred147_psqlgrammar4271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Single_Quote_in_synpred151_psqlgrammar4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Single_Quote_in_synpred152_psqlgrammar4378 = new BitSet(new long[]{0x3011020020020000L,0x05C0000300105008L,0x0000000000000060L});
    public static final BitSet FOLLOW_row_value_special_case_in_synpred152_psqlgrammar4386 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_Single_Quote_in_synpred152_psqlgrammar4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Right_Paren_in_synpred155_psqlgrammar4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Single_Quote_in_synpred156_psqlgrammar4514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_terminal_identifier_in_synpred157_psqlgrammar4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Single_Quote_in_synpred159_psqlgrammar4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_non_terminal_identifier_in_synpred160_psqlgrammar4743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_synpred162_psqlgrammar4572 = new BitSet(new long[]{0x0000004020000002L});
    public static final BitSet FOLLOW_Single_Quote_in_synpred162_psqlgrammar4579 = new BitSet(new long[]{0x0000004020000002L});
    public static final BitSet FOLLOW_non_terminal_identifier_in_synpred162_psqlgrammar4743 = new BitSet(new long[]{0x0000004020000002L});
    public static final BitSet FOLLOW_Single_Quote_in_synpred162_psqlgrammar4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Single_Quote_in_synpred172_psqlgrammar4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Single_Quote_in_synpred177_psqlgrammar5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_synpred185_psqlgrammar5235 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_Left_Paren_in_synpred185_psqlgrammar5237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_Asterisk_in_synpred185_psqlgrammar5239 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_Right_Paren_in_synpred185_psqlgrammar5241 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_filter_clause_in_synpred185_psqlgrammar5245 = new BitSet(new long[]{0x0000000000000002L});

}