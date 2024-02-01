/*
 * range = 4
1
1 2
1 2 3
1 2 3 4 
 */
import java.io.*;
class NumPat1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the range : ");
        int range = Integer.parseInt(br.readLine());        
        for(int i = 1; i <= range ; i++)
        {
            int num = 1;
            for(int j = 0; j < i;j++)
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        
    }
}