package Frame;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import constants.PFConstants;

public class PFSearchButton extends JButton {
	private EventHandler eHandler;
	private JButton btn;
	PFCheckBoxPanel checkbox;
	
	public PFSearchButton(){
		btn = new JButton(new ImageIcon(PFConstants.IMG_URL+"search.png"));
		add(btn);
		checkbox = new PFCheckBoxPanel();
		eHandler = new EventHandler();
		btn.addActionListener(eHandler);
	}
	private class EventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			checkbox.test();
	//		 for (int i = 0; i < checkbox.getoPerlishArray().size(); i++){
	//		      System.out.println(checkbox.getoPerlishArray().get(i));
	//		 }
			System.out.println("검색버튼 눌렀음");
		}
	}
	
	public JButton getBtn() {
		return btn;
	}
	
}
