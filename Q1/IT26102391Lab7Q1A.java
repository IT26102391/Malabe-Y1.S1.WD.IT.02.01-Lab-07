import java.util.Scanner;
public class IT26102391Lab7Q1A {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter Subject mark 1: ");
        double mark1 = input.nextDouble();

        System.out.print("Enter Subject mark 2: ");
        double mark2 = input.nextDouble();

        System.out.print("Enter Subject mark 3: ");
        double mark3 = input.nextDouble();

        System.out.print("Enter Subject Mark 4: ");
        double mark4 = input.nextDouble();
        
        double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

        System.out.println("\nAverage is : " + average);
        System.out.print("Overall Grade is : ");
        
        if (average >= 75 && average <= 100) {
            System.out.println("Distinction");
        } else if (average >= 50 && average < 75) {
            System.out.println("Credit");
        } else {
            System.out.println("Fail");
        }
    }
}