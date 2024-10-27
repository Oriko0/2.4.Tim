package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<Car>();
    private Car car1 = new Car("firm1","model1",1950);
    private Car car2 = new Car("firm2","model2",1960);
    private Car car3 = new Car("firm3","model3",1970);
    private Car car4 = new Car("firm4","model4",1980);
    private Car car5 = new Car("firm5","model5",1990);
    @Override
    public List<Car> getCars(Integer count) {
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        if (count == null || count >= 5 ) {count = 5;}
        return cars.stream().limit(count).collect(Collectors.toList());
        }
    }

