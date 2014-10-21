package Frame;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;

import constants.PFConstants;

public class PFMainPanel extends JPanel {
	private PFCheckBoxPanel checkbox;	
	private PFSearchButton searchbutton;
	private JLabel title;
	
	public PFMainPanel(){
		checkbox = new PFCheckBoxPanel();
		searchbutton = new PFSearchButton();
		title = new JLabel(new ImageIcon(PFConstants.IMG_URL+"PF.png"));
		title.setPreferredSize(new Dimension(1900,200));
		add(title);
		
		checkbox.setPreferredSize(new Dimension(500,300));
		add(checkbox);	//체크박스 추가
		
		add(searchbutton);	//검색버튼 추가
	}
}