package t1;

public class Cycle {
	private String name = "Cycle";
	public static void travel(Cycle c) {
		System.out.println("Cycle.ride() " + c);
	}
	public String toString() {
		return this.name;
	}
}
