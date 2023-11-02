public class Objective7Lab4 {
  public static void main(String[] args) {
    int counter = 1;
    int count = 0;

    while (counter <= 20) {
      count = count + counter;
      counter = counter + 1;
      if (counter == 21) {
          System.out.println(count);
      }
    }
  }
}
