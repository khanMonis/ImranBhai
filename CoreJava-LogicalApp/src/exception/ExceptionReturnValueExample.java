package exception;

public class ExceptionReturnValueExample {

	@SuppressWarnings("finally")
	public int m1() {
		try {
			int a=100/0;
			System.out.println("try called");
			return 0;
		} catch (Exception e) {
			System.out.println("catch called");
			e.printStackTrace();
			return 1;
		}
		finally {
			System.out.println("finally called");
			return 2;
		}
		
	}
	public static void main(String[] args) {
		ExceptionReturnValueExample obj = new ExceptionReturnValueExample();
		int val = obj.m1();
		System.out.println("return val::"+val);

	}

}
