package com.empwage.program;


class EmpWageUC4 extends EmpWageUC3  {
	public int totalempwage=0;
	public void EmpWageUC4 () {
		int attendemployee=(int) (Math.floor(Math.random()*10)%3);

		switch ((int) attendemployee) {
		case  is_presentemployee :
			emphrs = 8;
			break;
		case parttime :
			emphrs = 4;
			break;
		default:
			emphrs = 0;
		}	
		employeewage=emphrs*wage_per_hr;
		System.out.println("The Salary of Employee is "+employeewage+" ");}{
			System.out.println("The Total Salary of Month is "+totalempwage+" ");
		}


		public static void main(String[] args) {
			EmpWageUC4 newcase=new EmpWageUC4();
			newcase.EmpWageUC4();
		}
}




