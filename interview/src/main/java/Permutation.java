import java.util.Scanner;

public class Permutation {

    public static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1); // remaining string
            permute(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String number = scanner.nextLine();

        System.out.println("Permutations are:");
        permute(number, "");
    }
}
