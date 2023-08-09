package org.system;

public class Desktop extends Computer {
	public void desktopSize(long desktopSize) {
		System.out.println("The desktop size is   "+desktopSize);

}
	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.computerMethods("hp");
		desk.desktopSize(380*250);
		
	}
}
