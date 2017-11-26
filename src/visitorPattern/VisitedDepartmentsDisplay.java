/* ************************************************************************************
 * Copyright (C) Nov 25, 2017, Natnael Alemayehu, All rights Reserved. Unauthorized 
 * copying of this file and/or distributed without, the express permission of 
 * Natnael Alemayehu is strictly prohibited. Written by Natnael Alemayehu 1:49:47 PM.
 * ************************************************************************************
 */

package visitorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * An VisitedDepartmentsDisplay class implements CEO interface to demonstrate
 * a Visitor Design Pattern
 * This concrete class implemented to display all visited departments on screen
 * @author Natnael Alemayehu
 *
 */
public class VisitedDepartmentsDisplay implements CEO {

	//Fields
	private List<String> hrEmplyList;
	private List<String> itEmplyList;
	private List<String> financeEmplyList;
	private List<String> companyList;

	/**
	 * Constructor construct ArrayLists
	 */
	public VisitedDepartmentsDisplay() {
		companyList = new ArrayList<>();
		hrEmplyList = new ArrayList<>();
		itEmplyList = new ArrayList<>();
		financeEmplyList = new ArrayList<>();
	}

	/**
	 * A method to display a visited plant
	 */
	@Override
	public void visit(Plants company) {
		companyList.add("California Plant");
		companyList.add("Thiland Plant");
		System.out.println("\n");
		System.out.println("International Companys List: ");
		System.out.println("------------------------------------");
		for(Object name : companyList) {
			System.out.println("Company Name: " + name);
		}
	}

	/**
	 * A method to display a visited HR Department
	 */
	@Override
	public void visit(HRDepartment hrDept) {
		hrEmplyList.add("Lukas Mathew");
		hrEmplyList.add("John Edward");
		System.out.println("\n");
		System.out.println("HR Department employees List: ");
		System.out.println("-------------------------------");
		for(Object name : hrEmplyList) {
			System.out.println("Employee Full Name: " + name);
		}
	}
	
	/**
	 * A method to display a visited IT Department
	 */
	@Override
	public void visit(ITDepartment itDept) {
		itEmplyList.add("Margret Thomas");
		itEmplyList.add("Bill Robert");
		itEmplyList.add("Solomon Teka");
		System.out.println("\n");
		System.out.println("IT Department employees List: ");
		System.out.println("-------------------------------");
		for(Object name : itEmplyList) {
			System.out.println("Employee Full Name: " + name);
		}
	}
	
	/**
	 * A method to display a visited Finance Department
	 */
	@Override
	public void visit(FinanceDepartment itDept) {
		financeEmplyList.add("Sue Khong");
		financeEmplyList.add("George Jeferson");
		financeEmplyList.add("Natasha Markovich");
		System.out.println("\n");
		System.out.println("Finance Department employees List: ");
		System.out.println("------------------------------------");
		for(Object name : financeEmplyList) {
			System.out.println("Employee Full Name: " + name);
		}
	}

}

