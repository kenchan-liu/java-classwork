package t1;

public class Biking {
	public static void ride(Cycle c) {
		Cycle.travel(c);
	}
	public static void main(String[] args) {
		Unicycle u = new Unicycle();
		Bicycle b = new Bicycle();
		ride(u);
		ride(b);
	}
}
