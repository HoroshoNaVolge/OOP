package animalUtils.Iterators;

import animals.Snake;

import java.util.ArrayList;
import java.util.Iterator;

public class SnakeIterator implements Iterator<Snake> {

    private ArrayList<Snake> snakes;
    private int point;

    public SnakeIterator(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }

    @Override
    public boolean hasNext() {
        return point < snakes.size();
    }

    @Override
    public Snake next() {
        return snakes.get(point++);
    }
}