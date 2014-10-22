package Frame;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import constants.PFConstants;

public class PFSearchButton extends JButton {

	public PFSearchButton(){
		super(new ImageIcon(PFConstants.IMG_URL+"search.png"));
	}
	private class EventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JCheckBox  check = (JCheckBox)e.getSource();
			System.out.println(check.getText());		// 체크박스 부분에 이벤트 핸들러로 체크하면 겟소스 되게끔 하기.
	//		checkbox = new PFCheckBoxPanel();
		}
	}
}
