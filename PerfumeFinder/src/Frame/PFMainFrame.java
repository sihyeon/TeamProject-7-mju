package Frame;
import constants.PFConstants;
import constants.Perfume_Info.*;
import PFDataStruct.PFInsert;
import javax.swing.JFrame;

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
		
		this.setSize(PFConstants.WIDTH_MAINFRAME, PFConstants.HEIGHT_MAINFRAME);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		mainPanel = new PFMainPanel();
		add(mainPanel);
	}

}
