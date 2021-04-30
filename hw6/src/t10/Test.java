package t10;

public class Test {
	public static void main(String[]args){
		Base a=new Derive(1);
		a.change(2);
		a.show();
	}
}
