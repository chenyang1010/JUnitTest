package com.chenyang.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestThreeClass extends TestCase{
	
	public TestThreeClass(String method) {
		super(method);
	}

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(TestOneClass.class);
		suite.addTest(TestTwoClass.suite());
		return suite;
	}
}
