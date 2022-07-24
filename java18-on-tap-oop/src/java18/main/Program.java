package java18.main;

import java18.oop.ChildClass;
import java18.oop.HinhChuNhat;
import java18.oop.Student;

public class Program {
	public static void main(String[] args) {
		//instance
//		HinhChuNhat hinhChuNhat = new HinhChuNhat(); //constructor
//		System.out.println(hinhChuNhat.tinhChuVi());
//		Student student = new Student("Hien", "Phuc", 4.0f, 5f, 5.5f);
//		System.out.println(student.toString());
//	
		ChildClass phaGiaChiTu = new ChildClass();
		System.out.println(phaGiaChiTu.getGiaTai());
	}
}
