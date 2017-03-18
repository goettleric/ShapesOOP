
import Models.Shape;
import Models.ShapeFactory;


/**
 * 
 */

/**
 * @author Eric
 *
 */
public class ShapeFactoryTests {

		static float enteredRadius = 1;
		static float enteredHeight = 2;
		static float enteredWidth = 4;
	
	
	public static void main(String[] args) {
	
		
		ShapeFactory shapesFactory = new ShapeFactory();
		Shape newCuboid = shapesFactory.makeCuboid(enteredHeight, enteredWidth, enteredRadius);
		Shape newCylinder = shapesFactory.makeCylinder(enteredRadius, enteredHeight);
		Shape newSphere = shapesFactory.makeSphere(enteredRadius);
		
		System.out.print("The new cuboid has a volume of " + newCuboid.volume() + " a surface area of " + newCuboid.surfaceArea() + "\n");
		System.out.print("The new cylinder has a volume of " + newCylinder.volume() + " a surface area " + newCylinder.surfaceArea() + "\n" );
		System.out.print("The new sphere has a volume of " + newSphere.volume() + " a surface area " + newSphere.volume() + "\n");
	}

}
