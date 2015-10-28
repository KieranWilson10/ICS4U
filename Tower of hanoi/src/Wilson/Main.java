package Wilson;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
	}




	private void Solve(int N, int src, int dst, int aux) {
		
	    if( N == 0) 
	      return;
	    else{
	      Solve(N - 1, src, dst, aux);
	      
	      Solve(N - 1, aux, src, dst);
	    }
			
	}
}