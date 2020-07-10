package base;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExampleChoice {

	public static void main(String[] args) {
		
		Frame f = new Frame("����");
		
		f.setSize(500,250);
		f.setLocation(400,100);
		
		//�ڵ���ġ ����
		f.setLayout(null);
		
		Choice loc=new Choice();
		loc.add("��������");
		loc.add("����");
		loc.add("���");
		loc.add("��õ");
		loc.add("����");
		loc.add("�뱸");
		loc.add("����");
		loc.add("�λ�");
		
		
		loc.setSize(400,400);
		loc.setLocation(300,300); // ���̽��� ��ǥ(��ġ)
		
		
		loc.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println(loc.getSelectedItem());
			}
		});
		
		loc.addItemListener(new ChoiceHandler());
		f.add(loc);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
	}

}
