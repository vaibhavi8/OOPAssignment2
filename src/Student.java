
public class Student {
	private String name;
	private String major;
	private double gpa;
	
	public Student() {
		
	}
	
	public Student(String name, String major) {
		setName(name);
		setMajor(major);
	}
	public Student(String name, String major, double gpa) {
		setName(name);
		setMajor(major);
		setGpa(gpa);
	}
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return this.major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getGpa() {
		return this.gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String toString() {
		String a = "Name: " + getName() + " Major: " + getMajor() + " GPA: " + Double.toString(getGpa());
		return a;
	}
	public boolean isEqual(Student student) {
		String a = student.toString();
		String b = this.toString();
		if(a.equals(b)) {
			return true;
		}
		return false;
	}
	
}

