package in.langfun;

//== operator check content if it is primitive data types.
//== Operator checks Object addresses if it is Object data types  
//if we want compare the content of the String Object then will use .equals() method from String class.

public class TestDataTypesDemo3 {

	public static void main(String[] args) {

		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1 == i2);//true

		Integer i3 = 127;
		Integer i4 = 127;
		System.out.println(i3 == i4);//false
		
		System.out.println("***************************");
		
		int a = 10;
		int b = 10;
		System.out.println(a == b);

		String str = "Srikanth";// String Literal --> SCP : String Constant Pool
		String str2 = "Mounindra";
		String str1 = new String("Srikanth");// String Object : Heap memory

		String str3 = new String("Sai charan");// 2 objects
		String str4 = "Sai Charan";// 0

		System.out.println(str == str1);// false
		System.out.println();
		System.out.println(str == str2);// true

	}

}
