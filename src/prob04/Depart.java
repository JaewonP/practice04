package prob04;

public class Depart extends Employee {
	private String department;

	public Depart( String name, int salary, String department ) {
		//this.name = name;
		// this.salary = salary;
		super( name, salary ); // 자식 생성자에서 부모생성자 지정할 때 super씀  
		//setName(name);
		//setSalary(salary);
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void getInformation() {
		System.out.println( "이름:" + getName() + "	연봉:" + getSalary() + "	부서:" + department );
		System.out.printf("이름: %s   연봉: %d\n   부서:", getName(), getSalary(), department);
	
	
	}
}