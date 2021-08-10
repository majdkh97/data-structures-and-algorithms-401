package Challenge10;

public class AnimalShelter {
    Queue<Animal> animalQueue = new Queue<>();
    Queue<Animal> catQueue = new Queue<>();
    Queue<Animal> dogQueue = new Queue<>();


    public void enQueue(Animal animal) {
        if (animal instanceof Cat) {
            catQueue.enQueue(animal);
        } else if (animal instanceof Dog) {
            dogQueue.enQueue(animal);
        }
        animalQueue.enQueue(animal);
    }

    public Animal deQueue(String pref) {
        if (!dogQueue.isEmpty() && pref.equalsIgnoreCase("dog")) {
            return dogQueue.deQueue();
        } else if (!catQueue.isEmpty() && pref.equalsIgnoreCase("cat")) {
            return catQueue.deQueue();
        } else
            return null;
    }

    @Override
    public String toString() {

        Node<Animal> current = animalQueue.front;
        String s1 = "";
        while (current != null) {
            s1 = s1 + current.value.name + "->";
            current = current.next;
        }
        s1 = s1 + "null";
        return s1;
    }

    public void displayCats() {
        Node<Animal> current = catQueue.front;
        String s1 = "";
        while (current != null) {
            s1 = s1 + current.value.name + "->";
            current = current.next;
        }
        s1 = s1 + "null";
        System.out.println(s1);
    }

    public void displayDogs() {
        Node<Animal> current = dogQueue.front;
        String s1 = "";
        while (current != null) {
            s1 = s1 + current.value.name + "->";
            current = current.next;
        }
        s1 = s1 + "null";
        System.out.println(s1);
    }
}
