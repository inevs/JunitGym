package de.itagile.junit.gymnastik.abstractTests;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest extends AbstractListTests {

	@Override
	protected List<Object> getNewInstanceOfListUnderTest() {
		return new ArrayList<Object>();
	}

}
