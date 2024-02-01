// armstrong number - sum of every digit raised to the length of the number = number
// correct
import java.io.*;
class Armstrong 
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number : ");
        int num = Integer.parseInt(br.readLine());
        boolean check = isArmstrong(num);
        if(check) System.out.println("Yes!!, it is Armstrong");
        else System.out.println("No, it is not Armstrong");
    }
    static int len(int n){
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        return count;
    }
    static boolean isArmstrong(int num){
        int rem,temp = num,sum = 0,p = len(num);
        while(num > 0){
            rem = num % 10;
            sum = sum + (int)Math.pow(rem , p);
            num = num / 10;
        }
        return temp == sum;
    }
}