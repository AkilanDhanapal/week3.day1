package week3.day1.org.college;

public class student extends department{
	public void studentname() {
		System.out.println("Akilan");
	}
	public void studentdept() {
		System.out.println("computer");
	}
	public void studentid() {
		System.out.println("i123");
	}
	public static void main(String[] args) {
		college c = new college();
		department d =new department();
		student s =new student();
		c.collegename();
		c.collegecode();
		c.collegrank();
		d.department();
		s.studentname();
		s.studentid();
		s.studentdept();
	}

}
