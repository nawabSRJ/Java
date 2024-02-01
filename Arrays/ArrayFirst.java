import java.io.*;

class ArrayFirst {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[5];
        int size = arr.length;
        System.out.println("Enter elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.print("Elements in the array : \n");
        for (int value : arr) {
            System.out.println(value);
        }
        
        while (true) {
            System.out.println("\n\nMake Choice : \n0->End\n1->Sum of elements\n2->Positive & Negative Count\n3->Count of Even & Odd\n4->Two Digits and Three Digits");
            int choice = Integer.parseInt(br.readLine());
            int ans;
            ArrayFirst obj = new ArrayFirst(); // object of class
            
            switch (choice) {
                case 0:
                    System.exit(0); // You can pass any integer as the exit status.

                case 1:
                    ans = obj.sum(arr, size); // calling func through object
                    System.out.println("Sum of elements = " + ans);
                    break;

                case 2:
                    ans = obj.countpos(arr, size);
                    System.out.println("Positive Numbers = " + ans);
                    System.out.println("Negative Numbers = " + (size - ans));
                    break;

                case 3:
                    ans = obj.counteven(arr, size);
                    System.out.println("Even Numbers = " + ans);
                    System.out.println("Odd Numbers = " + (size - ans));
                    break;
                
                case 4:
                int res[] = obj.countdigits(arr , size);
                System.out.println("Two Digit Numbers = " + res[0]);
                System.out.println("Three Digit Numbers = " + res[1]); 
                break;
            }
        }

    } // * MAIN METHOD ENDS

    int counteven(int arr[], int size) {
        int evencnt = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                evencnt += 1;
            }
        }
        return evencnt;
    } // !ends

    int countpos(int arr[], int size) {
        int pcnt = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] > 0) {
                pcnt += 1;
            }
        }
        return pcnt;
    } // !ends

    int sum(int arr[], int size) {
        int s = 0;
        for (int i = 0; i < size; i++) {
            s += arr[i];
        }
        return s;
    } // !ends

    static int len(int n)  // * let it be static as it is a utility fun used by other methods
    {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }

        return count++;
    } // !ends

    int[] countdigits(int arr[] , int size)
    {
        int cnt[] = {0,0};
        for(int i = 0 ; i < size ; i++)
        {
            if(len(arr[i]) == 2){
                cnt[0] += 1;
            }
            else if(len(arr[i]) == 3){
                cnt[1] += 1;
            }
        }
        return cnt;
    }

    
}