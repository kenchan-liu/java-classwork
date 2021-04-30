package t4;
class test{
	test(){
		System.out.println("Initiating");
	}
	test(String s){
		System.out.println(s);
	}
}
public class Initiate_ {
	public static void main(String [] args){
		test t1=new test();
		test t2=new test("another way to initiate");
	}
}
