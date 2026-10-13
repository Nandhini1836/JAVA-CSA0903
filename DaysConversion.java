import java.util.Scanner;

public class DaysConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int days = sc.nextInt();

        if (days < 0) {
            System.out.println("Invalid number of days");
        } else {
            int years = days / 365;
            int remainingDays = days % 365;

            int weeks = remainingDays / 7;
            int remaining = remainingDays % 7;

            System.out.println("No. of years: " + years);
            System.out.println("No. of weeks: " + weeks);
            System.out.println("No. of days: " + remaining);
        }

        sc.close();
    }
}