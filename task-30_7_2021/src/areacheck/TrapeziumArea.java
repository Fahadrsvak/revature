package areacheck;

public class TrapeziumArea extends Area {
	protected float height;
	public  TrapeziumArea(float side1,float side2,float height) {
		super(side1, side2);
		this.height=height;
	}
	public void areaCalc() {
		area=(side1+side2)*height/2;
		System.out.println("Area of the Trapezium is:"+area);
	}
}
