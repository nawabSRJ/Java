import java.util.Scanner;
import java.util.Stack;

public class Parser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter code:");
        String code = scanner.nextLine();
        boolean check = parser(code);
        if (check)
            System.out.println("Code Correct");
        else
            System.out.println("Error");
        scanner.close();
    }

    public static boolean parser(String code) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < code.length(); i++) {
            StringBuilder ch = new StringBuilder();
            if (code.charAt(i) == '<') {
                i++;
                while (code.charAt(i) != '>') {
                    ch.append(code.charAt(i));
                    i++;
                }
                if (stack.empty())
                    stack.push(ch.toString());
                else {
                    if (("/" + stack.peek()).equals(ch.toString())) {
                        stack.pop(); // pop the top ~ closing tag matched
                    } else {
                        stack.push(ch.toString());
                    }
                }
            }
        }
        return stack.empty();
    }
}
