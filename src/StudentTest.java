
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student("John", "CS", 3.5);
		Student b = new Student();
		b.setName("Mary Ann");
		b.setMajor("CE");
		b.setGpa(3.3);
		System.out.println(a.toString());
		System.out.println(b.toString());

	}

}
