package base;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyMenu implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("����Ʈ ȯ�漳��")) {
			System.out.println("����Ʈ ȯ�漳��");
		}
		
		else if (e.getActionCommand().equals("Close")) {
			System.out.println("����");
			System.exit(0);
		}
		
	}
}


