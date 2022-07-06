package java18.baitap.baitaptuan2.object;

public class NormalStaff extends Staff {
	private Manager manager;

	public NormalStaff(String name, String mobile, int workingDay) {
		super(name, mobile, workingDay);
		this.setSalaryByDay(100);
		this.manager = null;
		setStaffCode("NS");
	}

	public NormalStaff(String name, String mobile) {
		super(name, mobile);
		this.setSalaryByDay(100);
		setStaffCode("NS");
	}

	public Manager getLeader() {
		return manager;
	}

	public void setLeader(Manager manager) {
		this.manager = manager;
	}

	public void removeLeader() {
		this.manager = null;
	}

}
