package sec06.exam04_wait_notify;

public class ThreadB extends Thread{
	// ������ü�� ������ �־�ߵǹǷ�
	private WorkObject workObject;
	
	// �����ڸ� ���� WorkObject�� ����
	public ThreadB(WorkObject workObject) {
		this.workObject= workObject;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			workObject.methodB();
		}
	}

}
