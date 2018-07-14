package abstractFactory;
/**
 * 具体工程角色
 * @author WaiHoYu
 *
 */
public class SportCarFactory extends Factory {

	@Override
	public BenziCar createBenz() {
		// TODO Auto-generated method stub
		return new BenzSportCar();
	}

	@Override
	public BMWCar createBMW() {
		// TODO Auto-generated method stub
		return new BMWSportCar();
	}

}
