package sapient.common;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class FindAvgSalaryWithStream {
	
	static List <Employee> getAvgSalary(){
		List <Employee>avgList = new ArrayList<Employee>();
		avgList.add(new Employee(101, "Imran", 10000.0f));
		avgList.add(new Employee(140,"Xaxsvier",200.0f));
		avgList.add(new Employee(120,"Abdil",8000.0f));
		avgList.add(new Employee(150,"Meraj",2000.0f));
		avgList.add(new Employee(180,"Adnan",4000.0f));
	    return avgList;
  }
	public static void main(String[] args) {
		List <Employee>avgList=getAvgSalary();
	     System.out.println("Average of Employees' salaries:"+
	    avgList.stream().mapToDouble(Employee::getEmpSalary).average().getAsDouble());
	}
}
