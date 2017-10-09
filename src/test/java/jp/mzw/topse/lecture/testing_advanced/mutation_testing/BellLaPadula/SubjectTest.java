package jp.mzw.topse.lecture.testing_advanced.mutation_testing.BellLaPadula;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubjectTest {

	private Object object;
	private Subject subject;

	@Before
	public void setup() {
		this.object = new Object(Security.Level.Unclassified);
		this.subject = new Subject(Security.Level.Unclassified);
	}

	@After
	public void teardown() {
		this.object.setSecurityLevel(Security.Level.Unclassified);
		this.subject.setSecurityLevel(Security.Level.Unclassified);
	}

	@Test
	public void testNoReadUp() {
		// Arrange
		// NOP

		// Act
		final boolean actual = this.subject.read(object);

		// Assert
		Assert.assertTrue(actual);
	}

	@Test
	public void testNoReadUpFailure() {
		// Arrange
		this.object.setSecurityLevel(Security.Level.Confidential);

		// Act
		final boolean actual = this.subject.read(object);

		// Assert
		Assert.assertFalse(actual);
	}

	@Test
	public void testNoWriteDown() {
		// Arrange
		// NOP

		// Act
		final boolean actual = this.subject.write(object);

		// Assert
		Assert.assertTrue(actual);
	}

	@Test
	public void testNoWriteDownFailure() {
		// Arrange
		this.subject.setSecurityLevel(Security.Level.Confidential);

		// Act
		final boolean actual = this.subject.write(object);

		// Assert
		Assert.assertFalse(actual);
	}
}
