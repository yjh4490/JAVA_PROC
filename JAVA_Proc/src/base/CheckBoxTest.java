package base;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CheckBoxTest {
	public static void main(String[] args) {
		
		Frame f=new Frame("질문");
		
		f.setBounds(500,100,800,250);
		
		f.setLayout(new FlowLayout());
		
		Label q1=new Label("1. 관심 분야는 무엇입니까?");
		Checkbox news=new Checkbox("news",true);
		Checkbox sports=new Checkbox("sports");
		Checkbox movie=new Checkbox("movie");
		Checkbox music=new Checkbox("music");
		
		news.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				String str =e.getStateChange()==1 ? "뉴스 선택됨" : "뉴스 선택해제";
				System.out.println(str);
			}
		});
		
		Font font = new Font("맑은고딕",Font.BOLD,30);
		
		q1.setFont(font); // q1이라는 라벨지에  폰트를 붙여줄게!
		
		f.add(q1);
		f.add(news);
		f.add(sports);
		f.add(movie);
		f.add(music);
		
		//배타적 선택 : 여러개중에 한개만 선택(라디오 버튼(둥근모양))
		Label q2 = new Label("2. 영화는 한달에 얼마나 자주 봅니까?");
		CheckboxGroup group = new CheckboxGroup();
		Checkbox one = new Checkbox("한번", group, true);
		Checkbox two = new Checkbox("두번", group, false);
		Checkbox three = new Checkbox("세번", group, false);
		
		//라디오 버튼 선택여부 판단
		one.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("한 번 봅니다.");
			}
		});
		
		two.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("두 번 봅니다.");
			}
		});
		
		three.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("세 번 봅니다.");
			}
		});
		
		
		q2.setFont(font);
		f.add(q2);
		f.add(one);
		f.add(two);
		f.add(three);
		
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		


	}
}