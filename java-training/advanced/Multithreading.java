class Multithreading {
	static class MyThread extends Thread {
		public void run() {
			System.out.println("Thread running");
		}
	}
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
	}
}
