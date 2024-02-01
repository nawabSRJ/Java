import java.io.*;
class First
{
    public static void main(String args[])  throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int s = a + b;
        System.out.println("Sum = " + s);

    }
}