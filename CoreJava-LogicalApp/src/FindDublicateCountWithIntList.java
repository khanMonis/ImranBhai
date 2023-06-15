import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDublicateCountWithIntList {

	public static void main(String[] args) {
		Map<Integer,Integer> dubMap = new HashMap<Integer,Integer>();
    	List <Integer> al= new ArrayList<Integer>();
        al.add(10);
        al.add(10);
        al.add(20);
        al.add(20);
        al.add(30);
    	for(Integer ch:al) {
    		if(dubMap.containsKey(ch)) {
    			dubMap.put(ch, dubMap.get(ch)+1);
    		}else {
    			dubMap.put(ch, 1);
    		}
    	}
    	Set<Integer> entry=dubMap.keySet();
    	for(Integer ch:entry) {
    		if(dubMap.get(ch)>=1) {
    			System.out.println(ch+",,,,,"+dubMap.get(ch));
    		}
    	}

	}

}
