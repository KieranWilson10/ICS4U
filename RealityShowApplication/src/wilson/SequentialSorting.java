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
	
	public static Integer searchNames(ArrayList<ContestantInformation> ci, String a, String b)
	{
	
		for(int i = 0; i < ci.size() -1 ; i++)
		{
			if(b.compareTo(ci.get(i).getLastName()) == 0)
			{
				if(b.compareTo(ci.get(i).getName()) == 0)
				{					
					return 0;				
				}				
			}			
		}	
		return -1;
		
	}
	public static Integer searchNamesIndex(ArrayList<ContestantInformation> ci , String a, String b){
		
		for(int i = 0; i < ci.size() -1 ; i++)
		{
			if(b.compareTo(ci.get(i).getLastName()) == 0)
			{
				if(b.compareTo(ci.get(i).getName()) == 0)
				{					
					return i;				
				}				
			}			
		}	
		return -1;
		
	}
}
