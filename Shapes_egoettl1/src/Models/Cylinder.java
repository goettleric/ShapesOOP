/**
 * 
 */
package Models;

import javax.swing.JOptionPane;

import org.cvtc.shapes.Dialog;

/**
 * @author ericgoettl
 *
 */
//Subclass that inherits from Shape
public class Cylinder extends Shape {

	//class properties
	private float radius = (float) 0.0;
	private float height = (float) 0.0;
	
	//getter and setters for class properties
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = radius;
	}

	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		this.height = height;
	}
	
	
	/**
	 * @param messageBox
	 * @param radius
	 * @param height
	 */
	public Cylinder(Dialog messageBox, float radius, float height) {
		super(messageBox);
		setRadius(radius);
		setHeight(height);
	}

	
	//Method used to calculate the surface area of a Cylinder
	@Override
	public float surfaceArea() {
		// SA = (2 * pie * r2) + (2 * pie * radius * height)
		float surfaceArea = (2 * (float)Math.PI * (float)Math.pow(radius, 2)) + (2 * (float)Math.PI * radius * height);
		return surfaceArea;
	}
	
	//Method used to calculate the volume of a Cylinder
	@Override
	public float volume() {
		// Volume = pie * r2 * height
		float volume = ((float)Math.PI * (float)Math.pow(radius,2) * height);
		return volume;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!Cylinder.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		return true;
		
	}
	
	//Method used to show a customized message with details about the object
	//created from this subclass.
	@Override
	public int show(String message, String title) {
		JOptionPane.showMessageDialog(null, "The "+title+" has a radius of " 
				+ this.radius + ", a height of " + this.height +   ", a surface area of " + this.surfaceArea() 
				+ ",and a volume of " + this.volume() + ".  " +message) ;

		return 0;
	}


}
