/**
     Description: The definition of the USresidentDBTester class.
     
     Author: William Crum
       
     Date: October 30, 2020
*/

public class USResidentDBTester {

   public static void main(String args[])
   {
   
      // Set up fields
     
      int fieldIdNumber = 0;              // ID number of the field
      int position;
     
      USResident resident1;   // a resident one
      USResident resident2;   // a resident two
      USResident resident3;   // a resident three
      USResident resident4;   // a resident four
      USResident resident5;   // a resident five
      USResident resident6;   // a resident six
      
      Person person;          // a basic profile of a resident
      Address address;        // an address of a resident
      Dat birthday;           // a birthday of a resident
      
      
      //Make resident1
      birthday = new Dat(23,5,1983);
      
      address = new Address("1756 Pine Avenue", "Pineville", "Maine", "08012");  
     
      person = new Person("Jane", "Jones", birthday, address);
      
      resident1 = new USResident(person, "127-34-6785", "Naturalized", "Germany");
       
      //Make resident2
      birthday = new Dat(15,8,1995);
      
      address = new Address("156 Maple Avenue", "Syrup", "New Hampshire", "18073");  
     
      person = new Person("Jack", "Smith", birthday, address);

      resident2 = new USResident(person, "203-84-5693", "Citizen", "United States of America");
      
      
       
      //Make resident3
      birthday = new Dat(10,6,1965);
      
      address = new Address("56 Sixth Street", "Greenville", "New Mexico", "38093");  
     
      person = new Person("Maria", "Botero", birthday, address);

      resident3 = new USResident(person, "310-35-3712", "Citizen", "United States of America");
      
       
      //Make resident4
      birthday = new Dat(1,11,2000);
      
      address = new Address("2345 Ninth Street", "Coolsville", "Alaska", "50143");  
     
      person = new Person("Frederick", "Oland", birthday, address);

      resident4 = new USResident(person, "732-90-1122", "Resident Alien", "France");
      
       
      //Make resident5
      birthday = new Dat(31,10,1975);
      
      address = new Address("150  Main Street", "May Town", "Washington", "38042");  
     
      person = new Person("Ana", "Kim", birthday, address);

      resident5 = new USResident(person, "234-14-7218", "Naturalized", "South Korea"); 
      
      //Make resident6
      birthday = new Dat(2,12,1980);
      
      address = new Address("7803 Water Street", "Riverdale", "California", "59007");  
     
      person = new Person("Yumi", "Tanaka", birthday, address);

      resident6 = new USResident(person, "213-84-5003", "Resident Alien", "Japan");
      
      /******************************************************************
     
           Test 1: 
	   
	          Tests constructor, addUSResident, and toString.
          
      ******************************************************************/
    
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 1: Tests constructor.");
      System.out.println("             Adds residents using the addUSResident method.");
      System.out.println("             Display the residents using the toString method.\n\n");
      
      ResidentDB database = new ResidentDB();
      
      if(database.addUSResident(resident1))
        System.out.println("Resident 1 added to the database.\n");
      else
        System.out.println("Resident 1 already in the database.\n");
        
      if(database.addUSResident(resident2))
        System.out.println("Resident 2 added to the database.\n");
      else
        System.out.println("Resident 2 already in the database.\n");
        
      if(database.addUSResident(resident1))
        System.out.println("Resident added to the database.\n");
      else
        System.out.println("Resident 1 already in the database.\n");
      
      
      System.out.println("\nDatabase Report\n\n" + database.toString());
                    
     /******************************************************************
     
           Test 2: 
	   
	   	  Tests adds additional residents to the database/
          
      ******************************************************************/
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 2: Adds additional residents using the addUSResident method.");
      System.out.println("             Display the residents using the toString method.\n\n");
      
      if(database.addUSResident(resident3))
        System.out.println("Resident 3 added to the database.\n");
      else
        System.out.println("Resident 3 already in the database.\n");
        
      if(database.addUSResident(resident4))
        System.out.println("Resident 4 added to the database.\n");
      else
        System.out.println("Resident 4 already in the database.\n");
        
      if(database.addUSResident(resident5))
        System.out.println("Resident 5 added to the database.\n");
      else
        System.out.println("Resident 5 already in the database.\n");
        
      if(database.addUSResident(resident6))
        System.out.println("Resident 6 added to the database.\n");
      else
        System.out.println("Resident 6 already in the database.\n");
        
      System.out.println("Database Report:\n\n" + database.toString());
      
      
      /******************************************************************
     
           Test 3: 
	   
	   	  Tests recordsWithStatusReport method
          
      ******************************************************************/
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 3: Tests the recordsWithStatusReport method.\n\n");
      
      System.out.println("Residents with resident alien status.\n\n" + database.recordsWithStatusReport("Resident Alien"));
      
      
      /******************************************************************
     
           Test 4: 
	   
	   	  Tests recordsWithStatusReport method
          
      ******************************************************************/
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 4: Tests the recordsWithLastNameReport method.\n\n");
      
      System.out.println("Residents with last name Black.\n\n" + database.recordsWithLastNameReport("Black"));
      
      
      /******************************************************************
     
           Test 5: 
	   
	   	  Tests recordsWithCountryReport method
          
      ******************************************************************/
      
      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 5: Tests the recordsWithCountryReport method.\n\n");
      
      System.out.println("Residents country of origin United States of America.\n\n" + database.recordsWithCountryReport("United States of America"));
      
     
     /******************************************************************
     
           Test 6: 
	   
	   	  Tests the noUSResidents and the numberOfUSResidents methods
          
      ******************************************************************/

      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 6: Tests the noUSResidents and the numberOfUSResidents methods.\n\n");
      
      if(database.noUSResidents())
        System.out.println("No residents in the database.\n");
      else
        System.out.println("There are " + database.numberOfUSResidents() + " residents.\n");
        
        
    /******************************************************************
     
           Test 7: 
	   
	   	  Tests the containsUSResident and the indexOfUSResident methods
          
      ******************************************************************/

      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 7: Tests the containsUSResident and the indexOfUSResident methods.\n\n");
      
      if(database.containsUSResident(resident2))
        System.out.println("The index of the resident is " + database.indexOfUSResident(resident2) + ".\n");
      else
        System.out.println("This resident not in the database.\n");
    
    /******************************************************************
     
           Test 8: 
	   
	   	  Tests the getUSResident method.
          
      ******************************************************************/

      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 8: Tests the getUSResident method.\n\n");
      
      System.out.println("The resident at position 1 " + (database.getUSResident(1)).toString() + "\n");
      
      
      /******************************************************************
     
           Test 9: 
	   
	   	  Tests the removeUSResident method.
          
      ******************************************************************/

      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 9: Tests the removeUSResident method.\n\n");
      
      if(database.removeUSResident("234-14-7218"))
        System.out.println("The record for the resident with social security number 234-14-7218 was removed.\n");
      else
        System.out.println("There is no resident with social security number 234-14-7218 in the database.\n");
        
      if(database.removeUSResident("204-04-7018"))
        System.out.println("The record for the resident with social security number 204-04-7018 was removed.\n");
      else
        System.out.println("There is no resident with social security number 204-04-7018 in the database.\n");
        
    /******************************************************************
     
           Test 10: 
	   
	   	  Tests the clearUSResidents method
          
      ******************************************************************/

      System.out.println("\n******************************************************************");
      System.out.println("\n     Test 10: Tests the clearUSResidents method.\n\n");
      
      database.clearUSResidents();
      
      if(database.noUSResidents())
        System.out.println("No residents in the database.\n");
      else
        System.out.println("There are " + database.numberOfUSResidents() + " residents.\n");
    
   } // main
  
}// USResidentDBTester