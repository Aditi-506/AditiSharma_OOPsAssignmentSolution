/**
 * 
 */
package com.greatLearning.department;

import com.greatLearning.department.child.AdminDepartment;
import com.greatLearning.department.child.HrDepartment;
import com.greatLearning.department.child.TechDepartment;
import com.greatLearning.department.parent.SuperDepartment;

/**
 * @author Admin - The Main class will be used to create objects of
 *         HrDepartment, TechDepartment, AdminDepartment and call all the
 *         classes
 *
 */
public class Main {

	/**
	 * @param args hrdeptobj, admindeptobj, and techdeptobj is used to call all the
	 *             methods in HR, Admin and Tech department respectively
	 *             isTodayAHoliday is declared in SuperDepartment Class.
	 *             SuperDepartment class is extended in all the department classes
	 */
	public static void main(String[] args) {

		// Declaring object to call Admin Department
		AdminDepartment admindeptobj = new AdminDepartment();
		// Calling Admin Methods
		System.out.println(admindeptobj.departmentName());
		System.out.println(admindeptobj.getTodaysWork());
		System.out.println(admindeptobj.getWorkDeadline());
		System.out.println(admindeptobj.isTodayAHoliday());
		System.out.println("\n");

		// Declaring object to call HR Department
		HrDepartment hrdeptobj = new HrDepartment();
		// Calling HR Methods
		System.out.println(hrdeptobj.departmentName());
		System.out.println(hrdeptobj.doActivity());
		System.out.println(hrdeptobj.getTodaysWork());
		System.out.println(hrdeptobj.getWorkDeadline());
		System.out.println(hrdeptobj.isTodayAHoliday());
		System.out.println("\n");

		// Declaring object to call Tech Department
		TechDepartment techdeptobj = new TechDepartment();
		// Calling Tech Methods
		System.out.println(techdeptobj.departmentName());
		System.out.println(techdeptobj.getTodaysWork());
		System.out.println(techdeptobj.getWorkDeadline());
		System.out.println(techdeptobj.getTechStackInformation());
		System.out.println(techdeptobj.isTodayAHoliday());

	}

}
