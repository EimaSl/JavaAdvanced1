package lesson14.teamWorkCars;

import java.time.LocalDate;
import java.util.Date;

public class Car {

    private int id;
    private String brand;
    private String model;
    private String color;
    private int weight;
    private String origin;
    private LocalDate date;

    public Car() {
    }

    public Car(int id, String brand, String model, String color, int weight, String origin, LocalDate date) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.origin = origin;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", origin='" + origin + '\'' +
                ", date=" + date +
                '}';
    }
}
