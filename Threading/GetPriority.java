public class GetPriority extends Thread{

    @Override
    public void run()
    {
        System.out.println("Running thread name is : " + Thread.currentThread().getPriority());
    }

    public static void main(String args[])
    {
        GetPriority obj = new GetPriority();
        GetPriority obj2 = new GetPriority();
        GetPriority obj3 = new GetPriority();
        GetPriority obj4 = new GetPriority();

        System.out.println("obj Thread Priority : " + obj.getPriority());
        System.out.println("obj2 Thread Priority : " + obj2.getPriority());
        System.out.println("obj Thread Priority : " + obj3.getPriority());
        System.out.println("obj2 Thread Priority : " + obj4.getPriority());
    }
}
