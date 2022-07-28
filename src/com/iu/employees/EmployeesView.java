package com.iu.employees;

import java.util.ArrayList;

public class EmployeesView {
	
	public void view(EmployeesDTO employeesDTO) {
		
		System.out.print(employeesDTO.getEmployee_id() + "\t");
		System.out.print(employeesDTO.getFirst_name() + "\t");
		System.out.print(employeesDTO.getLast_name() + "\t");
		System.out.print(employeesDTO.getEmail() + "\t");
		System.out.print(employeesDTO.getPhone_number() + "\t");
		System.out.print(employeesDTO.getHire_date() + "\t");
		System.out.print(employeesDTO.getJob_id() + "\t");
		System.out.print(employeesDTO.getSalary() + "\t");
		System.out.print(employeesDTO.getCommission_pct() + "\t");
		System.out.print(employeesDTO.getManager_id() + "\t");
		System.out.println(employeesDTO.getDepartment_id() + "\t");
		}
	
	public void view(ArrayList<EmployeesDTO> ar) {
		System.out.println("Employee_id\t First_name\t Last_name\t Email\t Phone_number\t"
				+ "Hire_date\t job_id\t Salary\t Commission_pct\t Manager_id\t Department_id");
		for(EmployeesDTO employeesDTO : ar) {
			this.view(employeesDTO);
		}
	}

}
