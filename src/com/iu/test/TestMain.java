package com.iu.test;

import java.util.ArrayList;

import com.iu.countries.CountriesDAO;
import com.iu.countries.CountriesDTO;
import com.iu.countries.CountriesView;
import com.iu.employees.EmployeesDAO;
import com.iu.employees.EmployeesDTO;
import com.iu.employees.EmployeesView;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsDTO;
import com.iu.regions.RegionsView;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		RegionsDAO regionsDAO = new RegionsDAO();
		CountriesDAO countriesDAO = new CountriesDAO();
		RegionsView regionsView = new RegionsView();
		CountriesView countriesVIew = new CountriesView();
		ArrayList<CountriesDTO> ar = new ArrayList<>();
		ArrayList<EmployeesDTO> ar1 = new ArrayList<>();
		ArrayList<RegionsDTO> ar2 = new ArrayList<>();
		
		EmployeesDAO employeesDAO = new EmployeesDAO();
		EmployeesView employeesView = new EmployeesView();
		
		try {
//			RegionsDTO regionsDTO = new RegionsDTO();
//			regionsDTO.setRegion_id(10);
//			regionsDTO.setRegion_Name("Mars");
//			int result = regionsDAO.setRegion(regionsDTO);
//			
//			if(result > 0) {
//				System.out.println("성공");
//			}else {
//				System.out.println("실패");
//			}
			
			CountriesDTO countriesDTO = new CountriesDTO();
			countriesDTO.setCountry_id("CR");
			countriesDTO.setCountry_name("Croatia");
			countriesDTO.setRegion_id(1);
			int result1 = countriesDAO.setCountry(countriesDTO);
			
			if(result1 > 0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
//			ar2 = regionsDAO.getList();
//			regionsView.view(ar2);
//			RegionsDTO regionsDTO = regionsDAO.getDetail(3);
//			regionsView.view(regionsDTO);
			
//			ar = countriesDAO.getList();
//			countriesVIew.view(ar);
//			CountriesDTO countriesDTO = countriesDAO.getDetail("CN");
//			countriesVIew.view(countriesDTO);
			
//			ar1 = employeesDAO.getList();
//			employeesView.view(ar1);
//			EmployeesDTO employeesDTO = employeesDAO.getDetail(201);
//			employeesView.view(employeesDTO);
//			employeesDAO.getSalaryInfo();
			
			
//			RegionsDTO regionsDTO = regionsDAO.getDetail(3);
//			regionsView.view(regionsDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
