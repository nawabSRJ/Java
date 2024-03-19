
import java.util.Stack;
class Make{

}

class Implement{
    int val;
    public static void main(String args[])
    {
        Implement obj = new Implement();
        obj.val = 12;
        Stack<Integer> st = new Stack<>();
        
        st.push(132);
        st.push(120);
        st.push(150);

        System.out.println("Top most element : " + st.peek());
        System.out.println("Is stack empty? : " + st.empty());

        // st.pop();
        System.out.println();   
        // st.pop();
        System.out.println("Looking for 120 in stack : " + st.search(obj.val));
        
        // ---------- Other functions

        st.addElement(42);  // like push
        System.out.println("Top @ line 30 : " + st.peek());

        System.out.println("Using capacity() func : " + st.capacity());

        System.out.println("Using size() func : " + st.size());
        
        System.out.println("printing " + st);
        System.out.println("Using hashCode() : " + st.hashCode());
        System.out.println("Clearing stack");
        st.clear();
        System.out.println("Is stack empty? : " + st.empty());
        System.out.println("Using hashCode() : " + st.hashCode());

        

    }
}