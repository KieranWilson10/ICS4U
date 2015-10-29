package wilson;

import java.util.ArrayList;

public class BinarySorting {

	public BinarySorting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void searchingInt(ArrayList<Integer> list, int x) {

		int middle = list.size() / 2;
		int midValue = list.get(middle);
		int searchNumber = midValue;

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(searchNumber) > x) {
				searchNumber = searchNumber / 2;
			}
			if (list.get(searchNumber) < x) {
				searchNumber = searchNumber + searchNumber / 2;

			}
			if (list.get(searchNumber) == x) {
				System.out.print(list.get(searchNumber));

			}
		}

	}

	public static void searchingString(ArrayList<String> stringList, String z) {
		int start = 0;
		int end = stringList.size() - 1;
		int middle = (start + end) / 2;
		String midValue = stringList.get(middle);

		for (int i = 0; i < stringList.size() - 1; i++) {
			middle = (start + end) / 2;
			midValue = stringList.get(middle);

			if (midValue.compareTo(z) == 1) {
				middle = middle - 1;
			} else if (midValue.compareTo(z) == -1) {
				middle = middle + 1;
			} else if (midValue.compareTo(z) == 0) {
				System.out.println("found");
			}
		}

	}

	public static void searchObject(ArrayList<ContestantInformation> ci, ContestantInformation a) {

		int start = 0;
		int end = ci.size() - 1;
		int middle = (start + end) / 2;
		ContestantInformation midValue = ci.get(middle);

		for (int i = 0; i < ci.size() - 1; i++) {
			middle = (start + end) / 2;
			midValue = ci.get(middle);

			if (a.compareFirstName(ci.get(i)) == 1) {
				middle = middle - 1;
			} else if (a.compareFirstName(ci.get(i)) == -1) {
				middle = middle + 1;
			} else if (a.compareFirstName(ci.get(i)) == 0) {
				System.out.println(ci.get(i));
			}

		}
	}

	public static void searchNames(ArrayList<ContestantInformation> ci, String a, String b) {

		int start = 0;
		int end = ci.size() - 1;
		int middle = (start + end) / 2;
		ContestantInformation midValue = ci.get(middle);

		for (int i = 0; i < ci.size() - 1; i++) {
			middle = (start + end) / 2;
			midValue = ci.get(middle);

			if (b.compareTo(ci.get(i).getLastName()) == 1) {
				middle = middle - 1;
			} else if (b.compareTo(ci.get(i).getLastName()) == -1) {
				middle = middle + 1;
			} else if (b.compareTo(ci.get(i).getLastName()) == 0) {
				System.out.println(ci.get(i));

				if (a.compareTo(ci.get(i).getName()) == 1) {
					middle = middle - 1;
				} else if (a.compareTo(ci.get(i).getName()) == -1) {
					middle = middle + 1;
				} else if (a.compareTo(ci.get(i).getName()) == 0) {
					System.out.println(ci.get(i));

				}

			}
		}
	}
	public int binarySearch(ArrayList<String> aL, String target){
		return binarySearch(aL,target,0,aL.size()-1);
	}
    private int binarySearch(ArrayList<String> aL, String target, int begin, int end){
    	if(begin > end){
    		return-1;
    	}
    	
    	int mid = (begin+end)/2;
    	
    	if(aL.get(mid).compareTo(target) == 0){
    		return mid;
    		
    	}
    	else if(aL.get(mid).compareTo(target)<0){
    		return binarySearch(aL,target,mid,end);
    		
    	}
    	else{
    		return binarySearch(aL,target,mid,end);
    	}
    	
    }
				
		
	}
