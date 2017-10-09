package jp.mzw.topse.lecture.testing_advanced.mutation_testing.BellLaPadula;

public class Subject {

	private Security.Level mySecurityLevel;

	public Subject(final Security.Level mine) {
		this.mySecurityLevel = mine;
	}

	public void setSecurityLevel(final Security.Level mine) {
		this.mySecurityLevel = mine;
	}

	public boolean read(final Object object) {
		if (this.mySecurityLevel.isEqualOrHigher(object.getSecurityLevel())) {
			return true;
		} else {
			return false;
		}
	}

	public boolean write(final Object object) {
		if (this.mySecurityLevel.isEqualOrLower(object.getSecurityLevel())) {
			return true;
		} else {
			return false;
		}
	}
}
