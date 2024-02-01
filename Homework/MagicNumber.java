// A magic number is 127 = 1+2+7 = 10 -> 1+0 = 1; final sum should be = 1
import java.io.*;
class MagicNumber
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number : ");
        int num = Integer.parseInt(br.readLine());
        int rem,sum=0;
        //System.out.println(sum);
        boolean check = isMagic(num);
        if(check){
            System.out.println("Yes!!, it is a Magic Number");
        }else{
            System.out.println("Not a Magic Number");
        }
    }    
    static boolean isMagic(int num){
        int sum;
        do{
            sum = 0;
            while(num > 0){
                //rem = num % 10;
                sum += num % 10;    // evaluation is right-to-left
                num = num / 10;
            }
            num = sum;
        }while(sum > 9);
        return sum == 1;
    }
}