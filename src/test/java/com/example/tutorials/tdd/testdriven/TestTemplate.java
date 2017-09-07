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
	public void differentTemplate() throws Exception {
		Template template = new Template("Hi, ${name}");
		template.set("name", "someone else");
		assertEquals("Hi, someone else", template.evaluate());
	}
}
