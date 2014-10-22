package Frame;

import javax.swing.JPanel;
import javax.swing.JCheckBox;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





import constants.PFConstants;


public class PFCheckBoxPanel extends JPanel {
	private EventHandler eHandler;
	private PFCheckBoxPanel checkbox;
	public PFCheckBoxPanel(){
		for(PFConstants.PFCheckBox checkbox : PFConstants.PFCheckBox.values()){	//체크박스 추가
			JCheckBox check = new JCheckBox(checkbox.toString());
			this.add(check);
			eHandler = new EventHandler();
			check.addActionListener(eHandler);
		}
	
	}
	private class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JCheckBox  check = (JCheckBox)e.getSource();
			if (check.isSelected()){
				System.out.println(check.getText());
			}
		}
	}
	public EventHandler geteHandler() {
		return eHandler;
	}
	
}
