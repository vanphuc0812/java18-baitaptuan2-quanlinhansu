package java18.baitap.baitaptuan1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java18.baitap.baitaptuan1.code.ExcercisePage8;

public class ExcercisePage8Test {
	@Test
	void shouldStringLengthWorkCorrectly() {
		assertEquals(3, ExcercisePage8.stringLength("123"));
		assertEquals(6, ExcercisePage8.stringLength("123456"));
		assertEquals(0, ExcercisePage8.stringLength(""));
		assertEquals(-1, ExcercisePage8.stringLength(null));
	}

	@Test
	void shouldCheckSubstringWorkCorrectly() {
		assertEquals(true, ExcercisePage8.checkSubstring("123", "12"));
		assertEquals(false, ExcercisePage8.checkSubstring("123456", "a"));
		assertEquals(true, ExcercisePage8.checkSubstring("", ""));

	}

	@Test
	void shouldCharAtIndexWorkCorrectly() {
		assertEquals(50, ExcercisePage8.charAtIndex("123", 1));
		assertEquals(51, ExcercisePage8.charAtIndex("123456", 2));
		assertEquals(1, ExcercisePage8.charAtIndex("", 1));
		assertEquals(1, ExcercisePage8.charAtIndex(null, 1));
	}

	@Test
	void shouldCheckNamNhuanWorkCorrectly() {
		assertEquals(true, ExcercisePage8.checkNamNhuan(2000));
		assertEquals(false, ExcercisePage8.checkNamNhuan(2022));
	}
}
