package v1;

public class userbook {
	user[] users=new user[1000];
	void add(int i,String n,double f){
		while(users[i]!=null)
			i++;
		users[i]=new user(i,n,f);
	}
	void remove(int i){
		users[i]=null;
	}
	user find(int i){
		return users[i];
	}
	void list(){
		for(int i=0;i<1000;i++){
			if(users[i]!=null){
				System.out.println("name:"+users[i].getName()+" money:"+users[i].getMoney());
			}
		}
	}
	void addMoney(int i,double f){
		users[i].setMoney(f+users[i].getMoney());
	}
	public String toString(){
		int count=0;
		for(int i=0;i<1000;i++){
			if(users[i]!=null)
				count++;
		}
		return "people:"+count;
	}
}
