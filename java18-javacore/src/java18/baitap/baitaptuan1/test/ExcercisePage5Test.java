package java18.baitap.baitaptuan1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java18.baitap.baitaptuan1.code.ExcercisePage5;

public class ExcercisePage5Test {
	@Test
	void shouldUpperCaseFirstCharacterWorkCorrectly() {
		assertEquals("Huynh Van Phuc", ExcercisePage5.upperCaseFirstCharacter("huynh van phuc"));
		assertEquals("Huynh Van Phuc", ExcercisePage5.upperCaseFirstCharacter("huynh   van   phuc"));
	}

	@Test
	void shouldCalculateTwoPointDistanceWorkCorrectly() {
		assertEquals(true, ExcercisePage5.checkSameNumOfChar(21,99));
		assertEquals(false, ExcercisePage5.checkSameNumOfChar(4,99));
		assertEquals(true, ExcercisePage5.checkSameNumOfChar(10,90));
	}
}
