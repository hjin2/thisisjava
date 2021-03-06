package sec08.exam01_threadgroup;

public class ThreadGoupExample {

	public static void main(String[] args) {
		ThreadGroup myGroup = new ThreadGroup("myGroup"); // main그룹 바로밑에 하위그룹이됨
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[main 스레드 그룹의 list() 메소드 출력 내용]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		
		System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]");
		myGroup.interrupt();
		
	}

}
