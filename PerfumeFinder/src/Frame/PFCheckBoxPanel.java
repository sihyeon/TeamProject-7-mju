package Frame;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;

import constants.PFConstants;


public class PFCheckBoxPanel extends JPanel {
	public PFCheckBoxPanel(){
		for(PFConstants.PFCheckBox checkbox : PFConstants.PFCheckBox.values()){
			JCheckBox check = new JCheckBox(checkbox.toString());
			this.add(check);
		}
		this.setBorder(BorderFactory.createTitledBorder("향기를 선택해주십시오"));
	}
}
