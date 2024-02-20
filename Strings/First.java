import java.util.*;
class First {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        First obj = new First();
        System.out.println("Choose : \n1->Reverse String\n2->Check Palindrome\n3->Sum of Numeric String\n4->Sort String (unicode based / alphabetically)\n5->Maximum Occuring character\n");
        String val;
        boolean check;
        String s; int ans; char c;
        int choice = Sc.nextInt();
        // Consume the newline character
        Sc.nextLine();
        switch (choice) {

            case 1:
                System.out.println("Enter string to reverse : ");
                // Use next() to read the string
                s = Sc.next();
                val = obj.reverse(s);
                System.out.println("Reversed : " + val);
                break;

            case 2:
                System.out.println("Enter string : ");
                // Use next() to read the string
                s = Sc.next();
                check = obj.isPalindrome(s);
                if (check)
                    System.out.print("Yes, Palindrome");
                else
                    System.out.println("Not Palindrome");
                break;

            case 3:
            System.out.println("Enter string : ");
            // Use next() to read the string
            s = Sc.next();
            ans = obj.NumericSum(s);
            System.out.println(ans);
            break;

            case 4:
            System.out.println("Enter string : ");
            // Use next() to read the string
            s = Sc.next();
            val = obj.sortString(s);
            System.err.println("Sorted String : \t" + val);
            break;    
            
            case 5:
            System.out.println("Enter string : ");
            s = Sc.next();
            c = obj.MaxOccuring(s);
            System.err.println("Max Occuring : " + c);

        }
    }

    String reverse(String s) {
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ans += s.charAt(i);
        }
        return ans;
    }

    boolean isPalindrome(String s) {
        String rev = reverse(s);
        // Compare strings using .equals() method
        return s.equals(rev);
    }

    int NumericSum(String s) {
        int num = 0;
        int t = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            // Convert character to integer by subtracting '0'
            int digit = ch - '0';   // this opr. will result in int value
            num += digit * t;
            t = t * 10;
        }
        int rem, sum = 0;
        while(num != 0)
        {
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
    
    String sortString(String s)
    {
        // * Method - Used Array Class pre-built functions to achieve this
        // Convert the input string to a character array
        char[] charArray = s.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Construct a new string from the sorted character array
        String sortedString = new String(charArray);

        return sortedString;
    }

    char MaxOccuring(String s)
    {
        // * Moore's Voting Algorithm
        String str = sortString(s);
        int count = 0;
        char ch = ' ';  // * imp. to initialize local char var 
        for(int i = 0 ; i < str.length();i++)
        {
            if(count == 0)
            {
                ch = str.charAt(i);
            }
            if(ch == str.charAt(i)){
                count++;
            }else{
                count--;
            }
        }
        return ch;  // max occuring character
    }
}
