package java18.baitaptuan2.object;

import java.io.IOException;

public class Student {
	private String name;
	private String id;
	private float mathScore;
	private float chemistryScore;
	private float physicScore;
	private String rank;
	private float averageScore;
	private static int count = 0;

	public Student() {
		this.id = "SV" + String.format("%3d", count++);
	}

	public Student(String name) {
		this.name = name;
		this.id = "SV" + String.format("%3d", count++);
	}

	public Student(String name, float mathScore, float chemistryScore, float physicScore) {
		this.name = name;
		this.id = "SV" + String.format("%3d", count++);
		this.mathScore = mathScore;
		this.chemistryScore = chemistryScore;
		this.physicScore = physicScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public float getMathScore() {
		return mathScore;
	}

	public void setMathScore(float mathScore) throws IOException {
		if (mathScore < 10 && mathScore > 0)
			this.mathScore = mathScore;
		else
			throw new IOException("Invalid input score");
	}

	public float getChemistryScore() {
		return chemistryScore;
	}

	public void setChemistryScore(float chemistryScore) throws IOException {
		if (chemistryScore < 10 && chemistryScore > 0)
			this.chemistryScore = chemistryScore;
		else
			throw new IOException("Invalid input score");
	}

	public float getPhysicScore() {
		return physicScore;
	}

	public void setPhysicScore(float physicScore) throws IOException {
		if (physicScore < 10 && physicScore > 0)
			this.physicScore = physicScore;
		else
			throw new IOException("Invalid input score");
	}

	public float getAverageScore() {
		this.averageScore = (this.chemistryScore + this.mathScore + this.physicScore) / 3;
		return this.averageScore;
	}

	public String getRank() {
		float averageScorre = getAverageScore();
		if (averageScorre >= 9) {
			this.rank = "Xuất sắc";
		} else if (averageScorre >= 8) {
			this.rank = "Giỏi";
		} else if (averageScorre >= 7) {
			this.rank = "Khá";
		} else if (averageScorre >= 6) {
			this.rank = "Trung bình khá";
		} else if (averageScorre >= 5) {
			this.rank = "Trung bình";
		} else if (averageScorre > 0) {
			this.rank = "Yếu";
		} else
			this.rank = "Unknown";
		return this.rank;
	}
}
