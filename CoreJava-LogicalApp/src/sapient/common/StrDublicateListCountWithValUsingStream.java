package sapient.common;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StrDublicateListCountWithValUsingStream {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Banana", "Apple", "Banana", "Apple", "Mango");
		Map<String,Long>dubMap = list.stream().collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting()));
		dubMap.entrySet().stream().forEach(key->{
			System.out.println(key.getKey()+":"+key.getValue());	
		});
	}
}
