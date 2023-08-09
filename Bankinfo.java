package week4.day3;

public class Bankinfo {
	public void saving() {
		System.out.println("saving");
	}
public void fixed() {
	System.out.println("fixed");
}
public void deposit() {
	System.out.println("deposit");
}
public static void main(String[] args) {
	Bankinfo bank=new Bankinfo();
	bank.deposit();
	bank.fixed();
	bank.saving();
}
}
