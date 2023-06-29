package week2.day4;

public class Automation extends MultipleLanguage implements Language,TestTool{
	
	public void java() {
		System.out.println("Printing from Java method defined in Automation class");
	}
	public void selenium() {
		System.out.println("Printing from Selenium method defined in Automation class");
	}
	public void ruby() {
		System.out.println("Printing from Ruby method defined in Automation class");
	}
	public static void main(String[] args) {
		Automation a = new Automation();
		a.java();
		a.selenium();
		a.ruby();
		a.python();

	}	

}
