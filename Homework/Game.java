import java.io.*;
class Game
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = 7;
        int uans;
        int chances = 1;
        System.out.print("Choose a number between 1 to 10 : ");
        uans = Integer.parseInt(br.readLine());
        while(true){
            if(uans == ans){
                System.out.println("Correct Guess!!!\nYou took " + chances + " Chances");
                break;
            }else if(uans != ans){
                System.out.println("Wrong Guess!!\nGuess again : ");
                chances++;
                uans = Integer.parseInt(br.readLine());
            }
        }
    }
}