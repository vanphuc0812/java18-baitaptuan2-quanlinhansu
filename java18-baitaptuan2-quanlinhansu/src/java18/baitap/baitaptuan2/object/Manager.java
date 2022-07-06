package java18.baitap.baitaptuan2.object;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Staff {
	private int numOfUnderStaff;
	private List<NormalStaff> underStaffList;

	public Manager(String name, String mobile, int workingDay) throws IOException {
		super(name, mobile, workingDay);
		this.setSalaryByDay(200);
		setStaffCode("MG");
		this.underStaffList = new ArrayList<NormalStaff>();
	}

	public Manager(String name, String mobile) throws IOException {
		super(name, mobile);
		this.setSalaryByDay(200);
		setStaffCode("MG");
		this.underStaffList = new ArrayList<NormalStaff>();
	}

	public int getNumOfUnderStaff() {
		return numOfUnderStaff;
	}

	public void addStaffToUnderControl(NormalStaff normalStaff) {
		if (underStaffList.contains(normalStaff)) {
			System.out.println("Staff has been add same leader");
		} else {
			normalStaff.setLeader(this);
			underStaffList.add(normalStaff);
			this.numOfUnderStaff++;
		}
	}

	public void removeAllStaffUnderControl() {
		this.underStaffList.forEach(staff -> staff.removeLeader());
	}

	@Override
	public double getSalary() {
		return this.getWorkingDay() * this.getSalaryByDay() + this.numOfUnderStaff * 100;
	}
}
