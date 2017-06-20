package employee;

import java.util.Scanner;

public class Employee {
	public static int workingdays=25; //Set default working days
	public int empId;
	public String empName;
	public int total_leaves;
	public double total_salary;
	
	Scanner get = new Scanner(System.in);
   
	public Employee()// Constructor to get  the basic employee details
    {
        System.out.println("Enter ID of the Employee:");
        empId = get.nextInt();
    	
        Scanner s = new Scanner(System.in);
    	System.out.println("Enter Name of the Employee:");
    	empName = s.nextLine();
    	
    	System.out.println("******************************");
    }

	void calculate_balance_leaves() {
	}

	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		return true;
	}

	void calculate_salary() {
	}
}