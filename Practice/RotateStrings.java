import java.util.*;;
class RotateStrings {
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter String : \n");
        String s = Sc.nextLine();
        System.out.println("Enter Rotation Value : \n");
        int r = Sc.nextInt();
        RotateStrings obj = new RotateStrings();
        obj.Rotate(s , r);
    }

    void Rotate(String str , int r)
    {
        String left  = "",right = "" ;
        
        for(int i = 0 ; i < str.length(); i++)
        {
            left += str.charAt((i+r) % str.length());
            right += str.charAt((i-r + str.length()) % str.length());
            
        }
        System.out.println("Rotated Values : \nLeft -> " + left + "\nRight ->" + right); 

    } 
}
