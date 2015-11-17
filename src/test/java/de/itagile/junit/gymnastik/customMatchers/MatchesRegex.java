package de.itagile.junit.gymnastik.customMatchers;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class MatchesRegex extends TypeSafeMatcher<String> {

	private final String regex;

	public MatchesRegex(String regex) {
		this.regex = regex;
	}

	@Override
	public void describeTo(Description description) {
		description.appendText("matching '" + regex + "'");
	}

	@Override
	protected boolean matchesSafely(String string) {
		return string.matches(regex);
	}

	public static <T> Matcher<String> matchesRegEx(String regex) {
		return new MatchesRegex(regex);
	}

}
