package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;

    @Override
    public ArrayList<Car> getCars(Integer count) {
        return carDao.getCars(count);
    }
}
