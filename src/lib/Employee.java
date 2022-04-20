package lib;

import java.time.LocalDate;

public class Employee extends User{

	private enum Gender{
		LAKILAKI,
		PEREMPUAN
	}
	private Gender gender; //true = Laki-laki, false = Perempuan

	private String employeeId;
	private LocalDate dateJoined;
	
	private boolean isForeigner;
	
	public Employee(User employeeData, String employeeId, String firstName, String lastName, String idNumber, String address, Gender gender, LocalDate dateJoined, boolean isForeigner) {
		super(firstName, lastName, idNumber, address);
		setEmployeeId(employeeId);
		setGender(gender);
		setDateJoined(dateJoined);
		setIsForeigner(isForeigner);
	}

    public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setDateJoined(LocalDate dateJoined) {
		this.dateJoined = dateJoined;
	}

	public LocalDate getDateJoined() {
		return this.dateJoined;
	}

	public void setIsForeigner(boolean isForeigner) {
		this.isForeigner = isForeigner;
	}

	public boolean getIsForeigner() {
		return this.isForeigner;
	}

	public void setGender(Gender gender){
		this.gender = gender;
	}

	public Gender getGender(){
		return this.gender;
	}
	
	/*
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3: 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */
	
}
