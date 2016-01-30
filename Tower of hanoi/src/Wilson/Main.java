package Wilson;
/**
 * This class utilizes a recursive method Solve to complete the Hanoi towers puzzle while giving an output to allow the user to follow.
 * @author Kieran Wilson
 */
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	//This is the main method
	public static void main(String[] args) {
		
		String src = "Src";
		String dst = "Dst";
		String aux = "Aux";
		//This calls the method Solve, to solve the hanoi tower recursively
		Solve(4, src, aux,  dst);
	}
	/**
	 * This method recursively calls itself to solve the hanoi tower puzzle
	 * @param N
	 * This is the number of rings on the starting peg
	 * @param src
	 * This passes in the string "Src", to help us follow the puzzle
	 * @param aux
	 * This passes in the string "Aux", to help us follow the puzzle
	 * @param dst
	 * This passes in the string "Dst", to help us follow the puzzle
	 */
	private static void Solve(int N, String src,  String aux , String dst) {
		//Base Case
		if(N == 0){
			return;
		}
		//Recursively calls the Solve method to solve the hanoi tower
		Solve(N-1, src , dst , aux);
		//Prints out the steps to allow us to follow the puzzle
		System.out.println(" Move from " + src + " to " + dst);
		Solve(N-1, aux , src , dst);
	 
	}
}