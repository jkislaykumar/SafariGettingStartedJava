package flowcontrol;

public class NewSwitchStatement {
  public static void main(String[] args) {
    int x = 99;
    switch (x) {
      // arrow form does not fall through
      // RHS of arrow must be a "single thing"
      case 99 -> {
        System.out.println("it's 99");
        System.out.println("really, it's less than 100");
      }
      // better alternation (can be used with newer Java for colon form)
      case 100, 101, 102, 103 -> System.out.println("it's 100 or a bit more");
    }
  }
}
