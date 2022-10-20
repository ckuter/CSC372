
public class ShapeArray {

	public static void main(String[] args) {
		Shape shapeArray[] = {new Sphere(2.5), new Cylinder(3.5, 4.5), new Cone(5.5, 6.5)};
		for (int i = 0; i < shapeArray.length; i++) {
			System.out.println(shapeArray[i]);
		}

	}

}
