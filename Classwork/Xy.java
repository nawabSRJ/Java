class Time
{
	int h , m , s;	// member variable 

	public Time()	// default constructor (with no parameter) : to initialize the member variable of the class
	{
		h = 10; m = 20; s = 30;
	}
	
	public Time(int x , int y , int z)	// parameterized Constructor
	{
		h = x; m = y; s = z;
	}

	/*public void add(Time A , Time B)	// with args , no return type
	{
		m = (A.s + B.s) / 60;
		s = (A.s + B.s) % 60;
		h = (A.m + B.m) / 60;
		m += (A.m + B.m) % 60;
		h += A.h + B.h;
		System.out.println(h + ":" + m + ":" + s);
	} */

	public Time add(Time A , Time B)	// with args , with return type -> Time object
	{
	// Math Logic : 
		m = (A.s + B.s) / 60;
		s = (A.s + B.s) % 60;
		h = (A.m + B.m) / 60;
		m += (A.m + B.m) % 60;
		h += A.h + B.h;	
	// Math Logic 
		Time val = new Time();
		val.h = h;
		val.m = m;
		val.s = s;

		return val;	// object return 
	} 
	

}// class ends

class Xy{

	public static void main(String args[])
	{
		Time P = new Time();	
		Time Q = new Time(20 , 10 , 40);
		Time R = new Time(); 
		Time A = new Time();
		A = R.add(P , Q);	// accessing with object returned in function above
		System.out.println("Hours : " + A.h);
		System.out.println("Minutes : " + A.m);
		System.out.println("Seconds : " + A.s);
	}

}