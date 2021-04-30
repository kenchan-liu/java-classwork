package t2;
class Tester{
	String s="a";
	String d;
	Tester(){d="b";}
}
public class Stringdiffrence {
	public static void main(String[]args){
		Tester t1=new Tester();
		System.out.println(t1.s);
		System.out.println(t1.d);
		t1.s="c";
		t1.d="d";
		System.out.println("t1.s:"+t1.s);
		System.out.println("t1.d:"+t1.d);
	}
}
