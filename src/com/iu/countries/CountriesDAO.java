package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class CountriesDAO {
	
	public CountriesDTO getDetail(String country_id) throws Exception{
		Connection con = DBConnector.getConnection();
		CountriesDTO countriesDTO = null;
		
		String sql = "SELECT * FROM countries where country_id = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, country_id);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			countriesDTO= new CountriesDTO();
			countriesDTO.setCountry_id(rs.getString(1));
			countriesDTO.setCountry_name(rs.getString(2));
//			System.out.println(cId);
//			System.out.println(cName);
		}
		return countriesDTO;
		
		
		
	}
	
	public ArrayList<CountriesDTO> getList () throws Exception {
		ArrayList<CountriesDTO> ar = new ArrayList<>();
		Connection con = DBConnector.getConnection();
		CountriesDTO countriesDTO = null;
		
		String sql = "SELECT * FROM countries";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			countriesDTO = new CountriesDTO();
			countriesDTO.setCountry_id(rs.getString(1));
			countriesDTO.setCountry_name(rs.getString(2));
			ar.add(countriesDTO);
//			System.out.println(id);
//			System.out.println(name);
		}
		
		DBConnector.disConnect(rs, st, con);
		return ar;
	}

	

}
