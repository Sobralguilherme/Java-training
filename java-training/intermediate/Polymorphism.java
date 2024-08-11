class Polymorphism {
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
	static class Cat extends Animal {
		void sound() {
			System.out.println("Meow");
		}
	}
	public static void main(String[] args) {
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		animal1.sound();
		animal2.sound();
	}
}
