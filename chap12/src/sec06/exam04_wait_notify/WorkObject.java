package sec06.exam04_wait_notify;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify(); // �� �޼ҵ带 ����Ϸ��� ����ȭ �޼ҵ尡 �Ǿ����
		try {
			wait();
		} catch (InterruptedException e) {}
	}
	
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {}
	}
}