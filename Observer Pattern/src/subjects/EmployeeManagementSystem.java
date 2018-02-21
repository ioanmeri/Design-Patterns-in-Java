package subjects;
import java.util.ArrayList;
import java.util.List;

import domain.Employee;
import domain.EmployeeDAO;
import observers.IObserver;

public class EmployeeManagementSystem implements ISubject {
	
	Employee employee;
	String msg;
	private EmployeeDAO employeeDao; 
	private List<IObserver> observers;
	private List<Employee> employees;
	
	public EmployeeManagementSystem() {
		observers = new ArrayList<IObserver>();
		employeeDao = new EmployeeDAO();
		employees = employeeDao.generateEmployees();
	}

	
	public void registerObserver(IObserver o) {
		observers.add(o);
	}

	
	public void removeObserver(IObserver o) {
		observers.remove(o);
	}


	public void notifyObservers() {
		for(IObserver departments : observers) {
			departments.callMe(employee, msg);
			//call each department's callMe method
		}
		
	}
		
	
    public void modifyEmployeeName(int id, String newName) {
    	boolean notify = false;
    	
    	for(Employee fountEmployee : employees) {
    		if (fountEmployee.employeeId == id) {
    			fountEmployee.setName(newName);
    			this.msg = "Employee name changed to: ";
    			this.employee = fountEmployee;
    			notify = true;
    		}
    	}
    	if(notify) {
    		notifyObservers();
    	}
    	
    }

    
	public void hireNewEmployee(Employee hiredEmployee) {
		employee = hiredEmployee;
		msg = "New Hire: ";
		employees.add(hiredEmployee);
		notifyObservers();
	}
	

}