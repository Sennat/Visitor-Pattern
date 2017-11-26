/* ************************************************************************************
 * Copyright (C) Nov 25, 2017, Natnael Alemayehu, All rights Reserved. Unauthorized 
 * copying of this file and/or distributed without, the express permission of 
 * Natnael Alemayehu is strictly prohibited. Written by Natnael Alemayehu 2:10:14 PM.
 * ************************************************************************************
 */

package visitorPattern;

/**
 * An Plants concrete class implemented to demonstrate a Visitor Design Pattern
 * This interface implemented to represent visitor
 * @author Natnael Alemayehu
 *
 */
public class Plants implements Departments {
	
	private Departments[] departments;
	
	//Array to hold visitors
	public Plants() {
		departments = new Departments[] {new HRDepartment(), new FinanceDepartment(), new ITDepartment()};
	}

	/**
	 * A method to accept all visitor in a loop
	 */
	@Override
	public void accept(CEO areaManger) {
		for(int i= 0; i < departments.length; i++) {
			departments[i].accept(areaManger);
		}
		
		areaManger.visit(this);
	}

}
