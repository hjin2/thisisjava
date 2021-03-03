package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	// 작업클래스를 만들때는 반드시 implements runnable 구현해야함
	// run 메소드 반드시 재정의

	@Override
	public void run() {
		//비프음을 5번 반복해서 소리나게 하는 작업
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			try { Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
