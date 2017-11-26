/* ************************************************************************************
 * Copyright (C) Nov 25, 2017, Natnael Alemayehu, All rights Reserved. Unauthorized 
 * copying of this file and/or distributed without, the express permission of 
 * Natnael Alemayehu is strictly prohibited. Written by Natnael Alemayehu 1:28:34 PM.
 * ************************************************************************************
 */

package visitorPattern;

/**
 * An CEO interface implemented to demonstrate a Visitor Design Pattern
 * This interface implemented to represent visitor
 * @author Natnael Alemayehu
 *
 */
public interface CEO {
	
	/**
	 * Methods to represents Plants and Department
	 * @param plants
	 */
	public void visit(Plants plants);
	public void visit(HRDepartment hrDept);
	public void visit(ITDepartment itDept);
	public void visit(FinanceDepartment itDept);

}
