package constants.Perfume_Info;

public class Info_write {
	
	public Perfume_info_patten PerfumeList[];
	
	public void info(){ //향수 정보
	PerfumeList = new Perfume_info_patten[Perfume_info_patten.Perfume_Kind]; 
	
	PerfumeList[0] = new Perfume_info_patten("로즈마리", 3000, new String[]{"탑"}, 
								new String[]{ "미들"}, new String[]{"베이스"},  "브랜드", "이미지.jpg", "남"); //로즈마리향수
	PerfumeList[1] = new Perfume_info_patten("라벤더", 3000, new String[]{"탑"}, 
								new String[]{"미들"}, new String[]{"베이스"},  "브랜드", "이미지.png", "여"); //라벤더향수
	}
	
}

