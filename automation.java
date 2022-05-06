package week3.day1;

public class automation implements language,testtool {
	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Language is JAVA");
		
	}

	public void selenium() {
		// TODO Auto-generated method stub
		System.out.println("Tool is Selenium");
		
	}
	public static void main(String[] args) {
	System.out.println("Automation");
	automation a= new automation();
	a.java();
	a.selenium();
	}

}
