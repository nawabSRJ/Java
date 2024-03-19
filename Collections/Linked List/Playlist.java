// todo - take some input from user until some 'Termination Operation' is performed by the user and store the values in a LL    ~ make a playlist from the user input
import java.util.*;
class Playlist{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        LinkedList <String> songs = new LinkedList<>();
        System.out.println("Enter the number of songs to add : ");
        int range = Sc.nextInt();
        String name;
        Sc.nextLine();   // Read and discard any remaining input in the buffer
        while(range != 0)
        {
            System.out.println("Enter the Song Name to add to playlist : ");
            name = Sc.nextLine();
            songs.add(name);
            range--;
        }

        System.out.println("Your final playlist is : \n" + songs);
                
    }
}