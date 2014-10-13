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
		for(PFConstants.PFCheckBox checkbox : PFConstants.PFCheckBox.values()){	//üũ�ڽ� �߰�
			JCheckBox check = new JCheckBox(checkbox.toString());
			this.add(check);
		}
		this.setBorder(BorderFactory.createTitledBorder("��⸦ �������ֽʽÿ�"));		//üũ�ڽ� �г� �̸�
	}
	public class checkboxEventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
}
