package sec02.exam02_threadname;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸�: "+thread.getName());
		
		Thread threada = new ThreadA();
		System.out.println("ThreadA�� ������ ������:" + Thread.currentThread().getName());
		System.out.println("�۾� ������ �̸�:" + threada.getName());
		threada.start(); // threadA�� run�޼ҵ� ����   ��	
		
		Thread threadb = new ThreadB();
		System.out.println("ThreadB�� ������ ������:" + Thread.currentThread().getName());
		threadb.start();
		
		//thread.start()�� �� �� ���� ȣ�� ����!
		//���� �̸� ������ ������ �ٽ� �����ؾߵ�
	}
}