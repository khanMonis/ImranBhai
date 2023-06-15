package sapient.common;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindHighestAndLowestSalaryWithStream {

	static List <Employee> getHighestgSalary(){
		List <Employee>highestList = new ArrayList<Employee>();
		highestList.add(new Employee(101, "Imran", 10000.0f));
		highestList.add(new Employee(140,"Xaxsvier",200.0f));
		highestList.add(new Employee(120,"Abdil",8000.0f));
		highestList.add(new Employee(150,"Meraj",2000.0f));
		highestList.add(new Employee(180,"Adnan",4000.0f));
	    return highestList;
  }
	
	public static void main(String[] args) {
		List <Employee>highestList =getHighestgSalary();
		//Solution 1 for Max salary
		Float maxSalary = highestList.stream()
				 .map(Employee::getEmpSalary)
				 .max(Float::compare).get();
		System.out.println("Max salary of Employee is:"+ maxSalary);
		
		//Solution 2 for Min salary
		Float minSalary = highestList.stream()
				 .map(Employee::getEmpSalary)
				 .min(Float::compare).get();
		System.out.println("Min salary of Employee is:"+ minSalary);
		
		//Solution 3 for Max salary with all fields
		Optional<Employee>highestSal= highestList.stream().
				collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getEmpSalary)));
		System.out.println("Highets salary of Employee is:"+ highestSal.get());
		
		//Solution 4 for Max salary with all fields
				Optional<Employee>lowestSalary= highestList.stream().
						collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getEmpSalary)));
				System.out.println("Min salary of Employee is:"+ lowestSalary.get());
	}

}
