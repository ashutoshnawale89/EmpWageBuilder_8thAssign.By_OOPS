package com.empwage.program;

class EmpWageUC7 {
	public static final  int IS_FULL_TIME =1;
	public static final int IS_PART_TIME =2;
	public static	int EMP_RATE_PER_HOUR;
	public static	int NUMB_WORKING_DAY;
	public static int MAX_HR_IN_MONTH;

	public EmpWageUC7(String name,int emprateperhr,int numbofworkingdays,
			int maxhrinmonth) {  // Parameterized Constructor 
		EMP_RATE_PER_HOUR=emprateperhr;
		NUMB_WORKING_DAY=numbofworkingdays;
		MAX_HR_IN_MONTH=maxhrinmonth;
		System.out.println("The Name of Company is  "+name);
	}

	public static void main(String[] args) {
		EmpWageUC7 Dmart= new EmpWageUC7("Dmart",20,20,100);
		// Variables
		int emphrs = 0;
		int empwage = 0;
		int totalempwage = 0;
		int totalworkingdays = 0;
		int totalemphrs = 0;
		// Computation
		while (totalemphrs < MAX_HR_IN_MONTH && totalworkingdays< NUMB_WORKING_DAY ){
			totalworkingdays++;
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;

			switch ((int)empcheck ) {
			case  IS_FULL_TIME :
				emphrs = 8;
				break;
			case IS_PART_TIME :
				emphrs = 4;
				break;
			default:
				emphrs = 0;
			}
			empwage = emphrs * EMP_RATE_PER_HOUR ;
			totalempwage += empwage;

			System.out.println( "The salary of Employe is" + empwage );
		}
		System.out.println("Total employee wage is" + totalempwage );
	}

}


