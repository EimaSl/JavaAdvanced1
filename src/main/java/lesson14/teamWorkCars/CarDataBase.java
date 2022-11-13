package lesson14.teamWorkCars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class CarDataBase {

    public static final String RESOURCES_CARS = "src/main/resources/Cars";

    public ArrayList<Car> getDatabaseFromFile() throws IOException {
        ArrayList<Car> cars = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(RESOURCES_CARS));
        String currentLine = br.readLine();
        currentLine = br.readLine();

        while (currentLine != null) {
            String[] splitedLine = currentLine.split(",");

            Integer id = Integer.valueOf(splitedLine[0]);
            String brand = splitedLine[1];
            String model = splitedLine[2];
            String color = splitedLine[3];
            Integer weight = Integer.valueOf(splitedLine[4]);
            String origin = splitedLine[5];
            LocalDate date = LocalDate.parse(splitedLine[6]);

            cars.add(new Car(id, brand, model, color, weight, origin, date));
            currentLine = br.readLine();
        }
        return cars;
    }
}

