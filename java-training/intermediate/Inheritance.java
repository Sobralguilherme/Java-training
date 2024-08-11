class Inheritance {
	static class Animal {
		void sound() {
			System.out.println("Animal sound");
		}
	}
	static class Dog extends Animal {
		void sound() {
			System.out.println("Bark");
		}
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
	}
}
