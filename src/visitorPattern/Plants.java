
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
