import java.util.*;
class Alive extends Thread{
    Scanner Sc = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    
    @Override
    public void run()
    {
        try{
            for(int i = 0 ; i < 5; i++)
            {
                System.out.println("Enter a number : ");
                int x = Sc.nextInt();
                arr.add(x);
                Thread.sleep(4000);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
        show();
    }
    public void show()
    {
        System.out.println(arr);
    }

    public static void main(String args[])
    {
        Alive obj = new Alive();
        System.err.println("Before : " + obj.isAlive());
        obj.start();
        System.err.println("After : " + obj.isAlive());

    }

}