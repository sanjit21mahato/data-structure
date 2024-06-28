package test;

public class A implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside Run:"+ Thread.currentThread().getName());

	}

	public static void main(String[] args) {

		System.out.println("Inside main");
		A a = new A();
		Thread t1 = new Thread(a);
		t1.start();

	}

}
