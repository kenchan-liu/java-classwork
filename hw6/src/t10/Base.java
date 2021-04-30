package t10;

public class Base {
	int i;
	void change(int a){i=a;show();}
	void show(){System.out.println(i);}
	Base(int x){i=x;}
}
class Derive extends Base{
	Derive(int x){super(x);}
	protected void show(){System.out.println("don't show");}
}