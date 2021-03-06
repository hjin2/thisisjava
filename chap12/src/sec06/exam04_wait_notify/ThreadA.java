package sec06.exam04_wait_notify;

public class ThreadA extends Thread{
	// 공유객체를 가지고 있어야되므로
	private WorkObject workObject;
	
	// 생성자를 통해 WorkObject를 받음
	public ThreadA(WorkObject workObject) {
		this.workObject= workObject;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			workObject.methodA();
		}
	}

}
