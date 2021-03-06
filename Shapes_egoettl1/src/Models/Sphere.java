/**
 * 
 */
package Models;

import javax.swing.JOptionPane;

import org.cvtc.shapes.Dialog;


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
	
	/**
	 * @param messageBox
	 */
	public Sphere(Dialog messageBox,float radius) {
		super(messageBox);
		setRadius(radius);
		// TODO Auto-generated constructor stub
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
	

	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!Sphere.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		return true;
		
	}

	@Override
	public int show(String message, String title) {
		JOptionPane.showMessageDialog(null,"The "+title+" you created has a radius of " 
				+ this.radius + ", a surface area of " + this.surfaceArea() 
				+ ", and a volume of " + this.volume()+ ".  " + message);
		return 0;
	}


}
