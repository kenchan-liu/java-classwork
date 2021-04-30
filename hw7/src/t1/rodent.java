package t1;

abstract class rodent {
	int age;
	String name="rodent";
	public abstract void eat();
	public abstract void grow();
	void show(){
		System.out.println(name);
	}
}
class mouse extends rodent{
	public void eat(){
		System.out.println("mouse eat");
	}
	public void grow(){
		age+=1;
	}
}
class rat extends rodent{
	public void eat(){
		System.out.println("rat eat");
	}
	public void grow(){
		age+=2;
	}
}
class gerbil extends rodent{
	public void eat(){
		System.out.println("gerbil eating");
	}
	public void grow(){
		age+=1;
	}
}

