package setpolymorphism;

import java.util.Set;

public class MyOwnUtilityClass {

  public static void checkDuplicate(Set<String> s, String[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
      if (!s.add(numbers[i])) {
        System.out.println("Set type = " + s.getClass().getName() + ": " + s);
      }
    }
  }
}
