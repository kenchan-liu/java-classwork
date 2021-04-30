package t3;

public abstract class Base {
	public abstract void print();
}
class Derive extends Base{
	int i=0;
	public void print(){
		System.out.println(i);
	}
}

