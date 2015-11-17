package de.itagile.junit.gymnastik.customMatchers;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;

public class CustomMatcherTest {

	@Test
	public void customMatcherShouldWork() throws Exception {
		assertThat("aqswe", Matchers.not(MatchesRegex.matchesRegEx(".{6}")));
	}
}
