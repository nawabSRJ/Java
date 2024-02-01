// Palindrome ~ reverse and check
import java.io.*;
class Palindrome
{
	public static void main(String args[]) throws IOException 
{
	BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	System.out.println("Enter a number : ");

	int num = Integer.parseInt(br.readLine());

	// int temp = num;
	int rem, rev = 0, p = len(num);
//System.out.print(p);
	while(num > 0){
		rem = num % 10;
		rev += rem * Math.pow(10,p-1);
		//rev *= 10 ;
		//rev = rev + rem;		
		p--;
		num = num / 10;
		} // end of while
	System.out.println(rev);

}// end of main func

// new func for length of number
static int len(int num){	
int count = 0;
while(num > 0){
num = num / 10;
count++;
}
return count;
}


} // end of class