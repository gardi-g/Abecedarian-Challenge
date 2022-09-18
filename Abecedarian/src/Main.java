import java.util.Scanner;
public class Main {
    static StringBuffer printedStrings = new StringBuffer();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        generateStrings(input, 0);
        System.out.println(printedStrings);
    }
    static void generateStrings(String alphabet, int k) {
        helper(alphabet, k, new StringBuffer());
    }
    static void helper(String alphabet, int k, StringBuffer stringSoFar) {
        int len = alphabet.length();
        if (stringSoFar.length() != 0) {
            printedStrings.append(stringSoFar);
            printedStrings.append("\n");
        }
            for (int i = k; i < len; i++) {
                    stringSoFar.append(alphabet.charAt(i));
                    helper(alphabet, i + 1, stringSoFar);
                    stringSoFar.setLength(stringSoFar.length() - 1);
        }
    }
}

