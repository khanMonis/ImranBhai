import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDublicateCountWithString {
    static void findDublicateCountWithString(String dublicateCount) {
    	Map<Character,Integer> dubMap = new HashMap<Character,Integer>();
    	//char[] chStr = dublicateCount.toCharArray();
    	for(Character ch:dublicateCount.toCharArray()) {
    		if(dubMap.containsKey(ch)) {
    			dubMap.put(ch, dubMap.get(ch)+1);
    		}else {
    			dubMap.put(ch, 1);
    		}
    	}
    	Set<Character> entry=dubMap.keySet();
    	for(Character ch:entry) {
    		if(dubMap.get(ch)>=1) {
    			System.out.println(ch+",,,,,"+dubMap.get(ch));
    		}
    	}
    }
	public static void main(String[] args) {
		findDublicateCountWithString("javanoneej");

	}

}
