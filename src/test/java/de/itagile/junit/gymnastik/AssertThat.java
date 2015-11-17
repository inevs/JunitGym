package de.itagile.junit.gymnastik;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class AssertThat {

	@Test
	public void shortCutForStringEqualsSameNewString() {
		Assert.assertThat("foo", CoreMatchers.is(new String("foo")));
		Assert.assertThat("foo", CoreMatchers.equalTo(new String("foo")));
	}

	@Test
	public void aStringIsNotEqualToADifferentString() {
		assertThat("foo", is(not(equalTo("bar"))));
	}
}
