package java18.baitap.baitaptuan2.object;

import java.util.Comparator;

public class NameComparator implements Comparator<Staff> {

	public int compare(Staff staff1, Staff staff2) {
		// if the string are not equal
		if (staff1.getName().compareTo(staff2.getName()) != 0) {
			return staff1.getName().compareTo(staff2.getName());
		} else {
			// compare staff code
			// if the strings are equal
			return staff1.getStaffCode().compareTo(staff2.getStaffCode());
		}
	}
}
