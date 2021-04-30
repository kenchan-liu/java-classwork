package t3;

public class OutOfIndex {
	public static void main(String[]args){
		Integer a[]=new Integer[6];
		try{
			for(int i=0;i<9;i++){
			if(i>5)
				throw new ArrayIndexOutOfBoundsException();
			}
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("index out of bounds");
		}
	}
	
}
