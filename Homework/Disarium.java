// program to check for Disarium Number ~ sum of digits of number raised to it's position = digit
// examples - 175 
import java.io.*;
class Disarium
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number : ");
        int num = Integer.parseInt(br.readLine());
        boolean check = isDisarium(num);
        if(check) System.out.println("Yes!!, it is Disarium Number!!");
        else System.out.println("Not a Disarium Number!!");
        
    }
     static int len(int num){
       int count = 0;
        while(num > 0){
           num = num / 10;
           count++;
       }
       return count;
    }
    static boolean isDisarium(int num){
        int rem,temp = num,sum = 0,p=len(num);
        while(num > 0){
            rem = num % 10;
            sum = sum + (int)Math.pow(rem , p);
            num = num / 10;         
            p--;
        }
        System.out.println(sum);
        return temp == sum;
    }
}