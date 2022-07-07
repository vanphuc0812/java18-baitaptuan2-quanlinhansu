package java18.baitap.baitaptuan2.object;

import java.io.IOException;

public abstract class Staff {
	private static int count = 0;
	private String staffCode;
	private String name;
	private String mobile;
	private int workingDay;
	private double salaryByDay;

	public Staff() {
	}

	public Staff(String name, String mobile, int workingDay) throws IOException {
		super();
		if (!"".equals(name))
			this.name = name;
		else
			throw new IOException("Name can't be empty");
		if (checkMobileNumberValid(mobile))
			this.mobile = mobile;
		else
			throw new IOException("Wrong mobile number format");
		this.workingDay = workingDay;
	}

	public Staff(String name, String mobile) throws IOException {
		super();
		if (name.length() > 1)
			this.name = name;
		else
			throw new IOException("Name can't be empty");
		if (checkMobileNumberValid(mobile))
			this.mobile = mobile;
		else
			throw new IOException("Wrong mobile number format");
	}

	public String getStaffCode() {
		return staffCode;
	}

	protected void setStaffCode(String type) {
		this.staffCode = type + String.format("%03d", count++);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getWorkingDay() {
		return workingDay;
	}

	public void setWorkingDay(int workingDay) {
		this.workingDay = workingDay;
	}

	public double getSalaryByDay() {
		return salaryByDay;
	}

	public void setSalaryByDay(double salaryByDay) {
		this.salaryByDay = salaryByDay;
	}

	public double getSalary() {
		return this.getWorkingDay() * this.getSalaryByDay();
	}

	private boolean checkMobileNumberValid(String mobile) {
		return mobile.matches("\\d+");
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(staffCode);
		stringBuilder.append(": ");
		stringBuilder.append(name);
		stringBuilder.append(" - ");
		stringBuilder.append(mobile);
		return stringBuilder.toString();
	}
}
