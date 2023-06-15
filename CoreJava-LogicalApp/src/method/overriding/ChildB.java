package method.overriding;

public class ChildB extends ParentA{
	public void m1() {
		System.out.println("ChildB.m1() called");
	}
	
	public void m1(String str) {
		System.out.println("ChildB.m1() with String Param called");
	}
	
	public static void main(String[] args) {
		
		ChildB obj =new ChildB();
		obj.m1();
		obj.m1("abc");
	}

}
