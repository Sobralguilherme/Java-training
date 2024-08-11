import java.util.ArrayList;
class Collections {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.forEach(System.out::println);
	}
}
