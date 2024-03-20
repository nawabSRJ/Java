// todo - implement a stack using vector 
import java.util.*;
public class Stack1 {
    static Vector<Integer> stack = new Vector<>();
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        
        // int top ~ not needed for implementing a dynamic stack here
        Stack1 obj = new Stack1();

        obj.push(10);
        obj.push(12);
        obj.push(18);
        obj.push(7);
        for(int elt : stack)
        {
            System.err.println(elt);
        }
        obj.peek();
        obj.pop();
        obj.peek();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        


    }

    void push(int elt)
    {
        stack.addElement(elt);
    }
    void pop()
    {
        if(stack.size() == 0)
        {
            System.out.println("Underflow");
            return;
        }else{
            int ind = stack.size() - 1;
            System.out.println("Popped Element : " + stack.elementAt(ind));
            stack.removeElementAt(ind);
        }
    }
    void peek()
    {
        int ind = stack.size() - 1;
        System.out.println("Top Most Element : " + stack.elementAt(ind));
    }
    
}
