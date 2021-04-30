package fib;
class Fib implements Runnable{
	int n;
	public Fib(int a){
		n=a;
	}
	int fib(int n){
		if(n==1||n==2){
			return 1;
		}
		else
			return fib(n-1)+fib(n-2);
	}
	public void run(){
		for(int i=1;i<=n;i++){
			System.out.println(fib(i));
		}
	}
}
public class real_fib {
	public static void main(String[]args){
		Thread f1=new Thread(new Fib(15));
		f1.start();
	}
}
