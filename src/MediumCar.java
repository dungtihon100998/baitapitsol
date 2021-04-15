
public class MediumCar extends  Car {
	boolean havePowerSteering;
	

	public MediumCar(boolean havePowerSteering) {
		super();
		this.havePowerSteering = havePowerSteering;
	}

	public MediumCar(String numberPlate, int yearOfManufacture, String brand, boolean haveInsurance,
			boolean havePowerSteering) {
		super(numberPlate, yearOfManufacture, brand, haveInsurance);
		this.havePowerSteering = havePowerSteering;
	}

	public boolean isHavePowerSteering() {
		return havePowerSteering;
	}

	public void setHavePowerSteering(boolean havePowerSteering) {
		this.havePowerSteering = havePowerSteering;
	}
	

}
