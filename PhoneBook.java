/*
 * shega vala
 * veriozion 1
 * 4/27/21
 *ITSC 1213 
 */
package phonebook;

import java.util.ArrayList;

public class PhoneBook {
    
   private ArrayList<PhoneBookEntry> list;
    
   public PhoneBook() {
      list = new ArrayList<PhoneBookEntry>();
   }
   
   public PhoneBookEntry getEntry(String name) {
      PhoneBookEntry entry = null;
      for(PhoneBookEntry e: list) {
         if(e.getName().equals(name)) {
                entry = e;
         }
      }
      return entry;
   }
    
   public void addEntry(String name, String number) {
      PhoneBookEntry entry = new PhoneBookEntry(name, number);
      list.add(entry);
   }
    
   public void removeEntry(String name) {
      PhoneBookEntry entry = getEntry(name);
      if(entry != null) {
         list.remove(entry);
         System.out.println("Entry has been removed");
      }
      else
         System.out.println("Entry cannot be found");
   }
    
   public void editEntry(String name, String number) {
      PhoneBookEntry entry = getEntry(name);
      if(entry != null) {
         entry.setPhonenumber(number);
         System.out.println("Entry has been updated");
      }
      else {
         System.out.println("Entry cannot be found");
      } 
   }
    
   public String searchPhoneNumber(String name) {
      String result = null;
      PhoneBookEntry entry = getEntry(name);
      if(entry != null) {
         result = entry.getPhoneNumber();
      }
      return result;
   }
    
   public void printBook() {
      System.out.println("\n\nPhone Book");
      for(PhoneBookEntry e: list) {
         e.printPhoneBookEntry();
      }
   }
}

