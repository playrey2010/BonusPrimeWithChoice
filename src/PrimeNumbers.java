import java.util.Scanner;
import java.util.Random;

public class PrimeNumbers {

    public static void main(String[] args) {
        int num1;
        boolean isPrime = true;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        String choice = "";

        System.out.print("Would you like to generate a random number? (Y/N): ");
        choice = sc.next();

        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Generating random number... please wait.");
            num1 = 1 + r.nextInt(250);
        } else {
            System.out.print("Please enter a number and I'll let you know if it is prime or not: ");
            num1 = sc.nextInt();
        }
        if (num1 == 0 || num1 == 1){
            System.out.println(num1 + " is not a prime number.");
        } else {
            for (int i = 2; i < num1; i++) {
                if (num1%i == 0) {
                    isPrime = false;
                    break;
                } else {isPrime = true;}
            }
            if (isPrime) {
                System.out.println(num1 + " is a prime number.");
            } else {
                System.out.println(num1 + " is not a prime number.");
            }
        }
    }
}
