
package classt3;

public class findprime {
	static boolean isprime(int n){
		if(n==0||n==1)
			return false;
		if(n==2)
			return true;
		boolean a=true;
		for(int i=3;i<=n/2;i++){
			if(n%i==0)
				a=false;
		}
		return a;
	}
	public static void main(String []args){
		for(int i=1;i<=100;i++){
			if(isprime(i))
				System.out.println(i+"\n");
		}
	}
}
