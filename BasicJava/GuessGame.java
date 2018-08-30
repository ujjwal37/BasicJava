import java.util.Scanner;


public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
       void StartGame(){
            p1 =new Player();
            p2 = new Player();
            p3  = new Player();

            int guessp1 = 0;
            int guessp2 = 0;
            int guessp3 = 0;

            boolean p1guess = false;
            boolean p2guess = false;
            boolean p3guess  = false;



           int testscore =  (int)(Math.random() * 10) ;
           System.out.println("THE NUMBER IS WHICH YOU HAVE TO GUEES IS BWTWEEN 0 AND 9");
           System.out.println("NUMBER IS : " + testscore );

           while(true){
               p1.getnumber();
               p2.getnumber();
               p3.getnumber();

               guessp1 = p1.number;
               System.out.println("player1 guessed  : " + guessp1);

               guessp2 = p2.number;
               System.out.println("player2 guessed : " + guessp2);

               guessp3 = p3.number;
               System.out.println("player3 guessed : " + guessp3);

               if(guessp1 ==  testscore){
                   p1guess = true;
               }

               if(guessp2 == testscore) {
                     p2guess = true;
               }

               if(guessp3 == testscore){
                   p3guess = true;
               }

               if(p1guess || p2guess || p3guess){
                   System.out.println("we have a winner ");
                   System.out.println("player 1 got it right : " + p1guess);
                   System.out.println("player 2 got it right : " + p2guess);
                   System.out.println("player 3 got it right : "+  p3guess);

               }else {
                   System.out.println("try Again");
               }
           }
       }
}


public class Player {
       Scanner input = new Scanner(System.in);
        int number = 0;
        void getnumber(){
            number = input.nextInt();
            System.out.print("i am guessing " + number);
        }
}
public class GameLauncher {
    public static void main(String[] args){
        GuessGame game  = new GuessGame();
        game.StartGame();
    }
}
