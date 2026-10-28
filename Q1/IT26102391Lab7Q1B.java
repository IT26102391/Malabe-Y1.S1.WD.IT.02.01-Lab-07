import java.util.Scanner;
public class IT26102391Lab7Q1B {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     for (int i = 1; i <= 3; i++) {
         System.out.println("Student " + i);
         System.out.print("Enter marks: ");

         double mark1 = input.nextDouble();
         double mark2 = input.nextDouble();
         double mark3 = input.nextDouble();
         double mark4 = input.nextDouble();

         double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

         System.out.println("Average is : " + average);
         System.out.print("Overall Grade is : ");
         
         if (average >= 75 && average <= 100) {
             System.out.println("Distinction");
         } else if (average >= 50 && average < 75) {
             System.out.println("Credit");
         } else {
             System.out.println("Fail");
         }
         System.out.println(); 
     }
   }
}