import.java.util.*;

public class policyDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in); // Scanner object
      
      System.out.print("Please enter the Policy Number: ");
      int policyNumber = keyboard.nextInt();
      keyboard.nextLine(); //clear buffer
      
      System.out.print("Please enter the Provider Name: ");
      String providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      String firstName = keyboard.nextLine();
      System.out.print("Please enter the Policyholder's Last Name: ");
      String lastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's age: ");
      int holderAge = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status(smoker/non-smoker): ");
      boolean smoker = keyboard.nextBoolean();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Height(in inches): ");
      double holderHeight = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight(in inches): ");
      double holderWeight = keyboard.nextDouble();
   }
   
   
}   