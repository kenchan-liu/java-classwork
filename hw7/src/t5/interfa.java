package t5;
interface in{
	int v=1;
	public void change(int i);
	int num();
	void show();
}
public class interfa implements in{
	int v1;
	public void change(int i){
		v1=i;
	}
	public int num(){
		return v;
	}
	public void show(){
		System.out.println(v1);
	}
}
