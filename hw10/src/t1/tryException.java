package t1;
class Except1 extends Exception{
	public Except1(String s){
		super(s);
		System.out.println("except1"+s);
	}
}
public class tryException {
	public static void func1()throws Except1{
		throw new Except1("from fun1");
	}
	public static void main(String[] args){
		try{
			func1();
		}
		catch(Except1 e){
			System.err.println("caught exception");
		}
		finally{
			System.out.println("made it to final");
		}
		}
}
