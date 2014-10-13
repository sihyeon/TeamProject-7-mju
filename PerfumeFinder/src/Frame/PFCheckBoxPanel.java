package Frame;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import constants.PFConstants;


public class PFCheckBoxPanel extends JPanel {
	private checkboxEventHandler eventHandler;
	
	public PFCheckBoxPanel(){
		for(PFConstants.PFCheckBox checkbox : PFConstants.PFCheckBox.values()){	//체크박스 추가
			JCheckBox check = new JCheckBox(checkbox.toString());
			this.add(check);
		}
		this.setBorder(BorderFactory.createTitledBorder("향기를 선택해주십시오"));		//체크박스 패널 이름
	}
	public class checkboxEventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
}
