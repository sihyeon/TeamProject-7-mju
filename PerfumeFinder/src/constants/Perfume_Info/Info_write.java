package constants.Perfume_Info;

public class Info_write {
	
	public Perfume_info_patten PerfumeList[];
	
	public void info(){ //��� ����
	PerfumeList = new Perfume_info_patten[Perfume_info_patten.Perfume_Kind]; 
	
	PerfumeList[0] = new Perfume_info_patten("�Ұ��� �ȴϾ� �Ƹ޽ý�Ʈ", 55000, new String[]{"ȫ�ڸ�", "��������"}, 
								new String[]{ "�Ұ����� �������", "���̸���", "���"}, 
								new String[]{"���", "�ӽ�ũ��"},  "�Ұ���", "�Ұ��� �ȴϾ� �Ƹ޽ý�Ʈ.jpg", "��");
	
	PerfumeList[1] = new Perfume_info_patten("�Ұ��� �Ѹ��ʹ� ���� ��Ǿ", 55000, new String[]{"�ķ��� ��Ʈ����", "��Ż���� ��������", "�϶��϶�", "������"}, 
								new String[]{"�÷ζ�", "���� �̸��", "���� ����������", "���� ��� �ڽ���"},
								new String[]{"�Ŀ���� ����ũ", "�÷η�ƾ ���̸���", "����ũ"},  "�Ұ���", "�Ұ��� �Ѹ��ʹ� ���� ��Ǿ.jpg", "��"); 
	
	PerfumeList[2] = new Perfume_info_patten("�Ұ��� ������� �����ڷ�", 52000, new String[]{"���̹���ũ", "�Ƹ��׹̽þ� ��"}, 
			new String[]{"ȭ��Ʈ ����"}, new String[]{"����"},  "�Ұ���", "�Ұ��� ������� �����ڷ�.jpg", "��");
	
	PerfumeList[3] = new Perfume_info_patten("�����ü� �� �� ������Ǿ", 100000, new String[]{"���̸���", "��ũ����"}, 
			new String[]{"���� �׸���"}, new String[]{"���͸�"},  "�����ü� �ε帮����", "�����ü� �� �� ������Ǿ.jpg", "��");
		}
	
}

