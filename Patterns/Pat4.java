/*
    *   range = 5
   **
  ***
 ****
*****
*/
import java.io.*;
class Pat4
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the range : ");
        int ran = Integer.parseInt(br.readLine());
        for(int i = 1; i <= ran; i++)
        {
            int track = ran - i;    // for keeping track upto where spaces have to be printed
            for(int j = 1; j <= ran;j++)
            {
                if(j <= track) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}