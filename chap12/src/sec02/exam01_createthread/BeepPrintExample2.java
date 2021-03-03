package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		//how1
		/*Runnable beepTask = new BeepTask(); // �۾���ü
		Thread thread = new Thread(beepTask); // ������ Ŭ������ ���� ������ ����
		*/ // run()����
		
		//how2
		/*Thread thread = new Thread(new Runnable() { // �͸�ü�� ����
			@Override
			public void run() {
				//�������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep();
					try { Thread.sleep(500);}catch(Exception e) {}
				}
				
			}
			
		});*/
		
		//how3
		Thread thread = new Thread(()-> {
			//�������� 5�� �ݺ��ؼ� �Ҹ����� �ϴ� �۾�
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++) {
				toolkit.beep();
				try { Thread.sleep(500);}catch(Exception e) {}
		}
		}); // run�� (),{}
		
		thread.start();
		
		
		//"��" ���ڿ��� 5�� ����ϴ� �۾�
		for(int i=0;i<5;i++) {
			System.out.println("��");
			try { Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
