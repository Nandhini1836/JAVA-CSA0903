import java.util.Scanner;

public class StudentUsers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Total Users: ");
        int totalUsers = sc.nextInt();

        System.out.print("Staff Users: ");
        int staffUsers = sc.nextInt();

        if (totalUsers < 0 || staffUsers < 0) {
            System.out.println("Invalid input");
        } 
        else if (staffUsers > totalUsers) {
            System.out.println("Invalid input: Staff users cannot exceed total users");
        } 
        else {
            int nonTeachingStaff = staffUsers / 3;
            int studentUsers = totalUsers - staffUsers - nonTeachingStaff;

            System.out.println("Student Users: " + studentUsers);
        }

        sc.close();
    }
}
