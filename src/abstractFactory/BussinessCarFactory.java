package abstractFactory;

public class BussinessCarFactory extends Factory {

	@Override
	public BenziCar createBenz() {
		// TODO Auto-generated method stub
		return new BenzBussinessCar();
	}

	@Override
	public BMWCar createBMW() {
		// TODO Auto-generated method stub
		return new BMWBussinessCar();
	}

}
