class StaticBlock{
private static int x;
static	
{	// Instance initialization block
  System.out.println("Value of x : " + x);
  x = 7;
}

// constructor
StaticBlock(){
	System.out.println("Value of x inside constructor: " + x);
	
}


}
class Test2{
  public static void main(String[] args){
	StaticBlock obj = new StaticBlock();
	
  }

}