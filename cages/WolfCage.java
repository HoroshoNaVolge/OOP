package cages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import Comparators.AnimalWeightComparator;
import Comparators.WolfAgeComparator;
import Iterators.WolfIterator;
import animals.Animal;
import animals.Wolf;

public class WolfCage implements AnimalCage<Wolf>, Iterable<Wolf> {

    private ArrayList<Wolf> wolves;
    private int foodWeight;
    private int garbageWeight;

    public WolfCage(ArrayList<Wolf> wolves, int foodWeight, int garbageWeight) {
        this.wolves = wolves;
        this.foodWeight = foodWeight;
        this.garbageWeight = garbageWeight;
    }

    public WolfCage() {
        this.wolves = new ArrayList<Wolf>();
    }

    public ArrayList<Wolf> getWolves() {
        return wolves;
    }

    public void setWolves(ArrayList<Wolf> wolves) {
        this.wolves = wolves;
    }

    public int getFoodWeight() {
        return foodWeight;
    }

    public void setFoodWeight(int foodWeight) {
        this.foodWeight = foodWeight;
    }

    public int getGarbageWeight() {
        return garbageWeight;
    }

    public void setGarbageWeight(int garbageWeight) {
        this.garbageWeight = garbageWeight;
    }

    @Override
    public int addAnimal(Wolf animal) {
        if (animal.getType().equals("wolf")) {
            wolves.add(animal);
        }
        return wolves.size();
    }

    @Override
    public void giveFood(int foodWeight) {
        int tmpFood = foodWeight + this.foodWeight;
        try {
            for (Animal wolf : wolves) {
                wolf.feed(tmpFood);
                if (tmpFood > wolf.getmaxWeight()) {
                    tmpFood -= wolf.getmaxWeight();
                } else {
                    tmpFood = 0;
                }
            }
            this.foodWeight = tmpFood;
        } catch (NullPointerException e) {
            this.foodWeight = 0;
            this.garbageWeight = tmpFood;
        }

    }

    @Override
    public void cleanCage(int garbageWeight) {
        if (garbageWeight < this.garbageWeight) {
            this.garbageWeight -= garbageWeight;
        } else {
            this.garbageWeight = 0;
        }
    }

    public Wolf takeOffAnimal() {
        if (this.wolves.isEmpty()) {
            return null;
        } else {
            Random random = new Random();
            int i = random.nextInt(wolves.size());
            return (Wolf) wolves.remove(i);
        }
    }

    @Override
    public int countAnimals() {
        return wolves.size();
    }

    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolves);
    }

    @Override
    public void ageSortAnimals(boolean fromLessToHigher) {
        if (fromLessToHigher)
            Collections.sort(wolves, new WolfAgeComparator(true));
        else
            Collections.sort(wolves, new WolfAgeComparator(false));
    }

    @Override
    public void weightSortAnimals(boolean fromLessToHigher) {
        if (fromLessToHigher)
            Collections.sort(wolves, new AnimalWeightComparator(true));
        else
            Collections.sort(wolves, new AnimalWeightComparator(false));
    }

    @Override
    public void displayAnimals() {
        for (Wolf wolf : wolves) {
            System.out.println(wolf.toString());
        }
    }
}