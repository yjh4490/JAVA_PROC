package base;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

public class MenuTest {

	public static void main(String[] args) {
		//�����ӿ� �޴� ���̱�
		Frame f = new Frame("�޴�");
		f.setSize(300,200);
		
		MenuBar menuBar = new MenuBar();
		
		Menu mFile = new Menu("����");
		
		MenuItem miNew = new MenuItem("New");
		MenuItem miOpen = new MenuItem("Open");
		MenuItem miSave = new MenuItem("Save");
		
		Menu print = new Menu("print"); 
		MenuItem printSetup = new MenuItem("����Ʈ ȯ�漳��");
		MenuItem printPre = new MenuItem("�̸�����");
		
		print.add(printSetup);
		print.add(printPre);
		
		MenuItem miClose = new MenuItem("Close");
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		mFile.add(print);
		mFile.add(miClose);
		
		menuBar.add(mFile);
		
		f.setMenuBar(menuBar);
		f.setVisible(true);
		
		
		printSetup.addActionListener(new MyMenu());
		miClose.addActionListener(new MyMenu());
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		
		
		
	}

}
