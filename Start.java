/*
 * Shega Vala
 * Version 1
 * 4/27/21
 * ITSC 1213 - workshop activities.
 */
package phonebook;

import java.util.Scanner;

/**
 *
 * @author shegavala
 */
public class Start {
    
    private static PhoneBook book;

    
    public static void main(String[] args) {
        
        PhoneBook bookA = new PhoneBook();
        initialize(bookA);
        displayManu();
    }
    public static void displayManu()
    {
        
       
       
       int userChoice = 1;
       
       while(userChoice != 0)
       {
       
        String menu = ("Shega's Phone Tracker ##\n");
       
       menu+= "\n1. Add an entry";
       menu+= "\n2. Edit an entry";
       menu+= "\n3. Look up phone number";
       menu+= "\n4. Remove an entry";
       menu+= "\n5. Print out phone book";
       menu+= "\n0. Exit";
       
       System.out.println(menu);
       System.out.println("Enter the number of choice >> ");
       
       Scanner input = new Scanner(System.in);
       userChoice = input.nextInt();
       input.nextLine();
       
       //switch
       switch (userChoice)
       {
           
            case 1 : //Add an entry
                
               System.out.println("Enter name: ");
               String userName = input.nextLine();
               System.out.println("Enter phone number:");
               String userPhoneNumber = input.nextLine();
               book.addEntry(userName,userPhoneNumber);
               
               break;  
            case 2 : //Edit an entry";
                
               System.out.println("Enter name: ");
               String userName1 = input.nextLine();
               System.out.println("Enter phone number:");
               String userPhoneNumber1 = input.nextLine();
               book.editEntry(userName1, userPhoneNumber1 );
               
               break;
           case 3 :  
        //Look up phone number";
              System.out.println("What is your user name ? ");
              String sUserLookUp = input.nextLine();
              
              String result = book.searchPhoneNumber(sUserLookUp);
              if (result == null)
              {
               System.out.println("Phone number not found ");
              }
              else{
               System.out.println(sUserLookUp+ "'s number is " + result);
                  }
               break;
           case 4 :   // Remove an entry";
              System.out.println("Whos entry would you like to remove? ");
              String userRemoveName = input.nextLine();
              
              book.removeEntry(userRemoveName);
             
               break;
           case 5 :  //Print out phone book";
               
               book.printBook();
               break;
           case 0 :
             break;   
             
           default :  
           System.out.println(" Please enter the value between 0-5 ");
             break;
    }   
    }
    }
    public static void initialize(PhoneBook bookList) {
        book = bookList;
        book.addEntry("Roxanne Hughes", "443-555-2864");
        book.addEntry("Juan Alberto Jr.", "410-555-9385");
        book.addEntry("Rachel Phillips", "310-555-6610");
    
    }

    
    
    
}
