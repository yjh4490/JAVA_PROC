package base;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

// ȭ�� �߾ӿ� window ������ ��ġ��Ű��
public class FrameTest3 {

	public static void main(String[] args) {
		
		
		/*
		 * ȭ�� �߾ӿ� ������ ��ġ ��Ű��
		 1 �������� ������� �ػ󵵸� �˾ƾ� �Ѵ�.
		 2 ����� �߾� ��ǥ�� �˾ƾ� �Ѵ�
		 3 �������� �¿� ũ�⸦ �߾���ǥ���� ���ش�.
		 */
		
		
		// Toolkit�� ���ؼ� �ػ� ��������!
		Frame fr=new Frame("����°");
		fr.setSize(400,400);
		
		
		Toolkit tk=Toolkit.getDefaultToolkit();
		
		Dimension di = tk.getScreenSize();
		int monitorW = di.width;
		int monitorH = di.height;
	
		 //x:����� �߾� ��ǥ�� - ���� ������� �������� width/2	
		 //y:����� �߾� ��ǥ�� - ���� ������� �������� height/2
		
		
		int x = monitorW/2-fr.getWidth()/2;
		int y = monitorH/2-fr.getHeight()/2;
	
		fr.setLocation(x,y);
		fr.setVisible(true);
	

	}
}