package java18.baitaptuan2.object;

public class Student {
	private String name;
	private String id;
	private float mathScore;
	private float chemistryScore;
	private float physicScore;

	public Student(String name, String id, float mathScore, float chemistryScore, float physicScore) {
		super();
		this.name = name;
		this.id = id;
		this.mathScore = mathScore;
		this.chemistryScore = chemistryScore;
		this.physicScore = physicScore;
	}

	public float getAverageScorre() {
		return (this.chemistryScore + this.mathScore + this.physicScore) / 3;
	}

	public String getRank() {
		float averageScorre = getAverageScorre();
		if(averageScorre>=9) {
			return "Xuất sắc";
		}else if(averageScorre>=8) {
			return "Giỏi";
		}else if(averageScorre>=7) {
			return "Khá";
		}else if(averageScorre>=6) {
			return "Trung bình khá";
		}else if(averageScorre>=5) {
			return "Trung bình";
		}else if(averageScorre>0) {
			return "Yếu";
		}else return "Unknown";
	}
}
