import java.util.Scanner;

public class Q13_CharacterType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        boolean isLetter = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
        boolean isVowel = "aeiouAEIOU".indexOf(ch) != -1;
        boolean isDigit = ch >= '0' && ch <= '9';

        String type = isLetter ? (isVowel ? "Vowel" : "Consonant")
                               : (isDigit ? "Digit" : "Special symbol");
        System.out.println("'" + ch + "' is a: " + type);
        sc.close();
    }
}
