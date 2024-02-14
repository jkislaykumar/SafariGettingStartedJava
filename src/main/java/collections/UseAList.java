package collections;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class UseAList {
  public static void main(String[] args) {
    ArrayList names = new ArrayList();
    System.out.println(names);
    System.out.println(names.size());
    // no user operator overloading
    names.add("Fred");
    names.add("Jim");
    names.add(LocalDateTime.now()); // can add ANY REFERENCE type
//    names.add(Integer.valueOf(99)); // cannot add primitives, must add "wrapper" objects, can improve
    // "autoboxing" -- use a primitive where an object is needed, the compiler writes the code seen above
    names.add(99);
    System.out.println(names);
    System.out.println(names.size());
    names.add("Sheila");
    names.add(0, "Albert");
    names.set(1, "Frederick");
    System.out.println(names);
    System.out.println(names.size());


  }
}
