package base;

// ������ �ݱ� ��ư Ȱ��ȭ ���!
import javax.swing.JFrame;

public class FrameTest2 {

	public static void main(String[] args) {
		JFrame fr=new JFrame("�ι�°");
		fr.setSize(400, 400); 	  // ����, ����
		fr.setLocation(800, 100); // ��ǥ
		
		
		// x��ư���� ������ �ݱ�
		// �������� ������ �޸𸮵� �Ҹ�
		// �Ϲ�Frame���� ���� ���
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
		
		
		
	}

}
