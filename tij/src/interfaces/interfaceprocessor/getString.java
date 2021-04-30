package interfaces.interfaceprocessor;
class st implements Processor{
	getString get;
	public void getStringAdapt(getString g){
		get=g;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object process(Object input) {
		return get.process((String)input);
	}
}
class getString {
	static String process(String s){
	char[]c = new char[s.length()];
		if((s.length())%2 == 0) {
				for(int i = 0; i < s.length(); i += 2) {
					c[i] = s.charAt(i + 1);
					c[i + 1] = s.charAt(i);			
				}		
				return new String(c);
	}
	else {
		for(int i = 0; i < s.length() - 1; i += 2) {
			c[i] = s.charAt(i + 1);
			c[i + 1] = s.charAt(i);			
		}
		c[s.length() - 1] = s.charAt(s.length() - 1);		
		return new String(c);
	}
	}
	public static void main(String []args){
		Apply.process(new st(),"123456");
	}
}
