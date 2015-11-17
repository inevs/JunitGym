package de.itagile.junit.gymnastik;

import org.junit.Test;

public class ExpectedException {

	@Test(expected = NoNegativeNumbers.class)
	public void throwsNoNegativenUmbersExeptionForNegativeNumbers() {
		iOnlyTakePositiveNumbers(-1);
	}

	private void iOnlyTakePositiveNumbers(int i) {
		if (i < 0) {
			throw new NoNegativeNumbers();
		}
	}

	public class NoNegativeNumbers extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}
}
