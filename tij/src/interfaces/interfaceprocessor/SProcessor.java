package interfaces.interfaceprocessor;
public class SProcessor {
	public static void main(String[]args){
		String s = "hahahahs";
		Apply.process(new StringAdapter(new getString()), s);
	}
}

class StringAdapter implements Processor {
	public String name() { return "StringAdapter"; }
	getString gs;
	public StringAdapter(getString gs1) {
		gs = gs1;
	}
	public String process(Object input) {
		return gs.process((String)input);
	}	
}

