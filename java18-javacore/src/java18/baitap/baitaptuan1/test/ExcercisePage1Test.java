package java18.baitap.baitaptuan1.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalTime;

import org.junit.jupiter.api.Test;

import java18.baitap.baitaptuan1.code.ExcercisePage1;

public class ExcercisePage1Test {
	@Test
	void shouldKaraokeCostWorkCorrectly() {
		assertEquals(60000, ExcercisePage1.calculateKaraokeCost(LocalTime.of(17, 10), LocalTime.of(18, 10), 3));
		assertEquals(-1, ExcercisePage1.calculateKaraokeCost(LocalTime.of(17, 10), LocalTime.of(18, 10), -3));
		assertEquals(-1, ExcercisePage1.calculateKaraokeCost(LocalTime.of(8, 10), LocalTime.of(18, 10), 4));
		assertEquals(598000, ExcercisePage1.calculateKaraokeCost(LocalTime.of(10, 10), LocalTime.of(23, 10), 13));
	}
}
