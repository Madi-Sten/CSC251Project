//import Scanner Class:
import java.util.Scanner;

//Demo Class:
//
public class Project_madi_stenson{

//Main Method:
//
public static void main(String[] args){

   //Declare instance fields:
   int policy_Number = 0;
   String provider_Name = "";
   String policyholder_First_Name = "";
   String policyholder_Last_Name = "";
   int policyholder_Age = 0;
   boolean policyholder_Smoking_Status = false;
   double policyholder_Height = 0.0;
   double policyholder_Weight = 0.0;
   
   //Placeholder field:
   String smoker_Status;
   double john_bMI;
   double john_Policy_Price;
   
   //Create Scanner Object;
   Scanner console = new Scanner(System.in);
   
   //Ask user to enter necessary information:
   //
   //Policy Number:
   System.out.println("Please enter the Policy Number: ");
   policy_Number = console.nextInt();
   console.nextLine();
   
   //Provider Name:
   System.out.println("Please enter the Provider Name: ");
   provider_Name = console.nextLine();
   
   //Policyholder's First Name:
   System.out.println("Please enter the Policyholder's First Name: ");
   policyholder_First_Name = console.nextLine();
   
   //Policyholder's Last Name:
   System.out.println("Please enter the Policyholder's Last Name: ");
   policyholder_Last_Name = console.nextLine();
   
   //Policyholder's Age:
   System.out.println("Please enter the Policyholder's Age: ");
   policyholder_Age = console.nextInt();
   console.nextLine();

   //Policyholder's Smoking Status:
   System.out.println("Please enter the Policyholder's Smoking Status (true = smoker / false = non-smoker): ");
   policyholder_Smoking_Status = console.nextBoolean();
   
   //Policyholder's Height:
   System.out.println("Please enter the Policyholder's Height (in inches): ");
   policyholder_Height = console.nextDouble();
   
   //Policyholder's Weight:
   System.out.println("Please enter the Policyholder's Weight (in pounds): ");
   policyholder_Weight = console.nextDouble();
   
   //Create Policy Object w/ assigned arguments:
   Policy john = new Policy(policy_Number, provider_Name, policyholder_First_Name, policyholder_Last_Name, policyholder_Age, policyholder_Smoking_Status, policyholder_Height, policyholder_Weight);
   
   john_bMI = john.get_Policyholder_BMI();
   
   john_Policy_Price = john.get_Policy_Price();
   
   //Output:
   System.out.println("Policy Number: " + john.get_Policy_Number() + "\nProvider Name: " + john.get_Provider_Name() + "\nPolicyholder's First Name: " 
   + john.get_Policyholder_First_Name() + "\nPolicyholder's Last Name: " + john.get_Policyholder_Last_Name() + "\nPolicyholder's Age: " 
   + john.get_Policyholder_Age() + "\nPolicyholder's Smoking Status: " + john.get_Policyholder_Smoking_Status() + "\nPolicyholder's Height: "
   + john.get_Policyholder_Height() + "\nPolicyholder's Weight: " + john.get_Policyholder_Weight() + "\nPolicyholder's BMI: " 
   + john.get_Policyholder_BMI() + "\nPolicy Price: $" + john.get_Policy_Price());
   
   
}//End of Main Method.
}//End of Demo Class.


