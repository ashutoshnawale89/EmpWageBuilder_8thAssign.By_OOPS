
package com.empwage.program;

class EmpWageUC6 extends EmpWageUC5 {

	public final int workinghours=100;
	public int employeewages=0
			;
	public void EmpWageUC6() {
		EmpWageUC4 newcase=new EmpWageUC4();
		while (n < workingdays && n < workinghours) {
			n++;
			newcase.EmpWageUC4();
		}
	}
	public static void main(String[] args) {
		EmpWageUC6 days=new EmpWageUC6();
		days.EmpWageUC6();

	}


}
