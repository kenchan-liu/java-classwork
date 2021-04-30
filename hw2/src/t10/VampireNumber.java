package t10;

public class VampireNumber {
	static void find(int n){
		int m=n;
		int a[]=new int[4];
		int b[]=new int[4];
		int q=0;
		while(m>0){
			a[q]=m%10;
			m/=10;
			q++;
		}
		label:
		for(int i=0;i<=3;i++){
			for(int w=0;w<=3;w++)
				b[w]=0;
			b[i]=1;int t1,t2,t3,t4;
			for(int j=0;j<=3;j++){
				if(b[j]==0){
					t1=10*a[i]+a[j];
					t2=10*a[j]+a[i];
					b[j]=1;
				for(int i1=0;i1<=3;i1++){
					if(b[i1]==0){
						b[i1]=1;
						for(int j1=0;j1<=3;j1++){
							if(b[j1]==0){
								t3=10*a[i1]+a[j1];
								t4=10*a[j1]+a[i1];
								if(n==t1*t3||n==t1*t4||n==t2*t3||n==t2*t4){
									System.out.println(n);
									break label;
								}
							}
						}
					}
				}
			}
		}
	}
	}
	public static void main(String[] args){
		for(int i=1000;i<=9999;i++)
			find(i);
		
}
}
