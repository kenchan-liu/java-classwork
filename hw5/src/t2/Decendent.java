package t2;

public class Decendent extends Detergent{
	public void scrub(){
		append("the_real_scrub()");
	}
	public void sterilized(){
		append("sss");
	}
	public void main(String []args){
		Decendent x=new Decendent();
		x.dilute();
		x.sterilized();
		x.scrub();
		System.out.println(x.toString());
	}
}
