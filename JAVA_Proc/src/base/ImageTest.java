package base;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageTest {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		
		f.setBounds(500, 100, 530, 530);
		
		//�̹���
		ImageIcon img = new ImageIcon("C:/Users/soldesk/Desktop/�� �ڽ��ֳ�!.JPG");
		
		JLabel jl = new JLabel(img);//JLabel���� ImageIcon�� �߰��� �� �ִ�.
		jl.setBounds(10, 10, 960, 722); //�����̹����� width, height�� �˾ƾ� ��
		
		f.add(jl);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}
