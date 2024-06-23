package com.pace.emp.crud.dao;
import java.util.ArrayList;
import com.pace.emp.crud.bean.Employee;
public class EmployeeCrud {
	ArrayList<Employee> empList=new ArrayList<Employee>();
	public void addEmployee(Employee emp) {
		empList.add(emp);
	}
	public void showEmpList() {
		for(Employee Emp:empList) {
			System.out.println(Emp.getId());
			System.out.println(Emp.getName());
			System.out.println(Emp.getSalary());
			System.out.println("=================================");
		}
	}
	//Update employee salary by 10%
	public void updateEmployee() {
		for(Employee Emp:empList) {
			float salary=Emp.getSalary();
			salary=salary + salary*0.10f;
			Emp.setSalary(salary);
			System.out.println("Salary has been Updated");
		}
	}
	public void deleteEmployee(int id) {
		boolean isAvailable=false;
		for(Employee Emp:empList) {
			if(id==Emp.getId()) {
				empList.remove(Emp);
				isAvailable=true;
				break;
			}
		}
		if(isAvailable==true) {
			System.out.println("Employee with id " + id +" has been succesfully deleted");
		}else {
			System.out.println("Employee with id " + id + " is unavailable");
		}
    }
}