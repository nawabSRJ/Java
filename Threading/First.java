// todo - first thread program 
class X extends Thread{
    int i ;
    @Override
    public void run()
    {
        try{
            for(int i = 0 ; i < 10; i++)
            {
                System.out.println("In X loop : " + i);
                Thread.sleep(2000);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Y extends Thread{
    int i ;
    @Override
    public void run()
    {
        try{
            for(int i = 0 ; i < 5; i++)
            {
                System.out.println("In Y loop : " +i);
                Thread.sleep(2000);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class First{
    public static void main(String args[])
    {
        X obj = new X();
        Y obj2 = new Y();

        // obj.start();
        // obj2.start();

        // ? In case - to run one thread after each other
        obj.start();
        try{
            obj.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        obj2.start();   
    }
    
}