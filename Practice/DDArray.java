import java.util.*;
class DDArray{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        int ddarr[][] = new int[2][4];

        System.out.println("Enter elements of the array :");
        for(int i = 0 ; i < ddarr.length ; i++)
        {
            for(int j = 0 ; j < ddarr[i].length ; j++)
            {
                ddarr[i][j] = Sc.nextInt();
            }
        }
        DDArray obj = new DDArray();
        // obj.printDDArray(ddarr);
        // obj.ReverseRows(ddarr);
        // System.out.println("After Reversal : ");
        // obj.printDDArray(ddarr);
        int result[] = obj.SumOfRow(ddarr);
        System.err.println("Sum of Rows");
        obj.printArray(result);
        
        
    }
     void printArray(int a[]) 
    {
        for(int i = 0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    } 

    void printDDArray(int arr[][])
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.err.print(arr[i][j] + " ");
            }
            System.err.println();
        }
    }

    void ReverseRows(int arr[][])
    {
        for(int i = 0 ; i < arr.length; i++)
        {
            int start = 0;
            int end = arr[i].length - 1;
            while(start <= end)
            {
                int a = arr[i][start];
                int b = arr[i][end];
                // swap
                a = a ^ b;
                b = a ^ b;
                a = a ^ b;
                // re-assign values
                arr[i][start] = a;
                arr[i][end] = b;
                // update pointers
                start++;
                end--;
            }
        }
    }
    int [] SumOfRow(int arr[][])
    {
        int result[] = new int[arr.length];     // size ~ no. of rows
        for(int i = 0 ; i < arr.length;i++)
        {
            int sum = 0;    // reset
            for(int j = 0 ; j < arr[i].length ; j++)
            {
                sum += arr[i][j];
            }
            result[i] = sum;
        }
        return result;
    }
}