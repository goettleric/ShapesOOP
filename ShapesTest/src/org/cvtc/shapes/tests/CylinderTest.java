package org.cvtc.shapes.tests;


import Models.Cylinder;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import junitparams.*;

@RunWith(JUnitParamsRunner.class)

public class CylinderTest {
	
	MessageBoxSub messageBox = new MessageBoxSub();
	@Test
	@Parameters({
		"5,6",
		"7,9",
		"8,2.3"
	})
	public void testSurfaceArea(float x, float y) {
		//1. Arrange
		Cylinder cylinder = new Cylinder(messageBox, x,y);
		float expected = (2 * (float)Math.PI * (float)Math.pow(x, 2)) + (2 * (float)Math.PI * x * y);
		//2. Act
		float actual = cylinder.surfaceArea();
		//3. Assert
		assertEquals(expected, actual, 0.0001);
	}

	@Test
	@Parameters({
		"9,6",
		"6.1, 5",
		"1,2"
	})
	public void testVolume(float x, float y) {
		//1. Arrange
		Cylinder cylinder = new Cylinder(messageBox, x, y);
		float expected = ((float)Math.PI * (float)Math.pow(x,2) * y);
		//2. Act
		float actual = cylinder.volume();
		//3. Assert
		assertEquals(expected, actual, 0.0001);
	}

	@Test
	@Parameters({
		"10, 40"
	})
	public void testGetRadius(float x, float y) {
		//1. Arrange
		Cylinder cylinder = new Cylinder(messageBox, x, y);
		float expected = x;
		//2. Act
		float actual = cylinder.getRadius();
		//3. Assert
		assertEquals(expected, actual, 0.0001);
	}

	@Test
	@Parameters({
		"2,3"
	})
	public void testGetHeight(float x, float y) {
		//1. Arrange
		Cylinder cylinder = new Cylinder(messageBox, x, y);
		float expected = y;
		//2. Act
		float actual = cylinder.getHeight();
		//3. Assert
		assertEquals(expected, actual, 0.0001);
	
	}

	@Test
	@Parameters({
		"7,20"
	})
	public void testCylinder(float x, float y) {
		Cylinder expected = new Cylinder(messageBox, x,y);
		//2. Act
		Cylinder actual = new Cylinder(messageBox, expected.getRadius(), expected.getHeight());
		//3. Assert
		assertEquals(expected, actual);
	}
	
	@Test(expected = Exception.class)
	@Parameters({
		"e,-3"
	})
	public void testExceptions(float x, float y) {
		//1. Arrange
		@SuppressWarnings("unused")
		Cylinder cylinder = new Cylinder(messageBox, x,y);
		
	}

}
