package com.example.tutorials.tdd.testdriven;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestTemplateParse {
		
	@Test
	public void emptyTemplateRendersAsEmptyString() throws Exception {
		List<String> segments = parse("");
		assertSegments(segments, "");
	}
	
	@Test
	public void templateWithOnlyPlainText() throws Exception {
		List<String> segments = parse("plain text only");
		assertSegments(segments, "plain text only");
	}
	
	@Test
	public void parsingMultipleVariables() throws Exception {
		List<String> segments = parse("${a}:${b}:${c}");
		assertSegments(segments, "${a}", ":", "${b}", ":", "${c}");		
	}

	private List<String> parse(String template) {
		return new TemplateParse().parse(template);
	}
	
	private void assertSegments(List<? extends Object> actual, Object ... expected) {
		assertEquals("Number of segments doesn't match.", expected.length, actual.size());
		assertEquals(Arrays.asList(expected), actual);		
	}

}
