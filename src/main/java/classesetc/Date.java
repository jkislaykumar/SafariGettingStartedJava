package classesetc;

// if no superclass specified, it's a subtype of java.lang.Object
public class Date {
//  int day, month, year;
  // any mutable fields should be private
  // private, in Java, means "accessible anywhere within the enclosing TOP-LEVEL curly braces"
  // Java allows "nested" (sometimes called "inner") class
  private int day;
  private int month;
  private int year;

  private static final int MONTHS_IN_YEAR = 12;

//  // IF you provide zero constructors in the source, you get the "default" constructor, which looks like this:
//  public Date() {
//    // something here...
//      super(); // if this does not exist in source, the compiler inserts it!!!
//  }

  // Called a "constructor" -- not really, it's an initializer.
  // object memory is allocated and zeroed by "new"
  // constructor looks like a method but has NO RETURN TYPE
  // same name as enclosing type
//  public Date() { // "this" is passed implicitly
//    System.out.println("initializing this date " + this);
//    day = 14; // this is optional prefix unless needed for disambiguation
//    month = 2;
//    year = 2024;
//  }

  public Date() { // "this" is passed implicitly
    this(14, 2, 2024); // no implicit super()
//    System.out.println("initializing this date " + this);
//    day = 14; // this is optional prefix unless needed for disambiguation
//    month = 2;
//    year = 2024;
  }

  // "overloading" -- "real name" of methods and constructors INCLUDES type-sequence of arguments
  public Date(int day, int month, int year) {
// NOTHING can precede this() or super() in current Java
    // but behavior that does not use the "this" reference WILL be permitted here soon
//    System.out.println("nope!");
    super(); //
    System.out.printf("setting a Date to %d %d %d\n", day, month, year);
    if (day < 1 || day > 31) throw new IllegalArgumentException("Bad day value");
    this.day = day; // disambiguating this is required here
    this.month = month;
    this.year = year;
  }

  public static boolean isLeapYear(int year) {
    return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
  }

  // explicit this MUST be FIRST, and exactly the enclosing type
//  public String toString(Date this) {
  // method name is identical to a parent method? And argument TYPE sequence is identical?
  // then you have Overriden the method
  // The @Override "annotation" allows us to verify that we did it right
  @Override
  public String toString() {
    return "I'm a Date with day = " + day + ", month = " + month + ", year = " + year;
  }

  // Java does NOT provide default parameter values -- overloading can "ease" that problem
  // we DO have variable length argument lists
//  public static void doStuff(String [] names) {
  public static void doStuff(String ... names) {
    for (String name : names) {
      System.out.println("> " + name);
    }
  }

//  public int add(int a, int b) {
//    System.out.println("adding int");
//    return a + b;
//  }

  public long add(long a, int b) {
    System.out.println("adding long, int");
    return a + b;
  }

  public long add(int a, long b) {
    System.out.println("adding int, long");
    return a + b;
  }
}

class Holiday extends Date {
  private String name;

  public Holiday(int day, int month, int year, String name) {
    super(day, month, year);
    this.name = name;
  }

  @Override
  public String toString() {
    return "I'm a Holiday called " + name + " on " + super.toString();
  }
}

class UseMyDate {
  public static void main(String[] args) {
    Date d = new Date();
    System.out.println(d);
    Object d2 = new Date(21, 7, 2020);

    System.out.println("is 2020 a leap year? " + Date.isLeapYear(2020));
    System.out.println("d2 is " + d2);

    // new String[] is REQUIRED here...
//    Date.doStuff(new String[] {"Fred", "Jim", "Sheila"});
    // given ... in the declaration
    Date.doStuff("Fred", "Jim", "Sheila");

    // ambiguous call!
//    System.out.println(Date.add(1, 2));

    Date h1 = new Holiday(1, 1, 2025, "New Year's Day");
//    System.out.println(h1.toString());
    System.out.println(h1);
  }
}