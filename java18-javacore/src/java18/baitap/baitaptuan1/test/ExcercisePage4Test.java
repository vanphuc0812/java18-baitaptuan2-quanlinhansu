package java18.baitap.baitaptuan1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import java18.baitap.baitaptuan1.code.ExcercisePage4;

public class ExcercisePage4Test {
	@Test
	void shouldFactorialWorkCorrectly() {
		assertEquals(120, ExcercisePage4.caculateFactorial(5));
		assertEquals(-1, ExcercisePage4.caculateFactorial(-1));
		assertEquals(1, ExcercisePage4.caculateFactorial(1));
	}
	@Test
	void shouldCalculateTwoPointDistanceWorkCorrectly() {
		assertEquals(Math.sqrt(2), ExcercisePage4.calculateTwoPointDistance(1,1,0,0));
		assertEquals(0, ExcercisePage4.calculateTwoPointDistance(1,1,1,1));
		assertEquals(Math.sqrt(81.25), ExcercisePage4.calculateTwoPointDistance(1.5,1,1,10));
	}
	@Test
	void shouldReverseStringWorkCorrectly() {
		assertEquals("654321", ExcercisePage4.reverseString("123456"));
		assertEquals("d c b a", ExcercisePage4.reverseString("a b c d"));
	}
	@Test
	void shouldFindDivisorsWorkCorrectly() {
		Integer[] arr1 = { 1 };
		Integer[] arr2 = { 2,5,10 };
        List<Integer> testList1 = Arrays.asList(arr1);
        List<Integer> testList2 = Arrays.asList(arr2);

		assertEquals(testList1, ExcercisePage4.findDivisors(1));
		assertEquals(testList2, ExcercisePage4.findDivisors(10));
	}
}
