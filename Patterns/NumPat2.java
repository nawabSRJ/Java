/*
range = 4
1
2 3
4 5 6
7 8 9 10
 */
import java.io.*;
class NumPat2
{
    public static void main(String args[]) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the range : ");
        int range = Integer.parseInt(br.readLine());
        int num = 1;
        for(int i = 1; i <= range ; i++)
        {            
            for(int j = 0; j < i; j++)
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}