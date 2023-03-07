package animals;

public abstract class Animal {
    protected String nickName;
    protected int yearBirth;
    protected int weight;
    protected int legsQuantity;

    public Animal(String nickName, int yearBirth, int weight, int legs) {
        this.nickName = nickName;
        this.yearBirth = yearBirth;
        this.weight = weight;
        this.legsQuantity = legs;
    }

    public void feed(int foodWeight) {
        weight = weight + foodWeight;
        if (weight > getmaxWeight()) {
            weight = getmaxWeight();
        }
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLegsQuantity() {
        return legsQuantity;
    }

    public void setLegsQuantity(int countLegs) {
        this.legsQuantity = countLegs;
    }

    public abstract String getType();

    public abstract int getmaxWeight();
}