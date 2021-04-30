package t6;

class Dog{
	void bark(int i,String s){
		System.out.println("barking");
	}
	void bark(String s,int i){
		System.out.println("howling");
	}
}
public class NewDogs {
	public static void main(String[] args){
		Dog d1=new Dog();
		Dog d2=new Dog();
		d1.bark(1,"r");
		d2.bark("r",2);
	}
}
