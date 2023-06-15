import java.util.ArrayList;
import java.util.List;

public class Test {
	
	
	 int a=10; 
	 static int b=10; 
	 Test() { a++; b++; }
	 

	public static void main(String[] args) {
		 Test ob1=new Test(); Test ob2=new Test(); System.out.println(ob2.a);
		  System.out.println(ob2.b);
		 

	}

}
