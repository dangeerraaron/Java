import java.lang.*;
import java.util.*;

// scanner function from keyboard, summing value

class AddScanner
{
  public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      int a=0, b=0, c=0;
      
      System.out.println("Please enter two numbers to add: ");
      
      a=sc.nextInt(); // scan in and assign integer value to a
      b=sc.nextInt();
      c = a + b;
      
     System.out.println("Sum is " + c); // concatenate to display value
  }
  
 }
