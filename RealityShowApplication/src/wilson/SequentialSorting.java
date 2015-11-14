package wilson;
import java.util.ArrayList;

public class SequentialSorting {

	public SequentialSorting() {
		// TODO Auto-generated constructor stub
	}

	

	public static void searchInt(ArrayList <Integer> list, int x)
	{
		for(int i = 0 ; i < list.size()-1 ; i++)
		{
			if(list.get(i) == x)
			{
				System.out.print(list.get(i));
			}
			
		}
		
		
	}
	public static void searchString(ArrayList <String> stringList, String z){
		
		
		for(int i = 0; i < stringList.size()-1; i++)
		{
			if(stringList.get(i).compareTo(z) == 0)
			{
				System.out.print(stringList.get(i));
			}			
			
		}	
		
	}
	public static void searchObject(ArrayList<ContestantInformation> ci, ContestantInformation a)
	{
		
		for(int i = 0; i < ci.size() -1 ; i++)
		{
			if(ci.get(i).getClass().getName().compareTo(a.getClass().getName()) == 0){
				
				System.out.print(ci.get(i));
			}
		}		
	}
	/**
	 * Evaluates if the contestant from arraylist is equal to the inputted contestant name and last name.
	 * @param ci
	 * @param a
	 * @param b
	 * @return
	 */
	public static Integer searchNames(ArrayList<ContestantInformation> ci, String a, String b)
	{
		for(int i = 0; i < ci.size() ; i++)
		{
			if(b.trim().toUpperCase().equals(ci.get(i).getLastName().trim().toUpperCase()))
			{
				if(a.trim().toUpperCase().equals(ci.get(i).getName().trim().toUpperCase()))
				{					
					return 0;				
				}				
			}			
		}	
		return -1;
		
	}
	/**
	 * Evaluates the Index at which the contestant is equal to the inputted first and last name.
	 * @param ci
	 * @param a
	 * @param b
	 * @return
	 */
	public static Integer searchNamesIndex(ArrayList<ContestantInformation> ci , String a, String b){
		
		for (int i = 0; i < ci.size() ; i++)
		{
			if(b.trim().toUpperCase().equals(ci.get(i).getLastName().trim().toUpperCase()))
			{
				if(a.trim().toUpperCase().equals(ci.get(i).getName().trim().toUpperCase()))
				{					
					return i;				
				}				
			}			
		}	
		return -1;
		
	}
}
