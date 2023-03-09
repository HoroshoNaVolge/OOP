package Comparators;

import animals.Animal;

import java.util.Comparator;

public class AnimalWeightComparator implements Comparator<Animal> {
    int result = 1;

    public AnimalWeightComparator() {
    }

    public AnimalWeightComparator(boolean fromLessToHigher) {
        if (fromLessToHigher)
            result = -result;
    }

    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getWeight() < o2.getWeight()) {
            return result;
        } else if (o1.getWeight() > o2.getWeight()) {
            return -result;
        }
        return 0;
    }
}