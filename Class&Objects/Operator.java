import java.util.*;
class Npgc{
    String stu_name , fname;    // student name and father's name
    int roll_no;
    
    public Npgc(String stu_name , String fname ,int roll_no)
    {
        this.stu_name = stu_name;
        this.fname = fname;
        this.roll_no = roll_no;
    }
}


class BCA{
    // todo - make an array of subject marks
    // Npgc obj = new Npgc(null, null, 0)
    int marks[] = new int[5];   // * for 5 subjects
    Scanner Sc = new Scanner(System.in);
    boolean flag = false;
    void put()
    {
        System.out.println("Enter Your Name : \n");
        String name = Sc.nextLine();

        System.out.println("Enter Your Father's Name : \n");
        String fname = Sc.nextLine();

        System.out.println("Enter Your Roll No. : \n");
        int roll = Sc.nextInt();
        
        System.out.println("Enter marks of subjects : \n");
        for(int i = 0 ; i < marks.length ; i++)
        {
            marks[i] = Sc.nextInt();
        }
        flag = true;

        Npgc obj = new Npgc(name, fname, roll);
    }

    void show()
    {
        if(!flag) System.err.println("Can't display!!\nFirst Enter your marks");
        else{
            System.out.println("Your Marks : \n");
            for(int i = 0 ; i < marks.length ; i++)
            {
                System.out.println("For subject " + (i+1) +" : "+ marks[i]); 
            }
        }
    }

}

class BBA{
    // todo - make an array of subject marks
    // Npgc obj = new Npgc(null, null, 0)
    int marks[] = new int[5];   // * for 5 subjects
    Scanner Sc = new Scanner(System.in);
    boolean flag = false;
    void put()
    {
        System.out.println("Enter Your Name : \n");
        String name = Sc.nextLine();

        System.out.println("Enter Your Father's Name : \n");
        String fname = Sc.nextLine();

        System.out.println("Enter Your Roll No. : \n");
        int roll = Sc.nextInt();
        
        System.out.println("Enter marks of subjects : \n");
        for(int i = 0 ; i < marks.length ; i++)
        {
            marks[i] = Sc.nextInt();
        }
        flag = true;

        Npgc obj = new Npgc(name, fname, roll);
    }

    void show()
    {
        if(!flag) System.err.println("Can't display!!\nFirst Enter your marks");
        else{
            System.out.println("Your Marks : \n");
            for(int i = 0 ; i < marks.length ; i++)
            {
                System.out.println("For subject " + (i+1) +" : "+ marks[i]); 
            }
        }
    }

}

class Operator{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        BCA ob = new BCA();
        BBA ob2 = new BBA();
        System.out.println("Choose Your Batch : \n1->BCA\n2->BBA\nYour Choice : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                ob.put();
                ob.show();
                break;
            
            case 2:
            ob2.put();
            ob2.show();
            break;
            
            
            default:
                break;
        }
    }
}