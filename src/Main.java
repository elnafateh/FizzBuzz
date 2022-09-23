import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner printNumber = new Scanner(System.in);
        System.out.println("Enter Number:");
        double number = printNumber.nextDouble();
        if ((number % 5 == 0) && (number % 3 == 0)) {
            System.out.print("FIZZBUZZ");}
             else if (number % 3 == 0)
                System.out.print("Buzz");
            else if (number % 5 == 0) {
                System.out.print("Fizz");
            } else {
                System.out.print(number);
            }

        }

    }