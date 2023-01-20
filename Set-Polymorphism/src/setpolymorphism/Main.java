package setpolymorphism;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    //Set up test data
    String[] numbers = {
      new String("2"),
      new String("3"),
      new String("4"),
      new String("1"),
      new String("2"),
    };

    Set<String> s = new HashSet<>();
    MyOwnUtilityClass.checkDuplicate(s, numbers);

    s = new TreeSet<>();
    MyOwnUtilityClass.checkDuplicate(s, numbers);

    s = new LinkedHashSet<>();
    MyOwnUtilityClass.checkDuplicate(s, numbers);
  }
}
