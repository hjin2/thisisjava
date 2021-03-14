package sec02.exam01_none_generic_type;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		
		box.set("¿Ã»ø¡¯");
		
		Object name = (String)box.get();
		System.out.println(name);
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();
	}

}
