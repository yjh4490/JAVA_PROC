package base;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest {

	public static void main(String[] args) {
		
		
		Frame frame=new Frame("ù ������"); // ������ ����
		frame.setBounds(800, 100, 400, 300);//(x��ǥ,y��ǥ,����,����)
		
		System.out.println(frame.getBounds().getWidth()); //double����
		System.out.println(frame.getBounds().height);//int����
		
		frame.setBackground(Color.blue);
		
		frame.setVisible(true);
	}

}
