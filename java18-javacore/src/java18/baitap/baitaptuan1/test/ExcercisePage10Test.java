package java18.baitap.baitaptuan1.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java18.baitap.baitaptuan1.code.ExcercisePage10;

public class ExcercisePage10Test {

	@Test
	void separateToEvenArrayTest() {
		int[] testArray = { 1, -10, -5, 2, 4, 6, 10 };
		int[] expectArray = { -10, 2, 4, 6, 10 };
		assertArrayEquals(expectArray, ExcercisePage10.separateToEvenArray(testArray));
	}

	@Test
	void separateToOddArrayTest() {
		int[] testArray = { 1, -10, -5, 2, 4, 6, 10, 11 };
		int[] expectArray = { 1, -5, 11 };
		assertArrayEquals(expectArray, ExcercisePage10.separateToOddArray(testArray));
		assertArrayEquals(expectArray, ExcercisePage10.separateToOddArray(testArray));
	}
	
	@Test
	void shouldCheckMeetKangurooCorrectly() {
		assertEquals(true,ExcercisePage10.checkMeetKangaroo(1,4,3,2));
		assertEquals(true,ExcercisePage10.checkMeetKangaroo(1,5,4,2));
		assertEquals(false,ExcercisePage10.checkMeetKangaroo(1,2,4,2));

	}
	
}
