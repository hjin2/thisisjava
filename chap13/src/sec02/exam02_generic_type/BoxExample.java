package sec02.exam02_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		
		box.set("¿Ã»ø¡¯");
		
		String name = box.get();
		System.out.println(name);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(3);
		int num = box2.get();
	}

}
