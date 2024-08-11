class ClassesObjects {
	String name;
	public ClassesObjects(String name) {
		this.name = name;
	}
	public void greet() {
		System.out.println("Hello " + name);
	}
	public static void main(String[] args) {
		ClassesObjects obj = new ClassesObjects("World");
		obj.greet();
	}
}
