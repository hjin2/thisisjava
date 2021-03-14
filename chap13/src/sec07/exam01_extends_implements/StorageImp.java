package sec07.exam01_extends_implements;

public class StorageImp<T> implements Storage<T>{
	private T[] array;
	
	public StorageImp(int capacity) {
		this.array = (T[]) (new Object[capacity]);
	}
	@Override
	public void add(T item, int index) {
		array[index] = item;
		
	}

	@Override
	public T get(int index) {
		return array[index];
	}
	
	

}
