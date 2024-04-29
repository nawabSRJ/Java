class InstanceBlock{
private int x;
	
{	// Instance initialization block
  System.out.println("Value of x : " + x);
  x = 7;
}

// constructor
InstanceBlock(){
	System.out.println("Value of x inside constructor: " + x);
	
}


}
class Test1{
  public static void main(String[] args){
	InstanceBlock obj = new InstanceBlock();
	
  }

}