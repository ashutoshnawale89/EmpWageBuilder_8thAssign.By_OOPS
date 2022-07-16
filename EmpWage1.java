package com.empwage.program;

class EmpWageUC1 {

	public final int is_presentemployee=1;
	public int attendemployee=(int) (Math.floor(Math.random()*10)%2);

	public void EmpWageUC1()
	{	
		if (attendemployee==is_presentemployee) {
			System.out.println("Employee is Present");}
		else {
			System.out.println("Employee is Absent");
		}
	}
	public static void main(String[] args) {
		EmpWageUC1 Attend=new EmpWageUC1();
		Attend.EmpWageUC1();

	}
}
