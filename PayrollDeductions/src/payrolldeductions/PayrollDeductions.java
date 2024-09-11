package payrolldeductions;
import java.util.Scanner;

public class PayrollDeductions {

   public static void main(String[] args) {
       
       Scanner James = new Scanner (System.in);
       
       do{
       try{  
       System.out.println("Please enter your name:  ");
       String name = James.nextLine();
       
       System.out.println("Please enter your salary:  ");
        int grossPay = James.nextInt();
        
        double gross = grossPay;
        double wTax = 15 * grossPay / 100;
        double sss = 3.63 * grossPay / 100 ;
        double mediCare =  1.25 * grossPay / 100;
        double pagIbig = 100.0;
        double netVal = wTax + sss + mediCare + pagIbig;
        double net = gross - netVal; 
        
        System.out.println("\n" + "Employee Name:    " + name + "\n" + "Gross Pay:          " + gross);
        System.out.println("----------------------------------");
        System.out.println("Withholding Tax:     " + wTax + "\n" + "SSS Contributions:    " + sss);
        System.out.println("Medicare:             " + mediCare + "\n" + "Pagibig Contribution: " + pagIbig);
        System.out.println("----------------------------------");
        System.out.println("Net Pay:            " + net);
        
        if(net >= 0){
        System.out.println("Good!");
        break;
        }
        
        else if (net < 0){
        System.out.println("Oh no!");
        break;
        } }
        
       catch(Exception e){
       System.out.println("Try Again!");
       }}
       while(true);
       
        
    }    
}