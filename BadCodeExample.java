public class BadCodeExample {

  // Field that is never used
  private int unusedField;

  public void badMethod(String param1, String param2, String param3, String param4, String param5) {
    try {
      int a = 5 / 0; // Avoidable ArithmeticException
    } catch (Exception e) {
      e.printStackTrace(); // Log the exception
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
