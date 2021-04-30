package t14;
import java.util.*;
public class compare {
	static void f(String s1,String s2){
		if(s1==s2)
			System.out.println("true");
		if(s1!=s2)
			System.out.println("false");
	}
	public static void main(String[] args){
		String a="123";
		String b="qwetr";
		String c="qwetr";
		f(a,b);
		System.out.println(a.equals(b));
		f(b,c);
		System.out.println(b.equals(c));
	}
}
