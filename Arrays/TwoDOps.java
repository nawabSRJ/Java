// TODO - Create 2 matrices using user enteries and perform Transpose , Addition , Substraction
import java.io.*;
class TwoDOps {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first[][] = new int[3][3];
        int second[][] = new int[3][3];
        TwoDOps obj = new TwoDOps();
        System.out.println("Enter the elements of the first Array : \n");
        for(int i = 0; i < 3 ; i++)
        {
            for(int j = 0; j < 3; j++){
                first[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("Enter the elements of the second Array : \n");
        for(int i = 0; i < 3 ; i++)
        {
            for(int j = 0; j < 3; j++){
                second[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("Make a Choice : \n1->Addition\n2->Substraction\n3->Tranpose\n\nchoose : ");

        int choice = Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1:
            obj.Addition(first , second);
            break;

            case 2:
            obj.Substraction(first, second);
            break;
            
            case 3:
            obj.Transpose(first);
            break;
        }

} // * Main Method Ends

void printArray(int arr[][] , int row , int col)
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

void Addition(int first[][] , int second[][])
{
    if(first.length != second.length || first[0].length != second[0].length) 
    {
        System.out.println("Sorry, Addition Cannot happen\nSize Mismatch");
        return;
    }
    int rows = first.length;
    int col = second[0].length; // ? this will give the lenth of the columns of the matrix

    int result[][] = new int[rows][col];

    for(int i = 0; i < rows; i++)
    {
        for(int j = 0; j < col ; j++)
        {
            result[i][j] = first[i][j] + second[i][j];
        }
    }
    System.out.println("Resulting Array : \n");
    printArray(result, rows, col);
}   // !Ends


void Substraction(int first[][] , int second[][])
{
    if(first.length != second.length || first[0].length != second[0].length) 
    {
        System.out.println("Sorry, Addition Cannot happen\nSize Mismatch");
        return;
    }
    int rows = first.length;
    int col = second[0].length; // ? this will give the lenth of the columns of the matrix

    int result[][] = new int[rows][col];

    for(int i = 0; i < rows; i++)
    {
        for(int j = 0; j < col ; j++)
        {
            result[i][j] = first[i][j] - second[i][j];
        }
    }
    System.out.println("Resulting Array : \n");
    printArray(result, rows, col);
}   // !Ends


void Transpose(int matrix[][])
{
    int rows = matrix.length;
    int col = matrix[0].length;
    int result[][] = new int[rows][col];

    for(int i = 0; i < rows;i++)
    {
        for(int j = 0; j < col; j++)
        {
            result[i][j] = matrix[j][i];
        }
    }
    System.out.println("Resulting Array : \n");
    printArray(result, rows, col);
}    // !Ends

} 
