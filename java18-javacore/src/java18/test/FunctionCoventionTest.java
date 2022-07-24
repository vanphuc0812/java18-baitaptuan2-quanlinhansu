package java18.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java18.javacore.FunctionConvention;

public class FunctionCoventionTest {

	@Test
	void shouldCheckOddEvenCorrectly() {
		assertEquals(true, FunctionConvention.checkOddOrEven(2));
		assertEquals(false, FunctionConvention.checkOddOrEven(13));
		assertEquals(true, FunctionConvention.checkOddOrEven(10020));
		assertEquals(false, FunctionConvention.checkOddOrEven(111231241));
	}

	@Test
	void shouldCheckSoNguyenToCorrectly() {
		assertEquals(false, FunctionConvention.checkSoNguyenTo(-1));
		assertEquals(true, FunctionConvention.checkSoNguyenTo(2));
		assertEquals(true, FunctionConvention.checkSoNguyenTo(3));
		assertEquals(true, FunctionConvention.checkSoNguyenTo(7));
		assertEquals(true, FunctionConvention.checkSoNguyenTo(23));
		assertEquals(false, FunctionConvention.checkSoNguyenTo(12));
		assertEquals(false, FunctionConvention.checkSoNguyenTo(21));
		assertEquals(false, FunctionConvention.checkSoNguyenTo(48));
	}

}
