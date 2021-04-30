package t4;
class MException extends Exception{
	private String msg;
	MException(String msg) {
		super(msg);
		System.out.println("Exception");
		msg = msg;
	}
	protected void showS() { 
		System.out.println("Message from Exception " + msg);
	}
}
public class MyException {
	public static void f() throws MException {
		System.out.println("f()");
		throw new MException("exception from f()");
	}
	public static void main(String[] args) {
		try {
			f();	
		} catch(MException e) {
			System.out.println("Caught");
			e.showS();
		} 
	}	
}

