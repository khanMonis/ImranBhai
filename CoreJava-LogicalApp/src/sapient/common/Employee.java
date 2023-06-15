package sapient.common;

public class Employee {
	
private Integer empId;
public Employee(Integer empId, String empName, Float empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
}
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Float getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(Float empSalary) {
	this.empSalary = empSalary;
}
private String empName;
private Float empSalary;

}
