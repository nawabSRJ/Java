import java.io.*;
class HwPat4
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter range : ");
        int rows = Integer.parseInt(br.readLine());
        int rowCount = 1;
        for (int i = rows; i > 0; i--)  
        {  
            /* Print i*2 spaces at the beginning of each row */  
   
            for (int j = 1; j <= i*2; j++)  
            {  
                System.out.print(" ");  
            }  
   
            /* Printing j value where j value will be from 1 to rowCount */  
   
            for (int j = 1; j <= rowCount; j++)            
            {  
                System.out.print(j+" ");  
            }  
   
            /* Print j value where j value will be from rowCount-1 to 1 */  
               
            for (int j = rowCount-1; j >= 1; j--)  
            {                 
                System.out.print(j+" ");              
            }                             
            System.out.println();  
            rowCount++;  
    }
}
}