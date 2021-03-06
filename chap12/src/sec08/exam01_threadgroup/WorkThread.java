package sec08.exam01_threadgroup;

public class WorkThread extends Thread{
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName); // 상위 스레드 생성자 호출
	}
	
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("현재 스레드인" + getName() + "가 interrupted되었다.");
				break;
			}
		}
		System.out.println(getName() + "가 종료됨");
	}
}
