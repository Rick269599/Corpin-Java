package practice;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner James = new Scanner (System.in);
        
        System.out.println("Please enter an integer: ");
        int inputA = James.nextInt();
        System.out.println("Please enter another integer: ");
        int inputB = James.nextInt();
        System.out.println("Please enter another integer: ");
        int inputC = James.nextInt();
        
        if(inputA > inputC){
            if(inputA > inputB){
            System.out.println("The largest integer input is : " + inputA);
            }
            else if(inputB > inputA){
            System.out.println("The largest integer input is : " + inputB);
            }   
        }
        else{
        System.out.println("The largest integer input is : " + inputC);
        }
        
    }
    
}
