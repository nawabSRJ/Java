public class Intro{
  public static void main(String[] args){
  	Integer i1 = Integer.valueOf("123");
	Double d1 = Double.valueOf("3.14");

	// also you can convert from one base to another
	Integer i2 = Integer.valueOf("0111",2); // num , base ~ converting a number of base 2 to base 10 
	
	// let's print them
	System.out.println(i1);
	System.out.println(i2);
	System.out.println(d1);

	// let's check their type 
	// xxxValue() ~ return the value in the wrapper class object

	if(i1.intValue() == 123){
		System.out.println("i1 is int type");
	}
	if(d1.doubleValue() == 3.14){
		System.out.println("d1 is double type");
	}
	

	// Conversion
	String num = "7";
	int a = Integer.parseInt("123");
	int b = Integer.parseInt(num);
	System.out.println("Sum of a & b : " + a+b);	// why concatenation?
  }

} // end of class