package session4;
class C{
	void test(){
		System.out.println("Inside class c");
	}
}
class B extends C{
	void test(){
		System.out.println("Inside class B");
	}
}

class A extends B{
	void test(){
		super.test();
		System.out.println("Inside class A");
	}
	
}

//Result: It is not possible to invoke test() method defined in C from a method in A.
