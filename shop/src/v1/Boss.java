package v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boss {
	userbook u1=new userbook();
	cdbook c1=new cdbook();
	cdbook c=new cdbook();
	private static Boss instance;
	public static Boss getinstance(){
		if(instance==null){
			instance=new Boss();
		}
		return instance;
	}
	public int getUserChoice() throws IOException{
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a line");
		String s=stdin.readLine();
		return Integer.parseInt(s);
	}
	private void begin() throws IOException{
		while(true){
			printMainMenu();
			int choice=getUserChoice();
			switch(choice){
			case 1:
				userManager();break;				
			case 2:
				cdManager();break;
			case 3:
				rendCD();break;
			case 4:
				returnCD();break;
			case 5:
				chargeMoney();break;
			default:
				return;
			}
		}
	}
	private void chargeMoney() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your id");
		String s=stdin.readLine();
		int i1=Integer.parseInt(s);
		BufferedReader stdin3=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your money");
		double p=Double.parseDouble(stdin3.readLine());
		u1.addMoney(i1,p);
	}
	private void returnCD() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter cd's id");
		String s=stdin.readLine();
		int i1=Integer.parseInt(s);
		BufferedReader stdin0=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("how many");
		String s0=stdin0.readLine();
		int i2=Integer.parseInt(s0);
		if(c1.find(i1)==null){
			BufferedReader stdin4=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter cd's name");
			String name=stdin4.readLine();
			BufferedReader stdin2=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("how much");
			String pri=stdin2.readLine();
			int i4=Integer.parseInt(pri);
			c1.add(i1,i2,i4,name);
		}
		else
			c1.add(i1,i2,c1.find(i1).getprice(),c1.find(i1).getName());
		BufferedReader stdin1=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter user's id");
		String n=stdin1.readLine();
		int i3=Integer.parseInt(n);
		u1.find(i3).returnCd(i1,i2);
	}
	private void rendCD() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter cd's id");
		String s=stdin.readLine();
		int i1=Integer.parseInt(s);
		BufferedReader stdin0=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("how many");
		String s0=stdin0.readLine();
		int i2=Integer.parseInt(s0);
		if(c1.find(i1)==null||c1.find(i1).getRemain()<i2){
			System.out.println("no remain!");
			return;
		}
		else
			c1.remove(i1,i2,c1.find(i1).getprice());
		BufferedReader stdin1=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter user's id");
		String n=stdin1.readLine();
		int i3=Integer.parseInt(n);
		u1.find(i3).rentCd(i1,i2);
	}
	void printMainMenu(){
		System.out.println("1.member management");
		System.out.println("2.cd management");
		System.out.println("3.borrow a cd");
		System.out.println("4.return a cd");
		System.out.println("5.charge money");
		System.out.println("6.return");
	}
	void userManager() throws IOException {
		while(true){
			printUserMenu();
			int choice=getUserChoice();
			switch(choice){
			case 1:
				signforacc();break;
			case 2:
				deleteacc();break;
			case 4:
				u1.list();break;
			case 5:
				showCD();break;
			case 6:
				showMoney();break;
			default:
				return;
			}
		}
	}
	private void showMoney() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader stdin1=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter user's id");
		String n=stdin1.readLine();
		int i3=Integer.parseInt(n);
		System.out.println("you account has"+u1.find(i3).getMoney());
	}
	private void showCD() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader stdin1=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter user's id");
		String n=stdin1.readLine();
		int i3=Integer.parseInt(n);
		u1.find(i3).listCd();
	}
	void cdManager() throws IOException{
		printCdMenu();
		int choice=getUserChoice();
		switch(choice){
		case 1:
			addCD();break;
		case 2:
			c1.list();break;
		case 3:
			changePrice();break;
		default:
			return;
		}
	}
	private void changePrice() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter cd's id");
		String n=stdin.readLine();
		int i=Integer.parseInt(n);
		if(c1.find(i)!=null){
			BufferedReader stdin1=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter cd's id");
			String p=stdin1.readLine();
			double pri=Double.parseDouble(p);
			c1.find(i).setPrice(pri);
		}
		else
			System.out.println("there's no such cd");
	}
	private void addCD() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader stdin1=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter cd's name");
		String n=stdin1.readLine();
		BufferedReader stdin2=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter id");
		int i=Integer.parseInt(stdin2.readLine());
		BufferedReader stdin3=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("how many");
		int i0=Integer.parseInt(stdin3.readLine());
		if(c1.find(i)==null){
			BufferedReader stdin4=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the price");
			double p=Double.parseDouble(stdin4.readLine());
			c1.add(i, i0,p , n);
			c.add(i, 0, p, n);
		}
		else{
			c1.add(i,i0,c1.find(i).getprice(),n);
		}
		
	}
	private void printCdMenu() {
		// TODO Auto-generated method stub
		System.out.println("1.new cd");
		System.out.println("2.show all CDs");
		System.out.println("3.change the price");
		System.out.println("4.return");
	}
	private void deleteacc() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader stdin2=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter id");
		System.out.println(stdin2.readLine());
		int i=Integer.parseInt(stdin2.readLine());
		u1.remove(i);
	}
	private void signforacc() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader stdin1=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name");
		String n=stdin1.readLine();
		BufferedReader stdin2=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter id");
		int i=Integer.parseInt(stdin2.readLine());
		BufferedReader stdin3=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your money");
		double p=Double.parseDouble(stdin3.readLine());
		u1.add(i,n,p);
		u1.find(i).getBook(c);
	}
	void printUserMenu(){
		System.out.println("1.sign up");
		System.out.println("2.delete");
		System.out.println("3.return");
		System.out.println("4.show all members");
		System.out.println("5.which cd has you borrowed");
		System.out.println("6.accoount money");
	}
	public static void main(String[]args) throws IOException{
		Boss.getinstance().begin();
	}
}
