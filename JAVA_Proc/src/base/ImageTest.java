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
		
		//이미지
		ImageIcon img = new ImageIcon("C:/Users/soldesk/Desktop/마 자신있나!.JPG");
		
		JLabel jl = new JLabel(img);//JLabel에만 ImageIcon을 추가할 수 있다.
		jl.setBounds(10, 10, 960, 722); //원본이미지의 width, height를 알아야 함
		
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
