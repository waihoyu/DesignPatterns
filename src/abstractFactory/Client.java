package abstractFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// π”√≈‹≥µ
		Factory f = new SportCarFactory();
		BenziCar benzi = f.createBenz();
		BMWCar bmw = f.createBMW();
		benzi.drive();
		bmw.drive();
	}

}
