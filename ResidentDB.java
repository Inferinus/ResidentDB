/**
Description:   ResidentDB class that holds data for a collection of USResident objects.
     
  Programmer:    Awwal Ahmed
        Date:    November 9, 2021    
    Modified:    November 12, 2021
*/

import java.util.ArrayList;

public class ResidentDB
{
	private ArrayList<USResident> residents;			// the residents in the database
	

// CONSTRUCTORS
	
	public ResidentDB()
	{
		residents = new ArrayList<USResident>();
		
	} // Default Constructor End.
	
	
// METHODS
	
	/**
		Adds a resident to the list.
		@param newUSResident - the new resident.
		@return true, if new resident added; false, if already in the list.
	*/
		public boolean addUSResident(USResident newUSResident)
		{
			boolean added = true;
			
			if (residents.contains(newUSResident))
			{
				added = false;
			}
			else {
				residents.add(newUSResident);
			}
			
			return added;
		
		} // addUSResident End.
	
	/**
		Removes the record matching the target social security number.
		@param target - the the target social security number.
		@return true, if resident removed; false, if not in the list.
	*/
		public boolean removeUSResident(String target)
		{
			boolean removed = true; 		// true, if resident removed
											// false, if not in the list.
			USResident resident;    		// the target resident
    
			resident = searchBySocialSecurity(target);
    
			if (resident == null)
			{
				removed = false;
			}
			else {
				
				residents.remove(residents.indexOf(resident));
			}
			
			return removed;
		
		} // removeUSResident
		
	/**
		Removes all USResident objectsfrom the list.
	*/
		public void clearUSResidents()
		{
			residents.clear();
			
		} // clearUSResidents End.
		
	/**
		Determines if the resident is in the list.
		@param target - the resident targeted in the search.
		@return true, if found; false, otherwise.
	*/
		public boolean containsUSResident(USResident target)
		{
			return residents.contains(target);
			
		} // containsUSResident End.
		
	/**
		Returns a resident from the list.
		@param location - the location of the resident in the list.
		@return a resident record from the list.
	*/
		public USResident getUSResident(int location)
		{
			return residents.get(location);
			
		} // getUSResident End.
		
	/**
		Provides the location of the resident in the list.
		@param target - the resident targeted in the search.
		@return the location of the resident or -1 if not found.
	*/
		public int indexOfUSResident(USResident target)
		{
			return residents.indexOf(target);
			
		} // indexOfUSResident End.
		
	/**
		Tests for an empty list.
		@return true, if the list is empty; false, otherwise.
	*/
		public boolean noUSResidents()
		{
			return residents.isEmpty();
			
		} // noUSResidents End.
		
	/**
		Provides the number of residents.
		@returns the number of residents.
	*/
		public int numberOfUSResidents()
		{
			return residents.size();
			
		} // numberOfUSResidents End.
		
	/**
		Provides a report containing all residents.
		@return a report containing all residents.
	*/
		public String toString()
		{
			String record = "";
			
			for (USResident usResident : residents)
			{
				record += usResident.toString() + "\n\n";
			}
			return record;
			
		} // toString End. 
		
	/**
		Provides a report containing residents with the target status or the message "No matching records".
		@param target - status of the resident.
		@return a report containing residents with the target status or the message "No matching records".
	*/
		public String recordsWithStatusReport(String target)
		{
			String statusReport = "";
			
				for (USResident usResident : residents)
				{
					if (target.equals(usResident.getStatus()))
					{
						statusReport += usResident.toString() + "\n\n";
					}
				}
				if (statusReport.isEmpty())
				{
					statusReport = "No matching records.";
				}
				
				return statusReport;
			
		} // recordsWithStatusReport End.
		
	/**
		Provides the report containing residents with the target last name or the message "No matching records".
		@param target - last name of the resident
		@return the report containing residents with the target last names or the message "No matching records".
	*/
		public String recordsWithLastNameReport(String target)
		{
			String lastName = "";
				
				for (USResident usResident : residents)
				{
					if (target.equals(usResident.getLastName()))
					{
						lastName += usResident.toString() + "\n\n";
					}
				}
				
				if (lastName.isEmpty())
				{
					lastName = "No matching records.";
				}
				
				return lastName;
			
		} // recordsWithLastNameReport End.
		
	/**
		Provides the report containing residents with the target country or the message "No matching records".
		@param target - country of origin of the resident.
		@return the report containing residents with the target country or the message "No matching records".
	*/
		public String recordsWithCountryReport(String target)
		{
			String countryReport = "";
				
				for (USResident usResident : residents)
				{
					if (target.equals(usResident.getCountry()))
					{
						countryReport += usResident.toString() + "\n\n";
					}
				}
				
				if (countryReport.isEmpty())
				{
					countryReport = "No matching records.";
				}
				
				return countryReport;
			
		} // recordsWithCountryReport End.
		
	/**
		Provides the record matching the target social security number.
		@param target - social security number of the resident
		@return the record matching the target social security number.
	*/
		public USResident searchBySocialSecurity(String target)
		{
			USResident resident = null;
			
				for (USResident usResident : residents)
				{
					if (target.equals(usResident.getSocialSecurity()))
					{
						resident = usResident;
					}
				}
				
				return resident;
					
		} // searchBySocialSecurity End.
	
} // ResidentDB End.