package com.iu.countries;

import java.util.ArrayList;

public class CountriesView {
	
	public void view(CountriesDTO countriesDTO) {
		System.out.println("Country_ID\t Country_name");
		System.out.print(countriesDTO.getCountry_id() + "\t\t");
		System.out.println(countriesDTO.getCountry_name());
		
	}
	
	public void view(ArrayList<CountriesDTO> ar) {
		System.out.println("Country_ID\t Country_name");
		for(CountriesDTO countriesDTO : ar) {
			System.out.print(countriesDTO.getCountry_id() + "\t\t");
			System.out.println(countriesDTO.getCountry_name());
		}
	}

}
