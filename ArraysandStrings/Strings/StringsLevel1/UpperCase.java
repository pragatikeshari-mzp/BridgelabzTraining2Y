package StringsLevel1;

import java.util.Scanner;

public class UpperCase {

    static String convertToUpperCase(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result = result + ch;
        }

        return result;
    }

    static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        String userDefined = convertToUpperCase(text);

        String builtIn = text.toUpperCase();

        System.out.println("User-defined uppercase: " + userDefined);
        System.out.println("Built-in uppercase: " + builtIn);

        System.out.println("Both are same: "
                + compareStrings(userDefined, builtIn));

        sc.close();
    }
}