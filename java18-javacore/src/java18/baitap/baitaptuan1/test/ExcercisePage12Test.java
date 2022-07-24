package java18.baitap.baitaptuan1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java18.baitap.baitaptuan1.code.ExcercisePage12;

public class ExcercisePage12Test {
	@Test
	void separateToEvenArrayTest() {
		assertEquals("123321", ExcercisePage12.longestPalindrome("123321asfjkansdklf"));
		assertEquals("bcdeffedcb", ExcercisePage12.longestPalindrome("asgawabcdeffedcbla"));
	}
}
