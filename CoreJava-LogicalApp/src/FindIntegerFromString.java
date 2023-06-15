
public class FindIntegerFromString {
   static void findIntegerFromString(String str) {
    	 int length=str.length();
    	 String result= "";
    	 for(int i=0;i<length;i++) {
    		 Character ch =str.charAt(i);
    		 if(Character.isDigit(ch)) {
    			 result +=ch;
    		 }
    	 }
    	 System.out.println("result:"+result);
     }
	public static void main(String[] args) {
		FindIntegerFromString.findIntegerFromString("abc12bn20lk70mm89");

	}

}
