package t1;

public class gerbil {
	int gerbilNumber;
	gerbil(int x){gerbilNumber=x;}
	void hop(){
		System.out.println(gerbilNumber+" is hopping");
	}
	public static void main(String []args){
		gerbil g1=new gerbil(3);
		g1.hop();
	}
}
