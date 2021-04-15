
public class Car {
	public String numberPlate;
	public int yearOfManufacture;
	public String brand;
	public boolean haveInsurance;

	public Car() {
		super();
	}
	

	public Car(String numberPlate, int yearOfManufacture, String brand, boolean haveInsurance) {
		super();
		this.numberPlate = numberPlate;
		this.yearOfManufacture = yearOfManufacture;
		this.brand = brand;
		this.haveInsurance = haveInsurance;
	}


	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isHaveInsurance() {
		return haveInsurance;
	}

	public void setHaveInsurance(boolean haveInsurance) {
		this.haveInsurance = haveInsurance;
	}
	

	
}
