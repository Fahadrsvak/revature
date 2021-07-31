package areacheck;

public class SquareArea  extends Area{

	public SquareArea(float side1, float side2) {
		super(side1, side2);
		
	}
	public void areaCalc() {
		area=side1*side1;
		System.out.println("Area of the square is:"+area);
	}

}
