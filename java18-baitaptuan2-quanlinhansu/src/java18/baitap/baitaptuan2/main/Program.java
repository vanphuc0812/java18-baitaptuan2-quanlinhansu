package java18.baitap.baitaptuan2.main;

import java.util.List;
import java.util.Scanner;

import java18.baitap.baitaptuan2.object.Company;
import java18.baitap.baitaptuan2.object.Manager;
import java18.baitap.baitaptuan2.object.NormalStaff;
import java18.baitap.baitaptuan2.object.Staff;

public class Program {
	public static void main(String[] args) {

		// Init
		Company company = new Company();
		Manager manager = new Manager("Pham Minh Tu", "1234");
		NormalStaff normalStaff1 = new NormalStaff("Huynh Van Phuc", "0788996877");
		NormalStaff normalStaff2 = new NormalStaff("Chau Quang Vinh", "1111");
		company.addStaff(normalStaff2);
		company.addStaff(normalStaff1);
		company.addStaff(manager);

		Scanner scanner = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("1. Nhập thông tin công ty\r\n");
		stringBuilder.append("2. Phân bổ Nhân viên vào Trưởng phòng\r\n");
		stringBuilder.append("3. Thêm, xóa thông tin một nhân sự\r\n");
		stringBuilder.append("4. Xuất ra thông tin toàn bộ người trong công ty\r\n");
		stringBuilder.append("5. Tính và xuất tổng lương cho toàn công ty\r\n");
		stringBuilder.append("6. Tìm Nhân viên thường có lương cao nhất\r\n");
		stringBuilder.append("7. Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất\r\n");
		stringBuilder.append("8. Sắp xếp nhân viên toàn công ty theo thứ tự abc\r\n");
		stringBuilder.append("9. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần\r\n");
		stringBuilder.append("10. Tìm Giám Đốc có số lượng cổ phần nhiều nhất\r\n");
		stringBuilder.append("11. Tính và Xuất tổng THU NHẬP của từng Giám Đốc");
		System.out.print(stringBuilder);
		int selection = scanner.nextInt();
		switch (selection) {
		case 1:
			setCompanyInfo(company);
			break;
		case 2:
			assignLeader(company);
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		}
	}

	private static void setCompanyInfo(Company company) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input your company name: ");
		String name = scanner.nextLine();
		company.setName(name);
		System.out.print("Input your company tax code: ");
		String taxCode = scanner.nextLine();
		company.setTaxCode(taxCode);
	}

	private static void assignLeader(Company company) {
		Scanner scanner = new Scanner(System.in);
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
			System.out.println(manager.getNumOfUnderStaff());
			System.out.println(normalStaff.getLeader().getName());
		}
		
	}
}