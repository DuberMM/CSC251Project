public class PolicyHolder
{
  private String firstName; // To hold the policy holder's first name
  private String lastName; // To hold the policy holder's last name
  private int holderAge; // To hold the policy holder's age
  private String smoker; // To hold the policy holder's status as a smoker
  private double holderHeight; // To hold the policy holder's height
  private double holderWeight; // To hold the policy holder's weight
  
  /**
   no-arg constructor that:
   - initializes the policy holder's first name
   - initializes the policy holder's last name
   - initializes the policy holder's age
   - initializes the boolean smoker statement as false
   - initializes the policy holder's height
   - initializes the policy holder's weight
   */
   public PolicyHolder()
   {
      firstName = "";
      lastName = "";
      holderAge = 0;
      smoker = "";
      holderHeight = 0.0;
      holderWeight = 0.0;
   }
   
   /**
   Constructor that initializes fields to the value of the argument it is passed
   @param fName the policy holder's first name
   @param lName the policy holder's last name
   @param age the policy holder's age
   @param smoking the boolean smoker statement as false
   @param height the policy holder's height
   @param weight the policy holder's weight
   */
   public PolicyHolder(String fName, String lName, int age, String smoking, double height, double weight)
   {
      firstName = fName;
      lastName = lName;
      holderAge = age;
      smoker = smoking;
      holderHeight = height;
      holderWeight = weight;
   }
   
   // SETTERS (MUTATORS)
   
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
   public void setSmoker(String smoking)
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
   public String getSmoker()
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
   
   // OTHER METHODS
   
   /** 
   Method that calculates the body mass index (BMI)
   @return Calculations of BMI
   */
   public double bodyMassIndex()
   {
      final double CONV_FACTOR = 703.00;
      double BMI = (holderWeight * CONV_FACTOR) / (holderHeight * holderHeight);
      
      return BMI;
   }
   
   /** 
   Method that calculates and returns the price of the insurance policy
   @return Calculated policy price
   */
   public double policyCost()
   {
      final double POLICY_BASE_PRICE = 600.00;
      final double POLICY_AGE_FEE = 75.00;
      final double POLICY_SMOKING_FEE = 100.00;
      final double POLICY_BMI_FEE = 20.00;
      
      final int AGE_THRESHOLD = 50;
      final int BODY_MASS_INDEX_THRESHOLD = 35;
      double additionalFeeBMI = (bodyMassIndex() - BODY_MASS_INDEX_THRESHOLD) * POLICY_BMI_FEE;
      
      double finalPrice = POLICY_BASE_PRICE;
      
      if(holderAge > AGE_THRESHOLD)
      {
         finalPrice += POLICY_AGE_FEE;
      }
      
      if(smoker.equalsIgnoreCase("smoker"))
      {
         finalPrice += POLICY_SMOKING_FEE;
      }
      
      if(bodyMassIndex() > BODY_MASS_INDEX_THRESHOLD)
      {
         finalPrice += additionalFeeBMI;
      }
      
      return finalPrice;  
   }
   
   /** 
   Method that provides a String representation of a policy holder
   @return a String representation of a policy holder
   */
   public String toStringHolder()
   {
      return "\nPolicyholder's First Name: " + firstName + 
             "\nPolicyholder's Last Name: " + lastName +
             "\nPolicyholder's Age: " + holderAge +
             "\nPolicyholder's Smoking Status: " + smoker +
             "\nPolicyholder's Height: " + holderHeight + " inches" +
             "\nPolicyholder's Weight: " + holderWeight + " pounds" +
             "\nPolicyholder's BMI: " + bodyMassIndex() +
             "\nPolicy Price: " + policyCost();
   }
   
}