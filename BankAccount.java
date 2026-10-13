import java.util.Scanner;

class Account {

    String name;
    int accountNumber;
    char type;
    double balance = 10000.00;

    void readDetails(Scanner sc) {

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();

        System.out.print("Enter Depositor Name: ");
        name = sc.next();

        System.out.print("Enter Account Type (S/C): ");
        type = sc.next().charAt(0);
    }

    void deposit(double amount) {

        balance = balance + amount;

        System.out.println("Amount Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {

        if (balance - amount >= 500) {
            balance = balance - amount;

            System.out.println("Amount Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Withdrawal not possible.");
            System.out.println("Minimum balance of Rs.500 must be maintained.");
        }
    }

    void display() {

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Depositor Name: " + name);
        System.out.println("Account Type: " + type);
        System.out.println("Final Balance: " + balance);
    }
}

public class BankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account acc = new Account();

        acc.readDetails(sc);

        System.out.print("Enter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        acc.deposit(depositAmount);

        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        acc.withdraw(withdrawAmount);

        System.out.println("\nAccount Details:");
        acc.display();

        sc.close();
    }
}