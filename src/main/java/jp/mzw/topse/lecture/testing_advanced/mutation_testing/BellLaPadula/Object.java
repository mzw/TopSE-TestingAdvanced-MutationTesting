package jp.mzw.topse.lecture.testing_advanced.mutation_testing.BellLaPadula;

public class Object {

	private Security.Level mySecurityLevel;

	public Object(final Security.Level mine) {
		this.mySecurityLevel = mine;
	}

	public Security.Level getSecurityLevel() {
		return this.mySecurityLevel;
	}

	public void setSecurityLevel(Security.Level level) {
		this.mySecurityLevel = level;
	}
}
