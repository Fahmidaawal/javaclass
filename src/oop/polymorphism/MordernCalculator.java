package oop.polymorphism;

public class MordernCalculator extends Claculator {
	
	@Override
	public int areaOfLand(int a, int b, int c, int d) {
	int total = a+b+c+d-1;
	return total;
	}
	

}
