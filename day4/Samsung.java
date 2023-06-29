package week2.day4;

public class Samsung extends AndroidTV{
	
	public void watchVideo() {
		System.out.println("Watch video method is implemented in concrete class Samsung");
		
	}

	public static void main(String[] args) {
		Samsung s = new Samsung();
		s.openApp();
		s.watchVideo();

	}

	

}
