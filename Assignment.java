public class Assignment
{
	public static void main(String args[]){
		A a = new A();
		a.test("hi",2);
	}
}

class C{
	void test(String S,int num1){
		
		System.out.println("Base class C with both string and int arguments");
	}


void test(int num1){
	
	System.out.println("Base class C with int arguments");
}
}
class B extends C{
	void test(){
	
		System.out.println("Class B extending C");
	}
}

class A extends B{
	void test(int num2){
		super.test();
		System.out.println("Class A extending B");
	}
}


