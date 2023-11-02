import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
		double num1, num2;
		boolean keepGoing = true;
		int choice;
		double answer = 0.0;

    System.out.println("Please provide one number: ");
      num1 = kb.nextDouble();

    System.out.println("Please provide another number: ");
      num2 = kb.nextDouble();

  		while (keepGoing) {
  			printMenu();
  			System.out.print("Which would you like to do? ");
        choice = kb.nextInt();
  			switch (choice) {
          case 1:
            double sum = findSum(num1, num2);
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
            break;
          case 2:
            double average = findAverage(num1, num2);
            System.out.println("The average of " + num1 + " and " + num2 + " is " + average);
            break;
          case 3:
            double totalTax = findTaxes(num1, num2);
            System.out.println("The taxes due for " + num1 + " and " + num2 + " is " + totalTax);
            break;
          case 4:
            System.out.println("Goodbye");
            keepGoing = false;
            break;

          default:
            System.out.println("That is not a valid choice. Please try again.");
            break;
          }
        }
  	  kb.close();
  }

	public static void printMenu() {
		System.out.println();
		System.out.println("========= MENU =========");
		System.out.println("|                      |");
		System.out.println("|   1. Add Numbers     |");
		System.out.println("|   2. Find Average    |");
		System.out.println("|   3. Calculate Tax   |");
		System.out.println("|   4. Exit            |");
		System.out.println("|                      |");
		System.out.println("========================");
		System.out.println();
  }

	public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;
  }

  public static double findAverage(double x, double y) {
    double average = (x + y) / 2;
    return average;
  }

  public static double findTaxes(double x, double y) {
    double taxRate = 0.0831;
    double totalTax = (x + y) * taxRate;
    return totalTax;
  }
 }
