package base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("프린트 환경설정")) {
			System.out.println("프린트 환경설정");
		}
		
		else if (e.getActionCommand().equals("Close")) {
			System.out.println("종료");
			System.exit(0);
		}
		
	}
}


