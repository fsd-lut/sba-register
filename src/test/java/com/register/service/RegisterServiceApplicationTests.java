package com.register.service;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class RegisterServiceApplicationTests extends TestCase {

	/**
	     * Create the test case
	     *
	     * @param testName name of the test case
	     */
	    public RegisterServiceApplicationTests( String testName )
	    {
	        super( testName );
	    }

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(RegisterServiceApplicationTests.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}
}
