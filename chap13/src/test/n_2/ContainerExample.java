package test.n_2;

// 2¹ø
public class ContainerExample {
	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.set("È«±æµ¿");
		String str = container1.get();

		Container<Integer> container2 = new Container<>();
		container2.set(6);
		int value = container2.get();

	}
}
