package animals;
public class Wolf extends Animal {

    protected static final int MAX_WEIGHT = 65;
    protected static final String type = "wolf";

    private int height;

    public Wolf(String nickName, int yearBirth, int weight, int legs, int height) {
        super(nickName, yearBirth, weight, legs);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "height=" + height +
                ", nickName='" + nickName + '\'' +
                ", yearBirth=" + yearBirth +
                ", weight=" + weight +
                "}";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getmaxWeight() {
        return MAX_WEIGHT;
    }
}