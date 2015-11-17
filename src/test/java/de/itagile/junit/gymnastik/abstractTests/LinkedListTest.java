package de.itagile.junit.gymnastik.abstractTests;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest extends AbstractListTests {

	@Override
	protected List<Object> getNewInstanceOfListUnderTest() {
		return new LinkedList<Object>();
	}

}
