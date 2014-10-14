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
		add("Center",mainPanel);	//프레임에 메인패널 추가
		this.setSize(PFConstants.WIDTH_MAINFRAME, PFConstants.HEIGHT_MAINFRAME);	//프레임 크기 설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료시 콘솔도 종료
		this.setVisible(true);	

	}
}
