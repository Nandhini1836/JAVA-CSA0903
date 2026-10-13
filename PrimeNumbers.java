import java.util.Scanner;

public class PrimeNumbers {

    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("N = ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int count = 0;
        int number = 2;
        int nthPrime = 0;

        // Find Nth prime
        while (count < n) {
            if (isPrime(number)) {
                count++;
                nthPrime = number;
            }
            number++;
        }

        System.out.println(n + "th Prime number is " + nthPrime);

        // Print N prime numbers after Nth prime
        System.out.print(n + " prime numbers after " + nthPrime + " are: ");

        count = 0;

        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number);

                count++;

                if (count < n)
                    System.out.print(", ");
            }

            number++;
        }

        System.out.println();

        sc.close();
    }
}