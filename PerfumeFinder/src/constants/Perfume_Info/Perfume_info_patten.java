package constants.Perfume_Info;

public class Perfume_info_patten {  //향수 정보를 위한 부모클래스
	
	public static final int Perfume_Kind = 10;		//향수 종류 갯수
	private String Perfume_Name;					//향수 이름
	private int Perfume_Price;							//향수 가격
	private String Perfume_scent[];						//향들
	private  String Perfume_image;					//이미지파일명
	private String Perfume_Brand;					//브랜드 이름
	private String User_Sex;							//사용자 성별
	public int Priority; 									//우선순위설정
	Perfume_info_patten(String Tname, int Tprice, String Tscent[],  String Tbrand, String Timage, String Tsex){		//생성자
		this.Perfume_Name = Tname;
		this.Perfume_Price = Tprice;
		this.Perfume_scent = Tscent;
		this.Perfume_Brand = Tbrand;
		this.User_Sex = Tsex;
		this.Priority = 0;
	}
	public String[] getPerfume_Scent() {
		return Perfume_scent;
	}
	
	public String getUser_Sex() {
		return User_Sex;
	}

	public void setUser_Sex(String user_Sex) {
		User_Sex = user_Sex;
	}

	public static int getPerfumeKind() {   
		return Perfume_Kind;
	}

	public String getPerfume_Name() {
		return Perfume_Name;
	}
	public int getPerfume_Price() {
		return Perfume_Price;
	}
	public String getPerfume_image() {
		return Perfume_image;
	}
	public String getPerfume_Brand() {
		return Perfume_Brand;
	}
	
}
