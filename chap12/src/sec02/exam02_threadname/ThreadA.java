package sec02.exam02_threadname;

public class ThreadA extends Thread {
	// �����ڿ��� ������ �̸� ����
	public ThreadA() {
		setName("ThreadA"); // ������ ������ �̸� ����
	}
	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println(getName() + "�� ����� ����");
		}
	}
}