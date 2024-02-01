// program to generate a factorial of a number
import java.io.*;
class Factorial
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number : ");
        int n = Integer.parseInt(br.readLine());
        int ans = factorial(n);
        System.out.print("The factorial of number is = " + ans);
    }
    static int factorial(int n){
        if(n == 0) return 1;
        else return n * factorial(n-1);
    }
}