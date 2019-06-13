package com.casestudy.MavenDemo;

import org.junit.Test;

import junit.framework.TestCase;

public class Junit_test extends TestCase {
	
	@Test
	public void test(){
		
	Even_num e = new Even_num();
	assertEquals("Number is even", true, e.is_Even(2));
	System.out.println("Number is even");
	}
}
