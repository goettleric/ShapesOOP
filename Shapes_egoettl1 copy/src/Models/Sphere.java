/**
 * 
 */
package Models;

import javax.swing.JOptionPane;

/**
 * @author ericgoettl
 *
**/
//Subclass that inherits from Shape
public class Sphere extends Shape {
	
	//Class properties
	private float radius = (float) 0.0;
	
	//Getters and setters for class properties
	public float getRadius() {
		return radius;
	}

	private void setRadius(float radius) {
		this.radius = radius;
	}
	
	//Constructor for Sphere
	public Sphere(float radius) {
		setRadius(radius);
	}
	
	//Method  used to find the surface area of a Sphere
	@Override
	public float surfaceArea() {
		//SA = 4 * pie * radius2
		float surfaceArea =  (4 * (float)Math.PI * (float)Math.pow(radius, 2));
		return surfaceArea;
	}
	
	//Method used to find the volume of a Sphere
	@Override
	public float volume() {
		//Volume = 4/3 * pie * radius3
		float volume = ((4/3) * (float)Math.PI * (float)Math.pow(radius, 3));
		return volume;
	}
	
	//Method used to display a customized message with details about the object
	//created from this subclass.
	@Override
	public void render() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"The Sphere you created has a radius of " 
				+ this.radius + ", a surface area of " + this.surfaceArea() 
				+ ", and a volume of " + this.volume());
	}

}
