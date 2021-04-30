package t21;

public class Enum {
	static public enum Bills {ONE, FIVE, TEN, TWENTY, FIFTY, HUNDRED}
	public static void main(String[] args) {
		for(Bills b : Bills.values()){
			System.out.println(b + ", ordinal " + b.ordinal());	
			switch(b){
			case ONE:System.out.println("you gave 1$");break;
			case FIVE:System.out.println("you gave 5 $");break;
			case TEN:System.out.println("you gave 10$");break;
			case TWENTY:System.out.println("you gave 20$");break;
			case FIFTY:System.out.println("you gave 50$");break;
			case HUNDRED:System.out.println("you gave 100$");break;
			}
			
		}
	}	
}
