import java.util.Scanner;

public class distance {
    public static void main(String[]  args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the two coordinates of x");
        double x1 = input.nextDouble();
        double x2 = input.nextDouble();
        System.out.println("enter two coordinates of y");
        double y1 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("Distance between two point is " + distance);
    }
}
