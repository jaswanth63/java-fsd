package problemstatement6_3;

public class Employee {

	int empNo;
	String empName, empAddress;
	
	public Employee(int empNo,String empName,String empAddress) {
		this.empNo=empNo;
		this.empName=empName;
		this.empAddress=empAddress;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

}
