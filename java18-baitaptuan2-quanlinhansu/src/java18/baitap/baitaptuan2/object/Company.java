package java18.baitap.baitaptuan2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Company {
	private String name;
	private String taxCode;
	private double revenue;
	private List<Staff> listStaff;

	public Company() {
		this.listStaff = new ArrayList<>();
	}

	public Company(String name, String taxCode) {
		this.name = name;
		this.taxCode = taxCode;
		this.listStaff = new ArrayList<>();
	}

	public Company(String name, String taxCode, double revenue, List<Staff> listStaff) {
		this.name = name;
		this.taxCode = taxCode;
		this.revenue = revenue;
		this.listStaff = listStaff;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public List<Staff> getListStaff() {
		return listStaff;
	}

	public void setListStaff(List<Staff> listStaff) {
		this.listStaff = listStaff;
	}

	public List<Staff> getPresidents() {
		return this.listStaff.stream().filter(st -> st.getStaffCode().contains("PD")).collect(Collectors.toList());
	}

	public List<Staff> getManagers() {
		return this.listStaff.stream().filter(st -> st.getStaffCode().contains("MG")).collect(Collectors.toList());
	}

	public List<Staff> getNormalStaffs() {
		return this.listStaff.stream().filter(st -> st.getStaffCode().contains("NS")).collect(Collectors.toList());
	}

	public Staff getStaffById(String staffId) {

		for (Staff staff : this.listStaff) {
			if (staffId.equals(staff.getStaffCode())) {
				return staff;
			}
		}
		return null;
	}
	
	public void addStaff(Staff staff) {
		if (this.listStaff.contains(staff))
			System.out.println("Exist staff");
		else
			this.listStaff.add(staff);
	}

	public void removeStaff(Staff staff) {
		if (this.listStaff.contains(staff)) {
			this.listStaff.remove(staff);
		} else {
			System.out.println("Staff does not exist");
		}
			
	}

}
