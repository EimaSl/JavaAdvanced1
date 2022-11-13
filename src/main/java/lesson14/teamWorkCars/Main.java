package lesson14.teamWorkCars;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        CarDataBase carDataBase = new CarDataBase();
        ArrayList<Car> fromFile = carDataBase.getDatabaseFromFile();

        CarService carService = new CarService();

        carService.getAllCars(fromFile);

//        carService.findCarsByColor(fromFile,"Blue");
//        carService.findOldestCar(fromFile);
//        carService.findHeaviestCar(fromFile);
//        carService.changeCarColor(fromFile, 25, "Red");
        carService.addCarAndUpdateFile();

    }
}
