/**
 * 
 */
package Models;

import org.cvtc.shapes.Dialog;

/**
 * @author ericgoettl
 *
 */
public class ShapeFactory {
	
	private Dialog dialog = getDialog();
	/*
	* @return the dialog
	 */
	private Dialog getDialog() {
		return dialog;
	}

	/**
	 * @param dialog the dialog to set
	 */
	@SuppressWarnings("unused")
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}

	public ShapeFactory() {
		
	}
	
	public  Shape makeCuboid( float height, float width, float depth) {
		return new Cuboid(dialog, height, width, depth);
	}
	
	public Shape makeCylinder(float radius, float height) {
		return new Cylinder(dialog, radius, height);
	}
	
	public Shape makeSphere(float radius) {
		return new Sphere(dialog, radius);
	}
	
}
