package t2;
class cleanser{
	private String s="cleanser";
	public void append(String a){
		s+=a;
	}
	public void dilute(){append("dilute()");}
	public void apply(){append("apply()");}
	public void scrub(){append("scrub");}
	public String toString(){return s;}
}
public class Detergent extends cleanser{
	public void scrub(){
		append("Detergent.sccrub()");
		super.scrub();
	}
	public void foam(){
		append("foam");
	}
}
