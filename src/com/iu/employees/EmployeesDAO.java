package com.iu.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class EmployeesDAO {
	
	public void  getJoinTest(EmployeesDTO employeesDTO)throws Exception{
		//1.DB 연결
		Connection con = DBConnector.getConnection();
		
		//2.SQL문 생성
		String sql = "SELECT E.LAST_NAME,SALARY, D.DEPARTMENT_NAME "
				+ "		FROM EMPLOYEES E "
			    + "		INNER JOIN "
			    + "		DEPARTMENTS D "
			    + "		ON E.DEPARTMENT_ID = D.DEPARTMENT_ID "
			    + "WHERE E.EMPLOYEE_ID = 100";
		
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 값 세팅
		st.setInt(1, employeesDTO.getEmployee_id());
		
		//5. 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			employeesDTO = new EmployeesDTO();
			employeesDTO.setLast_name(rs.getString("last_name"));
			employeesDTO.setSalary(rs.getInt("salary"));
//			DepartmentsDTO dt = new DepartmentsDTO
//			dt.setDepartment_name(rs.getString("department_name"));	
		}
		
		//6. 연결 해제
		DBConnector.disConnect(st, con);
	}
	
	public void getSalaryInfo() throws Exception{
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		
		//2. 쿼리문 작성
		String sql = "SELECT SUM(SALARY), AVG(SALARY), MAX(SALARY) AS MAX FROM EMPLOYEES";
		
		//3. 쿼리문 미리 보내기
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 값 세팅
		
		//5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			int sum = rs.getInt("SUM(SALARY)");
			double avg = rs.getDouble(2);
			int max = rs.getInt("MAX");
			System.out.println(sum);
			System.out.println(avg);
			System.out.println(max);
		}
		
		//6. 자원 해제
		DBConnector.disConnect(rs, st, con);
	}
	
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
