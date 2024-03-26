import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Toy> toys1 = new ArrayList<>(List.of(
                new Toy(1, "Конструктор", 2),
                new Toy(2, "Робот", 2),
                new Toy(3, "Кукла", 6)));
        ArrayList<Toy> toys2 = new ArrayList<>(List.of(
                new Toy(1, "Конструктор", 2),
                new Toy(2, "Робот", 2),
                new Toy(3, "Кукла", 6)));
        ArrayList<Toy> toys3 = new ArrayList<>(List.of(
                new Toy(1, "Конструктор", 2),
                new Toy(2, "Робот", 2),
                new Toy(3, "Кукла", 6)));
        ToyStore toyStore = new ToyStore();
        toyStore.put(toys1);
        toyStore.put(toys2);
        toyStore.put(toys3);
        System.out.println(toyStore.getToy());
        System.out.println(toyStore.getToy());
        System.out.println(toyStore.getToy());



    }


}