import java.io.*;
class NumpyFunctions
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose : \n1->1D Array\n2->2D Array\n\nChoose : ");

        System.out.println("\n\nMake Choice :\n1->Array Sum\n2->Mean Array\n3->Min & Max of Array\n4->Square root of each element\n5->Get Shape(dimensions) of Array\n6->Reshape Array\n\nChoose : ");


        NumpyFunctions obj = new NumpyFunctions();    // * Class Object
        int choice = Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1:

            break;
        }
    }   // * Main Ends


    // * <------------------------- Functions for 1D Array ------------------------------>
    int[] createArray(int size)
    {
        int ans[] = new int[size];
        System.out.println("Enter Array Elements : ");
        for(int i = 0; i < size; i++)
        {
            ans[i] = Integer.parseInt(br.readLine());
        }
    }
    int sum(int arr[])
    {
        int ans = 0;
        for(int i = 0; i < arr.length ; i++)
        {
            ans += arr[i];
        }
        return ans;
    }

    int mean(int arr[])
    {        
        int ans = sum(arr) / arr.length;
        return ans;
    }

    int min(int arr[]) 
    {
        int ans = arr[0];
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(ans > arr[i])
            {
                ans = arr[i];
            }
        }
        return ans;
    }

    int max(int arr[])
    {
        int ans = arr[0];
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(ans < arr[i])
            {
                ans = arr[i];
            }
        }
        return ans;
    }

    double[] sqrt(int arr[])
    {
        double result[] = new double [arr.length];
        for(int i = 0 ; i < arr.length ; i++)
        {
            result[i] = Math.sqrt(arr[i]);
        }

        return result;
    }

    // * <------------------------- Functions for 2D Array ------------------------------>
    int min(int arr[][]) 
    {
        int ans = arr[0][0];
        for(int i = 1 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                if(ans > arr[i][j])
            {
                ans = arr[i][j];
            }
            }
            
        }
        return ans;
    }

    int max(int arr[][])
    {
        int ans = arr[0][0];
        for(int i = 1 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[0].length ; j++)
            {
                if(ans < arr[i][j])
                {
                ans = arr[i][j];
                }
            }
            
        }
        return ans;
    }

    int mean(int arr[][])
    {      
        int total_terms = arr.length * arr[0].length;
        int ans = sum(arr) / total_terms;
        return ans;
    }

    int sum(int arr[][])    // * for DD Array
    {
        int ans = 0;
        for(int i = 0; i < arr.length ; i++)
        {
            for(int j = 0; j < arr[0].length;j++)
            {
                ans += arr[i][j];
            }
        }
        return ans;
    }


}   // * Class Ends