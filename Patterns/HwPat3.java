import java.io.*;
class HwPat3
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter range : ");
        int rows = Integer.parseInt(br.readLine());
        int num;
        for(int i = 1; i<=rows;i++)
        {
            num = 1;
            for(int j = 1; j<=i;j++)
            {
                
                System.out.print(num);
                num++;
            }
            for (int k = i*2; k <= rows*2-1; k++)
            {
                System.out.print(" ");
            }
            num = i;
            for (int l = 1; l <= i; l++)
            {
                
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
        // Lower Half
        for (int i=1; i<=rows; i++)       
        {   num = 1;         
            for (int j = rows; j >= i; j--)
            {
                System.out.print(num);
                num++;
            }
            for (int k = 1; k <= i*2; k++)        
            {  
                System.out.print(" ");          
            }      
            num = 6 - i;
            for (int l = rows; l >= i; l--)
            {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
        }
    }
