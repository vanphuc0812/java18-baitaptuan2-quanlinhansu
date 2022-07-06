package java18.baitap.baitaptuan2.object;

public class President extends Staff {
	private float sharePercent;

	public President(String name, String mobile, int workingDay, float sharePercent) {
		super(name, mobile, workingDay);
		this.setSalaryByDay(300);
		this.sharePercent = sharePercent;
		setStaffCode("PD");
	}

	public float getSharePercent() {
		return sharePercent;
	}

	public void setSharePercent(float sharePercent) {
		if (sharePercent <= 100 || sharePercent <= 0) {
			this.sharePercent = sharePercent;
		}
	}

}
