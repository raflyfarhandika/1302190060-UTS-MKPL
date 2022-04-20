package lib;

import java.time.LocalDate;

public class TaxFunction extends Salary {

	Salary salary;

	public TaxFunction(Employee employee) {
        super(employee);
        //TODO Auto-generated constructor stub
    }

    /**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
	
	
	public static int calculateTax(Salary monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
		int tax = 0;

		msgNumberOfMonthWorking(numberOfMonthWorking);

		infoNumberOfChildren(numberOfMonthWorking);
		
		if (isMarried) {
			tax = (int) Math.round(0.05 * ((totalMonthSalary(monthlySalary) * numberOfMonthWorking) - deductible - (54000000 + 4500000 + (numberOfChildren * 1500000))));
		}else {
			tax = (int) Math.round(0.05 * ((totalMonthSalary(monthlySalary) * numberOfMonthWorking) - deductible - 54000000));
		}

		return totalTaxes(tax);
			 
	}

	public static int totalMonthSalary(Salary salary) {
		return salary.getMonthlySalary() + salary.getOtherMonthlyIncome();
	}

	public static void msgNumberOfMonthWorking(int numberOfMonthWorking) {
		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
	}

	public static void infoNumberOfChildren(int numberOfChildren) {
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}
	}

	public static int totalTaxes(int tax){
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
	}
	
	public int getAnnualIncomeTax(Employee employee) {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == employee.getDateJoined().getYear()) {
			int numberOfMonthWorking = date.getMonthValue() - employee.getDateJoined().getMonthValue();
			salary.setMonthWorkingInYear(numberOfMonthWorking);
		}else {
			salary.setMonthWorkingInYear(12);
		}
		
		return TaxFunction.calculateTax(salary, salary.getOtherMonthlyIncome(), salary.getMonthWorkingInYear(), salary.getAnnualDeductible(), child.getSpouseIdNumber().equals(""), child.getChildIdNumber().size());
	}
}
