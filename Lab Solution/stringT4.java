import java.util.Scanner;
public class stringT4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a word with unique alphabets:");
            String input = sc.nextLine();
            boolean isValid = true;
            int[] counts = new int[26];
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (currentChar < 'a' || currentChar > 'z') {
                    System.out.println("Invalid input. Enter small letters only.");
                    isValid = false;
                    break;
                }
                counts[currentChar - 'a']++;
                if (counts[currentChar - 'a'] > 1) {
                    isValid = false;
                }
            }
            if (isValid) {
                System.out.println("You entered " + input + ".");
                break;
            } 
            else {
                for (int i = 0; i < 26; i++) {
                    if (counts[i] > 1) {
                        System.out.println("'" + (char) (i + 'a') + "' has been counted " + counts[i] + " times in the word \"" + input + "\".");
                    }
                }
                System.out.println("Please enter another word.");
            }
        }
    }
}