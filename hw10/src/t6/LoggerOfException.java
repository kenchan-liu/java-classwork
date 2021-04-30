package t6;

import java.util.logging.Logger;
import java.io.*;
class Ex1 extends Exception{
	private static Logger logger=Logger.getLogger("LoggingExCEPTION");
	public Ex1(){
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
class Ex2 extends Exception{
	private static Logger logger2=Logger.getLogger("LoggingExCEPTION");
	public Ex2(){
		StringWriter trace=new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger2.severe(trace.toString());
	}
}
public class LoggerOfException {
	static void f() throws Ex1,Ex2{
		throw new Ex1();
	}
	static void f1()throws Ex2{
		throw new Ex2();
	}
	public static void main(String[]args) throws Ex2,Ex1{
		try{
			f();
		}
		catch(Ex1 e1){
		}
		try{
			f1();
		}
		catch(Ex2 e2){
		}
	}
}
