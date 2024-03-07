import java.util.*;
class Validation{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Username :");
        String uname = Sc.nextLine();
        Validation obj = new Validation();
        boolean check = obj.ValidUsername(uname);
        if(check) System.out.println("Valid");
        else System.out.println("Invalid");

    }

// Rule for Valid : -> One Uppercase / One Number / total size > 8 chars
    boolean ValidUsername(String uname)
    {
        boolean flag = false; // initially
        if(uname.length() < 8)
        {
            System.out.println("Size cannot be less than 8 chars\nYours is " +  uname.length());
            return false;
        }else{
            int upper = 0 , lower = 0 , num = 0 ;
            for(int i = 0; i < uname.length(); i++)
            {
                if(uname.charAt(i) >= 'a' && uname.charAt(i) <= 'z' ){
                    lower += 1;
                }
                if(uname.charAt(i) >= 'A' && uname.charAt(i) <= 'Z'){
                    upper += 1;
                }
                if(uname.charAt(i) >= 48 && uname.charAt(i) <= 57)
                {
                    num += 1;
                }
            }
            if(lower > 0 && upper > 0 && num > 0)
            {
                flag = true;
            }

        }

        return flag;
    }
    
}