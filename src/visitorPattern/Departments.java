
package visitorPattern;

/**
 * A Departments interface implemented to demonstrate A Visitor Design Pattern to accept 
 * all visitors
 * @author Natnael Alemayehu
 *
 */
public interface Departments {
	
	/**
	* A method to accept all visitor
	*/
	public void accept(CEO areaManager);

}
