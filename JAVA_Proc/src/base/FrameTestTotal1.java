package base;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameTestTotal1 {

	public static void main(String[] args) {
		Frame frame = new Frame("����");
		
		
		//��ư�� �迭�� �����
		Button[] arbtn = new Button[5];
		String[] btnTitle = {"�ݱ�","����","���","Ȯ��","�ȳ�"};
		
		for(int i=0; i<arbtn.length; i++) {
			arbtn[i]=new Button(btnTitle[i]);
		}
		
		frame.add(arbtn[0], BorderLayout.EAST);
		frame.add(arbtn[1], BorderLayout.WEST);
		frame.add(arbtn[2], BorderLayout.SOUTH);
		frame.add(arbtn[3], BorderLayout.NORTH);
		frame.add(arbtn[4], BorderLayout.CENTER);
		
		//�������� ���빰�� ������ �� ���빰�� ���븸ŭ ������ Ȯ���� �ش�.
		frame.pack();
		frame.setVisible(true);
		
		arbtn[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//x��ư ������
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
