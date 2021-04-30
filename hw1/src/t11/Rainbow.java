package t11;

public class Rainbow {
	public static void main(String[] args) {
		AllTheColorsOfTheRainbow r1 = new AllTheColorsOfTheRainbow();
		System.out.println("r1.anIntegerRepresentingColors = " + r1.anIntegerRepresentingColors);
		r1.changeColor(7);
		r1.changeTheHueOfTheColor(9);
		System.out.println("After color change, atc.anIntegerRepresentingColors = " + r1.anIntegerRepresentingColors);
		System.out.println("atc.hue = " + r1.hue);	
	}
}
