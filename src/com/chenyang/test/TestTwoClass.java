package com.chenyang.test;

import junit.extensions.TestSetup;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestTwoClass extends TestCase{

	public TestTwoClass(String name) {
		super(name);
	}
	
	public void testLongOne() {
		assertEquals(2 + 2, 4);
	}
	
	public void testLongTwo() {
		assertEquals(2 + 2, 4);
	}
	
	public void testShortOne() {
		assertEquals(2 + 2, 4);
	}
	
	public void testShortTwo() {
		assertEquals(2 + 2, 4);
	}
	
	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTest(new TestTwoClass("testShortOne"));
		suite.addTest(new TestTwoClass("testShortTwo"));
		TestSetup testWrapper = new TestSetup(suite){

			@Override
			protected void setUp() throws Exception {
				OneTimeSetup();
				super.setUp();
			}

			@Override
			protected void tearDown() throws Exception {
				OneTimeTearDown();
				super.tearDown();
			}
			
		};
		return testWrapper;
	}
	
	public static void OneTimeSetup() {
		System.out.println("OneTimeSetup");
	}
	
	public static void OneTimeTearDown() {
		System.out.println("OneTimeTearDown");
	}

}
