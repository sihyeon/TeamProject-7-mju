package Frame;

import javax.swing.JPanel;
import javax.swing.JCheckBox;


import constants.PFConstants;


public class PFCheckBoxPanel extends JPanel {
	private PFCheckBoxPanel checkbox;
	public PFCheckBoxPanel(){
		for(PFConstants.PFCheckBox checkbox : PFConstants.PFCheckBox.values()){	//üũ�ڽ� �߰�
			JCheckBox check = new JCheckBox(checkbox.toString());
			this.add(check);
		}
		//this.setBorder(BorderFactory.createTitledBorder("��⸦ �������ֽʽÿ�"));		//üũ�ڽ� �г� �̸�
	}
}
