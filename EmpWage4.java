package com.empwage.program;

class EmpWageUC5 extends EmpWageUC4  {

	public final int workingdays=20;
	int n=1;


	public void EmpWageUC5 () {
		EmpWageUC4 newcase=new EmpWageUC4();
		while (n < workingdays)
		{ n++;

		newcase.EmpWageUC4();

		}
		System.out.println("The Total Salary of Month is "+totalempwage+" ");
	}
	public static void main(String[] args) {
		EmpWageUC5 days=new EmpWageUC5();
		days.EmpWageUC5();

	}


}



