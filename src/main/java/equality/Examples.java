package equality;

import java.time.LocalDateTime;

public class Examples {
  public static void main(String[] args) {
    int x = 99;
    int y = 100;
    int z = 99;
    System.out.println("x == y ? " + (x == y));
    System.out.println("x == z ? " + (x == z));

    String s1 = "He";
    String s2 = "llo";
    String s3 = s1 + s2;
    System.out.println("s3 is " + s3);
    String s4 = "Hello";
    System.out.println("s3 == s4 ? " + (s3 == s4));

    // dot-equals might test for "equivalent contents" -- it does reliably in String
    System.out.println("s3.equals(s4) ? " + s3.equals(s4));

    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    System.out.println("sb1 == sb2 ? " + (sb1 == sb2));
    // this doesn't work!!!
    System.out.println("sb1.equals(sb2) ? " + sb1.equals(sb2));

    String st1 = "Hello there";
    String st2 = "Hello there";
    System.out.println("constant pooling: " + (st1 == st2));

    System.out.println(st1.toUpperCase());
    System.out.println(st1);

  }
}
