import java.util.*;
import java.util.Scanner;
class Fibonacci{
	public static void main(String args[]){
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the nth term : ");
		int n = Sc.nextInt(); // no. of terms
		int prev = 0, curr = 1;
		int next = prev + curr;
		System.out.print(prev + " " + curr + " " + next);
		
		// now print rest of the series
		while(n != 0){
			prev = curr;
			curr = next;
			next = prev + curr;
			System.out.print(" " + next);
			n--;
		}
		System.out.println();
	}
}