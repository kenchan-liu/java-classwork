package v1;

public class user {
	String name;
	double fund;
	int id;
	cdbook u;
	user(int i,String n,double f){
		id=i;name=n;fund=f;
	}
	public String toString(){
		return "id:"+id+" name:"+name+" money:"+fund;
	}
	public String getName(){
		return name;
	}
	public int getId(){
		return id;
	}
	double getMoney(){
		return fund;
	}
	void getBook(cdbook x){
		u=x;
	}
	public void setMoney(double f){
		fund=f;
	}
	void listCd(){
		for(int i=0;i<1000;i++){
			if(u.find(i)!=null&&u.find(i).getRemain()!=0)
			System.out.println("unreturned cd "+u.find(i).getName()+" "+u.find(i).getRemain());
		}
	}
	void returnCd(int i,int num){
		if(u.find(i).getRemain()!=0)
			u.find(i).setRemain(u.find(i).getRemain()-num);
		else
			System.out.println("you haven't borrowed it");
	}
	void rentCd(int i,int num){
		if(u.find(i).getRemain()==0)
			u.find(i).setRemain(num);
		else{
			u.find(i).setRemain(u.find(i).getRemain()+num);
			fund=fund-u.find(i).getprice()*num;
		}
	}
}
