package t4;

public abstract class noabstract {
	int i;
	String s;
}
class Derive extends noabstract{
	Derive(String x){
		s=x;
	}
	void show(){
		System.out.println(s);
	}
	
}
