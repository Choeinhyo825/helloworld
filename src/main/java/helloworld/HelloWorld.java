package helloworld;

public class HelloWorld {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		Book t = new Test();
		t.test();		
	}
}

class Book {
	public void test() {
		System.out.println("Book");
	}
}

class Test extends Book{
	public void test() {
		System.out.println("test");
	}
}
