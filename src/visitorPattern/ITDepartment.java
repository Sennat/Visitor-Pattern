
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
