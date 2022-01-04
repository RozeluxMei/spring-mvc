package web.model;

import java.util.ArrayList;

public class Car {
    private String Name;
    private String Engine;
    private String Serial;

    public Car() {
    }

    public Car(String name, String engine, String serial) {
        Name = name;
        Engine = engine;
        Serial = serial;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }


    public static ArrayList<Car>  getSomeCars (){
    ArrayList<Car> cars = new ArrayList<>();

    cars.add(new Car("Impala", "V6", "5UP3RN4TUR41"));
    cars.add(new Car("Dolores", "VXZ", "B4CK2TH3FUTUR3"));
    cars.add(new Car("Bumblebee", "VZZ", "WH4TIV3DON3"));
    cars.add(new Car("Car0", "E0", "0000000"));
    cars.add(new Car("Car1", "E1", "1111111"));

    return cars;
    }

}