package t4;

public class Anc {
	Anc(){System.out.println("initializing");}
}
class Child extends Anc{
	Child(){System.out.println("is born");}
}
class GrandC extends Anc{
	GrandC(){System.out.println("finally born");}
}
