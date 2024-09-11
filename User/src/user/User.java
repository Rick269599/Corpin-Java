package user;
import java.util.*;
import java.io.*;

public class User {
    
public static void main (String[]args) throws IOException, FileNotFoundException{
 
//Scanner declaration    
Scanner James = new Scanner (System.in); 
    
//BufferedWriters for writing into the .txt files  
BufferedWriter writer1 = new BufferedWriter(new FileWriter("C:\\Users\\Rick\\Desktop\\Usernames2.txt", true));
BufferedWriter writer2 = new BufferedWriter(new FileWriter("C:\\Users\\Rick\\Desktop\\Passwords2.txt", true));
BufferedWriter writer3 = new BufferedWriter(new FileWriter("C:\\Users\\Rick\\Desktop\\Emails2.txt", true));

//BufferedReaders for reading the contents of the .txt files
BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\Rick\\Desktop\\Usernames2.txt"));
BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\Rick\\Desktop\\Passwords2.txt"));
BufferedReader reader3 = new BufferedReader(new FileReader("C:\\Users\\Rick\\Desktop\\Emails2.txt"));

//LinkedLists for checking and containing data within IDE
LinkedList <String> Username = new LinkedList <>();
LinkedList <String> Password = new LinkedList <>();
LinkedList <String> Email = new LinkedList <>();

//inserting contents of the Usernames2.txt file into the Username LinkedList
String data1 = "";
while((data1 = reader1.readLine()) != null){ 
  Username.add(data1);
}

//inserting contents of the Passwords2.txt file into the Password LinkedList
String data2 = "";
while((data2 = reader2.readLine()) != null){ 
  Password.add(data2);
}

//inserting contents of the Emails2.txt file into the Emails LinkedList
String data3 = "";
while((data3 = reader3.readLine()) != null){ 
  Email.add(data3);
}

//Interface beginning    
        do{
        System.out.println("Log in [L] Sign up [S] or [P] to check passwords and usernames."); //Asking which interface option the user wishes to access
	String option = James.nextLine ();
     
//Unexpected input character from user        
    if (option.equalsIgnoreCase("s") == false && option.equalsIgnoreCase("l") == false && option.equalsIgnoreCase("p") == false){
        System.out.println("Invalid or empty input. Please try again.");
        continue;
    }   

//For checking the users' data         
    else if (option.equalsIgnoreCase("P")){
        System.out.println("Usernames: " + Username);
        System.out.println("Passwords: " + Password);
        System.out.println("Emails: " + Email);
    }
    
//Log in beginning        
    else if (option.equalsIgnoreCase ("L")){
	    for (int i = 0; i <= 6; i++){
                
		System.out.print("Username: ");
		String username = James.nextLine ();
		System.out.print ("Password: ");
		String password = James.nextLine ();
                
//Successful log in		
		if (Username.contains(username) && Password.contains(password)){
                    if(Username.indexOf(username) == Password.indexOf(password)){
		    System.out.println("Log in successful. You may proceed.");
                    System.out.println (" ");
                    break;
                    }
                    else if(Username.indexOf(username)!= Password.indexOf(password)){
                       System.out.println("Username or Password does not match. Please try again.");
                    }
		  }
                
//Username or password mismatch                
		else if (Username.contains(username) == false || Password.contains(password) == false){
		    System.out.println("Invalid Username or Password. Please try again.");
		  }
	      }
            
	  }
        
//Log in end                

//Registration beginning             
	   else if (option.equalsIgnoreCase ("S")){
                    
//Email portion  
            do{  
            System.out.print("Valid Email: ");
            String mail = James.nextLine();
            if (mail.isBlank())
	    {
            System.out.println("Incomplete or empty input. Please try again.");
	    }
            else if (Email.contains(mail)){
            System.out.println("Email already in use.");}
            else if (Email.contains(mail) == false) {
            writer3.append(mail + "\n"); 
            break;
            }           
          }
          while(true);
          writer3.close(); //close bufferedwriter for emails after use
          
//Username portion
            do{
                System.out.print ("New Username: ");
		String newUser = James.nextLine ();
                if (newUser.isBlank())
		{
	        System.out.println("Incomplete or empty input. Please try again.");
		}
                else if (Username.contains(newUser)){
	        System.out.println("Username already taken.");
		} 
                else if (Username.contains(newUser) == false){
                writer1.append(newUser + "\n");
                writer1.close(); //close bufferedwriter for usernames after use
                break;   
                }
            } 
            while(true);
            
            
//Password portion    
            do{
                System.out.print ("New Password: ");
		String newPass = James.nextLine ();
                if (newPass.isBlank())
		{
		System.out.println("Incomplete or empty input. Please try again.");
		}
                else if (Password.contains(newPass)){
		System.out.println("Password already taken.");
		}
                else if(Password.contains(newPass) == false){
                System.out.print("Confirm Password: ");
                String newPass1 = James.nextLine();
                if(newPass1.equals(newPass) == false){
                System.out.println("Password mismatch. Please, try again.");
                    }
                    else if(newPass1.equals(newPass)){
                    writer2.append(newPass + "\n");
                    System.out.println("Registration complete.");
                    System.out.println (" ");
                    writer2.close(); //close bufferedwriter for passwords after use
                    break;
                    }
                }
            } 
            while(true);}
        break;
    
        }while(true);
            
//Registration end

    
//Interface end        
  }
}