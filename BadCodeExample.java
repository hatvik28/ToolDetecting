// Remove the unused field
public class BadCodeExample {

  public void badMethod(String param1, String param2, String param3, String param4, String param5) {
    try {
      int a = 5 / 0; // Avoidable ArithmeticException
    } catch (Exception e) {
      // Empty catch block — bad practice
    }

    if (true) {
      // Always true — unnecessary code
      System.out.println("Always true");
    }

    int result = 0;
    for (int i = 0; i < 10; i++) {
      result += i;
    }
  }
}
