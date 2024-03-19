import java.util.LinkedList;

public class Implement {
    public static void main(String args[])
    {
        LinkedList<String> names = new LinkedList<>();
        names.add("Srajan");
        names.add("Pratham");
        names.add("Vaibhav");

        System.out.println("List @ line 11" + names);

        System.out.println("Adding some value @ index 1");
        names.add(1, "here");
        System.out.println("List @ line 15" + names);

        // playing with remove(index) func
        System.out.println("Removing without specifying index : ");
        names.remove();
        System.out.print(names);
       
        System.out.print("\nWith index i.e index 1 : ");
        names.remove(1);
        System.out.print(names);
       
        names.add("Karan");
        names.add("Virat");

        System.out.println("\nSize of the linked list : "+ names + " is " + names.size());

        System.out.println("Using clear mehtod : ");
        names.clear();
        System.out.println("Now the Linked List is : " + names);

    }
}
