package java18.oop;

public class HinhChuNhat {
	//properties
	private float chieuDai;
	private float chieuRong;
	
	/**
	 * access modifier
	 * public -> access any where
	 * private -> inner class
	 * protected -> inner package, child class
	 * default -> inner package
	 */
	
	//constructor
	public HinhChuNhat() {
		this.chieuDai = 5;
		this.chieuRong = 3;
	}
	//Overloading
	public HinhChuNhat(float chieuDai, float chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	//methods
	public float tinhChuVi() {
		return 2*(chieuDai + chieuRong);
	}
	
	public float tinhDienTinh() {
		return chieuDai * chieuRong;
	}
}
