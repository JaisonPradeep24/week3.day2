package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		
		System.out.println("The desktop size is 42 inches and its touch.");
	}
	
	public static void main(String[] args) {
		
		Desktop dk=new Desktop();
		dk.computerModel();
		dk.desktopSize();
	}

}
