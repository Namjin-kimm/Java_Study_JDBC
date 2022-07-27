package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnector;

public class CountriesDAO {
	
	public void getList () throws Exception {
		Connection con = DBConnector.getConnection();
		
		String sql = "SELECT * FROM countries";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			String id = rs.getString("COUNTRY_ID");
			String name = rs.getString("COUNTRY_name");
			System.out.println(id);
			System.out.println(name);
		}
	}

}
