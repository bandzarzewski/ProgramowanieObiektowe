package Kolekcje;


import java.util.ArrayDeque;

public class SimulationQueue {
    public static void main(String[] args) {
        ArrayDeque<Person> queue = new ArrayDeque<>();
        queue.add(new Person("Zosia", "Piwo"));
        queue.add(new Person("Kasia", "paluszki"));
        queue.add(new Person("Marysia", "Papierosy"));

        while (!queue.isEmpty()) {
            Person currentClient = queue.removeFirst();
            System.out.println(currentClient.getName());
            System.out.println(currentClient.unpackShopping());
        }
        System.out.println("Obsluzylismy klientow");
    }
}
