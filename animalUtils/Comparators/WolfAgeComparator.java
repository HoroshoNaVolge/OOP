package animalUtils.Comparators;

import animals.Wolf;

import java.util.Comparator;

public class WolfAgeComparator implements Comparator<Wolf> {

    int result = 1;

    public WolfAgeComparator() {
    }

    public WolfAgeComparator(boolean fromLessToHigher) {
        if (fromLessToHigher)
            result = -result;
    }

    @Override
    public int compare(Wolf o1, Wolf o2) {
        if (o1.getYearBirth() < o2.getYearBirth()) {
            return result;
        } else if (o1.getYearBirth() > o2.getYearBirth()) {
            return -result;
        }
        return 0;
    }
}
