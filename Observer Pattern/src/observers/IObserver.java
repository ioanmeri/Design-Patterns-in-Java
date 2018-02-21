package observers;

import domain.Employee;

public interface IObserver {

	public void callMe(Employee emp, String msg);
}

//All the departments have callMe()
//because they want to be called when there are changes
//into the system