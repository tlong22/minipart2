package mini;

import mini.parser.*;
import mini.lexer.*;
import mini.node.*;
import mini.TypeChecker;
import mini.PrettyPrinter;
import mini.CodeEmitter;
import java.io.*;

public class Main {
  public static void main(String[] args) {
    try {
      Lexer lexer = new Lexer(new PushbackReader(new InputStreamReader(System.in), 1024));
      Parser parser = new Parser(lexer);
      Start tree = parser.parse();

      TypeChecker checker = new TypeChecker();
      CodeEmitter emitter = new CodeEmitter();
      tree.apply(checker);
      tree.apply(emitter);

    } catch (Exception e) {
      System.out.println("Invalid: " + e.getMessage());
    }
  }
}
