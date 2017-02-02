/**
 * 
 */
package org.cvtc.shapes;

import java.util.Scanner;

import Models.Cuboid;
import Models.Cylinder;
import Models.Sphere;

/**
 * @author Eric Goettl
 *
 */
public class Shapes {

	
	public static void main(String[] args) {
		
		//Creating a scanner object to read user keyboard input.
		Scanner reader =  new Scanner(System.in);
		//Try to gather all float numbers from user
		//Only allow those.  Checking for format exceptions.
		try {
			System.out.println("Enter a width for an objects.");
			float enteredWidth = reader.nextFloat();
			
			System.out.println("Enter a height for an objects.");
			float enteredHeight = reader.nextFloat();
			
			System.out.println("Enter a depth for an object.");
			float enteredDepth = reader.nextFloat();

			System.out.println("Enter a radius for an object.");
			float enteredRadius = reader.nextFloat();
			
			//Check for numbers less than zero
			if (enteredHeight > 0 && enteredWidth > 0 && enteredDepth > 0 && enteredRadius > 0) {
				Cuboid newCuboid = new Cuboid(enteredWidth, enteredHeight, enteredDepth);
				Cylinder newCylinder = new Cylinder(enteredRadius, enteredHeight);
				Sphere newSphere = new Sphere(enteredRadius);
				
				newCuboid.render();
				newCylinder.render();
				newSphere.render();
			} else {
				System.out.println("All numbers need to be positive.");
			}
		} catch (Exception e) {
			System.out.println("Please make sure all enteries are numbers.");
			
		} 
		
		//Closing reader so no resource leaks exist.
		reader.close();
		
	}

}
