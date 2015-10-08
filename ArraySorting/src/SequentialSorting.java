import java.util.ArrayList;

public class SequentialSorting {

	public SequentialSorting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		

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
}
