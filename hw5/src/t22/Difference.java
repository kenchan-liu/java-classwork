package t22;
import java.util.*;
class Test{
	Test(){System.out.println("Test");}
}
public class Difference {
	private String name;
	Difference(String str){name=str;System.out.println(str);}
	static final Test s=new Test();
	static final String fs="final";
	private static Random rand=new Random();
	final int i=rand.nextInt();
	private static int sfi=rand.nextInt();
	public String toString(){
		return (name+" "+i+" "+sfi+" "+fs);
	}
	public static void main(String[]args){
		Difference d1=new Difference("a");
		Difference d2=new Difference("b");
		Difference d3=new Difference("c");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}