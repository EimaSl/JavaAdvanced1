package lesson14.teamWorkCars;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class CarService {

    public void getAllCars(ArrayList<Car> cars) {
        System.out.println("All cars: ");
        for (Car car : cars) {
            System.out.println("\t\t\t" + car);
        }
    }


    public ArrayList<Car> findCarsByColor(ArrayList<Car> cars, String color) {
        System.out.println("Find cars with color " + color);
        ArrayList<Car> carByColor = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor() != null && car.getColor().equals(color) && !car.getColor().isEmpty()) {
                carByColor.add(car);
            }
        }
        return carByColor;
    }

    public ArrayList<Car> findCarsByModel(ArrayList<Car> cars, String model) {
        System.out.println("Find cars model :  " + model);
        ArrayList<Car> carByModel = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel() != null && car.getModel().equals(model) && !car.getModel().isEmpty()) {
                carByModel.add(car);
            }
        }
        return carByModel;
    }

    public ArrayList<Car> findCarsByMake(ArrayList<Car> cars, String make) {
        System.out.println("Find cars make :  " + make);
        ArrayList<Car> carByMake = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand() != null && car.getBrand().equals(make) && !car.getBrand().isEmpty()) {
                carByMake.add(car);
            }
        }
        return carByMake;
    }

    public ArrayList<Car> findCarsHeavierThanGivenWeight(ArrayList<Car> cars, Integer givenWeight) {
        System.out.println("Find cars hevier than :  " + givenWeight);
        ArrayList<Car> carsHeavierThanGiven = new ArrayList<>();
        for (Car car : cars) {
            if (car.getWeight() > givenWeight) {
                carsHeavierThanGiven.add(car);
            }
        }
        return carsHeavierThanGiven;
    }

    public ArrayList<Car> findCarsNewerThanGivenDate(ArrayList<Car> cars, LocalDate givenDate) {
        System.out.println("Find cars newer than :  " + givenDate);
        ArrayList<Car> carsNewerThanGivenDate = new ArrayList<>();
        for (Car car : cars) {
            if (car.getDate().isAfter(givenDate)) {
                carsNewerThanGivenDate.add(car);
            }
        }
        return carsNewerThanGivenDate;
    }

    public ArrayList<Car> findCarsFromGivenCountry(ArrayList<Car> cars, String givenCountry) {
        System.out.println("Find cars from given Country :  " + givenCountry);
        ArrayList<Car> carsFromGivenCountry = new ArrayList<>();
        for (Car car : cars) {
            if (givenCountry != null && car.getOrigin().equalsIgnoreCase(givenCountry)) {
                carsFromGivenCountry.add(car);
            }
        }
        return carsFromGivenCountry;
    }

    public Car findOldestCar(ArrayList<Car> cars) {
        System.out.println("Oldest car :  ");
        Car oldestCar = new Car();


        oldestCar.setDate(LocalDate.parse("2022-11-13"));
        LocalDate oldestDate = LocalDate.now();

        for (Car car : cars) {
            if (car.getDate().isBefore(oldestDate)) {
                oldestDate = car.getDate();
                oldestCar = car;
            }
        }
        System.out.println(oldestCar);
        return oldestCar;
    }

    public Car findHeaviestCar(ArrayList<Car> cars) {
        System.out.println("Heaviest car :  ");
        Car heaviestCar = new Car();
        heaviestCar.setWeight(0);

        for (Car car : cars) {
            if (car.getWeight() > heaviestCar.getWeight()) {
                heaviestCar = car;
            }
        }
        System.out.println(heaviestCar);
        return heaviestCar;
    }

    public void changeCarColor(ArrayList<Car> cars, Integer id, String color) {
        System.out.println("Select by Id car color to change: ");

        for (Car car : cars) {
            if (car.getId() == id && !car.getColor().equals(color)) {
                car.setColor(color);
                System.out.println("Color changed to " + color);
                System.out.println(car);
            }
        }
    }

    public void addCarAndUpdateFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter("src/main/resources/Cars", true);
        BufferedWriter bw = new BufferedWriter(fileWriter);

        System.out.println("Enter new car: Id, Brand, Model, Color, Weight, Origin, date");
        String readLine = scanner.next();

        bw.append("");
        bw.write(readLine);
        bw.close();

    }

    public void fileToJson(ArrayList<Car> cars) {
        // + added dependency
        //<!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
        String json = new Gson().toJson(cars);
        try {
            FileWriter file = new FileWriter("src/main/resources/output.json");
            file.write(json);
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("JSON file created");
    }
}
