package constants.Perfume_Info;

public class Info_write {
	
	public Perfume_info_patten PerfumeList[];
	
	public void info(){ //향수 정보
	PerfumeList = new Perfume_info_patten[Perfume_info_patten.Perfume_Kind]; 
	
	PerfumeList[0] = new Perfume_info_patten("불가리 옴니아 아메시스트", 55000, new String[]{"홍자몽", "오렌지향",/*top*/ "불가리아 로즈버드", 
			"아이리스", "장미",/*middle*/ "우디", "머스크향"/*base*/},  "불가리", "불가리 옴니아 아메시스트.jpg", "여");
	
	PerfumeList[1] = new Perfume_info_patten("불가리 뿌르팜므 오데 퍼퓸", 55000, new String[]{ "이탈리안 베르가못", "일랑일랑", "부케향",/**/ 
			"리빙 미모사", "리빙 프리뤼드로즈", "리빙 삼박 자스민",/**/ "플로렌틴 아이리스", "무스크"},  "불가리", "불가리 뿌르팜므 오데 퍼퓸.jpg", "여"); 
	
	PerfumeList[2] = new Perfume_info_patten("불가리 오떼블랑 오데코롱", 52000, new String[]{"에이벌모스크", "아르테미시아 잎"/**/,
			"화이트 페퍼"/**/},  "불가리", "불가리 오떼블랑 오데코롱.jpg", "여");
	
	PerfumeList[3] = new Perfume_info_patten("나르시소 포 힘 오드퍼퓸", 100000, new String[]{"아이리스", "핑크베리"/**/, 
			"엠버 그리스"/**/,"파촐리"},  "나르시소 로드리게즈", "나르시소 포 힘 오드퍼퓸.jpg", "남");
		}
	
}

