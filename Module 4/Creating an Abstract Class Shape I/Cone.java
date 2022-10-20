
public class Cone extends Shape {
	private double radius;
	private double height;
	
	public Cone(double r, double h) {
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
		double surfaceArea = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)) );
		return surfaceArea;
	}

	@Override
	public double volume() {
		double volume = Math.PI * Math.pow(radius, 2) * (height / 3);
		return volume;
	}
	
	public String toString() {
		return "The surface area of the Cone is: " + surface_area() + "\nThe volume of the Cone is: " + volume() + "\n";
	}

}
