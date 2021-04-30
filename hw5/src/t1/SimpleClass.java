package t1;
class S1{
	String s;
	S1(String q){s=q;}
	public String toString(){return s;}
	public void setString(String str){s=str;}
}
class S2 {
	S1 s;
	String str="str";
	public void check(){
		if(s==null)
			System.out.println("not initialized");
		else
			System.out.println(s.toString()+"initialized");
	}
	private S1 lazy(){
		if(s==null){
			s=new S1(str);
		}
		return s;
	}
	public void set(String ss){
		lazy().setString(ss);
	}
}
public class SimpleClass {
	public static void main(String []args){
		S2 Test=new S2();
		Test.check();
		Test.set("abc\n");
		Test.check();
	}
}
