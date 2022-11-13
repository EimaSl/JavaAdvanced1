package lesson13.oopBasics.encapsulation;

public class Employee {

    private String name;
    private int personalCode;
    private int salary;

    public Employee(String name, int personalCode, int salary) {
        this.name = name;
        this.personalCode = personalCode;
        this.salary = salary;
    }

    public Employee() {
    }

    /**
     * Viesas metodas leidziantis pasiekti musu nurodyto objekto lauko reiksme
     * Sis metodas Getteris - Accessorius
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
        else {
            System.out.println("Can't be empty");
        }
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(final int salary) {
        if (salary < 500) {
            System.out.println("LOG!!! Salary not changed.Alga negali but maziau minimumo");
        }else {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", personalCode=" + personalCode +
                ", salary=" + salary +
                '}';
    }
}
