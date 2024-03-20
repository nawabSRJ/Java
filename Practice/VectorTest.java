import java.util.*;

class VectorTest{
	public static void main(String args[]){

	Scanner Sc = new Scanner(System.in);
	Vector <String> vec = new Vector<>();
	
	vec.addElement("Srajan");
	vec.addElement("Shivam");
	vec.addElement("Aaditya");
	vec.addElement("Stuti");
	vec.addElement("Anybody");
	System.out.print("Here is the vector : " + vec);

	// removing

	vec.removeElement("Anybody");
	System.out.print("Here is the vector : " + vec);

	vec.removeElementAt(2);
	System.out.print("Here is the vector : " + vec);
	
	System.out.println("First : " + vec.firstElement());
	System.out.println("Last : " + vec.lastElement());

	// setting element 
	System.out.println("Setting @ 0th index : ");
	vec.setElementAt("Virat" , 0);
	System.out.print("After setting element : " + vec);
} // main ends

} // class ends