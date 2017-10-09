package jp.mzw.topse.lecture.testing_advanced.mutation_testing.BellLaPadula;

public class Security {

	public static enum Level {
		Unclassified(0), Confidential(1), Secret(2), TopSecret(3);
		private int position;

		private Level(final int position) {
			this.position = position;
		}

		public boolean isEqualOrHigher(final Level level) {
			return level.position <= this.position;
		}

		public boolean isEqualOrLower(final Level level) {
			return this.position <= level.position;
		}
	}

}
