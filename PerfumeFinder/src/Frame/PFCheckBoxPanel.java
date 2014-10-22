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
	private JCheckBox check;
	private static List<String> oPerlishArray = new ArrayList<String>();
	public PFCheckBoxPanel(){
		for(PFConstants.PFCheckBox checkbox : PFConstants.PFCheckBox.values()){	//Ã¼Å©¹Ú½º Ãß°¡
			check = new JCheckBox(checkbox.toString());
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
				PFCheckBoxPanel.oPerlishArray.add(check.getText());
				
			}
		}
	}

	public List<String> getoPerlishArray() {
		return oPerlishArray;
	}

	public void test(){
		System.out.println("Å©ÇïÇï"+check.getText());
		if (check.isSelected()){
			System.out.println("Å©ÇïÇï"+check.getText());
		}
	}
	
}
