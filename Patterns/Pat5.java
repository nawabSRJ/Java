/*  range = 5
*****
*   *
*   *
*   *
*****
*/
import java.io.*;
class Pat5
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the range : ");
        int ran = Integer.parseInt(br.readLine());
        
        for(int i = 0;i<ran;i++)
        {
            for(int j = 0;j<ran;j++)
            {
                if(i == 0 || j == 0 || i == ran-1 || j == ran-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}