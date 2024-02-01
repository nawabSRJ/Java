import java.io.*;
// first logic
class Reverse
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number : ");
        int num = Integer.parseInt(br.readLine());
        int temp = num;
        int rem, rev = 0;
        while(num > 0){
            rem = num % 10;
            rev *= 10;
            rev += rem;
            num = num / 10;
        }
        System.out.println("Reverse of the number "+temp+" is = " + rev);
    }
}