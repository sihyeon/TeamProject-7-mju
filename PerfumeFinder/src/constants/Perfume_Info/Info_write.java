package constants.Perfume_Info;

public class Info_write {
	
	private static Perfume_info_patten PerfumeList[];
	public Info_write(){
		this.info();
	}
	
	public void info(){ //��� ����
	PerfumeList = new Perfume_info_patten[4]; 
	
	PerfumeList[0] = new Perfume_info_patten("�Ұ��� �ȴϾ� �Ƹ޽ý�Ʈ", 55000, new String[]{"ȫ�ڸ�", "��������",/*top*/ "�������", 
			"���̸���", "���",/*middle*/ "���", "�ӽ�ũ��"/*base*/},  "�Ұ���", "�Ұ��� �ȴϾ� �Ƹ޽ý�Ʈ.jpg", "��");
	
	PerfumeList[1] = new Perfume_info_patten("�Ұ��� �Ѹ��ʹ� ���� ��Ǿ", 55000, new String[]{ "��������", "�϶��϶�", "������",/**/ 
			"�̸��", "����������", "�ڽ���",/**/ "���̸���", "����ũ"},  "�Ұ���", "�Ұ��� �Ѹ��ʹ� ���� ��Ǿ.jpg", "��"); 
	
	PerfumeList[2] = new Perfume_info_patten("�Ұ��� ������� �����ڷ�", 52000, new String[]{"���̹���ũ", "�Ƹ��׹̽þ� ��"/**/,
			"ȭ��Ʈ ����"/**/},  "�Ұ���", "�Ұ��� ������� �����ڷ�.jpg", "��");
	
	PerfumeList[3] = new Perfume_info_patten("�����ü� �� �� ������Ǿ", 100000, new String[]{"���̸���", "��ũ����"/**/, 
			"�����׸���"/**/,"���͸�"},  "�ε帮����", "������Ǿ.jpg", "��");
		}
	public Perfume_info_patten[] getPerfumeList() {
		return PerfumeList;
	}
}

