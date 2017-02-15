/**
 * 
 */
package org.cvtc.shapes.tests;


import Models.Sphere;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import junitparams.*;

/**
 * @author Eric Goettl
 *
 */
@RunWith(JUnitParamsRunner.class)

public class SphereTest {

	/**
	 * Test method for {@link Models.Sphere#surfaceArea()}.
	 */
	@Test
	@Parameters({
		"3",
		"9",
		"0.1"
	})
	public void testSurfaceArea(float x) {
		//1. Arrange
		Sphere sphere = new Sphere(x);
		float expected = (4 * (float)Math.PI * (float)Math.pow(x, 2));
		//2. Act
		float actual = sphere.surfaceArea();
		//3. Assert
		assertEquals(expected, actual, 0.0001);
	}

	/**
	 * Test method for {@link Models.Sphere#volume()}.
	 */
	@Test
	@Parameters({
		"5.4",
		"2",
		"6.8"
	})
	public void testVolume(float x) {
		//1. Arrange
		Sphere sphere = new Sphere(x);
		float expected = ((4/3) * (float)Math.PI * (float)Math.pow(x, 3));
		//2. Act
		float actual = sphere.volume();
		//3. Assert
		assertEquals(expected, actual, 0.0001);
	}

	/**
	 * Test method for {@link Models.Sphere#getRadius()}.
	 */
	@Test
	@Parameters({
		"4.8"
	})
	public void testGetRadius(float x) {
		//1. Arrange
		Sphere sphere = new Sphere(x);
		float expected = x;
		//2. Act
		float actual = sphere.getRadius();
		//3. Assert
		assertEquals(expected, actual, 0.0001);
	}

	/**
	 * Test method for {@link Models.Sphere#Sphere(float)}.
	 */
	@Test
	@Parameters({
		"3"
	})
	public void testSphere(float x) {
		//1. Arrange
		Sphere expected = new Sphere(x);
		//2. Act
		Sphere actual = new Sphere(expected.getRadius());
		//3. Assert
		assertEquals(expected, actual);
	}
	
	@Test(expected = Exception.class)
	@Parameters({
		"e"
	})
	public void testExceptions(float x) {
		//1. Arrange
		@SuppressWarnings("unused")
		Sphere sphere = new Sphere(x);
		
	}

}
