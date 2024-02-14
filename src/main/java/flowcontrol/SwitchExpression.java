package flowcontrol;

public class SwitchExpression {
  public static void main(String[] args) {
    int x = 999;

    System.out.println(switch (x) {
      case 99 -> {
        String s = "It's ";
        yield s + x; // yield, NOT return
      }
      default -> "It's something else";
    });
  }
}
