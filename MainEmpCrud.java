package com.pace.emp.crud.main;

import com.pace.emp.crud.bean.Employee;
import com.pace.emp.crud.dao.EmployeeCrud;

public class MainEmpCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee sanju=new Employee(529,"Sanjana",70342.21f);
		Employee nadiya=new Employee(531,"Nadiya",69342.23f);
		Employee amu=new Employee(536,"Amrutha",68342.41f);
		EmployeeCrud empCrud=new EmployeeCrud();
		//Send emp objects to addEmployee method
		empCrud.addEmployee(sanju);		
		empCrud.addEmployee(nadiya);		
		empCrud.addEmployee(amu);	
		//Display employee details
		System.out.println("Original Employee List");
		empCrud.showEmpList();
		empCrud.deleteEmployee(531);
		System.out.println("Employee List after deletion");
		empCrud.showEmpList();
		empCrud.updateEmployee();
		System.out.println("Employee List after Updation");
		empCrud.showEmpList();
     }
}
