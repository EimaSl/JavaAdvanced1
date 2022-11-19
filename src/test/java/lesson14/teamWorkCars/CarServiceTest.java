package lesson14.teamWorkCars;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarServiceTest {

   static CarService carService = new CarService();

    @Test
    void findCarsByColor() {
        //given
        ArrayList<Car> cars = new ArrayList<>();
        Car car = new Car(3, "Mitsubishi", "Mirage", "Blue", 529, "Latvia", LocalDate.parse("2020-06-28"));
        Car car1 = new Car(4, "Volvo", "Tanke", "Blue", 529, "Lithuania", LocalDate.parse("2020-06-28"));
        Car car2 = new Car(4, "Volvo", "Tanke", "Red", 529, "Lithuania", LocalDate.parse("2020-06-28"));
        cars.add(car);
        cars.add(car1);
        cars.add(car2);
        cars.add(null);
        //when

        cars = carService.findCarsByColor(cars, "Blue");
        //then
        assertEquals("Blue", cars.get(0).getColor());
        assertEquals(2, cars.size());
        assertEquals("Mitsubishi", cars.get(0).getBrand());
        assertEquals("Volvo", cars.get(1).getBrand());
    }

    @Test
    void findCarsByModel() {

        ArrayList<Car> data1 = new ArrayList<>();
        ArrayList<Car> actualCarsByModel = new ArrayList<>();
        Car car = new Car(3, "Mitsubishi", "Mirage", "Blue", 529, "Latvia", LocalDate.parse("2020-06-28"));
        Car car1 = new Car(4, "Volvo", "Tanke", "Blue", 529, "Lithuania", LocalDate.parse("2020-06-28"));
        data1.add(car);
        data1.add(car1);
        //when
        actualCarsByModel = carService.findCarsByModel(data1,"Tanke");
        //then
        assertEquals("Tanke", actualCarsByModel.get(0).getModel());
    }

    @Test
    void findCarsByMake() {

        ArrayList<Car> data1 = new ArrayList<>();
        Car car = new Car(3, "Mitsubishi", "Mirage", "Blue", 529, "Latvia", LocalDate.parse("2020-06-28"));
        Car car1 = new Car(4, "Volvo", "Tanke", "Blue", 529, "Lithuania", LocalDate.parse("2020-06-28"));
        data1.add(car);
        data1.add(car1);
        ArrayList<Car> actualCarsByModel = new ArrayList<>();

        //when
        actualCarsByModel = carService.findCarsByModel(data1,"Tanke");
        //then
        assertEquals("Tanke", actualCarsByModel.get(0).getModel());
    }


}