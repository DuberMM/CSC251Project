import java.util.ArrayList;
import java.io.*; //PrintWrite, File, IOException, Filewriter
import java.util.*;

public class Project_Duber_MoreiraMaestre
{
   public static void main(String[] args) throws IOException
   {
      File file = new File("PolicyInformation.txt");
      
      
      if(!file.exists())
      {
         System.out.println("Unable to open file.");
         System.exit(0);
      }
      
      Scanner inputPolicy = new Scanner(file);// Open the policy information file
      ArrayList<String> policies = new ArrayList<String>(); // For Array List
      
      //Variables
      int policyNumber;
      String providerName; 
      String firstName;
      String lastName;
      int holderAge;
      String smoker;
      double holderHeight;
      double holderWeight;
      // How to figure out the total of smoker and non-smoker?
      
      // Using a loop to process all the contents of the file
      while(inputPolicy.hasNext()) //To get information per line
      {
         policyNumber = inputPolicy.nextInt();
         inputPolicy.nextLine();// To clear buffer
         providerName = inputPolicy.nextLine();
         firstName = inputPolicy.nextLine();
         lastName = inputPolicy.nextLine();
         holderAge = inputPolicy.nextInt();
         smoker = inputPolicy.nextLine();
         inputPolicy.nextLine();// To clear buffer
         holderHeight = inputPolicy.nextDouble();
         holderWeight = inputPolicy.nextDouble();
         
         if(inputPolicy.hasNext())
            inputPolicy.nextLine();
            
         // how to create the array list then?
         
            
         //for (int i = 0; i < policies.size(); ++i)
         //{
         System.out.print("\nPolicy Number: " + policyNumber);
         System.out.print("\nProvider Name: " + providerName);
         System.out.print("\nPolicyholder's First Name: " + firstName);
         System.out.print("\nPolicyholder's Last Name: " + lastName);
         System.out.print("\nPolicyholder's Age: " + holderAge);
         System.out.print("\nPolicyholder's Smoking Status: " + smoker); // Why is this not printing out?
         System.out.printf("\nPolicyholder's Height: %,.1f inches\n", holderHeight);
         System.out.printf("Policyholder's Weight: %,.1f pounds\n", holderWeight);
         //}
      }
      
      inputPolicy.close(); //close policy file
   }
}   