package com.iu.regions;

public class RegionsDTO {
	//멤버변수 접근지정자 : private
	//Getter/setter
	//기본생성자 필수
	//멤버변수명은 Table의 컬럼명과 동일하게 선언
	
	private Integer region_id;
	private String region_Name;
	
	public RegionsDTO() {}

	public Integer getRegion_id() {
		return region_id;
	}

	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}

	public String getRegion_Name() {
		return region_Name;
	}

	public void setRegion_Name(String region_Name) {
		this.region_Name = region_Name;
	}
	
	

}
