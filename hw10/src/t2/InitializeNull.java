package t2;
class realClass{
	String s;
}
public class InitializeNull {
	public static void main(String[]args){
		try{
			realClass rs=null;
			if(rs==null)
				throw new NullPointerException();
		}
		catch (NullPointerException e){
			System.out.println("caught");
		}
	}
}
