package base;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExampleChoice {

	public static void main(String[] args) {
		
		Frame f = new Frame("질문");
		
		f.setSize(500,250);
		f.setLocation(400,100);
		
		//자동배치 끄기
		f.setLayout(null);
		
		Choice loc=new Choice();
		loc.add("지역선택");
		loc.add("서울");
		loc.add("경기");
		loc.add("인천");
		loc.add("광주");
		loc.add("대구");
		loc.add("대전");
		loc.add("부산");
		
		
		loc.setSize(400,400);
		loc.setLocation(300,300); // 초이스의 좌표(위치)
		
		
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
