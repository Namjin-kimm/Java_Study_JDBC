package com.iu.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.PartialResultException;

import com.iu.util.DBConnector;

public class RegionsDAO {
	
	//3. Regions에 데이터 추가
	public int setRegion(RegionsDTO regionsDTO)throws Exception{
		//1. DB연결
		Connection con = DBConnector.getConnection();
		
		//2. 쿼리문 작성
		String sql = "INSERT INTO REGIONS VALUES(?,?)";
		
		//3. 쿼리문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 있다면 값 세팅
		st.setInt(1, regionsDTO.getRegion_id());
		st.setString(2, regionsDTO.getRegion_Name());
		
		//5. 최종 전송 후 결과 처리
		int result = st.executeUpdate();
		
		//6. 자원 해제
		DBConnector.disConnect(st, con);
		
		return result;
	}
	
	//2 Regions에서 하나의 결과(row)
	public RegionsDTO getDetail(int region_id) throws Exception{
		//ArrayList<RegionsDTO> ar = new ArrayList<>();
		RegionsDTO regionsDTO = null;
		
		//1. DB 연결
		Connection con = DBConnector.getConnection();
		
		//2. SQL문 작성
		String sql = "select * from regions where region_id = ?";
		//변수가 들어갈 자리는 ? 로 표시한다
		
		//3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
		//4. ? 값 세팅
		//where num between?(1) and ?(2)
		st.setInt(1, region_id);
		
		//5. 최종 전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			regionsDTO = new RegionsDTO();
			regionsDTO.setRegion_id(rs.getInt(1));
			regionsDTO.setRegion_Name(rs.getString(2));
			
			//ar.add(regionsDTO);
			}
		
		return regionsDTO;
		
	}
	//1. Regions table에 있는 모든 Data 가져오기
	public ArrayList<RegionsDTO> getList() throws Exception {
		ArrayList<RegionsDTO> ar = new ArrayList();
		RegionsDTO regionsDTO = null;
			// 1. DB 연결
		Connection con = DBConnector.getConnection();
		
			// 2. Query문 작성
		String sql = "SELECT * FROM REGIONS";
		
			// 3. Query 문 미리 전송
		PreparedStatement st = con.prepareStatement(sql);
		
			// 4. 최종 전송 후 결과를 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			regionsDTO = new RegionsDTO();
			regionsDTO.setRegion_id(rs.getInt(1));
			regionsDTO.setRegion_Name(rs.getString(2));
			ar.add(regionsDTO);
//			System.out.println(id);
//			System.out.println(name);
		}
		DBConnector.disConnect(rs, st, con);
		return ar;
	}
	

}
