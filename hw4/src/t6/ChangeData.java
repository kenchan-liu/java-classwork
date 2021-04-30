package t6;

public class ChangeData {
	static void change(TestData td,int a){
		td.i=a;
	}
	public static void main(String []args){
		TestData t=new TestData();
		t.i=14;
		change(t,100);
		System.out.println(t.i);
	}
}
