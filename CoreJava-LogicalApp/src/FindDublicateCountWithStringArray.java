import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDublicateCountWithStringArray {

	public static void main(String[] args) {
		Map<String,Integer> dubMap = new HashMap<String,Integer>();
        String [] arr= {"Imran","Imran","Adnan","Adnan","Javed"};
    	for(String ch:arr) {
    		if(dubMap.containsKey(ch)) {
    			dubMap.put(ch, dubMap.get(ch)+1);
    		}else {
    			dubMap.put(ch, 1);
    		}
    	}
    	Set<String> entry=dubMap.keySet();
    	for(String ch:entry) {
    		if(dubMap.get(ch)>=1) {
    			System.out.println(ch+",,,,,"+dubMap.get(ch));
    		}
    	}


	}

}
