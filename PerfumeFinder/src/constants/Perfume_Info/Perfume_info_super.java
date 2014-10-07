package constants.Perfume_Info;

public class Perfume_info_super {
	
	public static final int Perfume_Kind = 10;
	private String Perfume_Name;
	private int Perfume_Price;
	private String Perfume_Top;
	private String Perfume_Middle;
	private  String Perfume_Base;
	private  String Perfume_image;
	private String Perfume_Brand;
	Perfume_info_super(String Tname, int Tprice, String Ttop, String Tmiddle,
			String Tbase,  String Tbrand, String Timage){
		this.Perfume_Name = Tname;
		this.Perfume_Price = Tprice;
		this.Perfume_Top = Ttop;
		this.Perfume_Middle = Tmiddle;
		this.Perfume_Base = Tbase;
		this.Perfume_Brand = Tbrand;
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
	public String getPerfume_Top() {
		return Perfume_Top;
	}
	public String getPerfume_Middle() {
		return Perfume_Middle;
	}
	public String getPerfume_Base() {
		return Perfume_Base;
	}
	public String getPerfume_image() {
		return Perfume_image;
	}
	public String getPerfume_Brand() {
		return Perfume_Brand;
	}
	
}
