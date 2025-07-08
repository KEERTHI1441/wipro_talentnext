package oops_inheritance;

class Employee1 extends Person {
	private double annual_salary;
	private int year_started;
	private String national_insurance_num;
	Employee1(String name,double annual_salary,int year_started,String national_insurance_num){
		super(name);
		this.annual_salary=annual_salary;
		this.year_started=year_started;
		this.national_insurance_num=national_insurance_num;
	}
	
	void setAnnualSalary(double annual_salary) {
		this.annual_salary=annual_salary;
	}
	void setYearStarted(int year_started) {
		this.year_started=year_started;
	}
	void setNationalInsuranceNum(String national_insurance_num) {
		this.national_insurance_num=national_insurance_num;
	}
	double getAnnualSalary() {
		return annual_salary;
	}
	int getYearStarted() {
		return year_started;
	}
	String getNationalInsuranceNum() {
		return national_insurance_num;
	}
	void display() {
		super.display();
		System.out.println("Employee Annual Salary: "+annual_salary);
		System.out.println("Employee started to work: "+year_started);
		System.out.println("National Insurance Num: "+national_insurance_num);
	}
}
