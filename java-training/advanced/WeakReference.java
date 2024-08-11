import java.lang.ref.WeakReference;
class WeakReferenceExample {
	public static void main(String[] args) {
		String strong = new String("Strong Reference");
		WeakReference<String> weak = new WeakReference<>(strong);
		System.out.println("Weak Reference: " + weak.get());
		strong = null;
		System.gc();
		System.out.println("After GC Weak Reference: " + weak.get());
	}
}
