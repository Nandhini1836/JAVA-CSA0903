import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int lower = sc.nextInt();

        System.out.print("Enter upper range: ");
        int upper = sc.nextInt();

        if (lower < 0 || upper < lower) {
            System.out.println("Invalid range");
        } else {
            System.out.print("[");

            for (int i = lower; i <= upper; i++) {

                System.out.print("(" + i + ", " + (i * i) + ")");

                if (i < upper) {
                    System.out.print(", ");
                }
            }

            System.out.println("]");
        }

        sc.close();
    }
}