package t9;

public class fibonacci {
	static int fib(int n){
		if(n==1)
			return 1;
		if(n==2)
			return 1;
		else return fib(n-1)+fib(n-2);
	}
	static void showfib(int n){
		for(int i=1;i<=n;i++){
			System.out.println(fib(i));
		}
	}
	public static void main(String []args){
		showfib(12);
	}
}
