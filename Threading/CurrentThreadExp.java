public class CurrentThreadExp extends Thread{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[])
    {
        CurrentThreadExp th1 = new CurrentThreadExp();

        CurrentThreadExp th2 = new CurrentThreadExp();

        th1.start();
        th2.start();

    }
}
