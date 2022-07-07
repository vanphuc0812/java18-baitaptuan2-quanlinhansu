package java18.baitap.baitaptuan2.main;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import java18.baitap.baitaptuan2.object.Company;
import java18.baitap.baitaptuan2.object.Manager;
import java18.baitap.baitaptuan2.object.NameComparator;
import java18.baitap.baitaptuan2.object.NormalStaff;
import java18.baitap.baitaptuan2.object.President;
import java18.baitap.baitaptuan2.object.SalaryComparator;
import java18.baitap.baitaptuan2.object.Staff;

public class Program {
	public static void main(String[] args) throws IOException {

		// Init
		Company company = new Company();
		President president = new President("Chu Quoc Khanh", "19251254", 0.2f);
		Manager manager = new Manager("Pham Minh Tu", "1234", 22);
		NormalStaff normalStaff1 = new NormalStaff("Huynh Van Phuc", "0788996877", 21);
		NormalStaff normalStaff2 = new NormalStaff("Chau Quang Vinh", "1111", 20);
		NormalStaff normalStaff3 = new NormalStaff("Mai Xuan Son", "1111", 20);
		company.addStaff(normalStaff3);
		company.addStaff(president);
		company.addStaff(normalStaff2);
		company.addStaff(normalStaff1);
		company.addStaff(manager);

		Scanner scanner = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\n1. Nhập thông tin công ty\r\n");
		stringBuilder.append("2. Phân bổ Nhân viên vào Trưởng phòng\r\n");
		stringBuilder.append("3. Thêm, xóa thông tin một nhân sự\r\n");
		stringBuilder.append("4. Xuất ra thông tin toàn bộ người trong công ty\r\n");
		stringBuilder.append("5. Tính và xuất tổng lương cho toàn công ty\r\n");
		stringBuilder.append("6. Tìm Nhân viên thường có lương cao nhất\r\n");
		stringBuilder.append("7. Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất\r\n");
		stringBuilder.append("8. Sắp xếp nhân viên toàn công ty theo thứ tự abc\r\n");
		stringBuilder.append("9. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần\r\n");
		stringBuilder.append("10. Tìm Giám Đốc có số lượng cổ phần nhiều nhất\r\n");
		stringBuilder.append("11. Tính và Xuất tổng THU NHẬP của từng Giám Đốc\n");
		while (true) {
			System.out.print(stringBuilder);
			int selection = scanner.nextInt();
			switch (selection) {
			case 1:
				setCompanyInfo(company, scanner);
				break;
			case 2:
				assignLeader(company, scanner);
				break;
			case 3:
				System.out.println("1. Add staff           2. Remove staff");
				int addOrRemove = scanner.nextInt();
				if (addOrRemove == 1) {
					addStaff(company, scanner);
				} else {
					removeStaff(company, scanner);
				}
				break;
			case 4:
				System.out.println("\nStaff infomation:");
				company.getListStaff().forEach(staff -> System.out.println(staff.toString()));
				System.out.println("");
				break;
			case 5:
				System.out.printf("Total salary of all staff in company: %d\n", company.getTotalSalary());
				break;
			case 6:
				findNormalStaffHasHighestSalary(company);
				break;
			case 7:
				findManagerHasHighestUnderStaff(company);
				break;
			case 8:
				sortStaffByName(company);
				break;
			case 9:
				sortStaffBySalary(company);
				break;
			case 10:
				getPresidentHasHighestSharePercent(company);
				break;
			case 11:
				getPresidentTotalIncome(company);
				break;
			}
		}
	}

	private static void setCompanyInfo(Company company, Scanner scanner) {
		try {
			scanner.nextLine();
			System.out.print("Input your company name: ");
			String name = scanner.nextLine();
			company.setName(name);
			System.out.print("Input your company tax code: ");
			String taxCode = scanner.nextLine();
			company.setTaxCode(taxCode);
			System.out.println("Input company infomation successfully");
		}catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void assignLeader(Company company, Scanner scanner) {
		scanner.nextLine();
		System.out.print("Input manager staff code: ");
		String managerId = scanner.nextLine();
		System.out.print("Input normal staff code: ");
		String staffId = scanner.nextLine();

		NormalStaff normalStaff = (NormalStaff) company.getStaffById(staffId);
		Manager manager = (Manager) company.getStaffById(managerId);

		if (manager == null || normalStaff == null) {
			System.out.println("Invalid staff id");
		} else {
			manager.addStaffToUnderControl(normalStaff);
			StringBuilder stringBuilder = new StringBuilder();
			
			System.out.printf("Successfully assign %s to become leader of %s\n",normalStaff.getLeader().getName(),normalStaff.getName());
			
		}
	}

	private static void addStaff(Company company, Scanner scanner) {
		System.out.println("Input staff type: 1. President  2. Manager  3. Normal staff");
		int staffType = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Input staff name: ");
		String staffName = scanner.nextLine();

		System.out.print("Input staff mobile: ");
		String staffMobile = scanner.nextLine();
		try {
			switch (staffType) {
			case 1:
				company.addStaff(new President(staffName, staffMobile));
				break;
			case 2:
				company.addStaff(new Manager(staffName, staffMobile));
				break;
			case 3:
				company.addStaff(new NormalStaff(staffName, staffMobile));
				break;
			}
			System.out.println("Add new staff successfully !");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void removeStaff(Company company, Scanner scanner) {
		System.out.print("Input staff id needed to remove: ");
		String staffId = scanner.nextLine();
		Staff staff = company.getStaffById(staffId);
		if (staff != null) {
			company.removeStaff(staff);
			if (staff.getClass() == Manager.class) {
				((Manager) staff).removeAllStaffUnderControl();
			}
		} else {
			System.out.println("Staff does not exist");
		}
	}

	private static void findNormalStaffHasHighestSalary(Company company) {
		List<Double> listSalary = company.getNormalStaffs().stream().map(staff -> staff.getSalary())
				.collect(Collectors.toList());
		if (listSalary.size() > 0) {
			double maxNormalStaffSalary = Collections.max(listSalary);
			List<Staff> highestSlaryStaffs = company.getNormalStaffs().stream()
					.filter(staff -> (staff.getSalary() == maxNormalStaffSalary)).collect(Collectors.toList());
			StringBuilder stringBuilder = new StringBuilder();
			highestSlaryStaffs.forEach(staff -> stringBuilder.append(staff.toString()));
			stringBuilder.append(" has highest salary: ");
			stringBuilder.append(maxNormalStaffSalary);
			System.out.println(stringBuilder.toString());
		} else {
			System.out.println("Company's seem has no normal staff. Please add staff to company");
		}
	}

	private static void findManagerHasHighestUnderStaff(Company company) {
		List<Integer> listNumOfUnderStaff = company.getManagers().stream()
				.map(manager -> ((Manager) manager).getNumOfUnderStaff()).collect(Collectors.toList());
		if (listNumOfUnderStaff.size() > 0) {
			int mostNumOfUnderStaff = Collections.max(listNumOfUnderStaff);
			List<Staff> managerHasMostUnderStaff = company.getManagers().stream()
					.filter(manager -> ((Manager) manager).getNumOfUnderStaff() == mostNumOfUnderStaff)
					.collect(Collectors.toList());
			StringBuilder stringBuilder = new StringBuilder();
			managerHasMostUnderStaff.forEach(staff -> stringBuilder.append(staff.toString()));
			stringBuilder.append(" has the most number of employees under: ");
			stringBuilder.append(mostNumOfUnderStaff);
			stringBuilder.append(" staff\n");
			System.out.println(stringBuilder.toString());
		} else {
			System.out.println("Company's seem has no manager.Please add staff to company");
		}
	}

	private static void sortStaffByName(Company company) {
		Collections.sort(company.getListStaff(), new NameComparator());
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("The list staff after sorted by name:\n");
		company.getListStaff().forEach(staff -> {
			stringBuilder.append(staff.toString());
			stringBuilder.append("\n");
		});
		stringBuilder.append("\n");
		System.out.println(stringBuilder.toString());
	}

	private static void sortStaffBySalary(Company company) {
		Collections.sort(company.getListStaff(), new SalaryComparator());
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("The list staff after sorted by salary:\n");
		company.getListStaff().forEach(staff -> {
			stringBuilder.append(staff.toString());
			stringBuilder.append("\n");
		});
		stringBuilder.append("\n");
		System.out.println(stringBuilder.toString());
	}

	private static void getPresidentHasHighestSharePercent(Company company) {
		List<Float> listSharePercent = company.getPresidents().stream()
				.map(president -> ((President) president).getSharePercent()).collect(Collectors.toList());
		if (listSharePercent.size() > 0) {
			Float highestSharePercent = Collections.max(listSharePercent);
			List<Staff> presidentHasHigestSharePercent = company.getPresidents().stream()
					.filter(president -> ((President) president).getSharePercent() == highestSharePercent)
					.collect(Collectors.toList());
			StringBuilder stringBuilder = new StringBuilder();
			presidentHasHigestSharePercent.forEach(staff -> stringBuilder.append(staff.toString()));
			stringBuilder.append(" has the highest share percent: ");
			stringBuilder.append(highestSharePercent);
			stringBuilder.append("%\n");
			System.out.println(stringBuilder.toString());
		} else {
			System.out.println("Company's seem has no president.Please add staff to company");
		}
	}

	private static void getPresidentTotalIncome(Company company) {
		List<? extends Staff> listPresidents = company.getPresidents();
		List<Double> listTotalIncome = listPresidents.stream().map(
				president -> ((President) president).getSharePercent() * company.getRevenue() + president.getSalary())
				.collect(Collectors.toList());
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Total income of each president: \n");
		for(int i = 0; i< listPresidents.size();i++) {
			stringBuilder.append(listPresidents.get(i).toString());
			stringBuilder.append(" : ");
			stringBuilder.append(listTotalIncome.get(i));
			stringBuilder.append("\n");
		}
		System.out.println(stringBuilder.toString());
	}

}
