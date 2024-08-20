package salary_mangaement_model;

public class FullTimeEmployee extends Employee{
	
	private double allowence;
	private double bonus;
	private static int count= 0;
	
	public FullTimeEmployee(String name, int employeeID, double basicSalary, double allowence, double bonus) {
		super(name, employeeID,basicSalary);
		this.allowence = allowence;
		this.bonus = bonus;
		count++;
		
	}
	

	@Override
	public double calculateSalary() {
		
		return this.allowence + this.bonus + this.getBasicSalary();
	}
	
	@Override
	public void display() {
		
		System.out.println("***** FullTime Employee *******");
		super.display();
	}
	public static int getCount() {
		return count;
	}
}
