/**
 * 
 */
package Models;

/**
 * @author ericgoettl
 *
 */

//Abstract class to be used as blueprint for subclasses.
//Abstract methods are declared here but will be defined
//in the subclasses.
public abstract class Shape {
	
	public abstract float surfaceArea();

	public abstract float volume();
	
	public abstract void render();
};