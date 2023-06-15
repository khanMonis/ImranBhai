package sapient.common;

public class FirstNoneRepeatingChar {

	public static void main(String[] args) {
		String inputStr ="stress";

        for(char ch :inputStr.toCharArray()){
        if ( inputStr.indexOf(ch) == inputStr.lastIndexOf(ch)) {
            System.out.println("First non-repeating character is: "+ch);
            break;
        }

	}

}
}