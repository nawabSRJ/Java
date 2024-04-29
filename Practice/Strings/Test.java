import java.util.*;
class Test {
	public static void main(String args[]){
		String name = "Srajan Saxena";
		name = name.toLowerCase();

		int len = name.length();
		String name2 = "srajan saxena";
		System.out.println(name);
		System.out.println(name.equalsIgnoreCase(name2));
	}
} // class ends