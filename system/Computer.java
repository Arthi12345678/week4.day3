package org.system;



public class Computer {
	public void computerMethods(String computerModel){
		
		System.out.println("The computer model is    "+computerModel);
		
	}
	public static void main(String[] args) {
		Computer comp=new Computer();
		comp.computerMethods("hp");
		
	}

}
