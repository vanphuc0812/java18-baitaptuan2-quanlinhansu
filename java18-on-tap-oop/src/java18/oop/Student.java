package java18.oop;

public class Student {
	private String name;
	private final String id;
	private float mathPoint;
	private float physicPoint;
	private float chemistryPoint;

	public Student(final String id) {
		this.id = id;
	}

	public Student(String name, String code, float mathPoint, float physicPoint, float chemistryPoint) {
		this.name = name;
		this.id = code;
		this.mathPoint = mathPoint;
		this.physicPoint = physicPoint;
		this.chemistryPoint = chemistryPoint;
	}

	// getters and setters
	public String getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMathPoint() {
		return mathPoint;
	}

	public void setMathPoint(float mathPoint) {
		this.mathPoint = mathPoint;
	}

	public float getPhysicPoint() {
		return physicPoint;
	}

	public void setPhysicPoint(float physicPoint) {
		this.physicPoint = physicPoint;
	}

	public float getChemistryPoint() {
		return chemistryPoint;
	}

	public void setChemistryPoint(float chemistryPoint) {
		this.chemistryPoint = chemistryPoint;
	}

	protected float calAveragePoint() {
		return (mathPoint + physicPoint + chemistryPoint) / 3;
	}

	protected String rank() {
		float avrPoint = calAveragePoint();
		if (avrPoint >= 9)
			return "Xuat sac";
		else if (avrPoint >= 8)
			return "Gioi";
		else if (avrPoint >= 7)
			return "Kha";
		else if (avrPoint >= 6)
			return "TB kha";
		else if (avrPoint >= 5)
			return "Kha";
		else
			return "Yeu";
	}

	@Override
	public String toString() {
		return name + rank() + id;
	}
}
