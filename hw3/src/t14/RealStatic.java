package t14;
class Tester{
	static String s1;
	static String s2="abc";
	static String s3;
	static{
		s3="def";
	}
	static void show(){
		System.out.println(s3);
		System.out.println(s2);
		System.out.println(s1);
	}
}
public class RealStatic {
	public static void main(String [] args){
		Tester.show();
		Tester t1=new Tester();
		t1.s1="123";
		t1.show();
	}
}
