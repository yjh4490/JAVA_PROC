package base;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FrameTestTotal2 {
	public static void main(String[] args) {
		//������ �����
		Frame frame= new Frame();
		frame.setBounds(800,100,250,400);
		frame.setBackground(Color.CYAN);
		
		//��Ʈ
		Font font=new Font(Font.SANS_SERIF, Font.PLAIN, 18);
		
		//���ʴ� :  ������Ʈ�� �ϳ��� ���´�.
		Panel pNorth=new Panel();
		pNorth.setBackground(Color.GREEN);
		
		TextField tf = new TextField(10);
		Button btn = new Button("�Է�");
		btn.setEnabled(false);
		
		pNorth.add(tf);
		pNorth.add(btn);
		pNorth.setFont(font);
		
		 // �߾�
		TextArea ta=new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setEditable(false);
		
		//���ʴ� :  ������Ʈ�� �ϳ��� ���´�.
		Panel pSouth=new Panel();
		pSouth.setFont(font);
		pNorth.setBackground(Color.MAGENTA);
		
		Button btnSave=new Button("����");
		Button btnClose=new Button("�ݱ�");
		
		pSouth.add(btnSave);
		pSouth.add(btnClose);
		
		
		frame.add(pNorth, BorderLayout.NORTH);
		frame.add(ta, BorderLayout.CENTER);
		frame.add(pSouth, BorderLayout.SOUTH);

		
		frame.setVisible(true);
		frame.setResizable(false);
		
		//TextField�� ���� �� ��츸 �Է¹�ư Ȱ��ȭ
		
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				if(tf.getText().equals("")) {
					btn.setEnabled(false);
				}
				else {
					btn.setEnabled(true);
				}
			}
		});
		
		//�߾ƿ� �ؽ�Ʈ���� ����(Enter)
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TextField�� �Է��� ���� TextArea�� ���� �߰� (Enter���)
				if(e.getKeyChar()==KeyEvent.VK_ENTER) {
					ta.append(tf.getText()+"\n");
					
					tf.setText("");
					tf.requestFocus(); // ������ �Է��� ���� �������� �ö�!
				}
			}
		});
		// �߾ӿ� �ؽ�Ʈ���� ����(�Է¹�ư)
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText()+"\n");
				
				//�ؽ�Ʈ�ڽ� �ʱ�ȭ
				tf.setText("");
				//��Ŀ�� �̵�
				tf.requestFocus();
			}
		});
		
		// "�ݱ�" �� ������ �����ϱ�!
		 btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		 
		 // "����" �� ������ �����ϱ�!
		 btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					String message=ta.getText();
					
					try {
					//FileDialog : Save�� Load�Ҷ� �ʿ��� ��ȭ����
					FileDialog fd= new FileDialog(frame,"����",FileDialog.SAVE);
					fd.setVisible(true);
					//���� ���
					String path = fd.getDirectory()+fd.getFile();
						
					if(!message.equals("")) {
					//path��ο� �ؽ�Ʈ ����
					FileWriter fw=new FileWriter(path);
					BufferedWriter bw=new BufferedWriter(fw);
					
					bw.write(message);
					
					if(fd.getFile()!= null) {
						JOptionPane.showMessageDialog(frame, path+"\n��ο� ����Ǿ����ϴ�~");
					}
					bw.close();

					}else {
						JOptionPane.showMessageDialog(frame, "������ ������ �����ϴ�!!");
					}
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					
			}
		});
		 
		 frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "���α׷��� ���� �մϴ� ~ :) ");
				System.exit(0);
			}
		});
		 
		
	}
}
