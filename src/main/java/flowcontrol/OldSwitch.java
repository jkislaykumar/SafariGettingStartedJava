package flowcontrol;

public class OldSwitch {
  public static void main(String[] args) {
    int x = 11;
    // switch "target" (x here) must be int or smaller numeric,
    // or String, or enum types
    // switch is a statement
    switch (x) {
      case 10: // must be constant expressions
        // scope, from point of decl, to end of immediately enclosing curlies
        int y = x;
        System.out.println("It's ten");
        break;
      case 11:
      case 12:
      case 13: // alternation, old style!
//        System.out.println(y); // WACKY
        System.out.println("11 to 13");
        break;
      default:
        System.out.println("something else");
        break;
    }
  }
}
