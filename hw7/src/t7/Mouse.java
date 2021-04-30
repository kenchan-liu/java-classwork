package t7;
interface Rodent{
	String name="Rodent";
	void eat();
	void grow();
}
public class Mouse implements Rodent{
	int age=1;
	public void eat(){
		System.out.println("mouse eating...");
	}
	public void grow(){
		age+=1;
		System.out.println("mouse growing"+" "+age);
	}
	public static void main(String[] args){
		Mouse m1=new Mouse();
		m1.grow();m1.grow();
	}
}
class Hamster implements Rodent{
	int age=1;
	public void eat(){
		System.out.println("hamster eating...");
	}
	public void grow(){
		age+=1;
		System.out.println("hamster growing"+" "+age);
	}
}
