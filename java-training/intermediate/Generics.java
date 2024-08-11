import java.util.ArrayList;
class Generics<T> {
	private T value;
	public Generics(T value) {
		this.value = value;
	}
	public T getValue() {
		return value;
	}
	public static void main(String[] args) {
		Generics<String> stringGeneric = new Generics<>("Hello");
		Generics<Integer> integerGeneric = new Generics<>(123);
		System.out.println(stringGeneric.getValue());
		System.out.println(integerGeneric.getValue());
	}
}
