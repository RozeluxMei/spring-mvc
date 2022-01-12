package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao{

    private static ArrayList<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Impala", "V6", "5UP3RN4TUR41"));
        cars.add(new Car("Dolores", "VXZ", "B4CK2TH3FUTUR3"));
        cars.add(new Car("Bumblebee", "VZZ", "WH4TIV3DON3"));
        cars.add(new Car("Car0", "E0", "0000000"));
        cars.add(new Car("Car1", "E1", "1111111"));
    }

    @Override
    public ArrayList<Car> getCars(Integer count) {
        if (count == null || count >=5){
            return cars;
        }
        else {
            return (ArrayList<Car>) cars.stream().limit(count).collect(Collectors.toList());
        }
    }


}
