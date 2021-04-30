package t9;
class Ex1 extends Exception{
	Ex1(String name){super(name);}
}

class Ex2 extends Exception{
	Ex2(String name){super(name);}
}

class Ex3 extends Exception{
	Ex3(String name){super(name);}
}
public class CrazyCatch {
	static void f1()throws Ex1{
		throw new Ex1("f1");
	}
	static void f2() throws Ex2{
		throw new Ex2("f2");
	}
	static void f3() throws Ex3{
		throw new Ex3("f3");
	}
	public static void main(String[]args){
		try{
			throw new NullPointerException();
		}
		catch (Exception e){
			System.out.println("i got you");
			e.printStackTrace(System.out);
		}
		finally{
			System.out.println("final");
		}
	}
}
