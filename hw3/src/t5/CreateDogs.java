package t5;
class Dog{
	void bark(int i){
		System.out.println("barking");
	}
	void bark(String s){
		System.out.println("howling");
	}
	void bark(){
		System.out.println("quiet");
	}
	void bark(float f){
		System.out.println("woof");
	}
}
public class CreateDogs {
	public static void main(String[] args){
		Dog d1=new Dog();
		Dog d2=new Dog();
		Dog d3=new Dog();
		d1.bark(1);
		d2.bark("r");
		d1.bark();
		d3.bark();
		d3.bark(1.02f);
	}
}
