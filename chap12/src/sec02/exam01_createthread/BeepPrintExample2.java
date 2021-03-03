package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		//how1
		/*Runnable beepTask = new BeepTask(); // 작업객체
		Thread thread = new Thread(beepTask); // 스레드 클래스로 직접 스레드 생성
		*/ // run()실행
		
		//how2
		/*Thread thread = new Thread(new Runnable() { // 익명객체로 구현
			@Override
			public void run() {
				//비프음을 5번 반복해서 소리나게 하는 작업
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep();
					try { Thread.sleep(500);}catch(Exception e) {}
				}
				
			}
			
		});*/
		
		//how3
		Thread thread = new Thread(()-> {
			//비프음을 5번 반복해서 소리나게 하는 작업
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0;i<5;i++) {
				toolkit.beep();
				try { Thread.sleep(500);}catch(Exception e) {}
		}
		}); // run의 (),{}
		
		thread.start();
		
		
		//"띵" 문자열을 5번 출력하는 작업
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try { Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
