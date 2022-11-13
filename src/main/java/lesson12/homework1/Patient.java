package lesson12.homework1;

public class Patient {

    String name;
    int age;
    String bloodType;
    double height;
    double weight;

    public Patient() {
    }

    public Patient(String name, int age, String bloodType, double height, double weight) {
        this.name = name;
        this.age = age;
        this.bloodType = bloodType;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", bloodType='" + bloodType + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
