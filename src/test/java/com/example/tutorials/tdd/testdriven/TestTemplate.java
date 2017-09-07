package com.example.tutorials.tdd.testdriven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTemplate {
	@Test
	public void oneVariable() throws Exception {
		Template template = new Template("Hello, ${name}");
		template.set("name", "Reader");
		assertEquals("Hello, Reader", template.evaluate());
	}
	
	@Test
	public void differentValue() throws Exception {
		Template template = new Template("Hello, ${name}");
		template.set("name", "someone else");
		assertEquals("Hello, someone else", template.evaluate());
	}
}
