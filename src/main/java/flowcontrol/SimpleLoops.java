package flowcontrol;

public class SimpleLoops {
  public static void main(String[] args) {
    int x = 3;
    while (x > 0) {
      System.out.println("x is " + x);
//      x = x - 1;
//      x -= 1;
      x--;
    }

    do {
      System.out.println("x in do while is " + x);
    } while (x > 0);
    System.out.println("all done");

    for (int y = 3, z = 10; y > 0; y--, z++) {
      System.out.println("y in for-loop is " + y + " and z is " + z);
    }
  }
}
