
public class OldCar extends Car {
	int actionDuration;

	public OldCar(int actionDuration) {
		super();
		this.actionDuration = actionDuration;
	}
	

	public OldCar(String numberPlate, int yearOfManufacture, String brand, boolean haveInsurance, int actionDuration) {
		super(numberPlate, yearOfManufacture, brand, haveInsurance);
		this.actionDuration = actionDuration;
	}


	public int getActionDuration() {
		return actionDuration;
	}

	public void setActionDuration(int actionDuration) {
		this.actionDuration = actionDuration;
	}

}
