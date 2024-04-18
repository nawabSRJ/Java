// todo - implement a simple producer and consumer problem
// ? (self made question) - Make one stack of string and then keep filling it with eatables in an array using thread and keep removing it (from top) using another thread.
// * Requirements : 
import java.util.*;
import java.util.Stack;
class Producer implements Runnable{
    
    // now fill 
    public void run()
    {
        try{
            for(int i = 0 ; i < 7 ; i++){
                Eat.st.push(Eat.eatables[i]);
                System.out.println("Bucket : " + Eat.st);
                Thread.sleep(1000);
            }
        }catch(Exception e)
        {
            System.err.println(e);
        }
    }


}
class Consumer implements Runnable{
    // eat this
    public void run()
    {
        try{
                while (!Eat.st.empty()) {
                    for(int i = 0 ; i < 7 ; i++)
                    {
                        Eat.st.pop();
                        System.out.println("Bucket : " + Eat.st);
                        Thread.sleep(1000); 
                    }
                }
        }catch(Exception e)
        {
            System.err.println(e);
        }
    }
}
class Eat extends Thread {
    static Stack<String> st = new Stack<>();
    static String eatables[] = new String[7];
    
    


    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        for(int i = 0 ; i < 7 ; i++)
        {
            String item = Sc.nextLine();
            eatables[i] = item;
        }
        Producer put = new Producer();
        Consumer eat = new Consumer();
        // put.start();
        // eat.start();

        // Create threads for producer and consumer
        Thread producerThread = new Thread(put);
        Thread consumerThread = new Thread(eat);

        producerThread.start();
        consumerThread.start();
    }

}
