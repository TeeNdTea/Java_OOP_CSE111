import java.util.Scanner;
public class stringT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == 'a') {
                result += 'z';
            } 
            else {
                result += (char) (currentChar - 1);
            }
        }
        System.out.println(result);
    }
}
