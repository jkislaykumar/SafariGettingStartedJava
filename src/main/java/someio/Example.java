package someio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example {
  public static void main(String[] args) /*throws IOException*/ {
    try ( // "resources" declared here will be closed
        FileReader input = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(input);
    ) {
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println("> " + line);
      }
      System.out.println("Finished!");
    } catch (IOException e) {
      System.out.println("That broke: " + e.getMessage());
    }
  }
}
