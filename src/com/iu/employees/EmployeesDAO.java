package com.iu.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class EmployeesDAO {
	
	public EmployeesDTO getDetail(int employee_id) throws Exception {
		EmployeesDTO employeesDTO = null;
	//1. employees에서 하나의 결과
	
			//1. DB 연결
		Connection con = DBConnector.getConnection();
			
			//2. SQL문 작성
		String sql = "select * from employees where employee_id = ?";
			
			//변수가 들어갈 자리는 ? 로 표시한다
			
			//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
			
			//4. ? 값 세팅
		st.setInt(1, employee_id);
			//where num between?(1) and ?(2)
			
			
			//5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
		employeesDTO = new EmployeesDTO();
		employeesDTO.setEmployee_id(rs.getInt(1));
		employeesDTO.setFirst_name(rs.getString(2));
		employeesDTO.setLast_name(rs.getString(3));
		employeesDTO.setEmail(rs.getString(4));
		employeesDTO.setPhone_number(rs.getString(5));
		employeesDTO.setHire_date(rs.getDate(6));
		employeesDTO.setJob_id(rs.getString(7));
		employeesDTO.setSalary(rs.getInt(8));
		employeesDTO.setCommission_pct(rs.getDouble(9));
		employeesDTO.setManager_id(rs.getInt(10));
		employeesDTO.setDepartment_id(rs.getInt(11));
		}
		
		return employeesDTO;
	}
	
	public ArrayList<EmployeesDTO> getList() throws Exception {
		ArrayList<EmployeesDTO> ar = new ArrayList<>();
		EmployeesDTO employeesDTO;
		Connection con = DBConnector.getConnection();
		
		String sql = "select * from employees";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			employeesDTO = new EmployeesDTO();
			employeesDTO.setEmployee_id(rs.getInt(1));
			employeesDTO.setFirst_name(rs.getString(2));
			employeesDTO.setLast_name(rs.getString(3));
			employeesDTO.setEmail(rs.getString(4));
			employeesDTO.setPhone_number(rs.getString(5));
			employeesDTO.setHire_date(rs.getDate(6));
			employeesDTO.setJob_id(rs.getString(7));
			employeesDTO.setSalary(rs.getInt(8));
			employeesDTO.setCommission_pct(rs.getDouble(9));
			employeesDTO.setManager_id(rs.getInt(10));
			employeesDTO.setDepartment_id(rs.getInt(11));
			ar.add(employeesDTO);
		}
		
		
		return ar;
	}

}
