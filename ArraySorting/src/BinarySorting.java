import java.util.ArrayList;

public class BinarySorting {

	public BinarySorting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void searchingInt(ArrayList<Integer> list , int x)
	{

		int middle = list.size() / 2;
		int midValue = list.get(middle);
		int searchNumber = midValue; 
		
		for(int i = 0 ; i < list.size()-1; i++){
			if(list.get(searchNumber) > x ){
				searchNumber = searchNumber/2;				
			}
			if(list.get(searchNumber)< x){
				searchNumber = searchNumber + searchNumber/2 ;
				
			}
			if(list.get(searchNumber) == x){
				System.out.print(list.get(searchNumber));
				
			}		
		}
		
	
	}
	
	public static void searchingString(ArrayList<String> stringList , String z){
		
		int middle = stringList.size()/2;
		String midValue = stringList.get(middle);
		String searchNumber = midValue; 
		
		for(int i = 0 ; i < stringList.size()-1; i++)
		{
			if(searchNumber.compareTo(stringList.))
			
			
			
		}
		
		
	}

}