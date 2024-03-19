
// todo - basically create a menu driven program that allows user to create multiple Linked Lists and the task would be to store the songs and also choose the name for the playlist on the own
import java.util.*;

class PlaylistSeries {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        Map<String, LinkedList<String>> playlists = new HashMap<>(); // to keep a track of playlist name and the
                                                                     // corresponding playlist ~ name : playlist
        // PlaylistSeries obj = new PlaylistSeries();
        while (true) {
            System.out.println("Menu : ");
            System.out.println("1 -> Create a new Playlist : ");
            System.out.println("2 -> Add songs to a Playlist");
            System.out.println("3 -> Display Playlists : ");
            System.out.println("4 -> Exit : ");
            System.out.println("Enter your choice : ");
            int choice = Sc.nextInt();
            String name, songname;
            Sc.nextLine(); // consume new line to clear buffer

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of the playlist : ");
                    name = Sc.nextLine();
                    playlists.put(name, new LinkedList<>());
                    System.out.println("Playlist Created : " + name);
                    break;

                case 2:
                    System.out.println("Enter the name of the playlist : ");
                    name = Sc.nextLine();
                    LinkedList<String> current = playlists.get(name);
                    if (current == null) {
                        System.err.println("Not found");
                    } else {
                        System.out.println("No. of songs to add : ");
                        int limit = Sc.nextInt();
                        Sc.nextLine();
                        for (int i = 0; i < limit; i++) {
                            System.out.println("Enter the name of the song : ");
                            songname = Sc.nextLine();
                            current.add(songname);
                        }
                        System.out.println("Songs addded to playlist : " + name + "are : " + current);
                    }
                    break;

                case 3:
                    if (playlists.isEmpty()) {
                        System.out.println("No Playlists as of now");
                    } else {
                        for (String sn : playlists.keySet()) {
                            System.out.println(sn + " : " + playlists.get(sn));
                        }
                    }
                    break;

                case 4:
                    System.exit(1);

                default:
                    System.err.println("Invalid Choice\nPlease Re-enter");
                    break;
            }
        }

    }

}