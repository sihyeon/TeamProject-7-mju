package constants.Perfume_Info;

public class Perfume_info_patten {  //��� ������ ���� �θ�Ŭ����
	
	public static final int Perfume_Kind = 10;		//��� ���� ����
	private String Perfume_Name;					//��� �̸�
	private int Perfume_Price;							//��� ����
	private String Perfume_scent[];						//���
	private  String Perfume_image;					//�̹������ϸ�
	private String Perfume_Brand;					//�귣�� �̸�
	private String User_Sex;							//����� ����
	public int Priority; 									//�켱��������
	Perfume_info_patten(String Tname, int Tprice, String Tscent[],  String Tbrand, String Timage, String Tsex){		//������
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
