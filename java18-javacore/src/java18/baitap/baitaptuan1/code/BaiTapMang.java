package java18.baitap.baitaptuan1.code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import java18.javacore.FunctionConvention;

public class BaiTapMang {
	void demoMang() {
		int[] mangInt = new int[3]; // cố định số lượng phần tử của mảng
		mangInt[0] = 15;
		List<Integer> listInt;
		listInt = new ArrayList<>();
		listInt = new LinkedList<>();

	}

	public static List<Integer> layDanhSachSoNguyenToTuMang(final List<Integer> mangInt) {
//		List<Integer> result = new ArrayList<>();
		if (mangInt == null)
			return null;

//		for(int soN : mangInt) {
//			if(checkSoNguyenTo(soN)) {
//				result.add(soN);
//			}
//		}

//		mangInt.stream().forEach(soN -> {
//			if(FunctionConvention.checkSoNguyenTo(soN)) {
//				result.add(soN);
//			}
//		});

		List<Integer> result = mangInt.stream()
				.filter(soN -> FunctionConvention.checkSoNguyenTo(soN))
				.collect(Collectors.toList());

		return result;
	}

}
