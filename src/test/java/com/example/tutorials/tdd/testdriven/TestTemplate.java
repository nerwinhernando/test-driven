package com.example.tutorials.tdd.testdriven;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTemplate {
	
	private Template template;
	
	@Before
	public void setUp() throws Exception {
		template = new Template("${one}, ${two}, ${three}");
		template.set("one", "1");
		template.set("two", "2");
		template.set("three", "3");		
	}

	@Test
	public void multipleVariables() throws Exception {
		assertEquals("1, 2, 3", template.evaluate());
	}
	
	@Test
	public void unknownVariablesAreIgnored() throws Exception {
		template.set("doesnotexist", "whatever");
		assertTemplateEvaluatesTo("1, 2, 3");
	}

	@Test
	public void missingValueRaisesException() throws Exception {
		try {
			new Template("${foo}").evaluate();
			fail("evaluate() should throw an exception if "
					+ "a variable was left without a value!");
		} catch (MissingValueException expected) {
			
		} 
	}
	
	private void assertTemplateEvaluatesTo(String expected) {
		assertEquals(expected, template.evaluate());
	}
}
