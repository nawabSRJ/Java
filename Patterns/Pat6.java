import java.io.*;
class Pat6
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the range : ");
        int ran = Integer.parseInt(br.readLine());
        // upper Triangle
        for(int i = ran; i > 0 ;i--)
        {
            for(int j = 0; j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower Triangle
        for(int i = 2; i <= ran  ;i++)
        {
            for(int j = 0; j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}