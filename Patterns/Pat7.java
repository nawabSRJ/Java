/* rows = 5
    *
   ***
  *****
 *******
*********
*/
import java.io.*;
class Pat7
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the rows : ");
        int rows = Integer.parseInt(br.readLine());
        int ran = 1;
        
        while(rows != 0){
            int c = 1,i = 0;
            while(i < rows - c)
            {
                System.out.print(" ");
                i++;
            }
            for(i = 1; i <= ran;i++){
                System.out.print("*");
            }
            ran += 2;
            rows--;
            c++;
            System.out.println();
        }
    }
}