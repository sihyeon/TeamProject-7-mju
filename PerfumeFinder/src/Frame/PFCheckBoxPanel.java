package Frame;

import javax.swing.JPanel;
import javax.swing.JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import constants.PFConstants;


public class PFCheckBoxPanel extends JPanel {
	private EventHandler eHandler;
//	private JCheckBox check[];
	private static List<JCheckBox> check = new ArrayList<JCheckBox>();
	private static List<String> oPerlishArray = new ArrayList<String>();
	public PFCheckBoxPanel(){
		int i = 0;
		for(PFConstants.PFCheckBox checkbox : PFConstants.PFCheckBox.values()){	//체크박스 추가
			PFCheckBoxPanel.check.add(new JCheckBox(checkbox.toString()));
			this.add(check.get(check.size()-1));
			eHandler = new EventHandler();
			check.get(check.size()-1).addActionListener(eHandler);
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
	

	public static List<JCheckBox> getCheck() {
		return check;
	}
	public List<String> getoPerlishArray() {
		return oPerlishArray;
	}

}
