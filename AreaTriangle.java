import java.util.*;
import java.lang.*; //or use .util.Scanner

    class AreaTriangle
    {
        public static void main(String args[])
        {
         
         Scanner sc = new Scanner(System.in); //object scanner, stored in heap
         
         float base=0, area=0, height=0;
         
         System.out.println("Please enter the base measurement of triangle: ");
         
         base = sc.nextFloat();
         
         System.out.println("Please enter the height measurement of triangle: ");
         
         height = sc.nextFloat();
         
         area = (base * height) / 2;
         
         System.out.println("The area of the triangle is " + area + " units.");
              
        }
    }
