// ? HCF is calculated through Euclid's Algorithm
import java.util.*;
public class HCF {
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Numbers : ");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int ans = gcd(a , b);
        System.out.println("HCF of " +a+ " and "+b+ " is : " + ans);

        
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            if (rem == 0) {
                return b;  // b is the GCD
            } else {
                // swap divisor and remainder
                a = b;
                b = rem;
            }
        }
        return 1; // otherwise 
    }

}
