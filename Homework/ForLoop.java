import java.io.*;
class ForLoop
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a range : ");
        int range = Integer.parseInt(br.readLine());
        String name = br.readLine();
        
        for(int i = 0;i<range;i++){
            System.out.println(name + " is Great");
        }    
    }
}
