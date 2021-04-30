package classt2;
import java.util.*;
public class random {
	public static void main(String[] args){
		int x=0;
		Random r=new Random(1);
		for(int i=1;i<=25;i++){
			int q=r.nextInt(100);
			if(x==0){
				x=q;
				System.out.println("first");
			}
			else if(q<x){
				System.out.println("smaller");
			}
			else if(q==x){
				System.out.println("equal");
			}
			else
				System.out.println("larger");
		}
	}
}
