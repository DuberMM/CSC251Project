import java.util.ArrayList;
import java.io.File; //PrintWrite, File, IOException, Filewriter
import java.io.IOException;
import java.util.*;

public class Project_Duber_MoreiraMaestre
{
   public static void main(String[] args) throws IOException
   {
      //Variables
      String policyNumber;
      String providerName; 
      String firstName;
      String lastName;
      int holderAge;
      String smoker;
      double holderHeight;
      double holderWeight;
      int numSmokers = 0;
      
      // Open File
      File file = new File("PolicyInformation.txt");
      
      if(!file.exists())
      {
         System.out.println("Unable to open file.");
         System.exit(0);
      }
      
      Scanner inputPolicy = new Scanner(file);// Open the policy information file
      
      // Array List To Store Objects
      ArrayList<Policy> policies = new ArrayList<Policy>();
      
      
      // Using a loop to process all the contents of the file
      while(inputPolicy.hasNext()) //To get information per line
      {
         policyNumber = inputPolicy.nextLine();
         providerName = inputPolicy.nextLine();
         firstName = inputPolicy.nextLine();
         lastName = inputPolicy.nextLine();
         holderAge = inputPolicy.nextInt();
         inputPolicy.nextLine();// To clear buffer
         smoker = inputPolicy.nextLine();
         holderHeight = inputPolicy.nextDouble();
         holderWeight = inputPolicy.nextDouble();
         
         //make sure we haven't hit the end of the file before trying to skip the blank line
         if(inputPolicy.hasNext())
            inputPolicy.nextLine();
         if(inputPolicy.hasNext())
            inputPolicy.nextLine();   
         
         //create a Policy object and add it to our ArrayList
         policies.add(new Policy(policyNumber, providerName, firstName, lastName, holderAge, smoker, holderHeight, holderWeight));
         
       }  
       
       // print out information for each policy object     
       for(Policy policy : policies) // in order: Class, new object : ArrayList
       {
         //Displaying about the policy
         
         System.out.print("\nPolicy Number: " + policy.getPolicyNumber());
         System.out.print("\nProvider Name: " + policy.getProviderName());
         System.out.print("\nPolicyholder's First Name: " + policy.getFirstName());
         System.out.print("\nPolicyholder's Last Name: " + policy.getLastName());
         System.out.print("\nPolicyholder's Age: " + policy.getAge());
         System.out.print("\nPolicyholder's Smoking Status: " + policy.getSmoker());
         System.out.printf("\nPolicyholder's Height: %,.1f inches\n", policy.getHeight());
         System.out.printf("Policyholder's Weight: %,.1f pounds\n", policy.getWeight());
         System.out.printf("Policyholder's BMI: %.2f\n", policy.bodyMassIndex());
         System.out.printf("Policy Price: $%.2f\n", policy.policyCost());
         System.out.println();
         
         if(policy.getSmoker().equalsIgnoreCase("smoker")) // Keep track number of smokers
            numSmokers++;
            
       }
       
      //print out the number of smokers and non-smokers
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policies.size() - numSmokers));
      
      inputPolicy.close(); //close policy file
   }
}   