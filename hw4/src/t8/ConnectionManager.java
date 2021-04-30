package t8;

public class ConnectionManager {
	static int remain=3;
	static Connection[] C = new Connection[remain];	
	public static Connection Get() {
		if(remain > 0){
			return C[--remain];
		}
			System.out.println("No more connections");
			return null;
	}
	public static void main(String[] args) {		
		Get();
		System.out.println("Successfully made a new Connection");
		Get();
		System.out.println("Successfully made a new Connection");
		Get();
		Get();
	}				  	
}
