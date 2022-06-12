import java.lang.*;
import java.util.*;

class CuboidAreaVolume
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float length=0, width=0, height=0, Area=0, Volume=0;

        System.out.println("Enter length, width, and height of cuboid: ");

       length = sc.nextFloat();
       width = sc.nextFloat();
       height = sc.nextFloat();

       Area = 2 * (length*width + width*height + length*height);

       Volume = length * width * height;

       System.out.println("The area is "+Area+" units and the volume is "+Volume+" units.");


    }
}
