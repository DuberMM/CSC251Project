public class Policy
{
   // Instance Fields required to track policies' information
   private String policyNumber; // To hold the number of the policy
   private String providerName; // To hold the name of the provider
   public static int policyCount;
   private PolicyHolder policyHolder;
   
   /**
   no-arg constructor that:
   - initializes the policy number
   - initializes the provider name
   - intializes the policy count to 0
   */
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      policyCount = 0;
   }
   
   /**
   Constructor that initializes fields to the value of the argument it is passed
   @param policyNumb the policy number
   @param provName the provider name
   */
   public Policy(String policyNumb, String provName, int polCount, PolicyHolder polHold)   
   {
      policyNumber = policyNumb;
      providerName = provName;
      policyCount = polCount;
      policyHolder = new PolicyHolder(polHold); //use the copy constructor 
   }
   
   
   // SETTERS (MUTATORS)
   
   /**
   Sets the policy number
   @param policyNumb is the policy number
   */
   public void setPolicyNumber(String policyNumb)
   {
      policyNumber = policyNumb;
   }
   
   /**
   Sets the provider name
   @param provName is the name of the provider
   */
   public void setProviderName(String provName)
   {
      providerName = provName;
   }
   
   /**
   Sets the policy count
   @param polCount is the policy counter
   */
   public void setPolicyCount(int polCount)
   {
      policyCount = polCount;
   }
   
   /**
   Sets the policy holder class
   @param polHold is the policy holder class
   */
   public void setPolicyHolder(PolicyHolder polHold)
   {
      policyHolder = new PolicyHolder(polHold); // making deep copy of the object
   }
   
   
   // GETTERS (ACCESORS)
   
   /**
   Returns the policy number value
   @return the policy number value
   */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
   Returns the name of the provider
   @return the name of the provider
   */
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
   Returns the policy count
   @return the policy count
   */
   public int getPolicyCount()
   {
      return policyCount;
   }
   
   /**
   Returns the policy holder class
   @return the policy holder class
   */
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder); // making deep copy of the object
   }
   
   // OTHER METHODS
   
   /** 
   Method that provides a String representation of the information of a policy
   @return a String representation of the information of a policy
   */
   public String toString()
   {
      return "\nPolicy Number: " + policyNumber + 
             "\nProvider Name: " + providerName +
             policyHolder; // Getting the To String Method from the PolicyHolder class 
                           // through the policyHolder field added
   }          
}