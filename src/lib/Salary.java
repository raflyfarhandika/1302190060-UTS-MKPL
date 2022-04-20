package lib;

import java.time.LocalDate;

public class Salary extends Family{

    private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;
    private int monthWorkingInYear;
    public Employee employee;
    public Family child;

    public Salary(Employee employee) {
        super(employee);
        //TODO Auto-generated constructor stub
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
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
	public int getAnnualIncomeTax(Employee employee) {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == employee.getDateJoined().getYear()) {
			monthWorkingInYear = date.getMonthValue() - employee.getDateJoined().getMonthValue();
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, child.getSpouseIdNumber().equals(""), child.getChildIdNumber().size());
	}
}
