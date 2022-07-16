package com.empwage.program;

class EmpWageUC3 extends EmpWageUC2 {

	public final int parttime=2;


	public void EmpWageUC3 () {
		if (attendemployee==is_presentemployee) {
			emphrs=8; 
		} else {
			emphrs=4;
		}
		employeewage=emphrs*wage_per_hr;
		System.out.println("The Salary of Employee is "+employeewage+" ");
	}

	public static void main(String[] args) {

		EmpWageUC3 add=new EmpWageUC3();
		add.EmpWageUC3();

	}	
}
