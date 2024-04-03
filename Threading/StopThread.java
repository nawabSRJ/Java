public class StopThread extends Thread{
    @Override
    public void run()
    {
        try{
            for(int i = 0 ; i < 5; i++)
            {
                if(i == 3)
                {
                    
                }
                System.out.println("In Y loop : " +i);
                Thread.sleep(2000);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String args[])
    {
        StopThread obj = new StopThread();
        obj.start();
    }
}
