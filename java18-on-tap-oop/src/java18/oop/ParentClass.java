package java18.oop;

public class ParentClass {
	private String giaTaiCuaBa;
	protected String giaTaiDeLai;
	
	public ParentClass() {
		giaTaiCuaBa = "100";
		giaTaiDeLai = "100";
	}
	
	public String getGiaTai() {
		return giaTaiCuaBa + "\n" + giaTaiDeLai;
	}
	
	
}
