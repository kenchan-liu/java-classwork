package t19;
class StringTest{
	 StringTest(String...s){
		for (String str:s){
			System.out.println(str);
		}
	}
}
public class ChangeableString {
	public static void main(String [] args){
		String [] s1={"one","two","three"};
		String s2="four";
		String s3="five";
		StringTest t1=new StringTest(s1);
		StringTest t2=new StringTest(s2,s3);
	}
}
