package org.totalBeginner.tutorial;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

	public void testPerson() {
		Person p1 = new Person();
		assertEquals("unknown name", p1.getName());
		assertEquals(3, p1.getMaximumBooks());
		
	}

	public void testSetName() {
		fail("Not yet implemented");
	}

	public void testSetMaximumBooks() {
		fail("Not yet implemented");
	}

}
