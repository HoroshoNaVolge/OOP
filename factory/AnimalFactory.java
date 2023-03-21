package factory;

import java.util.ArrayList;

import animals.Animal;

public interface AnimalFactory<T extends Animal> {

    ArrayList<T> createAnimals(int quantity);
}
