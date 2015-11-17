package de.itagile.junit.gymnastik.rules;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

public class CutomRuleTest {

	@Rule
	public LoggingRule loggingRule = new LoggingRule();

	@Test
	public void test() {
		Assert.assertTrue(true);
	}

}
