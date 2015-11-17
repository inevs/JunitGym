package de.itagile.junit.gymnastik;

import static org.junit.Assert.assertThat;

import java.util.Arrays;

import org.hamcrest.Matchers;
import org.junit.Test;

public class HamcrestMatchers {

	@Test
	public void testHamcrestMatchers() throws Exception {
		assertThat("a", Matchers.is("a"));
		assertThat("a", Matchers.equalTo("a"));
		assertThat("a", Matchers.isA(String.class));
		assertThat(String.class, Matchers.hasProperty("name"));
		assertThat(Arrays.asList(""), Matchers.hasItem(""));
		assertThat(Arrays.asList(""), Matchers.contains(""));
		assertThat("  a  ", Matchers.equalToIgnoringWhiteSpace("a"));
		assertThat("b", Matchers.greaterThan("a"));
	}
}
