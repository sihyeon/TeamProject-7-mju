package constants.Perfume_Info;

public class Perfume_info_patten {  //향수 정보를 위한 부모클래스
	
	public static final int Perfume_Kind = 10;		//향수 종류 갯수
	private String Perfume_Name;					//향수 이름
	private int Perfume_Price;							//향수 가격
	private String Perfume_Top[];						//탑노트 향들
	private String Perfume_Middle[];					//미들노트 향들
	private  String Perfume_Base[];					//베이스노트 향들
	private  String Perfume_image;					//이미지파일명
	private String Perfume_Brand;					//브랜드 이름
	private String User_Sex;							//사용자 성별
	Perfume_info_patten(String Tname, int Tprice, String Ttop[], String Tmiddle[],
			String Tbase[],  String Tbrand, String Timage, String Tsex){		//생성자
		this.Perfume_Name = Tname;
		this.Perfume_Price = Tprice;
		for(int i = 0; i <= 10; i++){
			this.Perfume_Top[i] = Ttop[i];
			this.Perfume_Middle[i] = Tmiddle[i];
			this.Perfume_Base[i] = Tbase[i];
		}
		this.Perfume_Brand = Tbrand;
		this.User_Sex = Tsex;
	}
	public String[] getPerfume_Top() {
		return Perfume_Top;
	}

	public String[] getPerfume_Middle() {
		return Perfume_Middle;
	}

	public String[] getPerfume_Base() {
		return Perfume_Base;
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
