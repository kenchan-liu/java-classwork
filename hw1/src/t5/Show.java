package t5;

public class Show {
	public static void main(String[] args){
		DataOnly data=new DataOnly();
		data.i=3;
		data.d=3.14;
		data.b=true;
		System.out.println(data.i);
		System.out.println(data.d);
		System.out.println(data.b);
	}
}
