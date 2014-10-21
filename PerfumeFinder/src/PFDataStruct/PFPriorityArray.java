package PFDataStruct;

import constants.PFConstants;
import constants.Perfume_Info.*;

public class PFPriorityArray {
	private Info_write Info;
	private Perfume_info_patten PerfumeList[];
	
	public PFPriorityArray(){
	}
	
	public Perfume_info_patten[] Array(Perfume_info_patten[] list){
		Info = new Info_write();
		list = Info.getPerfumeList();
		for (int i = Perfume_info_patten.Perfume_Kind-1; i >= 0; i--){
			for (int j = 0; j <= i; j++){
				if (list[j].Priority < list[i].Priority){
					Perfume_info_patten temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
			}
		}
		return list;
	}
}
