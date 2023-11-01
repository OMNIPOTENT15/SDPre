public class Objective3Lab3 {
  public static void main(String[] args) {
    int first = 1 + (int)(Math.random()*6);
    int second = 1 + (int)(Math.random()*6);
    int third = 1 + (int)(Math.random()*6);
    int total = first + second + third;
    String f = first + " + ";
    String s = second + " + ";
    String t = third + "";
    String tot = " = " + total;
    System.out.println(f + s + t + tot);
  }
}
