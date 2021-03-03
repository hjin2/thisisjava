package sec02.exam02_threadname;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: "+thread.getName());
		
		Thread threada = new ThreadA();
		System.out.println("ThreadA를 생성한 스레드:" + Thread.currentThread().getName());
		System.out.println("작업 스레드 이름:" + threada.getName());
		threada.start(); // threadA의 run메소드 실행   ㄱ	
		
		Thread threadb = new ThreadB();
		System.out.println("ThreadB를 생성한 스레드:" + Thread.currentThread().getName());
		threadb.start();
		
		//thread.start()는 딱 한 번만 호출 가능!
		//같은 이름 쓰려면 스레드 다시 생성해야됨
	}
}
