package de.itagile.junit.gymnastik;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

public class Comments {
	@Test
	@Ignore
	public void aStringIsNotEqualToADifferentString() {
		assertThat("two different strings may not be equal", "foo", is(not(equalTo("foo"))));
	}

	@Test
	@Ignore
	public void sameStringsMustBeEqual() {
		Assert.assertEquals("same Strings must be equal", "foo", "bar");
	}
}
