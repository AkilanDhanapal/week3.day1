package week3.day1;

public class students {
	public void getstudentinfo() {
		System.out.println("id");
	}
	public void getstudentinfo(int id, String name) {
		System.out.println("id");
	}

	public void getstudentinfo(String email, double phonenumber) {
		System.out.println("id");
	}
	public static void main(String[] args) {
		students s= new students();
		s.getstudentinfo();
		s.getstudentinfo(001, "Akilan");
		s.getstudentinfo("akilandhanapal@gmail.com", 9003290531d);
	}


}
