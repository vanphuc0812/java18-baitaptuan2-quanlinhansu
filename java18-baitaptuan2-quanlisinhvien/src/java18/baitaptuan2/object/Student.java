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

	public Student(String name, float mathScore, float chemistryScore, float physicScore) throws IOException {
		this.name = name;
		this.id = "SV" + String.format("%3d", count++);

		if (checkInvalidScore(mathScore)) {
			this.mathScore = mathScore;
		} else {
			throw new IOException("Invalid input math score");
		}
		if (checkInvalidScore(chemistryScore)) {
			this.chemistryScore = chemistryScore;
		} else {
			throw new IOException("Invalid input chemistry score");
		}
		if (checkInvalidScore(physicScore)) {
			this.physicScore = physicScore;
		} else {
			throw new IOException("Invalid input physic score");
		}
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
		if (checkInvalidScore(mathScore))
			this.mathScore = mathScore;
		else
			throw new IOException("Invalid input math score");
	}

	public float getChemistryScore() {
		return chemistryScore;
	}

	public void setChemistryScore(float chemistryScore) throws IOException {
		if (checkInvalidScore(chemistryScore))
			this.chemistryScore = chemistryScore;
		else
			throw new IOException("Invalid input chemistry score");
	}

	public float getPhysicScore() {
		return physicScore;
	}

	public void setPhysicScore(float physicScore) throws IOException {
		if (checkInvalidScore(physicScore))
			this.physicScore = physicScore;
		else
			throw new IOException("Invalid input physic score");
	}

	public float getAverageScore() {
		this.averageScore = (this.chemistryScore + this.mathScore + this.physicScore) / 3;
		return this.averageScore;
	}

	public String getRank() {
		averageScore = getAverageScore();
		if (averageScore >= 9) {
			this.rank = "Xuất sắc";
		} else if (averageScore >= 8) {
			this.rank = "Giỏi";
		} else if (averageScore >= 7) {
			this.rank = "Khá";
		} else if (averageScore >= 6) {
			this.rank = "Trung bình khá";
		} else if (averageScore >= 5) {
			this.rank = "Trung bình";
		} else if (averageScore > 0) {
			this.rank = "Yếu";
		} else
			this.rank = "Unknown";
		return this.rank;
	}

	private boolean checkInvalidScore(float score) {
		if (score < 10 && score > 0)
			return true;
		else
			return false;
	}
}
