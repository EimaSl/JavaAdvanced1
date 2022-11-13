package lesson13.oopBasics.encapsulation;

public class Main {
    public static void main(String[] args) {

        Employee tom = new Employee("Tom", 123123, 3000);

        //kai private duomenys encapsuliuoti ir napasiekiami
//        System.out.println("Employee name:" + tom.name + ",personal code: " + tom.personalCode + " , salary:");
//        tom.personalCode = 99999;
//        System.out.println(tom.personalCode);
        tom.setPersonalCode(0007);
        tom.setSalary(1500);
        System.out.println(tom);


        tom.setSalary(100);

        Employee justas = new Employee();
        justas.setName("Justas");
        justas.setSalary(4500);
        justas.setPersonalCode(9876543);


    }
}
