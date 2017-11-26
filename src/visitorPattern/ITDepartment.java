/* ************************************************************************************
 * Copyright (C) Nov 25, 2017, Natnael Alemayehu, All rights Reserved. Unauthorized 
 * copying of this file and/or distributed without, the express permission of 
 * Natnael Alemayehu is strictly prohibited. Written by Natnael Alemayehu 1:35:53 PM.
 * ************************************************************************************
 */

package visitorPattern;

/**
 * An ITDepartment class implements Departments interface to demonstrate
 * a Visitor Design Pattern
 * This concrete class implemented to accept all visitor
 * @author Natnael Alemayehu
 *
 */
public class ITDepartment implements Departments {

	/**
	 * A method to accept a visitor
	 */
	@Override
	public void accept(CEO areaManager) {
		areaManager.visit(this);
		
	}
}
