package t17;
class Tester{
	Tester(String s){
		System.out.println(s);
	}
}
public class StringInitiator {
	public static void main(String [] args){
		Tester[] t=new Tester[5];
		for(int i=0;i<5;i++){
			t[i]=new Tester("a");
		}
	}
}
