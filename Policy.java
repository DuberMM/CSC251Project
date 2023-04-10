public class Policy
{
   // Instance Fields required to track policies' information
   private int policyNumber; // To hold the number of the policy
   private String providerName; // To hold the name of the provider
   private String firstName; // To hold the policy holder's first name
   private String lastName; // To hold the policy holder's last name
   private int holderAge; // To hold the policy holder's age
   private boolean smoker; // To hold the boolean of the policy holder's status as a smoker
   private double holderHeight; // To hold the policy holder's height
   private double holderWeight; // To hold the policy holder's weight
   
   /**
   no-arg constructor that:
   - initializes the policy number to 0
   - initializes the provider name
   - initializes the policy holder's first name
   - initializes the policy holder's last name
   - initializes the policy holder's age
   - initializes the boolean smoker statement as false
   - initializes the policy holder's height
   - initializes the policy holder's weight
   */
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      holderAge = 0;
      smoker = false;
      holderHeight = 0.0;
      holderWeight = 0.0;
   }
   
   /**
   Constructor that initializes fields to the value of the argument it is passed
   @param policyNumb the policy number
   @param provName the provider name
   @param fName the policy holder's first name
   @param lName the policy holder's last name
   @param age the policy holder's age
   @param smoking the boolean smoker statement as false
   @param height the policy holder's height
   @param weight the policy holder's weight
   */
   public Policy(int policyNumb, String provName, String fName, String lName, int age, boolean smoking, double height, double weight)
   {
      policyNumber = policyNumb;
      providerName = provName;
      firstName = fName;
      lastName = lName;
      holderAge = age;
      smoker = smoking;
      holderHeight = height;
      holderWeight = weight;
   }
   
   // SETTERS (MUTATORS)
   
   /**
   Sets the policy number
   @param policyNumb is the policy number
   */
   public void setPolicyNumber(int policyNumb)
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
   Sets the policy holder's first name
   @param fName is the first name of the policy holder
   */
   public void setFirstName(String fName)
   {
      firstName = fName;
   }
   
   /**
   Sets the policy holder's last name
   @param lName is the last name of the policy holder
   */
   public void setLastName(String lName)
   {
      lastName = lName;
   }
   
   /**
   Sets the policy holder's age
   @param age is the age of the policy holder
   */
   public void setAge(int age)
   {
      holderAge = age;
   }
   
   /**
   Sets a boolean that defines if the policy holder is a smoker
   @param smoking defines policy holder as a non-smoker by default
   */
   public void setSmoker(boolean smoking)
   {
      smoker = smoking;
   }
   
   /**
   Sets the policy holder's height
   @param height is the height of the policy holder
   */ 
   public void setHeight(double height)
   {
      holderHeight = height;
   }
   
   /**
   Sets the policy holder's weight
   @param weight is the weight of the policy holder
   */
   public void setWeight(double weight)
   {
      holderWeight = weight;
   }
   
   // GETTERS (ACCESORS)
   
   /**
   Returns the policy number value
   @return the policy number value
   */
   public int getPolicyNumber()
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
   Returns the policy holder's first name
   @return the policy holder's first name
   */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
   Returns the policy holder's last name
   @return the policy holder's last name
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
   Returns the policy holder's age
   @return the policy holder's age
   */
   public int getAge()
   {
      return holderAge;
   }
   
   /**
   Returns the boolean value on policy holder's smoking status
   @return the boolean value on policy holder's smoking status
   */
   public boolean getSmoker()
   {
      return smoker;
   }
   
   /**
   Returns the policy holder's height
   @return the policy holder's height
   */
   public double getHeight()
   {
      return holderHeight;
   }
   
   /**
   Returns the policy holder's weight
   @return the policy holder's weight
   */
   public double getWeight()
   {
      return holderWeight;
   }
   
   
   /** 
   Method that calculates the body mass index (BMI)
   @return Calculations of BMI
   */
   public double bodyMassIndex()
   {
      return (holderWeight * 703) / (holderHeight * holderHeight);
   }
   
   /** 
   Method that calculates and returns the price of the insurance policy
   @return Calculated policy price
   */
   public double policyCost()
   {
      double policyBasePrice = 600.00;
      double additionalFee = (bodyMassIndex() - 35) * 20;
      
      if(holderAge > 50)
      {
         policyBasePrice += 75.00;
      }
      
      if(smoker == true)
      {
         policyBasePrice += 100.00;
      }
      
      if(bodyMassIndex() > 35)
      {
         policyBasePrice += additionalFee;
      }
      
      return policyBasePrice;  
   }
}