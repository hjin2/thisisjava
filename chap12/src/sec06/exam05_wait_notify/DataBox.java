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
		System.out.println("ConsummerThread가 읽은 데이터: "+returnValue);
		data = null;
		notify(); // 생성자 스레드를 실행대기로 만들어둠
		return returnValue;
	}

	public synchronized void setData(String data) {
		if(this.data != null) {
			//아직 소비자스레드가 데이터를 읽지 않았다면
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		// 데이터필드가 널이면 즉 읽고나서 널로만들었다면
		// 매개값으로 받은걸 필드에 세팅
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: "+data);
		notify();
	}
	
	
}
