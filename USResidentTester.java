/**
Description:   This is a client application of the USResident class.
               This class tests the functionality of the USResident class methods.
     
     Author: William Crum
      
       Date: November 1, 2020
*/


public class USResidentTester {

   public static void main(String args[])
   {
    
      USResident firstUSResident;        // stores the first person 
      USResident secondUSResident;       // stores the second person 
      USResident thirdUSResident;        // stores the third person   
      
      Person person;                     // stores the basic profile of a person
      Address address;                   // stores the address of a person
      
      Dat secondUSResidentBirthDate;     // stores the birthday of the second person 
      Dat thirdUSResidentBirthDate;      // stores the birthday of the third person
      
      int orderNumber;                   // the result from compareTo      

      
      /******************************************************************
     
           Test 1: 
	   
	   	   Create a new default US resident and test toString().

          
      ******************************************************************/
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 1: Test default constructor");
      System.out.println("     Display the address using the toString method");
      System.out.println("\n     Expected result:\n");
      System.out.println("\nTest 1: US Resident 1\n");
      System.out.println("First Name:     John");
      System.out.println("Last Name:      Doe"); 
      System.out.println("Birth Date:     January 1, 1900");
      System.out.println("Street:         Somewhere Street");
      System.out.println("City:           Somewhere City");
      System.out.println("State:          Somewhere State");
      System.out.println("Zip Code:       00000\n");
      System.out.println("Social Security:        000-00-0000");
      System.out.println("Status:                 Citizen");
      System.out.println("Country of Origin:      United States of America\n\n");

      System.out.println("     Result\n");  
      
      firstUSResident = new USResident();

      System.out.println("\nTest 1: US Resident 1\n\n" + firstUSResident.toString());
      
     
      /******************************************************************
     
           Test 2: 
	   
	           Use set methods to change US resident attributes.
          
      ******************************************************************/    
    
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 2: Test set methods");
      System.out.println("\n     Expected result:\n");
      System.out.println("\nTest 2: US Resident 2\n");
      System.out.println("First Name:     Jane");
      System.out.println("Last Name:      Jones"); 
      System.out.println("Birth Date:     May 23, 1983");
      System.out.println("Street:         1756 Pine Avenue");
      System.out.println("City:           Pineville");
      System.out.println("State:          Maine");
      System.out.println("Zip Code:       08012\n");
      System.out.println("Social Security:        123-45-9823");
      System.out.println("Status:                 Naturalized");
      System.out.println("Country of Origin:      France\n\n");

      System.out.println("     Result\n");  
      
      secondUSResident = new USResident();
     
      secondUSResidentBirthDate = new Dat(23,5,1983);
     
      secondUSResident.setFirstName("Jane");     
      secondUSResident.setLastName("Jones"); 
      secondUSResident.setBirthDate(secondUSResidentBirthDate);     
      secondUSResident.setStreet("1756 Pine Avenue");    
      secondUSResident.setCity("Pineville");    
      secondUSResident.setState("Maine");    
      secondUSResident.setZipCode("08012"); 
      secondUSResident.setSocialSecurity("123-45-9823"); 
      secondUSResident.setStatus("Naturalized"); 
      secondUSResident.setCountry("France"); 
      
      System.out.println("\nTest 2: US Resident 2\n\n" + secondUSResident.toString());
      
      
     /******************************************************************
     
           Test 3: 
	   
	          Create a new US resident using constructor with parameters
          
      ******************************************************************/
     
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 3: Test constructor with parameters");
      System.out.println("\n     Expected result:\n");
      System.out.println("\nTest 3: US Resident 3\n");
      System.out.println("First Name:     Fred");
      System.out.println("Last Name:      Smith"); 
      System.out.println("Birth Date:     October 31, 2000");
      System.out.println("Street:         134 Oak Avenue");
      System.out.println("City:           Oak Town");
      System.out.println("State:          Iowa");
      System.out.println("Zip Code:       34876\n");
      System.out.println("Social Security:        345-56-1274");
      System.out.println("Status:                 Resident Alien");
      System.out.println("Country of Origin:      India\n\n");

      System.out.println("     Result\n");  
      
      thirdUSResidentBirthDate = new Dat(31,10,2000);
      
      address = new Address("34 Oak Avenue", "Oak Town", "Iowa", "34876");
      
      person = new Person("Fred", "Smith", thirdUSResidentBirthDate, address); 
      
      thirdUSResident = new USResident(person, "345-56-1274", "Resident Alien", "India");    // creates a person object
      
      System.out.println("\nTest 3: US Resident 3\n\n" + thirdUSResident.toString());
      
                      
      /******************************************************************
     
           Test 4: 
	   
	           Display US resident attributes using get methods
          
      ******************************************************************/
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 4: Test get methods");
      System.out.println("\n     Expected result:\n");
      System.out.println("\nTest 4\n");
      System.out.println("The first name is Jane.");
      System.out.println("The last name is Jones."); 
      System.out.println("The birth date is May 23, 1983.");
      System.out.println("The street is 1756 Pine Avenue.");
      System.out.println("The city is Pineville.");
      System.out.println("The state is Maine.");
      System.out.println("The zip code is 08012.");
      System.out.println("The social security number is 123-45-9823.");
      System.out.println("The status is Naturalized.");
      System.out.println("The country of origin is France\n\n");

      System.out.println("     Result\n");  
                    
      System.out.println("\nTest 4\n\n" +
                         "The first name is " + secondUSResident.getFirstName() + ".\n" +
                         "The last name is " + secondUSResident.getLastName() + ".\n" +
                         "The birth date is " + secondUSResident.getBirthDate().toString() + ".\n" +
                         "The street is " + secondUSResident.getStreet() + ".\n" +
                         "The city is " + secondUSResident.getCity() + ".\n" +
                         "The state is " + secondUSResident.getState() + ".\n" +
                         "The zip code is " + secondUSResident.getZipCode() + ".\n" +
                         "The social security number is " + secondUSResident.getSocialSecurity() + ".\n" +
                         "The status is " + secondUSResident.getStatus() + ".\n" +
                         "The country of origin is " + secondUSResident.getCountry() + ".\n");
                         
                    
      /******************************************************************
     
           Test 5: 
	   
	   	  Test equals
          
      ******************************************************************/
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 5: Test equals method");
      System.out.println("\n     Expected result:\n");
      System.out.println("\nTest 5\n");
      System.out.println("Second US Resident is not equal to Third US Resident.\n\n");

      System.out.println("     Result\n");  
      
      
      System.out.print("\nTest 5\n\nSecond US Resident is "); 
      
      if(secondUSResident.equals(thirdUSResident))
      {
        System.out.println("equal to Third US Resident.\n\n");
      }
      else
      {
        System.out.println("not equal to Third US Resident.\n\n");
      }   
                    
     /******************************************************************
     
           Test 6: 
	   
	   	  Test compareTo
          
      ******************************************************************/
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 6: Test compareTo method");
      System.out.println("\n     Expected result:\n");
      System.out.println("\nTest 6\n");
      System.out.println("Second US Resident comes before Third US Resident.\n\n");

      System.out.println("     Result\n");  
      
      System.out.print("\nTest 6\n\nSecond US Resident "); 
      
      orderNumber = secondUSResident.compareTo(thirdUSResident);
      
      if(orderNumber == 0)
      
        System.out.println("the same as Third US Resident.\n\n");
        
      else
      
        if(orderNumber > 0)
      
           System.out.println("comes after Third US Resident.\n\n");
    	
         else
         
	        System.out.println("comes before Third US Resident.\n\n"); 
      
      /******************************************************************
     
           Test 7: 
	   
	   	  Test error checking setSocialSecurity: social security number too short
          
      ******************************************************************
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 7: Test setSocialSecurity method");
      System.out.println("\n     Expected result:\n");
      System.out.println("\nTest 7: social security number too short\n\n");
      System.out.println("Exception in thread \"main\" java.lang.IllegalArgumentException: Invalid Social Security Number");
      System.out.println("at USResident.setSocialSecurity(USResident.java:92)");
      System.out.println("at USResidentTester.main(USResidentTester.java:257)\n\n");

      System.out.println("     Result\n");  
      
      System.out.print("\nTest 7: social security number too short\n\n");                       
      firstUSResident.setSocialSecurity("101-2-1256");  
      
      /******************************************************************
     
           Test 8: 	   
	   
	      Test error checking setSocialSecurity: social security number missing first dash
          
      ******************************************************************
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 8: Test setSocialSecurity method");
      System.out.println("\n     Expected result:\n");
      System.out.println("\nTest 8: social security number missing first dash\n\n");
      System.out.println("Exception in thread \"main\" java.lang.IllegalArgumentException: Invalid Social Security Number");
      System.out.println("at USResident.setSocialSecurity(USResident.java:92)");
      System.out.println("at USResidentTester.main(USResidentTester.java:280)\n\n");

      System.out.println("     Result\n");  
      
      System.out.print("\nTest 8: social security number missing first dash\n\n");   
      firstUSResident.setSocialSecurity("101=24-1256");    
      
      
      /******************************************************************
     
           Test 9: 	   
	   
	      Test error checking setSocialSecurity: social security number missing second dash
          
      ******************************************************************
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 9: Test setSocialSecurity method");
      System.out.println("\n     Expected result:\n");
      System.out.println("\nTest 9: social security number missing second dash\n\n");
      System.out.println("Exception in thread \"main\" java.lang.IllegalArgumentException: Invalid Social Security Number");
      System.out.println("at USResident.setSocialSecurity(USResident.java:92)");
      System.out.println("at USResidentTester.main(USResidentTester.java:302)\n\n");

      System.out.println("     Result\n");  
      
      System.out.print("\nTest 9: social security number missing second dash\n\n");   
      firstUSResident.setSocialSecurity("101-24=1256");    
       
      /******************************************************************
     
           Test 10: 	   
	   
	      Test error checking setSocialSecurity: social security number non-digit first number
          
      ******************************************************************
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 10: Test setSocialSecurity method");
      System.out.println("\n     Expected result:\n");
      System.out.println("\nTest 10: social security number non-digit first number\n\n");
      System.out.println("Exception in thread \"main\" java.lang.IllegalArgumentException: Invalid Social Security Number");
      System.out.println("at USResident.setSocialSecurity(USResident.java:92)");
      System.out.println("at USResidentTester.main(USResidentTester.java:323)\n\n");

      System.out.println("     Result\n");  
      
      System.out.print("\nTest 10: social security number non-digit first number\n\n");   
      firstUSResident.setSocialSecurity("g01-24-1256");  
      
      /******************************************************************
     
           Test 11: 	   
	   
	      Test error checking setSocialSecurity: social security number non-digit second number
          
      ******************************************************************
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 11: Test setSocialSecurity method");
      System.out.println("\n     Expected result:\n");
      System.out.println("\nTest 11: social security number non-digit second number\n\n");
      System.out.println("Exception in thread \"main\" java.lang.IllegalArgumentException: Invalid Social Security Number");
      System.out.println("at USResident.setSocialSecurity(USResident.java:92)");
      System.out.println("at USResidentTester.main(USResidentTester.java:344)\n\n");

      System.out.println("     Result\n");  
      
      System.out.print("\nTest 11: social security number non-digit second number\n\n");   
      firstUSResident.setSocialSecurity("101-2h-1256"); 
      
            
      /******************************************************************
     
           Test 12: 	   
	   
	      Test error checking setSocialSecurity: social security number non-digit third number
          
      ******************************************************************/
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 12: Test setSocialSecurity method");
      System.out.println("\n     Expected result:\n");
      System.out.println("\nTest 12: social security number non-digit third number\n\n");
      System.out.println("Exception in thread \"main\" java.lang.IllegalArgumentException: Invalid Social Security Number");
      System.out.println("at USResident.setSocialSecurity(USResident.java:92)");
      System.out.println("at USResidentTester.main(USResidentTester.java:366)\n\n");

      System.out.println("     Result\n");  
      
      System.out.print("\nTest 12: social security number non-digit third number\n\n");   
      firstUSResident.setSocialSecurity("101-24-125?");   
  
   } // main
  
}// USResidentTester