// TODO : Take an array and (i) insert elt at a pos (ii) delete element at a position
import java.io.*;
class ArraySecond
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[10];
        System.out.print("How many elements you want to enter? ");
        int size = Integer.parseInt(br.readLine());
        // * elements taken by user
        System.out.println("Enter elements of the array : ");
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        ArraySecond obj = new ArraySecond(); // * class object
        System.out.print("\n\nMake Choice : \n1->Insert an Element\n2->Delete an Element\n\nchoose : ");
        int choice = Integer.parseInt(br.readLine());
        switch(choice)
        {
            case 1:

            System.out.println("Enter Element to insert : ");
            int elt = Integer.parseInt(br.readLine());
            System.out.println("Enter position : ");
            int pos = Integer.parseInt(br.readLine());
            obj.insertElement(arr , elt , pos);
            size += 1; // ! when new element is inserted
            System.out.println("Modified Array : ");
            printArray(arr , size);
            break;

            case 2:
            break;
        }
    } // * Main Method Ends

    // * to print Array
    static void printArray(int a[] , int size) 
    {
        for(int i = 0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    } // !Ends

    static void swap(int a , int b)
    {
        a = a + b;
        b = a-b;
        a = a-b;
    }
    void insertElement(int arr[] , int elt,int pos)
    {
        if (pos < 0 || pos > arr.length) {
            System.out.println("Invalid position");
            return;
        }
        int temp = elt; // * to hold the var to swap
        for(int i = pos ; i < arr.length ; i++)
        {
            /* make the logic of swap here , bcoz Java is a pass-by-value language. When you pass arr[i] and temp to the swap method, you're passing the values of these variables, not the references to the actual memory locations. Therefore, the swapping won't affect the original array. */
            arr[i] = arr[i] + temp;
            temp = arr[i] - temp;
            arr[i] = arr[i] - temp;            
        }
    }

    void deleteElement(int arr[] , int elt,int pos)
    {
        if (pos < 0 || pos >= arr.length) {
            System.out.println("Invalid index");
            return;
        }
        arr[pos] = 0;   // since it is a non-dynamic array!!
        for(int i = pos; i < arr.length ; i++)
        {

        }
    }

}