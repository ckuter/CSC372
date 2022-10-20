
public class Sphere extends Shape {
	private double radius;
	
	public Sphere(double r) {
		this.radius = r;
	}

	@Override
	public double surface_area() {
		double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		return surfaceArea;
	}

	@Override
	public double volume() {
		double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
	
	public String toString() {
		return "The surface area of the Sphere is: " + surface_area() + "\nThe volume of the Sphere is: " + volume() + "\n";
	}

}
