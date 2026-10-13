import java.util.Scanner;

public class PerfectSquares {

    static int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int lower = sc.nextInt();

        System.out.print("Enter upper range: ");
        int upper = sc.nextInt();

        if (lower < 0 || upper < lower) {
            System.out.println("Invalid range");
            return;
        }

        System.out.print("[");

        boolean first = true;

        for (int i = lower; i <= upper; i++) {

            int root = (int) Math.sqrt(i);

            if (root * root == i && digitSum(i) < 10) {

                if (!first) {
                    System.out.print(", ");
                }

                System.out.print(i);
                first = false;
            }
        }

        System.out.println("]");

        sc.close();
    }
}