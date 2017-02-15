package org.cvtc.shapes.tests;

import Models.Cuboid;
import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import junitparams.*;


@RunWith(JUnitParamsRunner.class)

public class CuboidTest {


	@Test
	@Parameters({
		
		"2,3,1",
		"5,6,2",
		"10,2,5"
	})
	public void testSurfaceArea(float x, float y, float z) {
		//1. Arrange
		Cuboid cuboid = new Cuboid(x, y, z);
		float expected =  2 * ((x*y) + (z*y) + (y*x));
		//2. Act
		float actual = cuboid.surfaceArea();
		//3. Assert
		
		assertEquals(expected, actual, 0.0001);
	}

	@Test
	@Parameters({
		
		"2,3,1",
		"5,6,2",
		"10,2,5"
	})
	public void testVolume(float x, float y, float z) {
		//1. Arrange
		Cuboid cuboid = new Cuboid(x, y, z);
		float expected = x * y * z;
		//2. Act
		float actual = cuboid.volume();
		//3. Assert
		assertEquals(expected, actual, 0.0001);
	}
	
	@Test
	@Parameters({
		"2,5,1"
	})
	public void testGetHeight(float x, float y, float z) {
		//1. Arrange
		Cuboid cuboid = new Cuboid(x,y,z);
		float expected = y;
		//2. Act
		float actual = cuboid.getHeight();
		//3. Assert
		assertEquals(expected, actual, 0.0001);
	}
	
	@Test
	@Parameters({
		"4,1,5"
	})
	public void testGetDepth(float x, float y, float z) {
		//1. Arrange
		Cuboid cuboid = new Cuboid(x,y,z);
		float expected = z;
		//2. Act
		float actual = cuboid.getDepth();
		//3. Assert
		assertEquals(expected, actual, 0.0001);
	}

	@Test
	@Parameters({
		"5,3,10"
	})
	public void testGetWidth(float x, float y, float z) {
		//1. Arrange
		Cuboid cuboid = new Cuboid(x,y,z);
		float expected = x;
		//2. Act
		float actual = cuboid.getWidth();
		//3. Assert
		assertEquals(expected, actual, 0.0001);
	}

	@Test
	@Parameters({
		"5,1,2"
	})
	public void testCuboid(float x, float y, float z) {
		//1. Arrange
		Cuboid expected = new Cuboid(x,y,z);
		//2. Act
		Cuboid actual = new Cuboid(expected.getWidth(), expected.getHeight(), expected.getDepth());
		//3. Assert
		assertEquals(expected, actual);
	}
	
	@Test(expected = Exception.class)
	@Parameters({
		"e,3,z"
	})
	public void testExceptions(float x, float y, float z) {
		//1. Arrange
		@SuppressWarnings("unused")
		Cuboid cuboid = new Cuboid(x,y,z);
		
	}
}
