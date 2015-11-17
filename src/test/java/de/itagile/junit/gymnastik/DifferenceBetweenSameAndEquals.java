package de.itagile.junit.gymnastik;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class DifferenceBetweenSameAndEquals {

	@Test
	public void twoNewCreatedStringsAreNotSame() {
		Assert.assertNotSame(new String("foo"), new String("foo"));
		Assert.assertThat(new String("foo"), is(not(sameInstance(new String("foo")))));

	}

	@Test
	public void sameTwoNewCreatedStringsAreEuqal() {
		Assert.assertEquals(new String("foo"), new String("foo"));
		Assert.assertThat(new String("foo"), CoreMatchers.is(new String("foo")));
	}

}
