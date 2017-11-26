/* ************************************************************************************
 * Copyright (C) Nov 25, 2017, Natnael Alemayehu, All rights Reserved. Unauthorized 
 * copying of this file and/or distributed without, the express permission of 
 * Natnael Alemayehu is strictly prohibited. Written by Natnael Alemayehu 1:37:00 PM.
 * ************************************************************************************
 */

package visitorPattern;

public class VisitorPatternDemo {
	
	/**
	 * A main method to run the application
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("===========================================");
		System.out.println("Visitor Design Pattern Implementation: ");
		System.out.print("===========================================");
			
		Departments departments = new Plants();
		departments.accept(new VisitedDepartmentsDisplay());

	}
}
