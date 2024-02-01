/* This pattern :
*
* *
* * *
* * * * 

*/
import java.io.*;
class RightTri
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter No. of Rows of Right Triangle : ");
        int range = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= range ; i++)
        {
            for(int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}