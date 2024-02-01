// rotate array by some fixed value in a DD array , do this row wise and column wise
import java.io.*;
class Shift
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Shift obj = new Shift();
        System.out.println("Enter the rows of the array : ");
        int rows = Integer.parseInt(br.readLine());
        System.out.println("Enter the columns of the array : ");
        int cols = Integer.parseInt(br.readLine());
        int arr[][] = new int[rows][cols];

        for(int i = 0 ; i < rows ; i++)
        {
            for(int j = 0; j < cols ; j++)
            {
                arr[i][j] = Integer.parseInt(br.readLine());
            }
        }
        int reform[][] = new int[rows][cols];
        for(int i = 0 ; i < arr.length ; i++)   // cover all rows
        {
            for(int j = 0; j < arr[i].length ; j++)
            {
                reform[i] = obj.shiftvalues(arr[i] , 1);
            }
        }

        System.out.println("Array after Shifting : \n");
        
        obj.printTwoDArray(reform);
    } // * main ends

    void printTwoDArray(int arr[][])
    {
        for(int i = 0; i < arr.length ; i++)
        {
            for(int j = 0; j < arr[i].length ; j++)
            {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    int[] shiftvalues(int arr[] , int r)    // * r -> rotation value
    {
        int k = 0;
        int result[] = new int[arr.length];
        for(int i = r; i < arr.length + r; i++)
        {
            result[i % arr.length] = arr[k];
            k++;
        }
        return result;
    }


}