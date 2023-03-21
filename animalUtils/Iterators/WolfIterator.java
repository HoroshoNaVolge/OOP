package animalUtils.Iterators;

import animals.Wolf;

import java.util.ArrayList;
import java.util.Iterator;

public class WolfIterator implements Iterator<Wolf> {

    private ArrayList<Wolf> wolves;
    private int point;

    public WolfIterator(ArrayList<Wolf> wolves) {
        this.wolves = wolves;
    }

    @Override
    public boolean hasNext() {
        return point < wolves.size();
    }

    @Override
    public Wolf next() {
        return wolves.get(point++);
    }
}