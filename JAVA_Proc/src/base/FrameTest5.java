package base;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// �����ӿ��� X��ư �̺�Ʈ�� ��� 
public class FrameTest5 {
	public static void main(String[] args) {
		MyFrame fr=new MyFrame();
		
		fr.setBackground(Color.ORANGE);
		fr.setTitle("�ټ���° ����� ������");
		
		// �����ڴ� WindowListener�� �����ϰ� �ִ� MyEventListener Ŭ���� �̴�.
		
		//��ü���� (WindowListener ��ü)
		//fr.addWindowListener(new MyEventListener());
		
		//�κ� ��ü����
		//fr.addWindowListener(new WinClosingListener());
		
		//�͸��� Ŭ����(���� �ϳ�)
		fr.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
			}
			
		});
			
			
		
		
	
	}
}