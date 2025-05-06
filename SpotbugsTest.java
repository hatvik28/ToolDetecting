public class SpotbugsTest {

  public static void main(String[] args) {
    // 1. Null Pointer Exception
    String nullString = null;
    try {
      System.out.println(nullString.length());
    } catch (NullPointerException e) {
      System.out.println("Caught NullPointerException: String is null");
    }

    // 2. Array Index Out of Bounds
    int[] numbers = {1, 2, 3};
    if (numbers.length > 3) {
      System.out.println(numbers[3]); // Accessing index out of bounds
    } else {
      System.out.println("Index out of bounds");
    }

    // 3. Infinite Loop
    int i = 0;
    while (i < 5) { // Loop will terminate after 5 iterations
      System.out.println("Loop iteration: " + i);
      i++;
    }

    // 4. StringIndexOutOfBoundsException
    String text = "Buggy";
    if (text.length() > 10) {
      System.out.println(text.substring(10));
    } else {
      System.out.println("Index out of bounds for substring operation");
    }
  }
}
