package java18.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import java18.baitap.baitaptuan1.code.BaiTapMang;

public class BaiTapMangTest {

	@Test
	void shouldLayDsSoNguyenToWorkCorrectly() {
		List<Integer> mangInt = List.of(-5, 5, 7, 13 ,21, 24, 25);
		
		List<Integer> mangSoNguyenTo = BaiTapMang.layDanhSachSoNguyenToTuMang(mangInt);
		
		assertEquals(3, mangSoNguyenTo.size());
		assertEquals(5, mangSoNguyenTo.get(0));
		assertEquals(7, mangSoNguyenTo.get(1));
		assertEquals(13, mangSoNguyenTo.get(2));
	}
	
	void shouldOriginalListShouldNotBeModified() {
		List<Integer> mangInt = List.of(-5, 5, 7, 13 ,21, 24, 25);
//		List<Integer> mangSoNguyenTo = BaiTapMang.layDanhSachSoNguyenToTuMang(mangInt);
		
		mangInt.stream().forEach(soN -> {
			soN = 0;
		});
		
		assertEquals(-5, mangInt.get(0));
	}

}
