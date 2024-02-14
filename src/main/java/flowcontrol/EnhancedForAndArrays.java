package flowcontrol;

import java.util.Arrays;

public class EnhancedForAndArrays {
  public static void main(String[] args) {
    // arrays are objects, this is storage for one reference value
//    String[] names = new String[]{"Fred", "Jim", "Sheila"};
    // Java indexes are ALWAYS zero based, EXCEPT with databases
    String[] names = {"Fred", "Jim", "Sheila"}; // only for initialization of new variable
//    names = new String[3];
//    names[0] = "Fred";
    System.out.println("names is " + Arrays.toString(names));
    System.out.println("length of names is " + names.length);

    String [] newNames = new String[6];
    System.arraycopy(names, 0, newNames, 2, 3);
    System.out.println("names is " + Arrays.toString(names));
    System.out.println("newNames is " + Arrays.toString(newNames));
    names = newNames;
    System.out.println("names is " + Arrays.toString(names));

    for (String n : names) {
      System.out.println("A name is " + n);
    }

  }
}
