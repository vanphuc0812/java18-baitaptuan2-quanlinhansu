package java18.baitap.baitaptuan2.object;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Staff> {

	public int compare(Staff staff1, Staff staff2) {
		// if the salary are not equal
		if (staff1.getSalary() > staff2.getSalary()) {
			return -1;
		} else if (staff1.getSalary() < staff2.getSalary()) {
			return 1;
		} else {
			// compare staff code
			// if the salary are equal
			return staff1.getStaffCode().compareTo(staff2.getStaffCode());
		}
	}
}
