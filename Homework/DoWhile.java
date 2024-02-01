import java.io.*;
class DoWhile
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a range : ");
        int range = Integer.parseInt(br.readLine());
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i <= range);
    }
}