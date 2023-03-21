package animalUtils;

import animals.Animal;

import java.util.ArrayList;
import java.util.Collections;

import animalUtils.Comparators.AnimalAgeComparator;
import animalUtils.Comparators.AnimalWeightComparator;

public class AnimalUtils {
    /**
     *
     * @param animalList list of Animal (in cage)
     * @param <T>        extend Animal
     */
    static <T extends Animal> void sortByAge(ArrayList<T> animalList) {
        Collections.sort(animalList, new AnimalAgeComparator());
    }

    static <T extends Animal> void sortByWeight(ArrayList<T> animalList) {
        Collections.sort(animalList, new AnimalWeightComparator());
    }

}