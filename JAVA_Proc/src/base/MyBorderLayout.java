package base;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyBorderLayout {
	
	Frame f =new Frame(); //패널 초기화
	Button jb1 = new Button("북");
	Button jb2 = new Button("서");
	Button jb3 = new Button("중앙");
	Button jb4 = new Button("동");
	Button jb5 = new Button("남");
	//Button jb6 = new Button("버튼6");
	
	public MyBorderLayout() {
		//프레임을 보더레이아웃으로 세팅
		f.setLayout(new BorderLayout());
		
		//프레임에 버튼 추가
		//BorderLayout 버튼 추가시에 North, west, center, east, south의
		//다섯위치 중 어디에 배치시킬 것인지를 반드시 명시해줘야 한다.
		f.add(jb1, BorderLayout.NORTH); //"North"라고 명시해도 되긴 함
		f.add(jb2, BorderLayout.WEST);
		f.add(jb3, BorderLayout.CENTER);
		f.add(jb4, BorderLayout.EAST);
		f.add(jb5, BorderLayout.SOUTH);
		//f.add(jb6, "Center);
		
		f.setSize(400, 300); // 원도우의 크기 가로X세로
		f.setVisible(true);  // 창을 보여줄때 true, 숨길때 false 사용 ~!! 
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
	}
	public static void main(String[] args) {
		new MyBorderLayout();
	
	}
}
