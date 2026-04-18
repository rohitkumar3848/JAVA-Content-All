import java.util.Scanner;

class Guesser{
    int randomNo;
    public int guessNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(":: The Guessing Number is ::");
        randomNo=sc.nextInt();
        return randomNo;
    }
}
class Player{
    int playerChoice;
    public  int guessNum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(":: Please Kindly Guess the Number for player ::");
        playerChoice=sc.nextInt();
        return playerChoice;
    }
}
class Umpire{
    int guessNum;
    int playerchoice1;
    int playerchoice2;
    int playerchoice3;
    void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        guessNum=g.guessNum();
    }
    void collectNumFromPlayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        playerchoice1=p1.guessNum();
        playerchoice2=p2.guessNum();
        playerchoice3=p3.guessNum();
    }
    void Compare()
    {
        if(guessNum==playerchoice1){
            if(guessNum==playerchoice2 && guessNum==playerchoice3)
            {
                System.out.println("All Player guess Right Number, all players are winners");
            }
            else if(guessNum==playerchoice2)
            {
                System.out.println("Only player 1 and 2 guess right number,so player 1 and 2 are winners");
            }
            else if(guessNum==playerchoice3)
            {
                System.out.println("Only player 1 and 3 guess right number,so player 1 and 3 are winners");                
            }
            else
            {
                System.out.println("Only player1 guess right Number, so player 1 is winner");
            }
        }
        else if(guessNum==playerchoice2)
        {
            if(guessNum==playerchoice3)
            {
                System.out.println("Only player 2 and 3 guess right number,so player 2 and 3 are winner");
            }
            else{
                System.out.println("Only player2 guess right Number, so player 2 is winner");
            }
        }
        else if(guessNum==playerchoice3)
        {
            System.out.println("Only player3 guess right Number, so player 3 is winner");
        }
        else
        {
            System.out.println("!!  Game End No Player Guess the correct Number  !!");
        }
    }
}

public class guesserGame
{
    public static void main(String[] args) {
        System.out.println(":: Welcome to our Game\n Let's start the Guessing Gaming ::");
        Umpire g=new Umpire();
        g.collectNumFromGuesser();
        g.collectNumFromPlayer();
        g.Compare();
        System.out.println(":: Game End ::");
    }
}