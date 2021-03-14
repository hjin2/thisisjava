package sec04.exam01_generic_method;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(1000);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2= Util.boxing("¿Ã»ø¡¯");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
