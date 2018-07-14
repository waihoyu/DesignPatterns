package abstractFactory;


/**
 * 1）要有产品族的概念
 * 2）
 * @author WaiHoYu
 *
 */
public abstract class Factory {
	public abstract BenziCar  createBenz();
	public abstract BMWCar createBMW(); 
}
