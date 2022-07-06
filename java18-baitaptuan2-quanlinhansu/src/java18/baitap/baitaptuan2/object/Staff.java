package java18.baitap.baitaptuan2.object;

public abstract class Staff {
	private static int count = 0;
	private String staffCode;
	private String name;
	private String mobile;
	private int workingDay;
	private double salaryByDay;

	public Staff() {
	}

	public Staff(String name, String mobile, int workingDay) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.workingDay = workingDay;
	}

	public Staff(String name, String mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
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
}
