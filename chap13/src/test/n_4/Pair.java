package test.n_4;

public class Pair <K,V>{
	private K key;
	private V value;
	
	public Pair(K k,V v) {
		this.key = k;
		this.value = v;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	
	

}
