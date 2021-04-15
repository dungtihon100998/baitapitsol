import java.awt.List;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Random;

public class CarList  {
	public static void main(String[] args) {
		ArrayList<MediumCar> mediumCar = new ArrayList<MediumCar>();
		ArrayList<ModernCar> modernCar = new ArrayList<ModernCar>();
		ArrayList<OldCar> oldCars = new ArrayList<OldCar>();
		ArrayList<Car> carList = new ArrayList<Car>();
		String[] brands = { "TOYOTA", "BMW", "HYUNDAI" };
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			Car car = new Car();
			car.setBrand(brands[random.nextInt(3)]);
			car.setNumberPlate(String.format("%05d", random.nextInt(100000)));
			car.setYearOfManufacture(random.nextInt(33) + 1980);
			car.setHaveInsurance(random.nextInt(2) == 0 ? false : true);

			carList.add(car);
			System.out.println(car.getBrand() +" "+ car.getNumberPlate() +" "+ car.getYearOfManufacture() +" "+ car.isHaveInsurance());
		}
		for(int j=0 ; j<carList.size();j++) {
			Car carx = carList.get(j);
			if (carx.getYearOfManufacture() <= 1995) {
				OldCar oldCar = new OldCar(carx.getNumberPlate(), carx.getYearOfManufacture() , carx.getBrand(), carx.isHaveInsurance(), 2021-carx.getYearOfManufacture());
				oldCars.add(oldCar);
			}else if (carx.getYearOfManufacture() > 1995 &&carx.getYearOfManufacture() <= 2005) {
				MediumCar mediumCar2 = new MediumCar(carx.getNumberPlate(), carx.getYearOfManufacture() , carx.getBrand(), carx.isHaveInsurance(), true);
				mediumCar.add(mediumCar2);
			}else {
				ModernCar modernCar2 = new ModernCar(carx.getNumberPlate(), carx.getYearOfManufacture() , carx.getBrand(), carx.isHaveInsurance(), true);
				modernCar.add(modernCar2);
			}
			
		}
		for(int z=0; z < oldCars.size();z++) {
			System.out.println(oldCars.get(z).getActionDuration() +" " +oldCars.get(z).getBrand()+" "+oldCars.get(z).getNumberPlate()+" "+oldCars.get(z).getYearOfManufacture()+" "+oldCars.get(z).isHaveInsurance());
		}
		for(int z=0; z < mediumCar.size();z++) {
			System.out.println(mediumCar.get(z).isHavePowerSteering() + mediumCar.get(z).getBrand() + mediumCar.get(z).getNumberPlate() + mediumCar.get(z).getYearOfManufacture() + mediumCar.get(z).isHaveInsurance() ) ;
		}
		for(int z=0; z < modernCar.size();z++) {
			System.out.println(modernCar.get(z).isHaveInsurance() + modernCar.get(z).getBrand() + modernCar.get(z).getNumberPlate() + modernCar.get(z).getYearOfManufacture() + modernCar.get(z).isHaveInsurance());
			
		}
		
		

	}

}
