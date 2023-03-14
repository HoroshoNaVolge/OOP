package animals;

public class Snake extends Animal {
    private int lenght;
    protected static final int MAX_WEIGHT = 10;

    public Snake(String nickName, int yearBirth, int weight, int legs, int lenght) {
        super(nickName, yearBirth, weight, legs);
        this.lenght = lenght;
    }

    protected static final String type = "snake";

    @Override
    public String getType() {
        return type;
    }

    public int getLength() {
        return lenght;
    }

    @Override
    public int getmaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "nickName='" + nickName + '\'' +
                ", yearBirth=" + yearBirth +
                ", weight=" + weight +
                ", length=" + lenght +
                "}";
    }
}
