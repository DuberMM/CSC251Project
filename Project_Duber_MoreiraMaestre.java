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
      int policyCount = 0;
      int numSmokers = 0;
      
      
      // Open File
      File file = new File("PolicyInformation.txt");
      
      // Verifying the file exists
      if(!file.exists())
      {
         System.out.println("Unable to open file.");
         System.exit(0);
      }
      
      // Open the policy information file
      Scanner inputPolicy = new Scanner(file);
      
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
         
         //To make sure we haven't hit the end of the file before trying to skip the blank line
         if(inputPolicy.hasNext())
            inputPolicy.nextLine();
         if(inputPolicy.hasNext())
            inputPolicy.nextLine();
         
         // Create Policy Holder Object
         PolicyHolder pHolder = new PolicyHolder(firstName, lastName, holderAge, smoker, holderHeight, holderWeight);
              
         //Create a Policy object and add it to our ArrayList and also keep track of our count
         policies.add(new Policy(policyNumber, providerName, policyCount, pHolder));
         
       }  
       
       // print out information for each policy object     
       for(Policy policy : policies) // in order: Class, new object : ArrayList
       {
         
         //Displaying about the policy
         System.out.println(policy); // implicitly calling the ToString method in Policy Class
         
         if(policy.getPolicyHolder().getSmoker().equalsIgnoreCase("smoker")) // Keep track number of smokers
            numSmokers++;
       }
       
      //print out the number of smokers and non-smokers
      System.out.println("");
      System.out.println("There were " + (policies.size()) + " Policy objects created.");
      System.out.println("The number of policies with a smoker is: " + numSmokers);
      System.out.println("The number of policies with a non-smoker is: " + (policies.size() - numSmokers));
      
      inputPolicy.close(); //close policy file
   }
}   