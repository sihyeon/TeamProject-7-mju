package Frame;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import constants.PFConstants;

public class PFSearchButton extends JButton {
	public PFSearchButton(){
		JButton	searchbutton = new JButton(new ImageIcon(PFConstants.IMG_URL+"search.png"));
	}
}
