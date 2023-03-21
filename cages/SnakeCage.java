package cages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import animalUtils.Comparators.AnimalWeightComparator;
import animalUtils.Comparators.SnakeAgeComparator;
import animalUtils.Iterators.SnakeIterator;
import animals.Animal;
import animals.Snake;

public class SnakeCage implements AnimalCage<Snake>, Iterable<Snake> {
    private ArrayList<Snake> snakes;
    private int foodWeight;
    private int garbageWeight;

    public SnakeCage(){
        this.snakes = new ArrayList<Snake>();
    }

    @Override
    public int addAnimal(Snake animal) {
        if (animal.getType().equals("snake")) {
            snakes.add(animal);
        }
        return snakes.size();
    }

    @Override
    public void giveFood(int foodWeight) {
        int tmpFood = foodWeight + this.foodWeight;

        for (Animal snake : snakes) {
            snake.feed(tmpFood);
            if (tmpFood > snake.getmaxWeight()) {
                tmpFood -= snake.getmaxWeight();
            } else {
                tmpFood = 0;
            }
        }
        this.foodWeight = tmpFood;
    }

    @Override
    public void cleanCage(int garbageWeight) {
        if (garbageWeight < this.garbageWeight) {
            this.garbageWeight -= garbageWeight;
        } else {
            this.garbageWeight = 0;
        }
    }

    @Override
    public Snake takeOffAnimal() {
        if (this.snakes.isEmpty()) {
            return null;
        } else {
            Random random = new Random();
            int i = random.nextInt(snakes.size());
            return (Snake) snakes.remove(i);
        }
    }

    @Override
    public int countAnimals() {
        return snakes.size();
    }

    @Override
    public void ageSortAnimals(boolean fromLessToHigher) {
        if (fromLessToHigher)
            Collections.sort(snakes, new SnakeAgeComparator(true));
        else
            Collections.sort(snakes, new SnakeAgeComparator(false));
    }

    @Override
    public void weightSortAnimals(boolean fromLessToHigher) {
        if (fromLessToHigher)
            Collections.sort(snakes, new AnimalWeightComparator(true));
        else
            Collections.sort(snakes, new AnimalWeightComparator(false));
    }

    @Override
    public void displayAnimals() {
        for (Snake snake : snakes) {
            System.out.println(snake.toString());
        }
    }

    @Override
    public Iterator<Snake> iterator() {
        return new SnakeIterator(snakes);
    }
}