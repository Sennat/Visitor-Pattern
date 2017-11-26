
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
