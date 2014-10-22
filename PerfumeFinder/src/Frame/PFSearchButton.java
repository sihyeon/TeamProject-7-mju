package Frame;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import constants.PFConstants;
import constants.Perfume_Info.Info_write;
import constants.Perfume_Info.Perfume_info_patten;

public class PFSearchButton extends JButton {
	private EventHandler eHandler;
	private JButton btn;
	private PFCheckBoxPanel checkbox;
	private Info_write infowrite;
	
	public PFSearchButton(){
		btn = new JButton(new ImageIcon(PFConstants.IMG_URL+"search.png"));
		add(btn);
		checkbox = new PFCheckBoxPanel();
		infowrite = new Info_write();
		eHandler = new EventHandler();
		btn.addActionListener(eHandler);
	}
	private class EventHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			for(int i = 0; i < infowrite.getPerfumeList().length; i++){
				infowrite.getPerfumeList()[i].Priority = 0;
			}
			for(int x = 0; x < checkbox.getCheck().size(); x++){		//여기부터 향수의 이름을 찾아서 맞는게 있으면 우선순위 증가
				if(checkbox.getCheck().get(x).isSelected()){
					System.out.println(checkbox.getCheck().get(x).getText());
					for(int y = 0; y < infowrite.getPerfumeList().length-1; y++){
						for(int z = 0; z < infowrite.getPerfumeList()[y].getPerfume_Scent().length-1; z++){
							if(checkbox.getCheck().get(x).getText().equals(infowrite.getPerfumeList()[y].getPerfume_Scent()[z])){
								infowrite.getPerfumeList()[y].Priority ++;
								System.out.println(infowrite.getPerfumeList()[y].getPerfume_Name()+"1 증가");
								System.out.println(infowrite.getPerfumeList()[y].Priority);
							}
						}
					}
				}
			}
			System.out.println("검색버튼 눌렀음");
		}
	}
	
	public JButton getBtn() {
		return btn;
	}
	
}
