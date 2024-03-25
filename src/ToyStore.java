import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ToyStore {
    private final PriorityQueue<ArrayList<Toy>> queue = new PriorityQueue<>();

//    public ToyStore(PriorityQueue<ArrayList<Toy>> queue) {
//        this.queue = queue;
//    }

    public void put(ArrayList<Toy> toys) {
        this.queue.add(toys);
    }
    public Queue<ArrayList<Toy>> getQueue(){
        return queue;
    }

    public Toy getToy() {
        if (!getQueue().isEmpty()) {
            Random random = new Random();
            Toy randomToy;
            randomToy = getQueue().element().remove(random.nextInt(getQueue().poll().size()));
            return randomToy;
            } else {
            return null;
        }
    }


}


