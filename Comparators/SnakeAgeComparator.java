package Comparators;

import animals.Snake;

import java.util.Comparator;

public class SnakeAgeComparator implements Comparator<Snake> {

    int result = 1;

    public SnakeAgeComparator() {
    }

    public SnakeAgeComparator(boolean fromLessToHigher) {
        if (fromLessToHigher)
            result = -result;
    }

    @Override
    public int compare(Snake o1,Snake o2) {
        if (o1.getYearBirth() < o2.getYearBirth()) {
            return result;
        } else if (o1.getYearBirth() > o2.getYearBirth()) {
            return -result;
        }
        return 0;
    }
}
