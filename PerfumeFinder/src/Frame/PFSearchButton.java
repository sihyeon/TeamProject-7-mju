package Frame;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import constants.PFConstants;

public class PFSearchButton extends JButton {
	private EventHandler eHandler;
	private JButton btn;

	public PFSearchButton(){
		btn = new JButton(new ImageIcon(PFConstants.IMG_URL+"search.png"));
		add(btn);
		eHandler = new EventHandler();
		btn.addActionListener(eHandler);
	}
	private class EventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton bt = (JButton)e.getSource();
			System.out.println("검색버튼 눌렀음");
	//		checkbox = new PFCheckBoxPanel();
		}
	}
	
	public JButton getBtn() {
		return btn;
	}
	
}
