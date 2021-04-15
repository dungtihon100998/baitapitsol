
public class ModernCar extends Car {
	boolean havePositioningDecive;

	public ModernCar(boolean havePositioningDecive) {
		super();
		this.havePositioningDecive = havePositioningDecive;
	}

	public ModernCar(String numberPlate, int yearOfManufacture, String brand, boolean haveInsurance,
			boolean havePositioningDecive) {
		super(numberPlate, yearOfManufacture, brand, haveInsurance);
		this.havePositioningDecive = havePositioningDecive;
	}

	public boolean isHavePositioningDecive() {
		return havePositioningDecive;
	}

	public void setHavePositioningDecive(boolean havePositioningDecive) {
		this.havePositioningDecive = havePositioningDecive;
	}

}
