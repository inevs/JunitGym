package de.itagile.junit.gymnastik;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NamingTestMethods {

	@Test
	// sollte zusammen mit dem Testnamen schön zu lesen sein
	public void addsTwoNumbers() {
		assertThat(add(1, 1), is(2));
	}

	@Test
	// [given] when then pattern
	public void whenMultiplingTwoNegativeNumbersThenTheResultIsPositive() {
		assertThat(mult(-1, -1), is(1));
	}

	@Test
	// nicht präferierte Benennung.
	// Geht eher auf Funktionalität als auf Verhalten der zu testenden Unit
	public void add_twoNegativeNumbers_returnsSumOfTwoNumbers() {
		assertThat(add(1, 1), is(2));
	}

	private int add(int a, int b) {
		return a + b;
	}

	private int mult(int a, int b) {
		return a * b;
	}

}
