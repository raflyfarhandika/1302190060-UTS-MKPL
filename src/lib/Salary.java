package lib;

public class Salary extends Family{

    private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
    private int monthWorkingInYear;
    public Employee employee;
    public Family child;

    public Salary(Employee employee) {
        super(employee);
    }

    public void setMonthlySalary(int grade, Employee employee) {	
		if (grade == 1) {
			monthlySalary = 3000000;
			if (employee.getIsForeigner()) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 2) {
			monthlySalary = 5000000;
			if (employee.getIsForeigner()) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 3) {
			monthlySalary = 7000000;
			if (employee.getIsForeigner()) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}
	}

	public void setMonthWorkingInYear(int monthWorkingInYear) {
		this.monthWorkingInYear = monthWorkingInYear;
	}

	public int getMonthWorkingInYear() {
		return monthWorkingInYear;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public int getOtherMonthlyIncome() {
		return otherMonthlyIncome;
	}

	public int getTotalMonthlySalary(){
		return getMonthlySalary() + getOtherMonthlyIncome();
	}
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}

	public int getAnnualDeductible() {
		return annualDeductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
}
