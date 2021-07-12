package animalShelter;

import Type.Queue;

public class Animal_Shelter {

    private Queue<Dogs> dogs;
    private Queue<Cats> cats ;

    public Animal_Shelter() {
        this.dogs = new Queue<>();
        this.cats = new Queue<>();
    }

   public void enqueue(Dogs dog){
        dogs.enqueue(dog);
   }
    public void enqueue(Cats cat){
        cats.enqueue(cat);
    }

    public Animal dequeue(String animal) {
        if (animal.equalsIgnoreCase("dog") && !dogs.isEmpty()) {
            return dogs.dequeue();
        } else if (animal.equalsIgnoreCase("cat") && !cats.isEmpty()) {
            return cats.dequeue();
        } else {
            return null;
        }
    }
}
