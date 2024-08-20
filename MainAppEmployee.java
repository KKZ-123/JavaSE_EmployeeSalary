package mainAppForEmployee;
import salary_mangaement_model.Employee;
import salary_mangaement_model.PartTimeEmployee;
import salary_mangaement_model.FullTimeEmployee;
import salary_mangaement_model.ContractEmployee;

public class MainAppForEmployee {

	public static void main(String[] args) {
		
		Employee emp1 = new PartTimeEmployee("Mg Mg", 234, 0.0, 30, 1000);
		Employee emp2 = new FullTimeEmployee("Mg Thu", 034, 0.0, 30, 1000);
		Employee emp3 = new ContractEmployee("Mg Min", 134, 0.0,6, 60000);
		Employee emp4 = new PartTimeEmployee("Mg Mg", 334, 3000, 1000, 0.0);
	
		emp1.display();
		emp2.display();
		emp3.display();
		emp4.display();
		
		System.out.println("Total Employe Count : " + Employee.getCount());
		System.out.println("Total FullEmploye Count : " + FullTimeEmployee.getCount());
		System.out.println("Total ContractEmploye Count : " + ContractEmployee.getCount());
		System.out.println("Total PartTimeEmploye Count : " + PartTimeEmployee.getCount());

	}
	
}
