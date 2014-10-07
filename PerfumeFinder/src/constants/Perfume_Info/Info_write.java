package constants.Perfume_Info;
import java.*;

public class Info_write {
	
	public Perfume_info_super PerfumeList[];
	
	public Perfume_info_super info(){
	PerfumeList = new Perfume_info_super[Perfume_info_super.Perfume_Kind];
	
	PerfumeList[0] = new Perfume_info_super("로즈마리", 3000, "탑", "미들",
		"베이스",  "브랜드", "이미지"); //로즈마리향수
	PerfumeList[1] = new Perfume_info_super("잉여", 3000, "탑", "미들",
		"베이스",  "브랜드", "이미지"); //로즈마리향수
	return null;
	
	
	}
	
}

