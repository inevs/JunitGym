package de.itagile.junit.gymnastik.rules;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class LoggingRule implements TestRule {

	@Override
	public Statement apply(final Statement statement, final Description description) {
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				System.out.println("Before " + description.getDisplayName());
				statement.evaluate();
				System.out.println("After " + description.getDisplayName());
			}
		};
	}

}
