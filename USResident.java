/**
Description:   USResident class that is a child class of the Person class.
     
  Programmer:    Awwal Ahmed
        Date:    November 3, 2021    
    Modified:    November 8, 2021
*/

public class USResident
				extends Person
				implements Comparable
{
	private String socialSecurity;			// the person's social security number
	private String status;					// the person's citizenship status: Citizen, Naturalized, or Resident Alien.
	private String country;					// the person's country of origin.
	

	// 	CONSTRUCTORS	
		public USResident()
		{
			setSocialSecurity("000-00-0000");
			setStatus("Citizen");
			setCountry("United States of America");
		
		}
		
	/**
		@param newPerson the person's profile.
			   newSocSec the person's social security number.
			   newStatus the person's citizenship status: Citizen, Naturalized, or Resident Alien.
			   newCountry the person's country of origin.
			   
	*/
		public USResident (Person newPerson, String newSocSec, String newStatus, String newCountry)
		{
			super(newPerson);
			setSocialSecurity(newSocSec);
			setStatus(newStatus);
			setCountry(newCountry);
			
		}
		
	// METHODS

	/**
		Provides the person's social security number.
		@return the person's ssecurit y number.
	*/
		public String getSocialSecurity()
		{
			return socialSecurity;
		
		} // getSocialSecurity End.
		
	/**
		Provides the person's citizenship status: Citizen, Naturalized, or Resident Alien.
		@returns the person's citizenship status: Citizen, Naturalized, or Resident Alien.
	*/
		public String getStatus()
		{
			return status;
			
		} // getStatus End.
	
	/**
		Provides the person's country of origin.
		@return the person's country of origin.
	*/
		public String getCountry()
		{
			return country;
			
		} // getCountry End.
		
	/**
		Assigns the person's social security number.
		@param newSocSec the person's social security number.
	*/
		public void setSocialSecurity(String newSocSec)
		throws java.lang.IllegalArgumentException
		{
			if (isValid(newSocSec))
			{
				socialSecurity = newSocSec;
			}
			else
			{
				throw new IllegalArgumentException("Invalid Social Security Number");
			}
			
		} // setSocialSecurity End.
		
		private boolean isValid(String sNumber)
		{
			boolean valid = true;
			int position = 0;
			
			if (sNumber.length() != 11)
			{
				valid = false;
			}
			else 
			{
				while(valid && position < sNumber.length())
				{
					if(position == 3 || position == 6)
					{
						valid = sNumber.charAt(position) == '-';
					}
					else
					{
						valid = Character.isDigit(sNumber.charAt(position));
					}
					position++;
				}
			}
			return valid;
		} // isValid End.
		
	/**
		Assigns the person's citizenship status: Citizen, Naturalized, or Resident Alien.
		@param newStatus the person's citizenship status: Citizen, Naturalized, or Resident Alien.
	*/
		public void setStatus(String newStatus)
		{
			status = newStatus;
			
		} // setStatus End.

	/**
		Assigns the person's country of origin.
		@param newCountry the person's country.
	*/
		public void setCountry(String newCountry)
		{
			country = newCountry;
		
		} // setCountry End.
		
	/**
		Determines if two persons are the same based on social security number.
		@param person2 the second person in the comparison.
		@return true when this person is same as person2; false otherwise.
	*/
		public boolean equals(Object person2)
		{
			
			USResident person = (USResident) person2;
			
			return socialSecurity.equals(person.getSocialSecurity());
			
		} // equals end.
	
	/**
		Determins order of the persons based on social security number.
		@param person2 the second person in the comparison.
		@return value < 0 when this person comes before person2.
				0 when this person is same as person2.
				value > 0 when the person comes after person2.
	*/
		public int compareTo(Object person2)
		{
			
			USResident person = (USResident) person2;
			
			return socialSecurity.compareTo(person.getSocialSecurity());
			
		} // compareTo End.
	
	/**
		Produces the person's profile.
		@return the person's profile.
	*/
		public String toString()
		{
			String id = 				  super.toString() +
										  "Social Security:        " + socialSecurity + "\n" +
										  "Status:                 " + status + "\n" +
										  "Country of Origin       " + country + "\n\n";
			return id;
			
		} // toString End.
		
} // Program End