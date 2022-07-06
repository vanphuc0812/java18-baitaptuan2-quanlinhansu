package java18.baitap.baitaptuan2.object;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Staff {
	private int numOfUnderStaff;
	private List<String> underStaffList;

	public Manager(String name, String mobile, int workingDay) {
		super(name, mobile, workingDay);
		this.setSalaryByDay(200);
		setStaffCode("MG");
		this.underStaffList = new ArrayList<String>();
	}

	public Manager(String name, String mobile) {
		super(name, mobile);
		this.setSalaryByDay(200);
		setStaffCode("MG");
		this.underStaffList = new ArrayList<String>();
	}

	public int getNumOfUnderStaff() {
		return numOfUnderStaff;
	}

	public void addStaffToUnderControl(NormalStaff normalStaff) {
		if (underStaffList.contains(normalStaff.getStaffCode())) {
			System.out.println("Staff has been add same leader");
		} else {
			normalStaff.setLeader(this);
			underStaffList.add(normalStaff.getStaffCode());
			this.numOfUnderStaff++;
		}
	}
	
	@Override
	public double getSalary() {
		return this.getWorkingDay() * this.getSalaryByDay() + this.numOfUnderStaff * 100;
	}
}
