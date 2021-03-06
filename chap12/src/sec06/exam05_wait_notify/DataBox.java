package sec06.exam05_wait_notify;

public class DataBox {
	private String data;

	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		
		String returnValue = data;
		System.out.println("ConsummerThread�� ���� ������: "+returnValue);
		data = null;
		notify(); // ������ �����带 ������� ������
		return returnValue;
	}

	public synchronized void setData(String data) {
		if(this.data != null) {
			//���� �Һ��ڽ����尡 �����͸� ���� �ʾҴٸ�
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		// �������ʵ尡 ���̸� �� �а��� �ηθ�����ٸ�
		// �Ű������� ������ �ʵ忡 ����
		this.data = data;
		System.out.println("ProducerThread�� ������ ������: "+data);
		notify();
	}
	
	
}
