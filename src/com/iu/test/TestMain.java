package com.iu.test;

import java.util.ArrayList;

import com.iu.countries.CountriesDAO;
import com.iu.countries.CountriesDTO;
import com.iu.countries.CountriesView;
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
		
		try {
//			ar = regionsDAO.getList();
//			regionsView.view(ar);
//			regionsDAO.getDetail(3);
			ar = countriesDAO.getList();
			countriesVIew.view(ar);
//			CountriesDTO countriesDTO = countriesDAO.getDetail("CN");
//			countriesVIew.view(countriesDTO);
			
			
//			RegionsDTO regionsDTO = regionsDAO.getDetail(3);
//			regionsView.view(regionsDTO);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
