import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
    class First
    {
         public static void main (String[] args)
         {
             String name;
             Scanner sc = new Scanner(System.in);

	     System.out.println("What is your name?");

             name = sc.nextLine();

             System.out.println("Hello, " + name);
         }
     }


