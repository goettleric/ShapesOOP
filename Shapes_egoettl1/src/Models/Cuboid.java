/**
 * 
 */
package Models;

import javax.swing.JOptionPane;

import org.cvtc.shapes.Dialog;

/**
 * @author Eric Goettl
 *
 */
//Subclass that inherits from Shape
public class Cuboid extends Shape {

	//Class properties
	private float height = (float) 0.0;
	private float depth = (float) 0.0;
	private float width = (float) 0.0;
	
	//Getters and Setters for the properties
	public float getHeight() {
		return height;
	}

	private void setHeight(float height) {
		this.height = height;
	}
	
	public float getDepth() {
		return depth;
	}
	
	private void setDepth(float depth) {
		this.depth = depth;
	}
	
	public float getWidth() {
		return width;
	}

	private void setWidth(float width) {
		this.width = width;
	}
	
	/**
	 * @param messageBox
	 * 
	 * @param messageBox
	 * @param height
	 * @param depth
	 * @param width
	 */
	public Cuboid(Dialog messageBox,float width, float height, float depth) {
		super(messageBox);
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	}
	

	//Method that calculates the surface area of a Cuboid
	@Override
	public float surfaceArea() {
		// TSA = 2 (wd + dh + hw) 
		float surfaceArea = 2 * ((width*height) + (depth*height) + (height*width));
		return surfaceArea;
	}
	
	//Method that calculated the volume of a Cuboid
	@Override
	public float volume() {
		// Volume = length * depth * height
		float volume = width * depth * height;
		return volume;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!Cuboid.class.isAssignableFrom(obj.getClass())) {
			return false;
		}
		return true;
		
	}

	@Override
	public int show(String message, String title) {
		JOptionPane.showMessageDialog(null, "The"+ title +" has a width of " 
				+ this.width + ", a height of " + this.height + ", a depth of " 
				+ this.depth + ", a surface area of " + this.surfaceArea() 
				+ ", and a volume of " + this.volume() + ". " + message);
		
		return 0;
	}


}
