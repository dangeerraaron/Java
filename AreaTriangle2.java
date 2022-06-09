import java.lang.*;
import java.util.Scanner;

    class AreaTriangle2
    {
        public static void main(String args[])
        {
           Scanner sc = new Scanner(System.in);
           double a=0, b=0, c=0, sum=0, area=0;
           
           System.out.println("Please enter all 3 side of triangle: ");
           
           a = sc.nextDouble();
           b = sc.nextDouble();
           c = sc.nextDouble();
           
           sum = 0.5 * (a + b + c);
           
           area = Math.sqrt(sum * (sum-a) * (sum-b) * (sum-c));
           
           System.out.println("The area of the triangle is " + area +" units");
           
        }
    }
