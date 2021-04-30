
package v1;

public class cd {
	int id;
	String name;
	int remain;
	double price;
	cd(int i,String n,int r,double p){
		id=i;name=n;remain=r;price=p;
	}
	public String toString(){
		return "id:"+id+" "+"name:"+name+" remains:"+remain+" price:"+price;
	}
	public double getprice(){
		return price;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	public int getRemain(){
		return remain;
	}
	public void setRemain(int r){
		remain=r;
	}
	void setPrice(double p){
		price=p;
	}
}
