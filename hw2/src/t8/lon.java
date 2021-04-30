package t8;

public class lon {
	public static void main(String[] args){
		long a=0x2FAB;
		long b=072513;
		System.out.println(Long.toBinaryString(a)+"  "+Long.toBinaryString(b));
		a+=0x3E;
		b+=030;
		System.out.println(Long.toBinaryString(a)+"  "+Long.toBinaryString(b));
	}
}
