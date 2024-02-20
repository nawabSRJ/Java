class X{
	public int a = 10;
	public int b = 20;
	public void finalize(){
	
	}
}
class Y{
	public static void main(String args[]){
		X M = new X();
		X P = new X();
		System.out.println("First : " + M.a + " " + M.b);
		M = null;
		P = null;
		System.out.println("Second : " + M.a + " " + M.b);
		System.gc();
		//System.out.println("Third : " + M.a + " " + M.b);
	}

}