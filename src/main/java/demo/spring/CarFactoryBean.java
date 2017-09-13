package demo.spring;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by owen on 2017/8/27.
 */
public class CarFactoryBean implements FactoryBean<Car> {
    private String carInfo;

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        String[] info = carInfo.split(",");
        car.setName(info[0]);
        car.setPrice(Integer.valueOf(info[1]));
        return car;
    }

    @Override
    public Class<Car> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
