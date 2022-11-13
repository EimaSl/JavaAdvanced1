package lesson13.teamWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Product bananai1 = new Product();
        bananai1.setId(1);
        bananai1.setOrigin("Spain");
        bananai1.setQuantity(9);
        bananai1.setName("Bananai");
        bananai1.setPrice(5.0);

        Product pienas = new Product();
        pienas.setId(1);
        pienas.setOrigin("Poland");
        pienas.setQuantity(2);
        pienas.setName("Pienas");
        pienas.setPrice(2.0);

        Product pc = new Product(123, "Nok", 10.0, 12.5,"Lietuva");

        ArrayList<Product> productai = new ArrayList<>();
        productai.add(bananai1);
        productai.add(pienas);
        productai.add(pc);

        for (Product product : productai) {
            System.out.println(product);
        }

    }
}
