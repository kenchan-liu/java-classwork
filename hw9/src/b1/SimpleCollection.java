package b1;
import java.util.*;
public class SimpleCollection {
	public static void main(String[] args){
		Set<Integer>c=new HashSet<Integer>();
		for(int i=0;i<10;i++)
			c.add(i);
		for(Integer i:c)
			System.out.print(i+", ");
	}
}
