// ? question - Create two threads, one printing odd numbers and the other printing even numbers alternatively, starting from 1.

class Even extends Thread{
    @Override
        public void run()
        {
            try{
                for(int i = 1; i <= 10 ; i++)
                {
                    if(i % 2 == 0)
                    {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                }
            }catch(Exception e)
            {
                System.err.println(e);
            }
        }
}
class Odd extends Thread{
    @Override
        public void run()
        {
            try{
                for(int i = 1; i <= 10 ; i++)
                {
                    if(i % 2 != 0)
                    {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                }
            }catch(Exception e)
            {
                System.err.println(e);
            }
        }
}

class EvenOdd extends Thread{
        
    public static void main(String args[])
    {
        Even th1 = new Even();
        Odd th2 = new Odd();
        th2.start();
        th1.start();
    }
}