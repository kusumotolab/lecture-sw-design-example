package osakau.swdesign;

public class SemverValidator {
	// https://gist.github.com/jhorsman/62eeea161a13b80e39f5249281e17c39
	static final private String matcher =
			"^([0-9]|[1-9][0-9]*)\\."
			+ "([0-9]|[1-9][0-9]*)\\."
			+ "([0-9]|[1-9][0-9]*)"
			+ "(?:-([0-9A-Za-z-]+(?:\\.[0-9A-Za-z-]+)*))?(?:\\+[0-9A-Za-z-]+)?$";
    public static boolean isValid(final String semver) {
        return semver.matches(matcher);
    }
}
