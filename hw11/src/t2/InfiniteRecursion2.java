package t2;
import java.util.*;

public class InfiniteRecursion2 {	
	public String toString() {
		return " InfiniteRecursion address: " + super.toString() + "\n";
	}
	public static void main(String[] args) {
		List<InfiniteRecursion2> v = new ArrayList<InfiniteRecursion2>();
		for(int i = 0; i < 10; i++)
			v.add(new InfiniteRecursion2());
		System.out.println(v);
	}
}