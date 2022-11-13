package lesson12.homework2;

public class Patient {

    String fullName;
    int age;
    double weight;
    String illness;

    public Patient(String fullName, int age, double weight, String illness) {
        this.fullName = fullName;
        this.age = age;
        this.weight = weight;
        this.illness = illness;
    }

    @Override
    public String toString() {
        return fullName + ',' + age + ", " + weight + ", " + illness;
    }
}
