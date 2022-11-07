package lesson12.intro_data_structureMain;

import java.util.ArrayList;

public class DataStructuresMain {

    public static void main(String[] args) {

        String[] names = new String[3];
        names[2] = "Nikolajus";

        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

        //Array list
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Tomas");
        namesList.add("Agne");
        namesList.add("Stasys");
        namesList.add("Romas");

        for (String name : namesList) {
            System.out.println(name);
        }

        System.out.println();
        namesList.remove("Romas");
        boolean contains = namesList.contains("m");
        System.out.println(namesList);

        Person tim = new Person("Tim", 1200);
        Person rob = new Person("Rob", 1200);
        Person mat = new Person("Mat", 1200);

        ArrayList<Person> team = new ArrayList<>();
        team.add(tim);
        team.add(rob);
        team.add(0, mat);
        System.out.println(team);

        System.out.println(team.contains(rob));

        System.out.println("Salary >= 1000");
        for (Person person : team) {
            if (person.salary >= 1000) {
                System.out.println(person.name + " earns: " + person.salary);
            }
        }
    }
}

class Person {
    public String name;
    public Integer salary;

    public Person(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


