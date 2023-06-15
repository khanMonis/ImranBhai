
public class ReverseStringVal {

	public static void main(String[] args) {
      String  st ="Hello me";
      char[] reverse= st.toCharArray();
      for(int i =reverse.length-1;i>=0;i--) {
    	  System.out.println("revesre string::"+reverse[i]);
      }
	}

}
