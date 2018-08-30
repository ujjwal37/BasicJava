import java.util.Arrays;
class Player {
    int score;
    String name;
     Player(int score, String name) {
        this.name = name;
        this.score = score;
    }
    }



public class checker implements Comparator<Player> {
    String name;
    int score;
    public int compare(Player p1, Player p2)
    {
        return  p2.score - p1.score;
    }
}


public class Comparator {
       public static void main(String[] ars)
       {
           Player[]   p  = new  Player [2];
           checker check = new checker();
           Arrays.sort(p,  check);
           for(int i =0 ; i < p.length ; i++)
           {
               System.out.println();
           }

       }
}
