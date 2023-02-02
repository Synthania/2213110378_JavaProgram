
public class testPointD {

	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		System.out.println("Default x, y of Point2D = " + p1);
		p1.setXY(10, 11);
		System.out.println("x, y of Point2D = " + p1);
		System.out.println("x of Point2D is: " + p1.getXY()[0]);
		System.out.println("y of Point2D is: " + p1.getXY()[1]);

		Point3D p2 = new Point3D();
		System.out.println("Default x, y, z of Point2D = " + p2);
		p2.setXYZ(10, 12, 7);
		System.out.println("x of Point2D is: " + p2.getXY()[0]);
		System.out.println("y of Point2D is: " + p2.getXY()[1]);
		System.out.println("z of Point2D is: " + p2.getXY()[2]);
	}

}
