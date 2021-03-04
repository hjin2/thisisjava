package sec05.exam01_state;

public class TargetThread extends Thread {
	@Override
	public void run() {
		for(long i=0;i<2000000000;i++) {}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {}
		for(long i=0;i<000000000;i++) {}
	}
}
