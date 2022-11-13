package lesson12.homework3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new FileReader("src/main/resources/patients"));
        List<String> name = new ArrayList<>();

        String nm;
        while ((nm = input.readLine()) != null) {
            name.add(nm);
        }
        input.close();
        display(name);
        first(name);
    }

    private static void first(List<String> name) {
        System.out.println("-------");
        System.out.println(name.get(0));
        System.out.println("-------");
        name.add("Vit, 12, 10 , t");
        display(name);
    }

    private static void display(List<String> name) {
        for (String s : name) {
            System.out.println(s);
        }
    }

}
