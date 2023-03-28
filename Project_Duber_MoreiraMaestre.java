import java.util.*;

public class Project_Duber_MoreiraMaestre
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
      String smokerStatus = keyboard.nextLine();
      boolean smoker = (smokerStatus.compareTo("smoker")==0)?true:false;
      
      System.out.print("Please enter the Policyholder's Height(in inches): ");
      double holderHeight = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight(in pounds): ");
      double holderWeight = keyboard.nextDouble();
      System.out.println("");
      
      Policy p = new Policy(policyNumber, providerName, firstName, lastName, holderAge, smoker, holderHeight, holderWeight);
      PrintPolicyInfo(p); 
   }
   
   public static void PrintPolicyInfo(Policy p)
   {
      System.out.println("Policy Number: " + p.getPolicyNumber());
      System.out.println("Provider Name: " + p.getProviderName());
      System.out.println("Policyholder's First Name: " + p.getFirstName());
      System.out.println("Policyholder's Last Name: " + p.getLastName());
      System.out.println("Policyholder's Age: " + p.getAge());
      System.out.println("Policyholder's Smoking Status: " + (p.getSmoker()==true?"smoker":"non-smoker"));
      System.out.printf("Policyholder's Height: %,.1f inches\n", p.getHeight());
      System.out.printf("Policyholder's Weight: %,.1f pounds\n", p.getWeight());
      System.out.printf("Policyholder's BMI: %,.2f\n", p.bodyMassIndex());
      System.out.printf("Policy Price: $%,.2f", p.policyCost());
   }
}   