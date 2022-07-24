package java18.baitap.baitaptuan1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java18.baitap.baitaptuan1.code.ExcercisePage6;

public class ExcercisePage6Test {

	@Test
	void shouldFindSoNhoHonLog2WorkCorrectly() {
		assertEquals(3, ExcercisePage6.findSoLonNhatNhoHonLog2(10));
		assertEquals(4, ExcercisePage6.findSoLonNhatNhoHonLog2(16));
		assertEquals(-1, ExcercisePage6.findSoLonNhatNhoHonLog2(-10));
		assertEquals(-1, ExcercisePage6.findSoLonNhatNhoHonLog2(0));
	}

}
