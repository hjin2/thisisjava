package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	// �۾�Ŭ������ ���鶧�� �ݵ�� implements runnable �����ؾ���
	// run �޼ҵ� �ݵ�� ������

	@Override
	public void run() {
		//�������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try { Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
