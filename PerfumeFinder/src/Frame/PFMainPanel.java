package Frame;

import javax.swing.JPanel;

public class PFMainPanel extends JPanel {
	private PFCheckBoxPanel checkbox;	
	public PFMainPanel(){
		checkbox = new PFCheckBoxPanel();
		add(checkbox);	//체크박스 추가
	}
}