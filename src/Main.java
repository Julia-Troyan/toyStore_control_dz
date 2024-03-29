import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Добро пожаловать в магазин игрушек!");

        ArrayList<Toy> toys1 = new ArrayList<>(List.of(
                new Toy(1, "Конструктор", 20),
                new Toy(2, "Робот", 20),
                new Toy(3, "Кукла", 60)));
        ArrayList<Toy> toys2 = new ArrayList<>(List.of(
                new Toy(1, "Конструктор", 20),
                new Toy(2, "Робот", 20),
                new Toy(3, "Кукла", 60)));
        ArrayList<Toy> toys3 = new ArrayList<>(List.of(
                new Toy(1, "Конструктор", 20),
                new Toy(2, "Робот", 20),
                new Toy(3, "Кукла", 60)));
        ToyStore toyStore = new ToyStore();
        toyStore.put(toys1);
        toyStore.put(toys2);
        toyStore.put(toys3);
        System.out.println(toyStore.getToy());
        System.out.println(toyStore.getToy());
        System.out.println(toyStore.getToy());



    }


}