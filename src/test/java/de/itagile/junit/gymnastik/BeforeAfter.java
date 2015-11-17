package de.itagile.junit.gymnastik;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAfter {

	private int i;
	private static int staticI;

	@Before
	public void setUp() {
		System.out.println("Before gets called before every test");
	}

	@After
	public void tearDown() {
		System.out.println("After gets called after every test");
	}

	@BeforeClass
	public static void setUpClass() {
		System.out.println("BeforeClass gets called before all test");
	}

	@AfterClass
	public static void tearDownClass() {
		System.out.println("AfterClass gets called after all test");
	}

	@Test
	public void incInstanceVariable() throws Exception {
		i++;
		staticI++;
		System.out.println(i);
		System.out.println("static: " + staticI);
	}

	@Test
	public void incInstanceVariableAgain() throws Exception {
		i++;
		staticI++;
		System.out.println(i);
		System.out.println("static: " + staticI);
	}

}
