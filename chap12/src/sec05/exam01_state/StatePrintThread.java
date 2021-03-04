package sec05.exam01_state;

public class StatePrintThread extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
		Thread.State state = targetThread.getState(); // Thread.State����Ÿ��
		System.out.println("Ÿ�� ������ ����: "+ state);
		
		if(state==Thread.State.NEW) {
			// NEW ���¶��
			targetThread.start();
		}
		
		if(state==Thread.State.TERMINATED) {
			break; // StatePrintThread ����
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {}
	}
	}
}
