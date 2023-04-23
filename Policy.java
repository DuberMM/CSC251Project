public class Policy
{
   // Instance Fields required to track policies' information
   private String policyNumber; // To hold the number of the policy
   private String providerName; // To hold the name of the provider
   private PolicyHolder policyHolder;
   public static int policyCount = 0;
   
   /**
   no-arg constructor that:
   - initializes the policy number to 0
   - initializes the provider name
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
   public Policy(String policyNumb, String provName, PolicyHolder polHold, int polCount)   
   {
      policyNumber = policyNumb;
      providerName = provName;
      policyHolder = polHold;
      policyCount = polCount;
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
   
   // OTHER METHODS
   
   /** 
   Method that provides a String representation of the information of a policy
   @return a String representation of the information of a policy
   */
   public String toString()
   {
      return "\nPolicy Number: " + policyNumber + 
             "\nProvider Name: " + providerName;
   }          
}