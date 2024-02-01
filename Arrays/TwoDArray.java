// TODO - Basic : Creation , entering elements and displaying them in a 2-d matrix
import java.io.*;
class TwoDArray
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int twoD[][] = new int[3][5]; // * 3 rows & 5 columns
        // ? NOTE - twoD.length is 3 only ~ equal to row size
        System.out.println("Enter Elements of Array : ");

        for(int i = 0; i < twoD.length ; i++)
        {
            for(int j = 0; j < 5; j++){
                twoD[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("The Array Matrix : \n\n");
        printArray(twoD, 3, 5);
        
    } // * Main Method Ends


    static void printArray(int arr[][] , int row , int col)
    {
        for(int i = 0; i < row ; i++)
        {
            for(int j = 0; j < col ; j++)
            {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

} // * Class Ends