import java.lang.*;
import java.util.Scanner;

class Quadratic
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=0,c=0;
        double r1=0, r2=0;

        System.out.println("Enter three numbers: ");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        r1 = (-b + Math.sqrt(b * b - 4 * a *c)) / (2 * a);

        r2 = (-b - Math.sqrt(b * b - 4 * a *c)) / (2 * a);

        System.out.println("The roots of the quadratic equation are " +r1+ " and " +r2+".");

    }
}


