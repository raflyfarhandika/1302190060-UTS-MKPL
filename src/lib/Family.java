package lib;

import java.util.List;
import java.util.LinkedList;

public class Family extends Employee{
    private String spouseName;
	private String spouseIdNumber;

	private List<String> childNames;
	private List<String> childIdNumbers;

    public Family(Employee employee){
        super(employee, employee.getFirstName(), employee.getLastName(), employee.getIdNumber(), employee.getAddress(), employee.getEmployeeId(), employee.getGender(), employee.getDateJoined(), employee.getIsForeigner());
        childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>();
    }

    public void setSpouseIdNumber(Employee employee) {
        this.spouseIdNumber = employee.getIdNumber();
    }

    public String getSpouseIdNumber() {
        return this.spouseIdNumber;
    }

    public void setSpouseName(Employee employee) {
        this.spouseName = employee.getFirstName() + " " + employee.getLastName();
    }

    public String getSpouseName() {
        return this.spouseName;
    }

    public void setSpouse(Employee employee){
        this.spouseName = employee.getFirstName() + " " + employee.getLastName();
        this.spouseIdNumber = employee.getIdNumber();
    }
	
	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}

    public List<String> getChildIdNumber() {
        return this.childIdNumbers;
    }
}