package t5;
class A{
	A(){}
}
class B{
	B(){System.out.println("creating a B");}
}
class C extends A{
	B b=new B();
}
public class DefaultCons {
	public static void main(String []args){
		C c=new C();
	}
}
