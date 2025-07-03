import java.util.Scanner;
public class stringT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String input1 = sc.next(); 
        System.out.print("Enter the second word: ");
        String input2 = sc.next(); 
        String conStr = input1 + " " + input2;
        int sum = 0;
        for (int i = 0; i < conStr.length(); i++) {
            char ch = conStr.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                sum += (int) ch;
            }
        }
        System.out.println(conStr);
        System.out.println( sum);
    }
}
