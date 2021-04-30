package t5;

public class dogTest {
	public static void main(String[] args){
		Dog spot=new Dog();
		Dog scruffy=new Dog();
		spot.name="spot";
		spot.says="Ruff";
		scruffy.SetName("scruffy");
		scruffy.says="Wurf";
		System.out.println("spot's name is "+spot.name+". "+"it says "+spot.says+".\n"+"scruffy's name is "+scruffy.name+". it says "+scruffy.says);
	}
	
}
