package java18.baitap.baitaptuan2.object;

import java.io.IOException;

public class President extends Staff {
	private float sharePercent;

	public President(String name, String mobile, int workingDay, float sharePercent) throws IOException {
		super(name, mobile, workingDay);
		this.setSalaryByDay(300);
		this.sharePercent = sharePercent;
		setStaffCode("PD");
	}

	public President(String name, String mobile) throws IOException {
		super(name, mobile);
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
