import java.io.*;
class Palindrome
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number : ");
        int num = Integer.parseInt(br.readLine());
        boolean check = isPalindrome(num);
        if(check) System.out.println("Yes!!, it is a Palindrome");
        else System.out.println("Not a Palindrome!!");
    }
    static boolean isPalindrome(int num){
        int rem,rev = 0,t=1;
        int temp = num;
        while(num > 0){
            rem = num % 10;
            rev *= 10;
            rev += rem;
            num = num / 10;
        }
        //System.out.println(rev);
        return temp == rev;
    }
}