package sec06.exam03_join;

public class SumThread extends Thread {
	private long sum;
	
	// 필드의 값 외부로 전달, 외부에서 변경할 수 있도록
	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			sum += i;
		}
	}
	
	
	

}
