import java.util.Scanner;
import java.lang.Math;
import java.util.*;
   
        class Compounding{
        public static void main(String args[])
            {
            double principal;
            double interest,years,comp;
            double ip,fin,d,q;
            int x;
            
            Scanner input = new Scanner(System.in);

            System.out.println("Find the value of your deposit after compounding:");
            System.out.println("Enter the principal amount: ");
            principal = input.nextDouble();
            System.out.println("Enter the rate of interest(%): ");
            interest = input.nextDouble();
            ip=interest/100;
            System.out.println("Enter the number of years you want to compound: ");
            years = input.nextDouble();
            System.out.println("Choose your plan. Type the number corresponding to your plan:");
            System.out.println("1) Annual "+"2) Semi-Annual "+"3) Quarterly "+"4) Monthly "+"5) Exit");
            x = input.nextInt();
            double p=1+ip;  

            switch (x)
            {
                case 1: System.out.println("You have chosen the Annual Plan");
                fin=principal*(Math.pow(p,years));
                System.out.println("The final compounded value is: ");
                System.out.println(fin);;
                break;

                case 2: System.out.println("You have chosen the Semi-Annual Plan");
                System.out.println("Enter the number of times you want to compound: ");
                comp = input.nextDouble();
                d=ip/comp;
                q=years*comp;
                fin=principal*(Math.pow(1+d,q));
                System.out.println("The final compounded value is: ");
                System.out.println(fin);;
                break;

                case 3: System.out.println("You have chosen the Quarterly Plan");
                System.out.println("Enter the number of times you want to compound: ");
                comp = input.nextDouble();
                d=ip/comp;
                q=years*comp;
                fin=principal*(Math.pow(1+d,q));
                System.out.println("The final compounded value is: ");
                System.out.println(fin);
                break;

                case 4: System.out.println("You have chosen the Monthly Plan");
                System.out.println("Enter the number of times you want to compound: ");
                comp = input.nextDouble();
                d=ip/comp;
                q=years*comp;
                fin=principal*(Math.pow(1+d,q));
                System.out.println("The final compounded value is: ");
                System.out.println(fin);
                break;

                case 5: System.out.println("****EXIT****");
                break;
            }

        }
   }