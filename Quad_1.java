import java.util.Scanner;
class Quad_1 {
    public static void main(String[] args) {
        double a = 0,b = 0,c = 0;
        double r1, r2;
        double det;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficients a,b,c:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        det = b * b - 4 * a * c;
        // Condition for real and distinct roots
        if(det > 0) {
            r1 = (-b + Math.sqrt(det)) / (2 * a);
            r2 = (-b - Math.sqrt(det)) / (2 * a);
            System.out.format("r1 = ");
            System.out.println(r1);
            System.out.println("r2 = ");
            System.out.println(r2);
        }
        // Condition for real and equal roots
        else if(det == 0) {
            r1 = r2 = -b / (2 * a);
            System.out.format("r1 = r2 = ", r1);
        }
        // Condition for imaginary roots
        else {
            System.out.println("Roots are imaginary.");
        }
    }
}