package velocitycalculate;
class velocitycalculator {
	static float v(float d,float t){
		return d/t;
	}
}
public class velocitycalculate{
	static float d=4.2f;
	static float t=3.21f;
	public static void main(String[] args){
		System.out.println("distance:"+d);
		System.out.println("time:"+t);
		System.out.println("velocity:"+velocitycalculator.v(d,t));
	}
}