package oop.polymorphism;

public class TeasCalculator {

	public static void main(String[] args) {
		Claculator ca = new Claculator();
		System.out.println(ca.areaOfLand(7, 3));
		System.out.println(ca.areaOfLand(2, 5, 10, 1));
		System.out.println(ca.areaOfLand(7, 3, 10));
		
		MordernCalculator ca1 = new MordernCalculator();
		System.out.println(ca1.areaOfLand(2, 5, 10, 1));
		
		
		
	}

}
