package cages;
import animals.Animal;

public interface AnimalCage<T extends Animal> {

    int addAnimal(T t);

    void giveFood(int foodWeight);

    void cleanCage(int garbageWeight);

    // реализация в конкретном классе WolfCage
    T takeOffAnimal();

    int countAnimals();

}