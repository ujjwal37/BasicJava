import java.util.Scanner;

public class marksheet {
    public static void main(String[] args) {
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter  6 marks of user");
        for (int i = 0; i < 6; i++) {
            double a = input.nextDouble();
            sum = sum + a;
        }
        double percentage = (sum / 600) * 100;
        if (percentage > 90) {
            System.out.println("A++");
        }
        else   if (percentage > 80) {
            System.out.println("A");
         }
        else if (percentage > 70) {
            System.out.println("B");
        }
        else if (percentage > 60) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
    }
