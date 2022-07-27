package com.iu.regions;

import java.util.ArrayList;

public class RegionsView {
	
	//view
	
	public void view(RegionsDTO regionsDTO) {
		System.out.println("Region_ID\t Regions_name");
		System.out.print(regionsDTO.getRegion_id() + "\t\t");
		System.out.println(regionsDTO.getRegion_Name() + "\t");
		System.out.print("---------------------------");
	}
	
	public void view(ArrayList<RegionsDTO> ar) {
		System.out.println("Region_ID\t Regions_name");
		for(int i = 0; i < ar.size(); i++) {
			System.out.print(ar.get(i).getRegion_id() + "\t\t");
			System.out.println(ar.get(i).getRegion_Name());
		}
		
//		for(RegionsDTO regionsDTO : ar) {
//			System.out.println(regionsDTO.getRegion_id());
//			System.out.println(regionsDTO.getRegion_Name());
//		}
	}

}
