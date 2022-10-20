
public class Cylinder extends Shape {
	private double radius;
	private double height;
	
	public Cylinder(double r, double h) {
		this.radius = r;
		this.height = h;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r) {
		this.radius = r;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double h) {
		this.height = h;
	}

	@Override
	public double surface_area() {
		double surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
		return surfaceArea;
	}

	@Override
	public double volume() {
		double volume = Math.PI * Math.pow(radius, 2) * height;
		return volume;
	}
	
	public String toString() {
		return "The surface area of the Cylinder is: " + surface_area() + "\nThe volume of the Cylinder is: " + volume() + "\n";
	}

}
