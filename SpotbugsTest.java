public class SpotbugsTest {

  public static void main(String[] args) {
    // 1. Null Pointer Exception
    String nullString = null;
    // Check if nullString is null before calling methods on it
    if (nullString != null) {
      System.out.println(nullString.length());
    } else {
      System.out.println("String is null");
    }

    // 2. Array Index Out of Bounds
    int[] numbers = {1, 2, 3};
    // Check array bounds before accessing
    if (numbers.length > 3) {
      System.out.println(numbers[3]);
    } else {
      System.out.println("Index 3 is out of bounds. Array length: " + numbers.length);
    }

    // 3. Infinite Loop
    int i = 0;
    while (i >= 0) { // Infinite loop as i is never decremented
      System.out.println("Infinite Loop!");
    }

    // 4. StringIndexOutOfBoundsException
    String text = "Buggy";
    System.out.println(text.substring(10)); // Index out of range
  }
}
