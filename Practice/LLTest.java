import java.util.*;

class LLTest{
	public static void main(String args[]){

	Scanner Sc = new Scanner(System.in);
	
	LinkedList<String> words = new LinkedList<>();
	words.add("Hi");
	words.add(1,"Hello");
	words.add("Greetings");
	
	System.out.println("Here is the words LL : " + words);

	// removing
	words.remove(1); // index
	System.out.println("After Removal : " + words);
	
	// searching element with index
	System.out.print("Enter any index less than " + words.size() + " : "); 
	int ind = Sc.nextInt();
	System.out.println("Element @ " + ind + " is : " + words.get(ind)); 

} // main ends
	
}// class ends