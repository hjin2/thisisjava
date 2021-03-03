package sec02.exam02_threadname;

public class ThreadA extends Thread {
	// 생성자에서 스레드 이름 변경
	public ThreadA() {
		setName("ThreadA"); // 생성시 스레드 이름 변경
	}
	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
