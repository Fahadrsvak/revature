package areacheck;

public class Area {
	protected float side1;
	protected float side2;
	protected float area;
	public Area(float side1, float side2) {
		
		this.side1 = side1;
		this.side2 = side2;
	}
	public void areaCalc() {
		area=side1*side2;
		System.out.println("area is :"+area);
	}
	
	
}
