public class stringT6 {
    public static void main(String[] args) {
        String input1 = "ABBCCCCCBBAB";
        String input2 = "AAABBBBCDDBBECE";

        String str = input1;
        if (str.length() == 0) {
            System.out.println("");
        } 
        else {
            char[] chars = new char[str.length()];
            int index = 0;
            chars[index++] = str.charAt(0);
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(i - 1)) {
                    chars[index++] = str.charAt(i);
                }
            }
            String result = "";
            for (int i = 0; i < index; i++) {
                result += chars[i];
            }

            System.out.println(result); 
        }
// second input
        str = input2;
        if (str.length() == 0) {
            System.out.println("");
        } 
        else {
            char[] chars = new char[str.length()];
            int index = 0;

            chars[index++] = str.charAt(0);

            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(i - 1)) {
                    chars[index++] = str.charAt(i);
                }
            }
            String result = "";
            for (int i = 0; i < index; i++) {
                result += chars[i];
            }

            System.out.println(result); 
        }
    }
}
