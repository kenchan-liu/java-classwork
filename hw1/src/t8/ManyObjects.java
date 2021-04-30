package t8;
public class ManyObjects {
	public static void main(String []args){
		StaticTest a=new StaticTest();
		System.out.println("Static.i="+StaticTest.i);
		a.i+=1;
		System.out.println("a.i="+a.i);
		StaticTest b=new StaticTest();
		System.out.println("b.i="+b.i);
		StaticTest c=new StaticTest();
		c.i+=1;
		System.out.println("a.i="+a.i);
	}
}	
