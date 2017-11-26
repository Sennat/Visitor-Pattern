
package visitorPattern;

public class VisitorPatternDemo {
	
	/**
	 * A main method to run the application
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("===========================================");
		System.out.println("A Visitor Design Pattern Implementation: ");
		System.out.print("===========================================");
			
		Departments departments = new Plants();
		departments.accept(new VisitedDepartmentsDisplay());

	}
}
