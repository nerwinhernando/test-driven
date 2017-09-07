package com.example.tutorials.tdd.testdriven;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestVariableSegment {
	@Test
	public void variableEvaluatesToItsValue() throws Exception {
		Map<String, String> variables = new HashMap<String, String>();
		String name = "myvar";
		String value = "myvalue";
		variables.put(name, value);
		assertEquals(value, new Variable(name).evaluate(variables));
	}
}
