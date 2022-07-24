package java18.baitap.baitaptuan1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java18.baitap.baitaptuan1.code.ExcercisePage2;

public class ExcercisePage2Test {
	@Test
	void shouldDecToBinWorkCorrectly() {
		assertEquals("1000", ExcercisePage2.convertDecToBin(8));
		assertEquals("111", ExcercisePage2.convertDecToBin(7));
		assertEquals("1111", ExcercisePage2.convertDecToBin(15));
		assertEquals("1010", ExcercisePage2.convertDecToBin(10));
	}
}
