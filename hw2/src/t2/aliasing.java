package t2;

public class aliasing {
	String s1;
	public static void main(String[] args){
		aliasing a=new aliasing();
		aliasing b=new aliasing();
		a.s1="abc";
		b.s1="def";
		System.out.println(a.s1+' '+b.s1);
		a=b;
		System.out.println(a.s1+b.s1);
	}
}
