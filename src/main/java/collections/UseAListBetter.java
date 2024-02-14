package collections;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UseAListBetter {

  // pass by VALUE (but...)
//  public static void showAll(ArrayList<String> stuff) {
  public static void showAll(List<String> stuff) {
    System.out.println("contents of stuff:");
    for (String s : stuff) {
      System.out.println("> " + s);
    }

//    stuff.add("Michael");
  }

  public static void main(String[] args) {
//    ArrayList<String> names = new ArrayList();
//    LinkedList<String> names = new LinkedList<>();
//    List<String> names = new ArrayList<String>(List.of(99, "Alex", "Bob")); // FAILS
//    List<String> names = new ArrayList<String>(List.of("Alex", "Bob"));
    List<String> names = new ArrayList<>(List.of(/*99, */"Alex", "Bob"));
    System.out.println(names);
    System.out.println(names.size());
    // no user operator overloading
    names.add("Fred");
    names.add("Jim");
//    names.add(LocalDateTime.now()); // Not permitted when ArrayList<String>
    System.out.println(names);
    System.out.println(names.size());
    names.add("Sheila");
    names.add(0, "Albert");
    names.set(1, "Frederick");
    System.out.println(names);
    System.out.println(names.size());
    String n1 = names.get(0); // direct assignment OK because of ArrayList<String>
    showAll(names);
    System.out.println(names);
  }
}
