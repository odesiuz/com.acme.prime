package com.acme.prime.eval.provider;

import junit.framework.TestCase;

/*
 * 
 * 
 * 
 */

public class EvalImplTest extends TestCase {
	
	/*
	 * A test for the Eval api provider
	 * 
	 * 
	 */
	
	public void testSimple() throws Exception {
		EvalImpl t = new EvalImpl();
		assertEquals(3.0, t.eval("1 * 3"));
	}
}
