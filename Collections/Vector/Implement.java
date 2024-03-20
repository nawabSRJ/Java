import java.util.*;
public class Implement {
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        Vector <Integer> vec = new Vector<>();
        vec.addElement(10);
        vec.addElement(22);
        vec.addElement(32);
        vec.addElement(52);

        System.out.println("Vector @ line 12 : " + vec);

        vec.add(3 , 42);
        System.out.println("Vector @ line 16 : " + vec);

        
        System.out.println("First Element : " + vec.firstElement());
        System.out.println("Last Element : " + vec.lastElement());

        // setting element

        vec.setElementAt(12, 1);
        System.out.println("Vector @ line 24 : " + vec);

        System.out.println("Enter any index : ");
        int i = Sc.nextInt();
        System.out.println(vec.elementAt(i));

        System.out.println("Removing the first element");
        vec.removeElementAt(0);    

        System.out.println("Vector @ line 33 : " + vec);

        System.out.println(vec.isEmpty());
    }
}