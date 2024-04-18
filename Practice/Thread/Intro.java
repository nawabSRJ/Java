class Test extends Thread{
	public void run(){
		try{
			for(int i = 0 ; i < 10 ; i++){
				System.out.println(i + " Time");
				System.out.println(Thread.currentThread().getName());

				Thread.sleep(1000);
			}
		}catch(Exception e){}
	}
	
}

class Test2 extends Thread{
	public void run(){
		try{
			for(int i = 0 ; i < 10 ; i++){
				System.out.println("Hello" + " Time");
				System.out.println(Thread.currentThread().getName());

				Thread.sleep(1000);
			}
		}catch(Exception e){}
	}
}

class Intro {
	public static void main(String args[])
	{
			Test th1 = new Test();
			Test2 th2 = new Test2();
			
		// setting the names of Threads
		th1.setName("Srajan");
		th2.setName("Saxena");



		th1.start();
		try{
			th1.join();
		}catch(Exception e) {}
			th2.start();
	} // main ends
	
} // class ends

