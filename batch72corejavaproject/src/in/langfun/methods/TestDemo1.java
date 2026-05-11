package in.langfun.methods;

///1) Without return type + without arguments 
//No return type + no argument 
public class TestDemo1 {

//	static method
//	static method will load automatically when the class loading 
//	static methods, We can call directly or by using class name or by using Object Reference variable.
//	Whenever, we want to call or load methods before creating an object then make sure that method should be static.
//	Whenever the behavior is same or for common functionalities will use static for methods.
	static void hello() {
		System.out.println("Hello method called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestDemo1 t1 = new TestDemo1();
		TestDemo1.hello();
		t1.show();
	}

//	 instance method
//	 instance methods will load when we create Objects, and we can call by using
//	 Object reference variable.
//	 Whenever we want load or call methods after creating an object then make sure those methods should be instance.
//	 Whenever the different is Specific or changing Object t oObject then we can consider those methods as instance. 
	void show() {
		System.out.println("show method called !");
	}
}
