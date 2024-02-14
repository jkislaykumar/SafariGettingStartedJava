package hello.world;

//import java.lang.System; // everything in java.lang is always "imported"
//import java.lang.*;
//import static java.lang.System.out;
import java.time.LocalDateTime;

import static java.lang.System.*;

public class Main {
//  var nope = "Hello"; // NOT HERE

  public static void main(/*java.lang.*/String [] args) {
//    java.lang.System.out.println("Hello Java World!");
    System.out.println("Hello Java World!");
    out.println("Hello Java World!");

    out.println(LocalDateTime.now());

    int x;
    if (Math.random() < 2) {
      x = 100;
    } else {
      x = 200; // never going to happen
    }
//    int x = 99;
    out.println("x is " + x);

    long lng = 4_000_000_000L; // L makes this a long literal also D for double, F for float
//    x = 3.14; // not allowed

    short s1 = 99; // 99 is compile time constant of int type, and it fits a short
    short s2 = 3;
    // NO! arithmetic produces larger or the two argument type, but AT LEAST INT
//    short s3 = s1 * s2;
    short s3 = (short)(s1 * s2);

    // shorthand (I don't recommend this!!!)
//    int anInt = 99;
    // allows ONLY FOR METHOD LOCALS
    var anInt = 99;

    /*
    + - * / % -- division is governed by the "larger of the two operands" discussion
              -- % is REMAINDER, not mod
    & | ^ ~   -- bitwise: and, or, xor, negation
    < <= == != >= >   -- comparisons
    && ||     -- logical short-circuiting
     */

    out.println(3.0 / 10); // types determine type of division!
  }
}
