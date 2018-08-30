import java.util.Scanner;

public class quadratic {
      public static void main(String[] args)
      {
          Scanner input = new Scanner(System.in);
          System.out.println("ax^2 +bx + c");
          System.out.println("enter the value of a , b , and c");
          double a = input.nextInt() ;
          double b = input.nextInt();
          double c = input.nextInt();
          double root1 = (-b + Math.sqrt(b-4*a*c))/2;
          double root2 = (b + Math.sqrt(b-4*a*c))/2;
          if( root1 > 0 && root2 > 0)
          {
              System.out.println("yes both roots are real");
          }else{
              System.out.println("roots are not real");
          }
      }
}
