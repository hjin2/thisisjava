package sec06.exam04_wait_notify;

public class ThreadA extends Thread{
	// ������ü�� ������ �־�ߵǹǷ�
	private WorkObject workObject;
	
	// �����ڸ� ���� WorkObject�� ����
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
