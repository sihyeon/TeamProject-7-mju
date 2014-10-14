package Frame;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Graphics;

import constants.PFConstants;

public class PFMainPanel extends JPanel {
	private PFCheckBoxPanel checkbox;	
	private JButton searchbutton;
	private Graphics g;
	public PFMainPanel(){
		
		checkbox = new PFCheckBoxPanel();
		searchbutton = new JButton(new ImageIcon(PFConstants.IMG_URL+"search.png"));
		add(new JLabel(new ImageIcon(PFConstants.IMG_URL+"search.png")));
		add(searchbutton);	//�˻���ư �߰�
		add(checkbox);	//üũ�ڽ� �߰�
	}
}