import java.io.*;
class NumpyArrays {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\nMake Choice :\n1->Zeros Array\n2->Ones Array\n3->Regular Shaped Array\n4->Identity Matrix\n\nChoose : ");
        NumpyArrays obj = new NumpyArrays();    // * Class Object
        int choice = Integer.parseInt(br.readLine());
        int r , c , s;
        int oneD[];
        int twoD[][];
        switch (choice) {
            case 1:
                System.out.println("Enter Rows : ");
                r = Integer.parseInt(br.readLine());
                System.out.println("Enter Columns : ");
                c = Integer.parseInt(br.readLine());
                twoD = obj.ZerosArray(r , c);
                System.out.print("Array Created : \n\n");
                obj.show_numpyArray(twoD);
                break;
            case 2:
                System.out.println("Enter Rows : ");
                r = Integer.parseInt(br.readLine());
                System.out.println("Enter Columns : ");
                c = Integer.parseInt(br.readLine());
                twoD = obj.OnesArray(r , c);
                System.out.print("Array Created : \n\n");
                obj.show_numpyArray(twoD);
                break;
            case 3:
                System.out.println("Enter Starting Value : ");
                r = Integer.parseInt(br.readLine());
                System.out.println("Enter End Value(excluded) : ");
                c = Integer.parseInt(br.readLine());
                System.out.println("Enter Step/Stride Value : ");
                s = Integer.parseInt(br.readLine());
                oneD = obj.regularShapedArray(r , c ,s);
                System.out.print("Array Created : \n\n");
                obj.show_onedArray(oneD);
                break;
            
            case 4:
                System.out.println("Enter Size : ");
                r = Integer.parseInt(br.readLine());
                twoD = obj.IdentityMatrix(r);
                System.out.print("Array Created : \n\n");
                obj.show_numpyArray(twoD);
                break;
        
            default:
                break;
        }
    }    // * MAIN ENDS

    void show_onedArray(int[] arr)
    {
        System.out.print("[");
        for(int i = 0 ;  i < arr.length ; i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.print("\b]");    // * backspace escape sequence
    }

    void show_numpyArray(int[][] arr)
    {
        int rows = arr.length; 
        int cols = arr[0].length;
        System.out.print("[");
        for(int i = 0; i < rows ; i++)
        {
            System.out.print("[");  // * for row
            for(int j = 0 ; j < cols ; j++)
            {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.print("]");
            System.out.println();
        }
        System.out.print("\b]");
    }


    int[][] ZerosArray(int rows , int cols)
    {
        int result[][] = new int[rows][cols];
        for(int i = 0; i < rows ; i++)
        {
            for(int j = 0 ; j < cols ; j++)
            {
                result[i][j] = 0;   
            }
        }
        return result;
    }


    int[][] OnesArray(int rows , int cols)
    {
        int result[][] = new int[rows][cols];
        for(int i = 0; i < rows ; i++)
        {
            for(int j = 0 ; j < cols ; j++)
            {
                result[i][j] = 1;   
            }
        }
        return result;
    }


    int[] regularShapedArray(int start , int end , int steps)
    {
        int size = (end - start) / steps;
        int result[] = new int [size];
        int k = 0;
        for(int i = start ; i < end ; i += steps )
        {
            result[k] = i;
            k++;
        }
    
    return result;
}

    int[][] IdentityMatrix(int size)
    {
        int result[][] = new int [size][size];  // * here rows = cols
        for(int i = 0; i < size ; i++)
        {
            for(int j = 0; j < size ; j++)
            {
                if(i == j)
                {
                    result[i][j] = 1;   // * diagonal dominant
                }
                else{
                    result[i][j] = 0;
                }
            }
            System.out.println();
        }
        return result;
    }


} // * class ends
