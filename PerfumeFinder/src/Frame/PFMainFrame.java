package Frame;

import constants.PFConstants;
import constants.Perfume_Info.*;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import java.awt.Image;
import javax.swing.ImageIcon;

public class PFMainFrame extends JFrame {
	private static PFMainFrame uniqueMainFrame = new PFMainFrame(PFConstants.TITLE_MAINFRAME);
	private PFCheckBoxPanel checkBox;
	private PFMainPanel mainPanel;
	
	private PFMainFrame(String title){
		super(title); 

	}
	public static PFMainFrame getUniqueMainFrame() {
		return uniqueMainFrame;
	}
	
	public void init(){
		this.setIconImage(new ImageIcon(PFConstants.IMG_URL+"search.png").getImage());
		mainPanel = new PFMainPanel();
		add("Center",mainPanel);	//�����ӿ� �����г� �߰�
		this.setSize(PFConstants.WIDTH_MAINFRAME, PFConstants.HEIGHT_MAINFRAME);	//������ ũ�� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//����� �ֵܼ� ����
		this.setVisible(true);	

	}
}
