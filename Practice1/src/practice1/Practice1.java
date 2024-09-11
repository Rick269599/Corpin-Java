package practice1;
import java.util.Collections;
import java.util.Scanner;
public class Practice1 {

    public static void main(String[] args) {
        Scanner James = new Scanner(System.in);
        
        for(int x = 0; x < 7 ; x++){
        System.out.print("Please enter a number: ");
        int num = James.nextInt();
        String week [] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
       
        
        
        if(num == 1){
            System.out.println(week[0]);
        }
        else if(num == 2){
            System.out.println(week[1]);
        }
        else if(num == 3){
            System.out.println(week[2]);
        }
        else if(num == 4){
            System.out.println(week[3]);
        }
        else if(num == 5){
            System.out.println(week[4]);
        }
        else if(num == 6){
            System.out.println(week[5]);
        }
        else if(num == 7){
            System.out.println(week[6]);
        }
        else{
        System.out.println("Invalid Input");
        }}
       
    }
    
}
