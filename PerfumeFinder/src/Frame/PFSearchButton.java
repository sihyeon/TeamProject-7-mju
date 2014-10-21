package Frame;

import javax.swing.JButton;
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
	//		checkbox = new PFCheckBoxPanel();
		}
	}
}
