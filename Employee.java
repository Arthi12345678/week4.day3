package week4.day3;

public class Employee {
	public void getEmployeeInfo(int employeeId) {
		System.out.println("employeeId");
	}
	public void getEmployeeInfo(int employeeId,String name) {
		System.out.println(employeeId+" - "+name);
	
	}
	public void getEmployeeInfo(int employeeId,String name,String email) {
		System.out.println(employeeId +" - "+ name +" - "+email);
	}
	public void getEmployeeInfo(int employeeId,String name,String email,long phno) {
		System.out.println(employeeId +" - "+ name +" - "+email+" - "+phno);
	}
	public static void main(String[] args){
		Employee details=new Employee();
		details.getEmployeeInfo(3);
		details.getEmployeeInfo(3,"arthi");
		details.getEmployeeInfo(3,"arthi","arthiselvaraj123@gmail.com");
		details.getEmployeeInfo(3,"arthi","arthiselvaraj123@gmail.com",9645680231l);
		
	}
	
	}
	


