public class Policy{

   //Private Fields:
   private int policy_Number = 0;
   private String provider_Name = "";
   private String policyholder_First_Name = "";
   private String policyholder_Last_Name = "";
   private int policyholder_Age = 0;   
   private boolean policyholder_Smoking_Status = false;
   private double policyholder_Height = 0.0;
   private double policyholder_Weight = 0.0;
   
   //Constants:
   private final int POLICY_BASE_FEE = 600;
   private final int AGE_50_BASE_FEE = 75;
   private final int SMOKER_BASE_FEE = 100;
   
   //Default, no arguments Constructor:
   public void Policy(){}
   
   
   //Argument Constructor:
   //Arguments: int, String, String, String, int, boolean, double, double
   public Policy(int policy, String provider, String first_Name, String last_Name, int age, boolean is_Smoker, double height, double weight){
      policy_Number = policy;
      provider_Name = provider;
      policyholder_First_Name = first_Name;
      policyholder_Last_Name = last_Name;
      policyholder_Age = age;   
      policyholder_Smoking_Status = is_Smoker;
      policyholder_Height = height;
      policyholder_Weight = weight;
   }
   
   //Access Methods:
   //
   //Get Policy Number:
   public int get_Policy_Number(){
      return this.policy_Number;
   }
   
   //Get Provider Name:
   public String get_Provider_Name(){
      return this.provider_Name;
   }
   
   //Get Policyholder First Name:
   public String get_Policyholder_First_Name(){
      return this.policyholder_First_Name;
   }
   
   //Get Policyholder Last Name:
   public String get_Policyholder_Last_Name(){
      return this.policyholder_Last_Name;
   }
   
   //Get Policyholder Age:
   public int get_Policyholder_Age(){
      return this.policyholder_Age;
   }
   
   //Get Policyholder Smoking Status:
   public boolean get_Policyholder_Smoking_Status(){
      return this.policyholder_Smoking_Status;
   }
   
   //Get Policyholder Height:
   public double get_Policyholder_Height(){
      return this.policyholder_Height;
   }
   
   //Get Policyholder Weight:
   public double get_Policyholder_Weight(){
      return this.policyholder_Weight;
   }
   //End of Accessor Methods.
   
   
   //Mutator Methods:
   //
   //Set Policy Number:
   public void set_Policy_Number(int policy){
      this.policy_Number = policy;
   }
   
   //Set Provider Name:
   public void set_Provider_Name(String provider){
      this.provider_Name = provider;
   }
   
   //Set Policyholder First Name:
   public void set_Policyholder_First_Name(String first){
      this.policyholder_First_Name = first;
   }
   
   //Set Policyholder Last Name:
   public void set_Policyholder_Last_Name(String last){
      this.policyholder_Last_Name = last;
   }
   
   //Set Policyholder Age:
   public void set_Policyholder_Age(int age){
      this.policyholder_Age = age;
   }
   
   //Set Policyholder Smoking Status:
   public void set_Policyholder_Smoking_Status(boolean is_Smoker){
      this.policyholder_Smoking_Status = is_Smoker;
   }
   
   //Set Policyholder Height:
   public void set_Policyholder_Height(double height){
      this.policyholder_Height = height;
   }
   
   //Set Policyholder Weight:
   public void set_Policyholder_Weight(double weight){
      this.policyholder_Weight = weight;
   }
   //
   //End of Mutator Methods.
   
   
   //BMI Method:
   public double get_Policyholder_BMI(){
      double bMI = (this.policyholder_Weight * 703) / (this.policyholder_Height * this.policyholder_Height);
      return bMI;
   }
   
   //Price of Policy Method:
   public double get_Policy_Price(){
   
      double price = POLICY_BASE_FEE;
      double bMI = this.get_Policyholder_BMI();
      
      if(this.policyholder_Age > 50){
         price += AGE_50_BASE_FEE;
      }
      if(this.policyholder_Smoking_Status == true){
         price += SMOKER_BASE_FEE;
      }
      if(bMI > 35){
         price += (bMI - 35) * 20;
      }
      
      return price;
   }
   
   
}//End Of Policy Class