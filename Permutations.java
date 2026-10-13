import java.util.*;

public class Permutations {

    static void generate(String str, String ans, Set<String> result) {

        if (str.length() == 0) {
            result.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String remaining = str.substring(0, i)
                    + str.substring(i + 1);

            generate(remaining, ans + ch, result);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Given Number: ");
        String number = sc.next();

        if (number.startsWith("-")) {
            System.out.println("Invalid input");
        } else {
            Set<String> result = new TreeSet<>();

            generate(number, "", result);

            System.out.println("Permutations are:");

            for (String permutation : result) {
                System.out.println(permutation);
            }
        }

        sc.close();
    }
}