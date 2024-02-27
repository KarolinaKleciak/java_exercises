package LABO_P;

import java.util.ArrayList;
import java.util.Collections;

public class ComissionCar {
    public ArrayList<Car> cars;
    private int numberCar;

    public ComissionCar(){
        cars = new ArrayList<Car>();
    }

    public void addCar(String brand, String model, int engine, String engine_type, String body_type, int year, double price, String date_of_registration) {

        this.cars.add(new Car(brand.toLowerCase(), model.toLowerCase(), engine , engine_type.toLowerCase(), body_type.toLowerCase(), year, price,date_of_registration.toLowerCase()));
    }

    public void printCars(){

        for (Car car: cars) {
            System.out.println(car.toString());
        }
    }

    public void printCars_2() {
        cars.forEach(car -> System.out.println(car.toString()));
    }

    public void sortCarsByEngineCapacity() {
        Collections.sort(cars);
    }
}
