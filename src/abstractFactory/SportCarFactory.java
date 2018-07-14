package abstractFactory;
/**
 * ���幤�̽�ɫ
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
