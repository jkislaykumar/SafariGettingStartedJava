package lambdasetc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// @FunctionalInterface // exactly one abstract method
//interface Predicate<E> {
//  boolean test(E e);
//}

class LongString implements Predicate<String> {
  @Override
  public boolean test(String s) {
    return s.length() > 3;
  }
}

public class Example {
  // OO -- "command" pattern
  // FP -- "higher order function"
  public static List<String> filter(List<String> in, Predicate<String> criterion) {
    List<String> results = new ArrayList<>();

    for (String s : in) {
      if (criterion.test(s)) {
        results.add(s);
      }
    }
    return results;
  }

  public static void main(String[] args) {
    List<String> names = List.of("Fred", "Jim", "Sheila");

    System.out.println(names);

    System.out.println(
        filter(names, new LongString())
    );
    System.out.println(
        filter(names,
            (String s) -> {
              return s.length() > 3;
            }
            ));

    System.out.println(
        filter(names,
//            (String s) -> {
//            (@Deprecated var s) -> {
            s -> {
              return s.length() > 3;
            }
            ));

    System.out.println(
        filter(names,
            s -> s.length() > 3
            ));

    System.out.println(filter(names, s -> s.length() > 3 ));

  }
}
