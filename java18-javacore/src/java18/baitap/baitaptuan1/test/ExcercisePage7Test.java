package java18.baitap.baitaptuan1.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java18.baitap.baitaptuan1.code.ExcercisePage7;

public class ExcercisePage7Test {
	@Test
	void shouldRemoveRepeatElementWorkCorrectly() {
		ExcercisePage7<Object> excercisePageSeven = new ExcercisePage7<>();
		Integer testArrray1[] = { 7, 2, 6, 7, 4, 9, 8 };
		Integer expectArrray1[] = { 7, 2, 6, 4, 9, 8 };
		String testArrray2[] = { "7", "2", "6", "7" };
		String expectArrray2[] = { "7", "2", "6" };
		assertArrayEquals(expectArrray1, excercisePageSeven.removeRepeatElement(testArrray1));
		assertArrayEquals(expectArrray2, excercisePageSeven.removeRepeatElement(testArrray2));

	}

	@Test
	void shouldCalculateAverageCorrectly() {
		Integer[] testArrray1 = { 7, 2, 6, 7, 4, 9, 8 };
		assertEquals(43 / 7, ExcercisePage7.calculateAverage(testArrray1, 7));
	}

	@Test
	void shouldFindMinCorrectly() {
		Integer[] testArrray1 = { 7, 2, 6, -7, 4, 9, 8 };
		Integer[] testArrray2 = { 7, 2, 6, 7, 4, 9, 8 };
		assertEquals(-7, ExcercisePage7.findMin(testArrray1));
		assertEquals(2, ExcercisePage7.findMin(testArrray2));
	}

	@Test
	void shouldFindMaxCorrectly() {
		Integer[] testArrray1 = { 7, 2, 6, -7, 4, 9, 8 };
		Integer[] testArrray2 = { 7, 2, 6, 7, 4, -9, 8 };
		assertEquals(9, ExcercisePage7.findMax(testArrray1));
		assertEquals(8, ExcercisePage7.findMax(testArrray2));
	}

	@Test
	void shouldFindMaxNegativeElementCorrectly() {
		Integer[] testArrray1 = { 7, 2, 6, -7, 4, 9, 8, 0 };
		Integer[] testArrray2 = { 7, -2, 6, 7, 4, -9, 8 };
		Integer[] testArrray3 = { 7, 2, 6, 7, 4, 9, 8 };
		assertEquals(-7, ExcercisePage7.findMaxNegativeElement(testArrray1));
		assertEquals(-2, ExcercisePage7.findMaxNegativeElement(testArrray2));
		assertEquals(0, ExcercisePage7.findMaxNegativeElement(testArrray3));
	}

	@Test
	void shouldFindMinNegativeElementCorrectly() {
		Integer[] testArrray1 = { 7, 2, -6, -7, 4, 9, 8, 0 };
		Integer[] testArrray2 = { 7, -2, 6, 7, 4, -9, 8 };
		Integer[] testArrray3 = { 7, 2, 6, 7, 4, 9, 8 };
		assertEquals(-7, ExcercisePage7.findMinNegativeElement(testArrray1));
		assertEquals(-9, ExcercisePage7.findMinNegativeElement(testArrray2));
		assertEquals(0, ExcercisePage7.findMinNegativeElement(testArrray3));
	}

	@Test
	void shouldFindMaxPositiveElementCorrectly() {
		Integer[] testArrray1 = { 7, 2, -6, -7, 4, 9, 8, 0 };
		Integer[] testArrray2 = { 7, -2, 6, 7, 4, -9, 8 };
		Integer[] testArrray3 = { -7, -2, -6, -7, -4, -9, -8 };
		assertEquals(9, ExcercisePage7.findMaxPositiveElement(testArrray1));
		assertEquals(8, ExcercisePage7.findMaxPositiveElement(testArrray2));
		assertEquals(-1, ExcercisePage7.findMaxPositiveElement(testArrray3));
	}

	@Test
	void shouldFindMinPositiveElementCorrectly() {
		Integer[] testArrray1 = { 7, 2, -6, -7, 4, 9, 8, 0 };
		Integer[] testArrray2 = { 7, -2, 6, 7, 4, -9, 8 };
		Integer[] testArrray3 = { -7, -2, -6, -7, -4, -9, -8 };
		assertEquals(2, ExcercisePage7.findMinPositiveElement(testArrray1));
		assertEquals(4, ExcercisePage7.findMinPositiveElement(testArrray2));
		assertEquals(-1, ExcercisePage7.findMinPositiveElement(testArrray3));
	}

	@Test
	void shouldInsertElementToIndexCorrectly() {
		Integer[] testArrray1 = { 7, 2, -6, -7, 4, 9, 8, 0 };
		Integer[] expectArrray1 = { 7, 2, 7, -6, -7, 4, 9, 8, 0 };
		Integer[] testArrray2 = { 7, -2, 6, 7, 4, -9, 8 };
		Integer[] expectArrray2 = { 7, -2, 6, 7, 4, 9, -9, 8 };
		assertArrayEquals(expectArrray1, ExcercisePage7.insertElementToIndex(2, 7, testArrray1));
		assertArrayEquals(expectArrray2, ExcercisePage7.insertElementToIndex(5, 9, testArrray2));
	}

	@Test
	void shouldRemoveElementToIndexCorrectly() {
		Integer[] testArrray1 = { 7, 2, -6, -7, 4, 9, 8, 0 };
		Integer[] expectArrray1 = { 7, 2, -7, 4, 9, 8, 0 };
		Integer[] testArrray2 = { 7, -2, 6, 7, 4, -9, 8 };
		Integer[] expectArrray2 = { 7, -2, 6, 7, 4, 8 };
		assertArrayEquals(expectArrray1, ExcercisePage7.removeElementToIndex(2, testArrray1));
		assertArrayEquals(expectArrray2, ExcercisePage7.removeElementToIndex(5, testArrray2));
	}

}
