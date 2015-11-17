package de.itagile.junit.gymnastik.abstractTests;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public abstract class AbstractListTests {

	private List<Object> list;

	@Before
	public void setUp() {
		list = getNewInstanceOfListUnderTest();
	}

	protected abstract List<Object> getNewInstanceOfListUnderTest();

	@Test
	public void whenAddingSthToAnEmptyListThenSizeIsOne() throws Exception {
		list.add(new Object());
	}

}
