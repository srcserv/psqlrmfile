import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        psqlgrammarLexer lex = new psqlgrammarLexer(new ANTLRFileStream("/Users/dkhuang/DATA/DEBUG/psqlworkspace/psql/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        psqlgrammarParser g = new psqlgrammarParser(tokens, 49100, null);
        try {
            g.start_select();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}