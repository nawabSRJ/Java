// program to find the length of a number
import java.io.*;
class Length
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number to check length : ");
        int num = Integer.parseInt(br.readLine());
        //int ans = len(num);
        System.out.println("Length of number is : " + len(num));
    }
    static int len(int num){
       int count = 0;
        while(num > 0){
           num = num / 10;
           count++;
       }
       return count;
    }
}