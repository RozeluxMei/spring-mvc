package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCarTable(ModelMap model, @RequestParam(required = false) Integer count) {
        List<Car> cars = new ArrayList<>(getCarsService(count));
        model.addAttribute("cars", cars);

        return "cars";
    }

    public ArrayList<Car> getCarsService (Integer count) {
        if (count == null || count >= 5){
            return Car.getSomeCars();
        } else {
            return (ArrayList<Car>) Car.getSomeCars().stream().limit(count).collect(Collectors.toList());
        }
    }
}

