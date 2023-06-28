package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		
		System.out.println("Desktop Size method is called from Desktop class");
	}
	
	public static void main(String[] args) {
		
		Desktop d = new Desktop();
		d.computermodel();
		d.desktopSize();


	}

}
