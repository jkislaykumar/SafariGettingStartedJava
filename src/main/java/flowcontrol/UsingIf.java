package flowcontrol;

public class UsingIf {
  public static void main(String[] args) {
    int x = 2;
    // must have parens, must be a boolean expression
    // Java does NOT have "truthy" and "falsy"
    if (x > 3) {

      // no "elif" needed, indentation doesn't matter
System.out.println("it's big");
      System.out.println("really, big...");} else {

         System.out.println("it's small");
}
  }
}
