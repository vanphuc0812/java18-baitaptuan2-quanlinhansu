package java18.baitap.baitaptuan1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java18.baitap.baitaptuan1.code.ExcercisePage9;

public class ExcercisePage9Test {
	@Test
	void separateToEvenArrayTest() {
		assertEquals(7, ExcercisePage9.calculateTimeDeposit(1000,2000,0.1,12));
		assertEquals(21, ExcercisePage9.calculateTimeDeposit(1924,10000,0.08,12));
		assertEquals(8, ExcercisePage9.calculateTimeDeposit(9564,20000,0.1,1));
	}
}
