

import java.util.*;

class Quadratic
{
    public static void main(String args[]) {
        
        System.out.println("To solve a Quadratic Equation of the general form:");
        Scanner x = new Scanner(System.in);
         float a = x.nextFloat();
         float b = x.nextFloat();
         float c = x.nextFloat();
         System.out.println("Enter the values of a:" +a);
         System.out.println("Enter the values of b:" +b);
         System.out.println("Enter the values of c:" +c);
    } 
            {
                float d = sqrt((b*b) - (4*a*c));
                if (d<0)
                System.out.println("Roots are imaginary");
                else{
                    
                    d = -b + (sqrt((b*b) - (4*a*c))/2*a);
                    float d1 = -b - (sqrt((b*b) - (4*a*c))/2*a);
                    System.out.println("Roots are:");
                    System.out.println(+d);
                    System.out.println(+d1);
                    }
            }   
}      